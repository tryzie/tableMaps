import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TableManagement {
    private Map<String, Table> tables;

    public TableManagement (){
        this.tables = new TreeMap<>();
    }

    public void addTable(Table table){
        tables.put(table.getTableName(), table);
    }

    public void manageColumns(String tableName, int position, Column column, String action){
        Table table = tables.get(tableName);
        if (table!=null){
            switch (action.toLowerCase()){
                case "add":
                    table.addColumn(position, column);
                    break;
                case "edit":
                    table.editColumn(position, column);
                    break;
                case "remove":
                    table.removeColumn(position);
                    break;
                default:
                    System.out.println("invalid action");

            }

        } else {
            throw new IllegalArgumentException("Table not found: " + tableName);
        }
    }

//    public List<Table>getTablesWithSimilarNamedColumns(String columnName){
//        List<Table> results = new ArrayList<>();
//        for (Table table: tables.values()){
//            for (Column column : table.getColumns().values()){
//                if(column.getColumnName().equalsIgnoreCase(columnName)){
//                    results.add(table);
//                    break;
//                }
//            }
//        }
//        return results;
//    }

    public List<Table> getTablesWithSimilarNamedColumns(String columnName) {
        return tables.values().stream()
                .filter(table -> table.getColumns().values().stream()
                        .anyMatch(column -> column.getColumnName().equals(columnName)))
                .collect(Collectors.toList());
    }

    public void displayAllTables(){
        for (Table table : tables.values()){
            System.out.println(table);
        }
    }

}
