package Data.Table;

import Data.Handler.FileCreator;
import Data.Handler.FileRemover;
import Data.Page.Page;
import Data.Page.Record;
import Data.Validator.TupleValidator;
import Exceptions.DBAppException;

import java.io.*;
import java.util.*;

import java.io.IOException;


public class Table implements Serializable {

    //    private static final long serialVersionUID = -9043778273416338053L;
    private Vector<String> pagePaths; // page paths
    private transient ArrayList<TableColumn> allColumns;
    static String tablesDirectory = "Data_Entry" + File.separator + "Tables";
    private String tableFilePath;
    private String tableDir;
    private String tableName;
    private int pageNum = 1;


    public Table(ArrayList<TableColumn> allColumns) throws IOException {
        this.pagePaths = new Vector<>();
        this.tableName = allColumns.get(0).getTableName();
        this.tableDir = tablesDirectory + File.separator + tableName;
        this.allColumns = allColumns;
        File f = new File(tableDir);
        System.out.println(f.mkdir() ? "Table Created" : "Table not Created");
        MetaData.writeDataToMetaDatafile(allColumns);
        save();
    }

    public void save() throws IOException {
        tableFilePath = tableDir + File.separator + tableName;
        FileCreator.storeAsObject(this, tableFilePath);
    }

    public ArrayList<TableColumn> getAllColumns() {
        return allColumns;
    }

    public Vector<String> getPagePaths() {
        return pagePaths;
    }

    public static String getTablesDirectory() {
        return tablesDirectory;
    }

    public String getTableFilePath() {
        return tableFilePath;
    }

    public String getTableDir() {
        return tableDir;
    }

