package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class IndexControler {

    public  static BPlusIndex createIndex(Table table , String strColName , String strIndexName) throws IOException {
        int i = table.getPageNum();
        BPlusIndex b =new BPlusIndex(i*200,table.getTableName(),strColName , strIndexName);
        b.save();
        return b;
    }
    public void insertIntoIndex(){};

    public static void updateIndex(Hashtable<String , Object>colVal , Table table) throws IOException, ClassNotFoundException, DBAppException {
        // get idx by idxName readIdx(name , table)
        // search for value(Key) in hashTable in this idx
        // if exist remove it
        // insert new value to this idx
        Set<String> keys = colVal.keySet();
        // get colname (only The Key) in the colVal
        String colName = keys.iterator().next();
        TableColumn col = table.getColumnByName(colName);
        BPlusIndex idx = readIndexByName(col.getIndexName() , table);
        // search for cluser key first from all retuned values (Because may have dublicates)
        ArrayList<Object> allClusterKeys = idx.search(colVal.get(colName)); //key in b+ == value in colVal
        Object obj = new Object() ;
        for (Object cluserKey : allClusterKeys ){
            if (cluserKey.equals(table.getClusterKey()) ){
//                obj = ;
                // get key this key from B+ (value of colVal) and send it to delete function
                // delete -> should be modified to make it take key and value(cluserKey)
                // to ensure that it deletes the correct key from B+
            }
        }
        // key already exist
        if (obj != null){
             idx.delete(obj);
             idx.insert(colVal.get(colName) ,table.getClusterKey());
        }else{ // key dne should not happen
            idx.insert(colVal.get(colName) ,table.getClusterKey());
        }
    };

    public void deleteIndex(){};

    public Object searchOnIndex(){return new Object();}; // for return the cluster Key value of B+

    public static BPlusIndex readIndexByName(String idxName, Table table) throws IOException, ClassNotFoundException {
        String idxPath ="Data_Entry" +
                File.separator +
                "Tables"+
                File.separator +
                table.getTableName() +
                File.separator+
                "indices"+
                File.separator+
                idxName;
        return (BPlusIndex) FileCreator.readObject(idxPath);
    }
}
