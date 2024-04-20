package Data.Page;

//import javafx.scene.control.Tab;

import Data.Handler.FileCreator;
import Data.Handler.FileRemover;
import Data.Handler.Pair;
import Data.Index.BPlusIndex;
import Data.Index.IndexControler;
import Data.Index.Pointer;
import Data.Table.MetaData;
import Data.Table.Table;
import Exceptions.DBAppException;

import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.util.*;
/**
 * The Page class represents a page within a database table.
 * It extends the Vector<Record> class, allowing it to store a collection of records.
 */
public class Page extends Vector<Record>  {
    @Serial
    private static final long serialVersionUID = -9043778273416338053L;
    private transient Table table ;
    private String pageName ; // unnecessary attribute?
    private String pagePath ;
    /**
     * Constructor to create a new Page object for the given table.
     * @param table The table to which the page belongs.
     * @throws IOException
     * @throws DBAppException
     * @throws ClassNotFoundException
     */
    public Page (Table table) throws IOException, DBAppException, ClassNotFoundException {
        this.table = table ;
        this.pageName = table.getTableName() + table.getPageNum() ;
        table.setPageNum(table.getPageNum()+1); // next page num
        this.pagePath = table.getTableDir()+File.separator+pageName ;
        table.appendPagePath(this.pagePath);
        System.out.println(pagePath);
        save();
    }
    /**
     * Static method to read a page from the specified path and associate it with the given table.
     * @param pagePath The path of the page file.
     * @param table The table to associate the page with.
     * @return The read Page object.
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public static Page readPage(String pagePath, Table table) throws IOException, ClassNotFoundException {
        Page page = (Page) FileCreator.readObject(pagePath);
        page.setTable(table);
        return page;
    }
    /**
     * Method to save the page to a file.
     * @throws IOException
     */
    public void save() throws IOException {
        FileCreator.storeAsObject(this , this.pagePath);
        table.save();
    }

