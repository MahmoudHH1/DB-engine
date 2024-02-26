package Data;

public class TableColumn {
    String tableName ; // Store tableName in Table Class
    String columnName ;
    String  columnType ;
    boolean isClusterKey ;
    String indexName ;
    String indexType ;

    public TableColumn(String tableName, String columnName, String columnType,
                       boolean isClusterKey, String indexName, String indexType) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.columnType = columnType;
        this.isClusterKey = isClusterKey;
        this.indexName = indexName;
        this.indexType = indexType;
    }

    @Override
    public String toString() {
        return
                 tableName +
                "," + columnName +
                "," + columnType +
                "," + isClusterKey +
                "," + indexName +
                "," + indexType + '\n' ;
    }

    public static void main(String[] args) {
        TableColumn c = new TableColumn("Student" , "ID",
                "java.lang.String" , true , null , null  );

        System.out.println(c);
    }
}


