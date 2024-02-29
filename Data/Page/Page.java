package Data.Page;

//import javafx.scene.control.Tab;

import Data.Handler.FileCreator;
import Data.Table.Table;

import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
public class Page implements Serializable {
    private Table table ;
    private String pageName ; // unnecessary attribute
    private Vector<Record> allRecords;
    private String pagePath ;
    public Page (Table table) throws IOException {
        allRecords = new Vector<>();
        this.table = table ;
        this.pageName = table.getTableName() + table.getPageNum() ;
        table.setPageNum(table.getPageNum()+1); // next page num
        this.pagePath = table.getTableDir()+'/'+pageName ;
        pageCreator();

    }

    public void pageCreator() throws IOException {
        table.addNewPage(this.pagePath);// store pagePath in corresponding table
        FileCreator.storeAsObject(this , this.pagePath);
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

    public Vector<Record> getAllRecords() {
        return allRecords;
    }

    public void setAllRecords(Vector<Record> allRecords) {
        this.allRecords = allRecords;
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }


    public void addRecord(Record record){
        allRecords.add(record); // in progress
    }

    public int getPageSize(){
        return allRecords.size();
    }

    @Override
    public String toString() {
        StringBuilder pageContent = new StringBuilder();
        for (Record record : allRecords) {
            pageContent.append(record.toString()).append(",").append("\n");
        }
        return pageContent.toString();
    }


    public static void main(String[] args) {
//        Page page = new Page() ;
//
//        Record r1 = new Record() ;
//        r1.add("ID");
//        r1.add("Name");
//        r1.add("Age");
//        r1.add("Gender");
//        page.addRecord(r1);
//        Record r2 = new Record() ;
//        r2.add("1");
//        r2.add("Mohamed");
//        r2.add("12");
//        r2.add("male");
//        page.addRecord(r2);
//        Record r3 = new Record() ;
//        r3.add(1);
//        r3.add("Dahroug");
//        r3.add("13");
//        r3.add("male");
//        page.addRecord(r3);
//        System.out.println(page.getPageSize());
//        System.out.println(page.toString());


    }

}