    public Table getTable() {
        return table;
    }
    public void setTable(Table table) {
        this.table = table;
    }
    public String getPageName() {
        return pageName;
    }
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
    public String getPagePath() {
        return pagePath;
    }
    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }
    /**
     * Checks if the page is full based on the maximum page size.
     * @return True if the page is full, false otherwise.
     */
    public boolean isFull(){return this.size() >= MetaData.maxPageSize; }

    /**
     * Inserts a record into the page, ensuring uniqueness based on the clustering key.
     * @param rec The record to insert.
     * @throws DBAppException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void insertIntoPage (Record rec) throws DBAppException, IOException, ClassNotFoundException {
        //getting the clustering key index
        // you already have the table why do this?????
//        int clusterKeyIdx = (int)Table.getTable(MetaData.loadAllTables(),table.getTableName()).getClusterKeyAndIndex()[1] ;
        int clusterKeyIdx = (int) table.getClusterKeyAndIndex()[1] ;
        if (searchRecord(rec.get(clusterKeyIdx) ,clusterKeyIdx)==null){
            this.add(rec) ;
            sortRecords(clusterKeyIdx);
        }
        else
            throw new DBAppException("non unique primary key") ;
    }
    /**
     * Retrieves the min and max of cluster keys in the page .
     * @return A Pair containing the minimum and maximum clustering values in the page.
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws DBAppException
     */
    public Pair<Comparable,Comparable> getRange() throws IOException, ClassNotFoundException, DBAppException {
        //getting the clustering key index
        int clusterKeyIdx = (int)Table.getTable(MetaData.loadAllTables(),table.getTableName()).getClusterKeyAndIndex()[1] ;
        int pageSize = MetaData.maxPageSize ;
        int lastPageElementIdx ;
        if (this.size()>pageSize)
            lastPageElementIdx = this.size()-2 ;
        else
            lastPageElementIdx = this.size()-1 ;
        return new Pair<> (this.get(0).get(clusterKeyIdx) , this.get(lastPageElementIdx).get(clusterKeyIdx));
    }

    /**
     * Checks if the size of the page exceeds the maximum page size.
     * If the size exceeds, it returns the overflow record and removes it from the page.
     * This method is executed after sorting the page.
     * @return The overflow record if the size exceeds the maximum page size, otherwise returns null.
     * @throws IOException
     */
    public Record overFlow () throws IOException {
        if (this.size()>MetaData.maxPageSize)
            return this.remove(MetaData.maxPageSize) ;
        return null ;
    }
    /**
     * Sorts the records within the page based on the specified index.
     * @param sortIndex The index used for sorting the records.
     */
    public void sortRecords(int sortIndex) {
        // Create a custom Comparator
        Comparator<Record> comparator = new Comparator<Record>() {
            @Override
            public int compare(Record record1, Record record2) {
                Comparable element1 = record1.get(sortIndex);
                Comparable element2 = record2.get(sortIndex);
                return element1.compareTo(element2);
            }
        };

        // Sort the records using the comparator
        this.sort(comparator);
    }
    /**
     * Searches for a record with the specified clustering value and index within the page.
     * This method initiates the search from the beginning of the page.
     * @param clusterVal1 The clustering value to search for.
     * @param clusterIdx The index of the clustering value in the records.
     * @return The record with the specified clustering value, or null if not found.
     */
    public Record searchRecord(Object clusterVal1, int clusterIdx){
        return searchRecord(clusterVal1, clusterIdx, 0);
    }
    /**
     * Searches for a record with the specified clustering value and index within the page.
     * This method allows specifying the start index for the search(binary search).
     * @param clusterVal1 The clustering value to search for.
     * @param clusterIdx The index of the clustering value in the records.
     * @param start The index from which to start the search.
     * @return The record with the specified clustering value, or null if not found.
     */
    public Record searchRecord(Object clusterVal1, int clusterIdx, int start){
        Comparable clusterVal =(Comparable) clusterVal1 ;
        int end = this.size()-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(clusterVal.compareTo(this.get(mid).get(clusterIdx)) < 0){
                end = mid-1;
            } else if(clusterVal.compareTo(this.get(mid).get(clusterIdx)) > 0){
                start = mid+1;
            } else{
                return this.get(mid);
            }
        }
        return null;
    }

    /**
     * Searches for the index of a record with the specified clustering value and index within the page.
     * @param clusterVal1 The clustering value to search for.
     * @param clusterIdx The index of the clustering value in the records.
     * @return The index of the record with the specified clustering value, or the index where it should be inserted if not found.
     */
    public int searchRecordIdx(Object clusterVal1, int clusterIdx){
        Comparable clusterVal =(Comparable) clusterVal1 ;
        int start = 0;
        int end = this.size()-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(clusterVal.compareTo(this.get(mid).get(clusterIdx)) < 0){
                end = mid-1;
            } else if(clusterVal.compareTo(this.get(mid).get(clusterIdx)) > 0){
                start = mid+1;
            } else{
                return mid;
            }
        }
        return mid;
    }
    /**
     * Removes all specified records from the page and performs necessary updates.
     * @param toRemove The list of records to remove from the page.
     * @param colIdxWBplus The list of column indices associated with B+ trees.
     * @param affectedBPlus The list of affected B+ tree indices.
     * @param ptrsToRemove The list of pointers to remove.
     * @param deletedIdx The index of the record being deleted.
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws DBAppException
     */
    public void removeAll(ArrayList<Record> toRemove, ArrayList<Integer> colIdxWBplus,
                          ArrayList<BPlusIndex> affectedBPlus,
                          ArrayList<Pointer> ptrsToRemove, int deletedIdx) throws IOException, ClassNotFoundException, DBAppException {
        this.removeAll(toRemove);
        if(this.isEmpty())
            IndexControler.updatePageDeletion(affectedBPlus, deletedIdx);
        else
            table.updateMIN_MAX(deletedIdx, this);
        // remove from all indicies
        IndexControler.deleteFromIndex(colIdxWBplus, affectedBPlus, toRemove, ptrsToRemove);
    }
    /**
     * Overrides the removeAll method of the Vector class to save changes to the page after removal.
     * If the page becomes empty after removal, it deletes the associated file.
     * @param c The collection of elements to remove.
     * @return True if the page was changed as a result of this operation, false otherwise.
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean changed = super.removeAll(c);

        try {
            this.save();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(this.isEmpty()){
            FileRemover.removePageFromTable(table ,pagePath);
        }
        return changed;
    }

    @Override
    public String toString() {
        StringBuilder pageContent = new StringBuilder();
        //for debugging concerns
        pageContent.append("page" + pageName + "\n") ;
        for (Record record : this /*allrecords*/) {
            pageContent.append(record.toString()).append(",").append("\n");
        }
        return pageContent.toString();
    }


    public static void main(String[] args) {

    }

}
