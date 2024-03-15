package Data.Validator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MetaDataValidator {
    private static final String metaPath = "Data_Entry/metadata.csv";
    //reading the metadata file to know the columns of each table to check it when trying to insert new record
    // el function sha8ala bas el gam3a bayza
    public static boolean IsValidTuple(String tableName , Hashtable<String,Object> insertedTuple) {
        Hashtable<String, String> TasbleColcsv = new Hashtable<>();
        boolean isValid = true ;
        try (BufferedReader br = new BufferedReader(new FileReader(metaPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into elements
                String[] elements = line.split(",");

                // Check if the first element matches the given string 'x'
                if (elements.length >= 3 && elements[0].equals(tableName)) {
                    // If the condition is met, add a tuple to the result hashtable
                    String columnName = elements[1];
                    String columnType = elements[2];
                    TasbleColcsv.put(columnName, columnType);
                }
            }
            //checking first whether the inserted tuple has the same size
            //as the table attributes
            if (TasbleColcsv.size()!=insertedTuple.size()){
                return false ;
            }
            //checking whether the data in the csv file matches the inserted tuple
            Iterator<Map.Entry<String, String>> ResIterator = TasbleColcsv.entrySet().iterator();
            Iterator<Map.Entry<String, Object>> InsertIterator = insertedTuple.entrySet().iterator();
            while (ResIterator.hasNext()) {
                Map.Entry<String, String> col = ResIterator.next();
                Map.Entry<String, Object> insertedCol = InsertIterator.next();
                System.out.println(col.getValue());
                if (!Objects.equals(col.getKey(), insertedCol.getKey()) || !checkValidDataType(col.getValue(),insertedCol.getValue())){
                    isValid = false ;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isValid ;
    }

    //A function to return true if the value I am inserting matches the datatype in
    //the csv file
    private static boolean checkValidDataType (String dataType , Object colValue) {
        String elementClassName = colValue.getClass().getName() ;
        return dataType.equals(elementClassName) ;
    }

}
