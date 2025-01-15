public class Column {
    private int columnId;
    private String columnName;
    private String dataType;

    public Column (int columnId, String columnName, String dataType){
        this.columnId = columnId;
        this.columnName = columnName;
        this.dataType =dataType;
    }

    public int getColumnId(){
        return  columnId;
    }
    public void setColumnId(int columnId){
         this.columnId = columnId;
    }

    public String getColumnName(){
        return columnName;
    }
    public void setColumnName(String columnName){
        this.columnName = columnName;
    }

    public String getDataType (){
        return dataType;
    }
    public void setDataType(String dataType){
        this.dataType = dataType;
    }

    @Override
    public String toString(){
        return "Column{ "  + "columnId: " + columnId + ", columnName: " +columnName + ", dataType: " + dataType +" }";
    }
}
