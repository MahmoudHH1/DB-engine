package Data.Table;

public class TableColumn {
    private String tableName ; // Store tableName in Table Class
    private String columnName ;
    private String  columnType ;
    private boolean isClusterKey ;
    private String indexName ;
    private String indexType ;

    public TableColumn(String tableName, String columnName, String columnType,
                       boolean isClusterKey, String indexName, String indexType) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.columnType = columnType;
        this.isClusterKey = isClusterKey;
        this.indexName = indexName;
        this.indexType = indexType;
    }

    public TableColumn(String tableName, String columnName, String columnType, boolean isClusterKey) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.columnType = columnType;
        this.isClusterKey = isClusterKey;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public boolean isClusterKey() {
        return isClusterKey;
    }

    public void setClusterKey(boolean clusterKey) {
        isClusterKey = clusterKey;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }
    public boolean ofName(String s){return columnName.equals(s);}

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


