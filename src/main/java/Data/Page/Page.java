package Data.Page;

//import javafx.scene.control.Tab;

import Data.Handler.FileCreator;
import Data.Handler.FileRemover;
import Data.Index.BPlusIndex;
import Data.Index.IndexControler;
import Data.Index.Pointer;
import Data.Table.MetaData;
import Data.Table.Table;
import Exceptions.DBAppException;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Page extends Vector<Record>  {
    private static final long serialVersionUID = -9043778273416338053L;
    private transient Table table ;
    private String pageName ; // unnecessary attribute?
    private String pagePath ;
    public Page (Table table) throws IOException {
        this.table = table ;
        this.pageName = table.getTableName() + table.getPageNum() ;
        table.setPageNum(table.getPageNum()+1); // next page num
        this.pagePath = table.getTableDir()+File.separator+pageName ;
        table.appendPagePath(this.pagePath);
        System.out.println(pagePath);
        save();
    }

    public static Page readPage(String pagePath, Table table) throws IOException, ClassNotFoundException {
        Page page = (Page) FileCreator.readObject(pagePath);
        page.setTable(table);
        return page;
    }
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

    public void insertIntoPage (Record rec) throws DBAppException, IOException, ClassNotFoundException {
        //getting the clustering key index
        int clusterKeyIdx = (int)Table.getTable(MetaData.loadAllTables(),table.getTableName()).getClusterKeyAndIndex()[1] ;
        if (searchRecord(rec.get(clusterKeyIdx) ,clusterKeyIdx)==null){
            this.add(rec) ;
            sortRecords(clusterKeyIdx);
        }
        else {
            throw new DBAppException("non unique primary key") ;
        }
    }

    public Comparable [] getRange() throws IOException, ClassNotFoundException, DBAppException {
        //getting the clustering key index
        int clusterKeyIdx = (int)Table.getTable(MetaData.loadAllTables(),table.getTableName()).getClusterKeyAndIndex()[1] ;
        return new Comparable[]{this.get(0).get(clusterKeyIdx) , this.get(this.size()-1).get(clusterKeyIdx)};
    }

    //this function is simply checking whether the size
    //of the page exceeded 200, and it returns the overflow
    //record and remove it from the page
    /* THIS METHOD GET EXECUTED AFTER SORTING EL PAGE
    * 3SHAN MNLBSSH FEL 7ETA  */
    public Record overFlow () throws IOException {
        if (this.size()>MetaData.maxPageSize)
            return this.remove(MetaData.maxPageSize) ;
        return null ;
    }
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

    public Record searchRecord(Object clusterVal1, int clusterIdx){
        return searchRecord(clusterVal1, clusterIdx, 0);
    }
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
    public void removeAll(ArrayList<Record> toRemove, ArrayList<Integer> colIdxWBplus,
                          ArrayList<BPlusIndex> affectedBPlus,
                          ArrayList<Pointer> ptrsToRemove, int deletedIdx) throws IOException, ClassNotFoundException {
        boolean changed = this.removeAll(toRemove);
        if(this.isEmpty())
            IndexControler.updatePageDeletion(affectedBPlus, deletedIdx);
        // remove from all indicies
        IndexControler.deleteFromIndex(colIdxWBplus, affectedBPlus, toRemove, ptrsToRemove);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean changed = super.removeAll(c);
        try {
            this.save();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(this.isEmpty()){
            FileRemover.removeFileFromDirectory(table ,pagePath);
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
