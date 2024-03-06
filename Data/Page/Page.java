package Data.Page;

//import javafx.scene.control.Tab;

import Data.Handler.FileCreator;
import Data.Table.MetaData;
import Data.Table.Table;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
public class Page extends Vector<Record> {
    private Table table ;
    private String pageName ; // unnecessary attribute?
    private String pagePath ;
    public Page (Table table) throws IOException {
        this.table = table ;
        this.pageName = table.getTableName() + table.getPageNum() ;
        table.setPageNum(table.getPageNum()+1); // next page num
        this.pagePath = table.getTableDir()+'/'+pageName ;
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
