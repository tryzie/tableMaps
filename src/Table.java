import java.util.Map;
import java.util.TreeMap;

public class Table {
    private int tableId;
    private  String tableName;
    private Map<Integer, Column> columns;

    public Table (int tableId, String tableName ){
        this.tableId = tableId;
        this.tableName = tableName;
        this.columns = new TreeMap<>();
    }

    public int getTableId(){
        return tableId;
    }
    public void setTableId(int tableId){
        this.tableId =tableId;
    }

    public String getTableName(){
        return tableName;
    }
    public void setTableName(String tableName){
        this.tableName = tableName;
    }

    public Map<Integer, Column> getColumns() {
        return columns;
    }

    public void addColumn(int position, Column column){
        columns.put(position, column);
    }
    public void editColumn (int position, Column column){
        columns.put(position, column);
    }
    public void removeColumn (int position){
        columns.remove(position);
    }

    @Override
    public String toString (){
        return "Table{ " + "tableId: " + tableId + ", tableName: " + tableName + ", column: " + columns + " }";
    }


}
