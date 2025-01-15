# tableMaps
This utilizes the use of tree maps 


Create a Column class with the following fields and include appropriate constructors, geƩ ers, 
seƩ ers: 
Int columnId, String columnName, String dataType 
 Create a Table class with the following fields and include appropriate constructors, geƩ ers, 
seƩ ers: 
Int tableId, String tableName, Map<Integer, Column> columns 
For the Columns, the key is the column posiƟ on.
 Create a Map, Map<String, Table> tables to hold all the Table records: 
o The key is the table name. 
 NB: Make sure the Maps you use in this exercise lexicographically order their keys i.e. maintain 
the order of its keys from lowest to highest. 
 The following are a list of funcƟ onaliƟ es to achieve:
a. Add New Table and its columns 
b. Add/Edit/Remove column in a parƟ cular table.
c. Get Tables which have similar-named columns e.g. date_created 
d. Display All Tables and their columns