    public String getTableName() {
        return tableName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setAllColumns(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void removePageFromArr(String pagePath) {
        this.pagePaths.remove(pagePath);
    }

    public static String getTableFilePath(String name) {
        return tablesDirectory + File.separator +
                name + File.separator + name;
    }

    public void appendPagePath(String filePath) {
        pagePaths.add(filePath);
    }

    public static Table getTable(ArrayList<Table> allTables, String tableName) throws DBAppException {
        for (Table table : allTables) {
            if (table.tableName.equals(tableName)) {
                return table;
            }
        }
        throw new DBAppException("Table not found");
    }

    public Object[] getClusterKeyAndIndex() throws DBAppException {
        for (int i = 0; i < allColumns.size(); i++) {
            if (allColumns.get(i).isClusterKey()) {
                return new Object[]{allColumns.get(i), i};
            }
        }
        throw new DBAppException("No cluster Key for this Table");
    }

    public Hashtable<Integer, Object> getColIdxVal(Hashtable<String, Object> ht) throws DBAppException {

        Hashtable<Integer, Object> res = new Hashtable<>();
        for (String key : ht.keySet()) {
            res.put(idxFromName(key), ht.get(key));
        }
        return res;
    }

    public int idxFromName(String name) throws DBAppException {
        for (int i = 0; i < getAllColumns().size(); i++) {
            if (getAllColumns().get(i).equals(name)) {
                return i;
            }
        }
        throw new DBAppException("Invalid Column Name: " + name);
    }

    // skeleton method for searching for records O(n)
    // To be modified later
    public ArrayList<Record> searchFor(Hashtable<Integer, Object> colIdxVal) throws IOException, ClassNotFoundException, DBAppException {
        for (String path : getPagePaths()) {
            // still need to adjust for index
            Page page = (Page) FileCreator.readObject(path);
            ArrayList<Record> toRemove = new ArrayList<>();
            for (Record record : page) {
                boolean matching = record.isMatching(colIdxVal);
                if (matching)
                    toRemove.add(record);
            }
            page.removeAll(toRemove);
        }
        throw new DBAppException("Not implemented yet"); // do not use method yet
    }

    // binary search on cluster Key
    // in progress
    public int search(Comparable clusterKey, int clusterIdx) throws IOException, ClassNotFoundException {
        int start = 0;
        int end = pagePaths.size() - 1;
        int mid = 0;
        int pageIdx = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            Page page = (Page) FileCreator.readObject(pagePaths.get(mid));
            if (clusterKey.compareTo(page.get(0).get(clusterIdx)) < 0) {
                end = mid - 1;
            } else if (clusterKey.compareTo(page.get(page.size() - 1).get(clusterIdx)) > 0) {
                start = mid + 1;
            } else {
                pageIdx = page.searchRecordIdx(clusterKey, clusterIdx);
            }
        }
        return mid * 1000 + pageIdx;
    }

    @Override
    public boolean equals(Object o) {
        // two tables are equal if they have the same name
        // to be revisited
        if (o instanceof Table) {
            return this.tableName.equals(((Table) o).tableName);
        }
        if (o instanceof String) {
            return tableName.equals(o);
        }
        return false;
    }

    //----------------------------------------------------------------------------------
    //functions by MX

    public void viewTable() throws IOException, ClassNotFoundException {
        if (!pagePaths.isEmpty()) {
            for (String pagePath : pagePaths) {
                Page page = (Page) FileCreator.readObject(pagePath);
                System.out.println(page);
            }
        }
    }

    public void insertIntoTable(Hashtable<String, Object> insertedTuple) throws DBAppException, IOException, ClassNotFoundException {
        TupleValidator.IsValidTuple(insertedTuple, this);
        if (insertedTuple.size() == allColumns.size()) {
            Record rec = new Record();
            //overflow record for shifting purposes
            Record overFlowRec = new Record();
            rec.insertRecord(getColIdxVal(insertedTuple));
            //if it is the first record to be inserted
            if (pagePaths.isEmpty()) {
                //creating a new page
                Page firstPage = new Page(this);
                firstPage.add(rec);
                firstPage.save();
            } else {
                for (String pagePath : this.pagePaths) {
                    Page page = (Page) FileCreator.readObject(pagePath);
                    Comparable clusterValue = rec.get((int) (getClusterKeyAndIndex()[1]));
                    Comparable minPageVal = page.getRange()[0];
                    Comparable maxPageVal = page.getRange()[1];
                    if (minPageVal.equals(maxPageVal) || isBetween(clusterValue, minPageVal, maxPageVal))
                        page.insertIntoPage(rec);
                    //if the record is inserted successfully there will be no overflow
                    //if overflow insert the keep inserting and shifting all records
                    //until you reach the last page of the table
                    overFlowRec = page.overFlow();
                    //can I read the next page while I am in this page
                    //we will find out
                    if (overFlowRec != null && this.pagePaths.indexOf(pagePath) < this.pagePaths.size() - 1)
                        ((Page) FileCreator.readObject(this.pagePaths.get(pagePaths.indexOf(pagePath) + 1))).insertIntoPage(overFlowRec);
                    page.save();
                }
                //checking whether I reached the last page and the overflow is not inserted yet
                //making a new page to insert the overflow
                if (overFlowRec != null) {
                    Page newP = new Page(this);
                    newP.insertIntoPage(overFlowRec);
                    newP.save();
                }
            }
            this.save();
        }
    }

    public static <T extends Comparable<T>> boolean isBetween(T value, T minValue, T maxValue) {
        return value.compareTo(minValue) >= 0 && value.compareTo(maxValue) <= 0;
    }

    public void removeTable() {
        MetaData.deleteTableFromCSV(this.getTableName());
        FileRemover.removeDirectory(this.getTableName());
    }

    //this function takes the path of a page and the clustering index to check whether
    //it should be inserted in this page or not
//    private boolean isInRange (String pagePath , String clutsertinKey){
//
//    }


    //----------------------------------------------------------------------------------------------

    public static void main(String[] args) throws IOException, DBAppException {

    }
}
