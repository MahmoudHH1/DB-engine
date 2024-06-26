package Data.Table;

import Data.Handler.FileCreator;
import Data.Handler.FileRemover;
import Data.Handler.Pair;
import Data.Index.IndexControler;
import Data.Index.Pointer;
import Data.Page.Page;
import Data.Page.Record;
import Data.Validator.TupleValidator;
import Exceptions.DBAppException;

import java.io.*;
import java.util.*;

import java.io.IOException;


public class Table implements Serializable {

    @Serial
    private static final long serialVersionUID = -9043778273416338053L;
    private Vector<String> pagePaths; // page paths
    private Vector<Pair<Comparable, Comparable>> minMax;
    private transient ArrayList<TableColumn> allColumns;
    static final String tablesDirectory = "Data_Entry" + File.separator + "Tables";
    private String tableFilePath;
    private final String tableDir;
    private final String tableName;
    private int pageNum = 1;


    public Table(ArrayList<TableColumn> allColumns) throws IOException {
        this.pagePaths = new Vector<>();
        this.minMax = new Vector<>();
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
        throw new DBAppException("Table Not Found");
    }

    public static boolean exists(ArrayList<Table> allTables, String tableName) {
        try {
            getTable(allTables, tableName);
            return true;
        } catch (DBAppException e) {
            return false;
        }
    }

