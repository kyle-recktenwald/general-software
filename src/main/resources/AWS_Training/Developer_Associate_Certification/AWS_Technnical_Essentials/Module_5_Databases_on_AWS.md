# Databases on AWS:

### Introduction to Databases on AWS:
* **History Behind Enterprise Databases:**
  * Choosing a database used to be a straightforward decision
  * Customers had only a few options to choose from
  * Typically, they would consider a few vendors and then, inevitably, choose one for all their applications
  * Businesses often selected a database technology before they fully understood their use case
  * Since the 1970s, the database type most commonly selected by businesses was a relational database
* **Relational Databases:**
  * A relational database organizes data into tables
  * Data in one table can link to data in other tables to create relationships—hence, the relational part of the name
  * A table stores data in rows and columns
  * A row, often called a record, contains all information about a specific entry
  * Columns describe attributes of an entry
  * The following image is an example of three tables in a relational database
  * <img src="images/Module_5/Relational_Database.png" width="600">
  * The preceding image shows a table for books, a table for sales, and a table for authors
  * In the books table, each row includes the International Standard Book Number (ISBN), title, author, and format
  * Each of these attributes is stored in its own column
  * The books table has something in common with the other two tables—the author attribute
  * That common column creates a relationship between the tables
  * The tables, rows, columns, and relationships between them is called a logical schema
  * With relational databases, a schema is fixed
  * After the database is operational, it becomes difficult to change the schema
  * Because of this, most of the data modeling is done up front before the database is active

Relational database management system

With a relational database management system (RDBMS), you can create, update, and administer a relational database. Some common examples of RDBMSs include the following:

MySQL
PostgresQL
Oracle
Microsoft SQL Server
Amazon Aurora
You communicate with an RDBMS by using structured query language (SQL) queries, similar to the following example:

SELECT * FROM table_name.

This query selects all the data from a particular table. However, the power of SQL queries is in creating more complex queries that pull data from several tables to identify patterns and answers to business problems. For example, querying the sales table and the books table together to see sales in relation to an author’s books. Querying tables together to better understand their relationships is made possible by a "join".

Relational database benefits

To learn more about the benefits of using relational databases, flip each of the following flashcards by choosing them. 