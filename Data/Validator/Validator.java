package Data.Validator;

import Data.Table.Table;
import Data.Table.TableColumn;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Validator  {

    public static boolean IsValidTuple(Hashtable<String, Object> insertedTuple , Table table) {
        boolean isValid = true;
        Iterator<Map.Entry<String, Object>> InsertIterator = insertedTuple.entrySet().iterator();
        for (TableColumn column : table.getAllColumns()) {
            Map.Entry<String, Object> insertedCol = InsertIterator.next();
            if (!Objects.equals(column.getColumnName(), insertedCol.getKey()) ||
                    !checkValidDataType(column.getColumnType(), insertedCol.getValue())) {
                isValid = false;
            }
        }
        return isValid;
    }

    private static boolean checkValidDataType(String dataType, Object colValue) {
        String elementClassName = colValue.getClass().getName();
        return dataType.equalsIgnoreCase(elementClassName);
    }

}
