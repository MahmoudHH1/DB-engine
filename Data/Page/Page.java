package Data.Page;

//import javafx.scene.control.Tab;

import Data.Handler.FileCreator;
import Data.Table.MetaData;
import Data.Table.Table;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Vector;
public class Page extends Vector<Record> {
    private Table table ;
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


    public Record searchRecord(Object clusterVal1, int clusterIdx){
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

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean changed = super.removeAll(c);
        if(this.isEmpty()){
            File myObj = new File(this.pagePath + ".class");
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
        return changed;
    }

    @Override
    public String toString() {
        StringBuilder pageContent = new StringBuilder();
        for (Record record : this /*allrecords*/) {
            pageContent.append(record.toString()).append(",").append("\n");
        }
        return pageContent.toString();
    }


    public static void main(String[] args) {

    }

}
