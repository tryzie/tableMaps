import java.util.List;

public class Main {
    public static void main(String[] args) {

        TableManagement manager = new TableManagement();

        // Create tables
        Table table1 = new Table(1, "Users");
        table1.addColumn(1, new Column(101, "user_id", "INT"));
        table1.addColumn(2, new Column(102, "username", "VARCHAR"));
        table1.addColumn(3, new Column(103, "date_created", "DATE"));

        Table table2 = new Table(2, "Orders");
        table2.addColumn(1, new Column(201, "order_id", "INT"));
        table2.addColumn(2, new Column(202, "user_id", "INT"));
        table2.addColumn(3, new Column(203, "date_created", "DATE"));

        // Add tables
        manager.addTable(table1);
        manager.addTable(table2);

        // Display all tables
        manager.displayAllTables();
        manager.displayAllTables();

        // Find tables with similar-named columns
        List<Table> similarTables = manager.getTablesWithSimilarNamedColumns("date_created");
        System.out.println("\nTables with column 'date_created': " + similarTables);

        // Manage columns
        manager.manageColumns("Users", 4, new Column(104, "email", "VARCHAR"), "add");
        manager.manageColumns("Orders", 3, null, "remove");

        // Display all tables after modifications
        manager.displayAllTables();

    }
}