package Data.Validator;

import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class TupleValidator {

    public static void IsValidTuple(Hashtable<String, Object> insertedTuple, Table table) throws DBAppException {
        boolean isValid = true;
        Iterator<Map.Entry<String, Object>> InsertIterator = insertedTuple.entrySet().iterator();
        if (insertedTuple.size() == table.getAllColumns().size()) {
            for (TableColumn column : table.getAllColumns()) {
                Map.Entry<String, Object> insertedCol = InsertIterator.next();
                if (!Objects.equals(column.getColumnName(), insertedCol.getKey()) ||
                        !checkValidDataType(column.getColumnType(), insertedCol.getValue())) {
                    isValid = false;
                }
            }
        } else if (insertedTuple.size() < table.getAllColumns().size()) {
            Hashtable<Integer, Object> tuples = table.getColIdxVal(insertedTuple);
            for (int idx : tuples.keySet()) {
                if (!checkValidDataType(table.getAllColumns().get(idx).getColumnType(), tuples.get(idx))) {
                    isValid = false;
                }
            }
        } else {
            isValid = false;
        }
        if (!isValid) {
            throw new DBAppException("Check tuple values and their types");
        }
//        return isValid;
    }

    private static boolean checkValidDataType(String dataType, Object colValue) {
        String elementClassName = colValue.getClass().getName();
        return dataType.equalsIgnoreCase(elementClassName);
    }


}