    public void reset() throws IOException {
        pagePaths = new Vector<>();
        minMax = new Vector<>();
        pageNum = 1;
        save();
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

    public ArrayList<String> getAllColumnBIdxsNames() {
        ArrayList<String> allColIdxs = new ArrayList<>();
        for (TableColumn col : allColumns) {
            if (col.isColumnBIdx()) {
                allColIdxs.add(col.getIndexName());
            }
        }
        return allColIdxs;
    }

    public ArrayList<Integer> colIdxWBPlus() {
        ArrayList<Integer> allColIdxs = new ArrayList<>();
        for (int i = 0; i < allColumns.size(); i++) {
            if (allColumns.get(i).isColumnBIdx()) {
                allColIdxs.add(i);
            }
        }
        return allColIdxs;
    }

    public boolean isColumnNameBIdx(String colName) throws DBAppException {
        TableColumn col = getColumnByName(colName);
        return col.isColumnBIdx();
    }

    public boolean hasIndex(int colIdx) throws DBAppException {
        return allColumns.get(colIdx).isColumnBIdx();
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
        for (int i = 0; i < allColumns.size(); i++)
            if (allColumns.get(i).getColumnName().equals(name))
                return i;
        throw new DBAppException("Invalid Column Name: " + name);
    }

    public void setAllColumns(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void removePageFromArr(String pagePath) {
        int i = pagePaths.indexOf(pagePath);
        pagePaths.remove(i);
        minMax.remove(i);
    }

    public void appendPagePath(String filePath) {
        pagePaths.add(filePath);
    }

    public void appendMinMax(Page p) throws DBAppException, IOException, ClassNotFoundException {
        minMax.add(p.getRange());
    }

    public void updateMIN_MAX(int pageIndex, Page p) throws IOException, ClassNotFoundException, DBAppException {
        minMax.set(pageIndex, p.getRange());
    }

    // skeleton method for searching for records O(n)
    // To be modified later
    public ArrayList<Record> searchFor(Hashtable<Integer, Object> colIdxVal) throws IOException, ClassNotFoundException, DBAppException {
        for (String path : getPagePaths()) {
            // still need to adjust for index
            Page page = Page.readPage(path, this);
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

    public int search(Comparable clusterKey, int clusterIdx) throws IOException, ClassNotFoundException, DBAppException {
        TableColumn clusterCol = getAllColumns().get(clusterIdx);
        if (clusterCol.isColumnBIdx()) {
            Vector<Pointer> ptrs = IndexControler.search(this, clusterCol.getColumnName(), clusterKey, "<");
            if (ptrs == null || ptrs.isEmpty())
                return 0;
            ptrs.sort(Pointer::compareTo);
            Pointer p = ptrs.get(ptrs.size() - 1);

            return p.pageIdx;
        }
        return search(clusterKey, clusterIdx, 0); // 5000
    }

    // binary search on cluster Key
    public int search(Comparable clusterKey, int clusterIdx, int start) throws IOException, ClassNotFoundException {
        int end = pagePaths.size() - 1;
        int mid = 0;
        boolean checkBefore;
        while (start <= end) { // 2 pages -> start = 0; end = 1; mid = 0  id = 250 3000
            mid = start + (end - start) / 2;
            //x is min and y is max
            Pair<Comparable, Comparable> minmax = minMax.get(mid);
            if (clusterKey.compareTo(minmax.x) < 0) {
                end = mid - 1;
                checkBefore = true;
            } else if (clusterKey.compareTo(minmax.y) > 0) {
                start = mid + 1;
            } else
                break;
        }
        return mid <= 0 ? mid : mid - 1; // 5000
    }

    public Pair<Page, Record> searchRec(Comparable clusterKey, int clusterIdx) throws IOException, ClassNotFoundException, DBAppException {
        TableColumn clusterCol = getAllColumns().get(clusterIdx);
        if (clusterCol.isColumnBIdx()) {
            Vector<Pointer> ptrs = IndexControler.search(this, clusterCol.getColumnName(), clusterKey, "=");
            if (ptrs == null || ptrs.isEmpty())
                return null;
            Pointer p = ptrs.get(0);
            Page page = Page.readPage(getPagePaths().get(p.pageIdx), this);
            return new Pair<>(page, page.searchRecord(clusterKey, clusterIdx));
        }
        return searchRec(clusterKey, clusterIdx, 0);
    }

    public Pair<Page, Record> searchRec(Comparable clusterKey, int clusterIdx, int start) throws IOException, ClassNotFoundException {
        int end = pagePaths.size() - 1;
        int mid;
        Record rec = null;
        Page page = null;
        while (start <= end) { // 2 pages -> start = 0; end = 1; mid = 0  id = 250 3000
            mid = start + (end - start) / 2;
            Pair<Comparable, Comparable> minmax = minMax.get(mid);
            // x is min, y is max
            if (clusterKey.compareTo(minmax.x) < 0) {
                end = mid - 1;
            } else if (clusterKey.compareTo(minmax.y) > 0) {
                start = mid + 1;
            } else {
                page = Page.readPage(pagePaths.get(mid), this);
                rec = page.searchRecord(clusterKey, clusterIdx);
                break;
            }
        }
        return rec == null || page == null ? null : new Pair<>(page, rec);
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

    public void viewTable() throws IOException, ClassNotFoundException {
        if (!pagePaths.isEmpty()) {
            for (String pagePath : pagePaths) {
                Page page = Page.readPage(pagePath, this);
                System.out.println(page);
            }
        }
    }

    public void displayMinMax() {
        System.out.println(minMax.toString());
    }

    public void insertIntoTable(
            Hashtable<String, Object> insertedTuple
    ) throws DBAppException, IOException, ClassNotFoundException {
        TupleValidator.IsValidTuple(insertedTuple, this);
        Record rec = new Record();
        rec.insertRecord(getColIdxVal(insertedTuple));

        //overflow record for shifting purposes
        Record overFlowRec = new Record();
        //if it is the first record to be inserted
        if (pagePaths.isEmpty()) {
            //creating a new page
            Page firstPage = new Page(this);
            firstPage.add(rec);
            IndexControler.insertIntoIndex(rec, 0, this, insertedTuple);
            appendMinMax(firstPage);
            firstPage.save();
        } else {
            // search returns x = pageIdx and y = record idx
            int clusterIdx = (int) getClusterKeyAndIndex()[1];
            int pagePathIdx = search(rec.get(clusterIdx), clusterIdx);
            for (int i = pagePathIdx; i < pagePaths.size(); i++) {
                String pagePath = pagePaths.get(i);
                Page page = Page.readPage(pagePath, this);
                if (rec != null) {
                    page.insertIntoPage(rec);
                    updateMIN_MAX(i, page);
                    IndexControler.insertIntoIndex(rec, pagePathIdx, this, insertedTuple);
                    rec = null;
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
                if (i < this.pagePaths.size() - 1) {
                    //inserting the overflow in the next page
                    Page nextPage = Page.readPage(this.pagePaths.get(i + 1), this);
                    nextPage.insertIntoPage(overFlowRec);
                    IndexControler.updatePageIdxOverflow(overFlowRec, this);
                    updateMIN_MAX(i + 1, nextPage);
                    nextPage.save();
                }
            }
            //checking whether I reached the last page and the overflow is not inserted yet
            //making a new page to insert the overflow
            if (overFlowRec != null) {
                Page newP = new Page(this);
                newP.insertIntoPage(overFlowRec);
                IndexControler.updatePageIdxOverflow(overFlowRec, this);
                appendMinMax(newP);
                newP.save();
            }
        }
        this.save();
    }

    public void removeTable() {
        MetaData.deleteTableFromCSV(this.getTableName());
        FileRemover.removeDirectory(this.getTableName());
    }

    public void deleteAllPages() throws IOException, ClassNotFoundException {
        for (String path : pagePaths)
            FileRemover.removeFileFromDirectory(path);
        reset();
        IndexControler.clearAllTableIndices(this);
    }

}
