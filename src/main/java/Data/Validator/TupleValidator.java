package Data.Validator;

import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class TupleValidator {
 /**
     * Validates whether the provided tuple (insertedTuple) is valid for insertion into the specified table.
     *
     * @param insertedTuple A Hashtable representing the tuple to be validated, where keys are column names
     *                      and values are the corresponding values to be inserted.
     * @param table         The Table object representing the table into which the tuple is to be inserted.
     * @throws DBAppException If the tuple is not valid for insertion into the table, due to reasons such as:
     *                        - The number of columns in the inserted tuple does not match the number of columns in the table.
     *                        - The data types of the columns in the inserted tuple do not match the data types of the columns in the table.
     *                        - The column names in the inserted tuple do not match the column names in the table.
     */
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
            throw new DBAppException("Check tuple values, their types and their name");
        }
    }
    /**
     * Checks whether the data type of the provided column value (colValue) matches the specified data type (dataType).
     *
     * @param dataType The data type string representing the expected data type.
     * @param colValue The column value whose data type is to be checked.
     * @return {@code true} if the data type of the column value matches the specified data type;
     *         {@code false} otherwise.
     */
    private static boolean checkValidDataType(String dataType, Object colValue) {
        String elementClassName = colValue.getClass().getName();
        return dataType.equalsIgnoreCase(elementClassName);
    }
}
