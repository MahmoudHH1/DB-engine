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
        this.indexName = "null";
        this.indexType = "null";
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
    public boolean isColumnBIdx(){return  ! indexName.equals("null") && ! indexType.equals("null");}

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
    @Override
    public boolean equals(Object o){
        if(o instanceof TableColumn){
            return columnName.equals(((TableColumn) o).columnName);
        }
        if(o instanceof String){
            return columnName.equals(o);
        }
        return false;
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

}


