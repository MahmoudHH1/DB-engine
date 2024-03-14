package Data.Table;

import Data.Handler.FileCreator;
import Data.Handler.FileRemover;
import Data.Index.BPlusIndex;
import Data.Index.IndexControler;
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
        File tableFolder = new File(tableDir);
        File indiciesFolder = new File(tableDir + File.separator + "Indices");
        System.out.println(tableFolder.mkdir() ? "Table Created" : "Table not Created");
        System.out.println(indiciesFolder.mkdir() ? "indexes folder Created" : "indexes folder not Created");
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

    public static String getTableFilePath(String name) {
        return tablesDirectory + File.separator +
                name + File.separator + name;
    }

    public static Table getTable(ArrayList<Table> allTables, String tableName) throws DBAppException {
        for (Table table : allTables) {
            if (table.tableName.equals(tableName)) {
                return table;
            }
        }
        return null;
    }

    public int getPageNum() {
        return pageNum;
    }

    public Vector<String> getPagePaths() {
        return pagePaths;
    }

    public ArrayList<TableColumn> getAllColumnBIdxs() {
        ArrayList<TableColumn> allColIdxs = new ArrayList<>();
        for (TableColumn col : allColumns) {
            if (col.isColumnBIdx()) {
                allColIdxs.add(col);
            }
        }
        return allColIdxs;
    }

    public boolean isColumnNameBIdx(String colName) throws DBAppException {
        TableColumn col = getColumnByName(colName);
        return col.isColumnBIdx();
    }

    public TableColumn getColumnByName(String colName) throws DBAppException {
        for (TableColumn col : allColumns) {
            if (col.getColumnName().equals(colName)) {
                return col;
            }
        }
        throw new DBAppException("Column not found");
    }

    public Object[] getClusterKeyAndIndex() throws DBAppException {
        for (int i = 0; i < allColumns.size(); i++) {
            if (allColumns.get(i).isClusterKey()) {
                return new Object[]{allColumns.get(i), i};
            }
        }
        throw new DBAppException("No cluster Key for this Table");
    }

    public TableColumn getClusterKey() throws DBAppException {
        for (int i = 0; i < allColumns.size(); i++) {
            if (allColumns.get(i).isClusterKey()) {
                return allColumns.get(i);
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

    public void setAllColumns(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void removePageFromArr(String pagePath) {
        this.pagePaths.remove(pagePath);
    }

    public void appendPagePath(String filePath) {
        pagePaths.add(filePath);
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
        int recIdx = 0;
        boolean checkBefore;
        while (start <= end) { // 2 pages -> start = 0; end = 1; mid = 0  id = 250 3000
            mid = start + (end - start) / 2;
            Page page = (Page) FileCreator.readObject(pagePaths.get(mid));
            checkBefore = false;
            if(page.isEmpty())
                return mid*1000;
            if (clusterKey.compareTo(page.get(0).get(clusterIdx)) < 0) {
                end = mid - 1;
                checkBefore = true;
            } else if (clusterKey.compareTo(page.get(page.size() - 1).get(clusterIdx)) > 0) {
                start = mid + 1;
            } else {
                recIdx = page.searchRecordIdx(clusterKey, clusterIdx);
                break;
            }
            // 0 : min = 0 max = 39
            // 1 : min = 40 max = 70
            // 2 : min = 50 max = 249
            // 3 : min = 251 max = 350
            if(checkBefore && mid > 0) {
                Page temp = (Page) FileCreator.readObject(pagePaths.get(mid-1));
                if(temp.size() < 200)
                    --mid;
            }
        }
        return mid * 1000 + recIdx; // 5000
    }
    public Record searchRec(Comparable clusterKey, int clusterIdx) throws IOException, ClassNotFoundException {
        int start = 0;
        int end = pagePaths.size() - 1;
        int mid = 0;
        Record rec = null;
        while (start <= end) { // 2 pages -> start = 0; end = 1; mid = 0  id = 250 3000
            mid = start + (end - start) / 2;
            Page page = (Page) FileCreator.readObject(pagePaths.get(mid));
            if(page.isEmpty())
                return null;
            if (clusterKey.compareTo(page.get(0).get(clusterIdx)) < 0) {
                end = mid - 1;
            } else if (clusterKey.compareTo(page.get(page.size() - 1).get(clusterIdx)) > 0) {
                start = mid + 1;
            } else {
                rec = page.searchRecord(clusterKey, clusterIdx);
                break;
            }
        }
        return rec;
    }

    public boolean hasRecords() {
        return !pagePaths.isEmpty();
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
        Record rec = new Record();
        rec.insertRecord(getColIdxVal(insertedTuple));
        //
        Vector<BPlusIndex> allTableIndices = IndexControler.loadAllTableIndices(this.getTableName());
        for (BPlusIndex b : allTableIndices) {
            Enumeration<String> keys = insertedTuple.keys();
            Enumeration<Object> values = insertedTuple.elements();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                Object value = values.nextElement();
                if (b.getColName().equals(key)) {
                    b.insert(value, rec.get((int) (getClusterKeyAndIndex()[1])));
                    b.save();
                }
            }
        }

        //overflow record for shifting purposes
        Record overFlowRec = new Record();
        //if it is the first record to be inserted
        if (pagePaths.isEmpty()) {
            //creating a new page
            Page firstPage = new Page(this);
            firstPage.add(rec);
            firstPage.save();
        } else {
            int pagePathIdx = (search(rec.get((int) (getClusterKeyAndIndex()[1])), (int) getClusterKeyAndIndex()[1])) % 1000;
            for (int i = pagePathIdx; i < pagePaths.size(); i++) {
                String pagePath = pagePaths.get(i);
                Page page = (Page) FileCreator.readObject(pagePath);
                if (rec != null) {
                    Comparable clusterValue = rec.get((int) (getClusterKeyAndIndex()[1]));
//                    Comparable minPageVal = page.getRange()[0];
//                    Comparable maxPageVal = page.getRange()[1];
//                    if (minPageVal.equals(maxPageVal) ||
//                            isBetween(clusterValue, minPageVal, maxPageVal) ||
//                            isless(clusterValue, minPageVal, maxPageVal) ||
//                            (isGreater(clusterValue, minPageVal, maxPageVal) && this.pagePaths.indexOf(pagePath) == this.pagePaths.size() - 1)
//                    ) {
                    page.insertIntoPage(rec);
                    rec = null;
//                    }
                }
                //if the record is inserted successfully there will be no overflow
                //if overflow insert the keep inserting and shifting all records
                //until you reach the last page of the table
                overFlowRec = page.overFlow();
                page.save();

                //if overflow is null after the value is inserted
                //break out of the for loop for time complexity concerns
                if (overFlowRec == null)
                    break;
                //can I read the next page while I am in this page
                //we will find out
                if (overFlowRec != null && this.pagePaths.indexOf(pagePath) < this.pagePaths.size() - 1) {
                    Page nextPage = ((Page) FileCreator.readObject(this.pagePaths.get(pagePaths.indexOf(pagePath) + 1)));
                    nextPage.insertIntoPage(overFlowRec);
                    nextPage.save();
                }
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

    public static <T extends Comparable<T>> boolean isBetween(T value, T minValue, T maxValue) {
        return value.compareTo(minValue) >= 0 && value.compareTo(maxValue) <= 0;
    }

    public static <T extends Comparable<T>> boolean isless(T value, T firstVal, T SecondVal) {
        return value.compareTo(firstVal) < 0 && value.compareTo(SecondVal) < 0;
    }

    public static <T extends Comparable<T>> boolean isGreater(T value, T firstVal, T SecondVal) {
        return value.compareTo(firstVal) > 0 && value.compareTo(SecondVal) > 0;
    }

    public void removeTable() {
        MetaData.deleteTableFromCSV(this.getTableName());
        FileRemover.removeDirectory(this.getTableName());
    }


    //----------------------------------------------------------------------------------------------

    public static void main(String[] args) throws IOException, DBAppException {

    }
}
