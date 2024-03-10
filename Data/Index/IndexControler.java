package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Table.Table;

import java.io.IOException;

public class IndexControler {

    public  static BPlusIndex CreateIndex(Table table , String strColName , String strIndexName) throws IOException {
        int i = table.getPageNum();
        BPlusIndex b =new BPlusIndex(i*200,table.getTableName(),strColName , strIndexName);
        b.save();
        return b;
    }
    public void InsertIntoIndex(){};

    public static void updateIndex(Table table ){

    };

    public void deleteIndex(){};

    public Object searchOnIndex(){return new Object();}; // for return the cluster Key value of B+
}
