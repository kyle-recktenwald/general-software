### Database Overview:

### Relational Database:
* A **relational database** is a **type of database** that **stores and organizes data** into **tables** with **rows** 
  and **columns**, **establishing relationships between the data** based on **common attributes**
* It follows the principles of the **relational model**, proposed by **Edgar F. Codd** in the **1970s**, emphasizing 
  the **logical structure and integrity of data**
* Key characteristics of a relational database:
  * **Tabular Structure:**
    * Data is organized into **tables (relations)**, where **each table** represents a **specific entity** or **data 
      category**
    * **Each table** consists of **rows** (**records**) and **columns** (**fields/attributes**), with **each column** 
      holding a **different type of data**
  * **Relationships:**
    * **Tables** within a relational database can be **linked through relationships**
    * **Common types of relationships** include **one-to-one**, **one-to-many**, and **many-to-many relationships**, 
      defining **how data in one table relates to data in another**
  * **Normalization:**
    * Relational databases aim to **reduce redundancy and dependency** in data by **applying normalization techniques**
    * Normalization involves **organizing data** to **minimize duplication and anomalies**, ensuring **data 
      consistency** and **integrity**
  * **Structured Query Language (SQL):**
    * Relational databases use **SQL** as the **standard language** for **managing and manipulating data**
    * SQL allows users to perform **various operations** such as **querying**, **inserting**, **updating**, and 
      **deleting data** in the database
  * **Data Integrity:**
    * Relational databases enforce **data integrity** using **constraints** like **primary keys**, **foreign keys**, 
      **unique constraints**, and **check constraints**
    * These constraints **maintain** the **accuracy** and **consistency** of data stored in the database
  * **ACID Properties:**
    * **ACID** (**Atomicity**, **Consistency**, **Isolation**, **Durability**) properties ensure **transactional 
      reliability** and **consistency**
    * Transactions in a relational database are **either completed entirely** or **rolled back in case of failure** to 
      **maintain data integrity**
  * **Scalability and Performance:**
    * Relational databases offer mechanisms for **indexing**, **query optimization**, and **tuning** to **improve 
      performance and scalability**, allowing **efficient retrieval and manipulation** of data **as the database grows**
* Some popular examples of relational database management systems (RDBMS) include **MySQL**, **PostgreSQL**, **Oracle 
  Database**, **Microsoft SQL Server**, and **SQLite**
* Relational databases are **widely used** in **various applications**, including **finance**, **e-commerce**, 
  **healthcare**, and more, due to their **structured nature**, ability to **manage complex relationships between 
  data**, and strong support for **data integrity** and **reliability**

### Relational Database Management System (RDBMS):
* A **Relational Database Management System (RDBMS)** is a **software system** designed to **manage**, **store**, 
  **retrieve**, and **manipulate data** organized in a **relational database**
* It uses a **structured approach** to **store data in tables** that **consist of rows and columns**, providing a way 
  to **establish relationships** between **different sets of data**
* Key components and features of an RDBMS include:
  * **Tables:**
    * Data is **organized into tables**, where **each table represents an entity** or a **specific data category**
    * **Tables** consist of **rows** (**records**) and **columns (fields)** where **each column** represents an 
      **attribute of the data**
  * **Schema:**
    * The **structure** and **organization** of the database are **defined by a schema**, which includes the **tables**, 
      **their columns**, **data types**, **relationships**, **constraints**, and **indexes**
  * **SQL (Structured Query Language):**
    * RDBMS systems use **SQL** to **manage data**
    * SQL provides a **standardized language** for **querying**, **updating**, **inserting**, and **deleting data** 
      from the database
    * It enables users to perform operations like **`SELECT`**, **`INSERT`**, **`UPDATE`**, and **`DELETE`**
  * **ACID Properties:**
    * RDBMS systems typically follow **ACID** (**Atomicity**, **Consistency**, **Isolation**, **Durability**) properties 
      to **ensure data integrity**, **reliability**, and **transactional consistency**
  * **Data Integrity:**
    * RDBMS systems **enforce data integrity** using **constraints** such as **primary keys**, **foreign keys**, 
      **unique constraints**, and **check constraints**
    * These constraints **maintain** the **accuracy and consistency** of data stored in the database
  * **Transactions:**
    * RDBMS supports **transactions**, which are **sequences of operations** that are **performed as a single unit**
    * They ensure that **all operations within a transaction** are **completed successfully** or **rolled back 
      entirely in case of failure**
  * **Indexing:**
    * **Indexes** are used to **optimize data retrieval** by **creating efficient lookup structures**
    * They **speed up query performance** by **providing faster access to specific data within tables**
  * **Concurrency Control:**
    * RDBMS **manages concurrent access** to the database by **multiple users or applications**, ensuring that 
      **transactions do not interfere with each other** and **maintaining data consistency**
* **Popular examples** of RDBMS systems include:
  * **MySQL**
  * **PostgreSQL**
  * **Oracle Database**
  * **Microsoft SQL Server**
  * **SQLite**
* Relational databases are **widely used** in **various applications and industries** due to their **structured and 
  organized nature**, ability to **handle complex relationships between data**, and **strong support for ACID 
  properties**, making them **suitable for mission-critical applications** where **data integrity** and **reliability** 
  are paramount

### ACID Properties:
* **ACID** stands for **Atomicity**, **Consistency**, **Isolation**, and **Durability**
* It's a set of properties that ensure **reliability** and **consistency** in **database transactions**
* These principles are essential for **maintaining data integrity**, especially in systems where **multiple transactions 
  occur concurrently**
* Here's a breakdown of each component of ACID:
  * **Atomicity:**
    * This property ensures that a **transaction** is treated as a **single unit of work**
    * It means that **either all the operations within the transaction** are **executed successfully**, or **none of 
      them are executed at all**
    * If **any part** of the **transaction fails**, the **entire transaction** is **rolled back to its initial state**, 
      ensuring that the **database remains** in a **consistent state**
  * **Consistency:**
    * Consistency ensures that the **database transitions** from **one valid state to another valid state after a 
      successful transaction**
    * In other words, the database should **meet all the predefined rules and constraints** (such as **data types**, 
      **constraints**, and **relationships**) **after the completion of a transaction**
    * Transactions should **maintain** the **integrity of the data** and **not violate any defined constraints**
  * **Isolation:**
    * Isolation ensures that the **concurrent execution** of transactions **does not lead to interference or data 
      inconsistency**
    * **Each transaction** should **operate independently of other transactions running concurrently**
    * Isolation **prevents one transaction from seeing the intermediate, uncommitted state of another transaction**
    * Various isolation levels (like **Read Uncommitted**, **Read Committed**, **Repeatable Read**, **Serializable**) 
      determine the **degree of isolation provided** in a database system
  * **Durability:**
    * Durability **guarantees** that **once a transaction is committed**, the **changes made by that transaction 
      persist** even in the event of **system failures** such as **power outages**, **crashes**, or **errors**
    * The changes are **saved permanently** and are **not lost**
    * These changes are typically stored in **non-volatile memory** (like **disk storage**) to ensure their durability
* These ACID properties together ensure that **database transactions** are **reliable**, **maintain data integrity**, 
  and provide a **high level of consistency** even in **complex** and **concurrent environments**
* They are essential in designing **robust database systems** that **handle critical data**

### NoSQL:
* **NoSQL**, short for "**Not Only SQL**," is a term used to describe a **wide range** of **database systems** that 
  **differ from traditional relational databases** (**SQL databases**) in their **data models**, **storage mechanisms**, 
  and often in their approach to **data consistency**, **scalability**, and **query languages**
* Key characteristics and features of NoSQL databases include:
  * **Non-Relational Data Models:**
    * NoSQL databases often use **non-relational data models** like **document-oriented**, **key-value**, **columnar**, 
      or **graph-based models**
    * These models are **flexible** and can **handle unstructured** or **semi-structured data more effectively** than 
      the **rigid tabular structure of relational databases**
  * **Scalability:**
    * NoSQL databases are designed to **scale horizontally across multiple servers or nodes**, allowing them to **handle 
      large volumes of data** and **high traffic loads**
    * Many NoSQL databases are built with **distributed architecture**, offering **better scalability than traditional 
      SQL databases**
  * **High Performance:**
    * NoSQL databases are **optimized for specific use cases** and can **provide high performance** for **certain types 
      of queries or operations**, especially when dealing with **large-scale data sets**
  * **Schema Flexibility:**
    * Most NoSQL databases offer **schema flexibility**, **allowing changes to the data model without requiring a 
      predefined schema**
    * This flexibility can be **beneficial** for **agile development** and **handling evolving data structures**
  * **Eventual Consistency:**
    * Some NoSQL databases **prioritize availability and partition tolerance over strict consistency**, following the 
      **CAP theorem (Consistency, Availability, Partition tolerance)**
    * They may provide **eventual consistency**, where **data may temporarily be inconsistent across distributed nodes** 
      but **will eventually converge to a consistent state**
* **Types of NoSQL databases:**
  * **Document Databases:**
    * Store and retrieve **semi-structured data** as **documents** (e.g., **MongoDB**, **Couchbase**)
  * **Key-Value Stores:**
    * Store data in a **schema-less manner** using a **key-value pair** (e.g., **Redis**, **Amazon DynamoDB**)
  * **Column-Family Stores:**
    * Store data in **columns rather than rows**, suited for **large-scale data storage and retrieval** (e.g., **Apache 
      Cassandra**, **HBase**)
  * **Graph Databases:**
    * Designed for **storing and querying relationships between data entities** (e.g., **Neo4j**, **Amazon Neptune**)
* NoSQL databases are **widely used in modern applications** for **handling various types of data**, especially in 
  scenarios where **high scalability**, **flexibility**, and **performance** are **critical**, such as in **web 
  applications**, **real-time analytics**, **IoT**, and **big data processing**

### Data Lake:
* A **data lake** is a **centralized repository** that allows organizations to **store** and **manage large volumes of 
  diverse and raw data at scale**
* **Unlike a traditional data warehouse**, which is **structured** and **optimized for analysis**, a data lake is 
  **designed to store raw**, **unstructured**, **semi-structured**, and **structured data** in its **native format**
* This flexibility makes data lakes **well-suited** for **handling a wide variety of data types and sources**
* **Key characteristics** of a data lake include:
  * **Storage of Raw Data:**
    * Data lakes store **raw** and **unprocessed data**, **preserving its original format**
    * This includes **data from various sources** such as **logs**, **social media**, **sensor data**, and more
    * The goal is to **capture data** in its **native state before any transformation or structuring takes place**
  * **Scalability:**
    * Data lakes are **designed** to **scale horizontally**, allowing organizations to **handle massive amounts of 
      data** by **adding more storage capacity**
    * This **scalability** is **crucial** as the **volume and variety of data continue to grow**
  * **Schema-on-Read:**
    * **Unlike traditional databases** that use a **schema-on-write approach**, data lakes use a **schema-on-read 
      model**
    * This means that the **structure** and **organization of the data** are **determined at the time of analysis rather 
      than during the data ingestion process**
    * This **flexibility** makes it **easier to adapt** to **evolving data requirements**
  * **Diverse Data Types:**
    * Data lakes can store a **wide variety of data types**, including **structured data** (like **relational 
      databases**), **semi-structured data** (like **JSON or XML**), and **unstructured data** (such as **text 
      documents**, **images**, and **videos**)
  * **Support for Big Data Technologies:**
    * Data lakes **often leverage big data technologies**, such as **Apache Hadoop** and **Apache Spark**, for 
      **distributed storage and processing**
    * These technologies enable **parallel processing and analysis** of **large datasets**
  * **Data Catalog and Metadata Management:**
    * To make the data in a data lake **discoverable** and **understandable**, **metadata management** is **crucial**
    * Data lakes **often include a data catalog** that **provides metadata** about the **stored data**, **helping users 
      find and comprehend the available information**
  * **Data Governance and Security:**
    * While data lakes **provide flexibility**, it's **important** to implement **robust data governance** and 
      **security measures**
    * **Access controls**, **encryption**, and **auditing** are **typically implemented** to **protect sensitive 
      information** and **ensure compliance with regulations**
  * **Integration with Analytics and Machine Learning:**
    * Data lakes serve as a **foundation** for **advanced analytics** and **machine learning applications**
    * **Analytical tools** and **machine learning algorithms** can **directly operate on the raw data**, allowing 
      organizations to **derive insights and patterns** from **diverse datasets**
* **Popular cloud-based data lake solutions** include **Amazon S3 (Simple Storage Service)**, **Microsoft Azure Data 
  Lake Storage**, and **Google Cloud Storage**
* Organizations often use **data lakes in conjunction with data warehouses** to create a **comprehensive and flexible 
  data architecture**

### Data Warehouse:
* A **data warehouse** is a **centralized repository** for **storing and managing large volumes of structured** and 
  **unstructured data** from **various sources within an organization**
* It is designed to **support business intelligence (BI)** and **reporting activities** by providing a **unified and 
  historical view of data**
* **Key characteristics** of a data warehouse in software include:
  * **Centralized Storage:**
    * Data warehouses **consolidate data** from **multiple sources** into a **single, central repository**
    * This helps in creating a **unified view** of the **organization's data**
  * **Structured and Optimized for Analysis:**
    * Data in a warehouse is **organized** in a **structured manner**, often using a **dimensional or star schema**, 
      which is **optimized for analytical queries**
    * This schema design allows for **efficient querying and reporting**
  * **Historical Data:**
    * Data warehouses **typically store historical data**, enabling users to **analyze trends and changes over time**
    * This is crucial for making **informed business decisions** based on **historical performance**
  * **ETL Processes:**
    * **Extract, Transform, Load (ETL) processes** are used to **extract data from source systems**, **transform** it 
      into a **suitable format for analysis**, and then **load it into the data warehouse**
    * This ensures **data consistency** and **quality**
  * **Query and Reporting Tools:**
    * Data warehouses provide **tools and interfaces** for **querying and reporting**
    * **Business intelligence tools** often **connect to data warehouses** to perform **complex analyses** and 
      **generate reports for decision-making**
  * **Scalability:**
    * Data warehouses are **designed** to **handle large volumes of data** and **support the scalability needs** of 
      **growing organizations**
    * This scalability ensures that the **system can handle increasing amounts of data without compromising 
      performance**
  * **Security and Access Control:**
    * Data warehouses implement **robust security measures** to **protect sensitive information**
    * **Access control mechanisms** are in place to ensure that **only authorized users can access specific data**
  * **Data Integration:**
    * Data warehouses **integrate data from various sources**, which may include **transactional databases**, **external 
      sources**, **spreadsheets**, and more
    * This integration provides a **holistic view** of the **organization's data**
* Popular data warehousing solutions include **Microsoft SQL Server Analysis Services**, **Oracle Exadata**, **Amazon 
  Redshift**, **Google BigQuery**, and **Snowflake**, among others
* These solutions offer **features** and **functionalities** to **effectively manage and analyze data** for **business 
  intelligence purposes**

### Apache Airflow:
* **Apache Airflow** is an **open-source platform** designed to **programmatically author**, **schedule**, and **monitor 
  workflows or data pipelines**
* It allows users to **define** and **execute complex workflows**, **automate data processing**, and **manage 
  dependencies between tasks** in a **scalable** and **maintainable** way
* Developed by the **Apache Software Foundation**, Apache Airflow is **widely used** for **orchestrating** and 
  **automating** **various data-related tasks**
* **Key features** of Apache Airflow include:
  * **Directed Acyclic Graphs (DAGs):**
    * **Workflows** in Apache Airflow are **represented** as **directed acyclic graphs (DAGs)**
    * **DAGs define the order and relationships between tasks**, allowing users to **create complex workflows** by 
      **chaining together individual tasks**
  * **Extensibility:**
    * Apache Airflow is **highly extensible** and **supports the integration** of **custom operators**, **sensors**, and 
      **hooks**
    * This extensibility allows users to **incorporate their own logic and connectors into their workflows**
  * **Dynamic Workflow Generation:**
    * Airflow allows for the **dynamic generation of workflows based on parameters or external conditions**, making it 
      **flexible and adaptable** to **changing requirements**
  * **Scheduler:**
    * The **Airflow scheduler orchestrates the execution of tasks** based on the **defined dependencies and schedules**
    * It ensures that **tasks are executed in the correct order** and **according to the specified intervals**
  * **Web-Based User Interface:**
    * Apache Airflow provides a **web-based user interface** that allows users to **monitor**, **visualize**, and 
      **manage their workflows**
    * Users can **view** the **status of tasks**, **inspect logs**, and **trigger or pause workflows** through this 
      interface
  * **Parallel Execution:**
    * Airflow **supports parallel execution of tasks**, allowing **multiple tasks** to **run concurrently** when their 
      **dependencies are satisfied**
    * This feature helps **optimize workflow execution** and **reduce processing time**
  * **Logging and Monitoring:**
    * Airflow provides **robust logging capabilities**, making it **easy** to **troubleshoot** and **monitor** the 
      **execution of workflows**
    * **Integration** with **external logging and monitoring tools** is **also possible**
  * **Integration with External Systems:**
    * Apache Airflow **can integrate** with **various external systems and services**, such as **databases**, **cloud 
      platforms**, and **message queues**
    * This integration allows for **seamless data movement** and **interaction with other components** in a **data 
      ecosystem**
  * **Metadata Database:**
    * Airflow uses a **metadata database** to **store information about workflows**, **tasks**, and **their statuses**
    * This metadata helps **track the state of workflows** and **facilitates historical analysis**
* Apache Airflow has **gained popularity** in the **data engineering** and **data science communities** for its 
  **flexibility**, **scalability**, and **ease of use** in **managing complex data workflows**
* It is **widely adopted** for tasks such as **ETL (Extract, Transform, Load) processes**, **data migration**, and 
  **regular data processing jobs** in **diverse environments**

### Apache Spark:
* **Apache Spark** is an **open-source distributed computing system** that provides a **fast** and **general-purpose 
  cluster-computing framework** for **big data processing and analytics**
* It was developed by the **Apache Software Foundation** and is **written in Scala and Java**
* Spark is designed to be **fast**, **flexible**, and **easy to use**
* **Key features** of Apache Spark include:
  * **Speed:**
    * Spark is known for its **speed** and **efficiency**, particularly **in comparison to the traditional Hadoop 
      MapReduce model**
    * It achieves **high performance** through **in-memory processing** and **optimization techniques** like **lazy 
      evaluation** and **pipelining**
  * **Ease of Use:**
    * Spark provides **high-level APIs** for **programming in Java**, **Scala**, **Python**, and **R**, making it 
      **accessible to a wide range of developers**
    * It also **offers interactive shells for these languages**, facilitating **easy development** and **testing**
  * **Versatility:**
    * Spark **supports a variety of workloads**, including **batch processing**, **interactive queries**, **streaming**, 
      and **machine learning**
    * It comes with **libraries** for **data analysis** (**Spark SQL**), **machine learning (MLlib)**, **graph 
      processing (GraphX)**, and **stream processing (Structured Streaming)**
  * **Fault Tolerance:**
    * Spark provides **fault tolerance** through **lineage information**, which allows it to **reconstruct lost data in 
      case of node failures**
    * **Resilient Distributed Datasets (RDDs)** are the **fundamental data structure** that **enables fault tolerance**
  * **Compatibility:**
    * Spark is designed to **work seamlessly** with **Hadoop Distributed File System (HDFS)** and **can also read data** 
      from **other storage systems**, including **HBase**, **Apache Cassandra**, and **Amazon S3**
  * **Cluster Manager Integration:**
    * Spark **can be integrated** with **various cluster managers**, such as **Apache Mesos**, **Apache Hadoop YARN**, 
      and **standalone Spark cluster manager**
    * This **flexibility** makes it **easy to deploy Spark** on **different computing infrastructures**
  * **Community and Ecosystem:**
    * Apache Spark has a **large and active community**, contributing to its **continuous development and improvement**
    * It also has a **growing ecosystem** of **third-party libraries and tools** that **enhance its functionality**
* Spark's ability to **handle complex data processing tasks efficiently** and its **support for various programming 
  languages and libraries** have made it a **popular choice** for **big data processing and analytics** in **diverse 
  industries**

### Apache Parquet:

### Hadoop:
* **Hadoop** is an **open-source distributed computing framework** designed for **processing and storing large volumes 
  of data across clusters of commodity hardware**
* It was **created** by **Doug Cutting** and **Mike Cafarella** and is **maintained by the Apache Software Foundation**
* **Key components** of the Hadoop ecosystem include:
  * **Hadoop Distributed File System (HDFS):**
    * **HDFS** is a **distributed file system** designed to **store large volumes of data across multiple machines in a 
      Hadoop cluster**
    * It provides **high throughput access to data** and is **fault-tolerant**, meaning it **can continue to operate** 
      even if **individual nodes fail**
  * **MapReduce:**
    * MapReduce is a **programming model** and **processing engine** for **distributed data processing**
    * It allows users to **write parallelizable computations** in the form of **map and reduce functions**, which are 
      **automatically distributed and executed across the nodes in a Hadoop cluster**
  * **YARN (Yet Another Resource Negotiator):**
    * **YARN** is a **resource management** and **job scheduling framework** in Hadoop
    * It allows **multiple data processing engines** such as **MapReduce**, **Apache Spark**, **Apache Flink**, and 
      others to **run concurrently on the same cluster**, enabling **more efficient resource utilization**
  * **Hadoop Common:**
    * **Hadoop Common** contains **libraries** and **utilities** that **support other Hadoop modules**
    * It includes **common utilities**, **configuration files**, and **dependencies used across the Hadoop ecosystem**
  * **Hadoop Ecosystem Projects:**
    * The **Hadoop ecosystem** consists of **various projects and tools built on top of Hadoop** to **extend its 
      capabilities**
    * Some popular ecosystem projects include **Apache Hive (data warehouse)**, **Apache Pig (data flow scripting)**, 
      **Apache HBase (NoSQL database)**, **Apache Spark (in-memory data processing)**, **Apache Kafka (distributed event 
      streaming platform)**, and many others
* Hadoop is **widely used** in **industries** such as **finance**, **healthcare**, **retail**, **telecommunications**, 
  and more for **processing and analyzing large-scale data sets**
* Its **distributed nature** and **scalability** make it suitable for a **wide range of use cases**, including **batch 
  processing**, **real-time analytics**, **machine learning**, and **data warehousing**

### Apache Hive:
* **Apache Hive** is a **data warehouse infrastructure built on top of Hadoop**, which is an **open-source framework** 
  for **distributed storage** and **processing of large data sets across clusters of computers**
* Hive **provides a mechanism** to **query and analyze data stored in Hadoop's distributed file system** (**HDFS**) or 
  **other compatible storage systems**, using a **language called HiveQL**
* Here are the key components and features of Apache Hive:
  * **HiveQL:**
    * **Hive Query Language (HiveQL)** is an **SQL-like language** used to **query and manipulate data stored in Hive**
    * It provides **familiar SQL syntax** for **querying structured data**, making it **accessible to users familiar 
      with traditional relational databases**
  * **Metastore:**
    * Hive uses a **metastore** to **store metadata** about the **structure of the data**, such as **table schemas**, 
      **partition information**, **column statistics**, and **storage location**
    * The metastore is **typically backed** by a **relational database** like **MySQL**, **PostgreSQL**, or **Derby** 
  * **Hive Execution Engine:**
    * Hive **supports multiple execution engines** for **executing HiveQL queries**
    * The **default execution engine** is **MapReduce**, but it **also supports other execution engines** such as 
      **Tez** and **Spark**, which offer **improved performance** and **optimization capabilities**
  * **Storage Formats:**
    * Hive **supports various storage formats** for **data stored in Hadoop**, including **text files**, 
      **SequenceFiles**, **ORC (Optimized Row Columnar)**, **Parquet**, and others
    * These formats **offer different trade-offs** in terms of **compression**, **query performance**, and **data 
      storage efficiency**
  * **Partitioning and Bucketing:**
    * Hive allows users to **partition data based on one or more columns**, which can **significantly improve query 
      performance** by **reducing the amount of data scanned**
    * Additionally, **bucketing enables data** to be **evenly distributed into smaller files based on hash functions**, 
      **further enhancing query performance**
  * **UDFs and UDAFs:**
    * Hive supports **User-Defined Functions (UDFs)** and **User-Defined Aggregation Functions (UDAFs)**, allowing 
      users to **extend Hive's functionality** by writing **custom functions** in **Java**, **Python**, or other 
      languages
* Overall, Apache Hive **simplifies the process** of **querying and analyzing large-scale data stored in Hadoop**, 
  making it **accessible to users** who are **familiar with SQL and relational databases**
* It is **widely used** in **data warehousing**, **analytics**, and **big data processing applications**

### Apache Iceberg:
* Apache Iceberg is an **open-source table format** for **large-scale data processing** in **distributed environments** 
  such as **Hadoop** and **Spark**
* It is designed to **address the challenges** of **managing and querying large volumes of data** in a **scalable and 
  efficient manner**
* Iceberg provides features for **managing schema evolution**, **data versioning**, and **transactional consistency**
* **Key features** of Apache Iceberg include:
  * Schema Evolution:
    * Iceberg supports schema evolution, allowing changes to the table schema without requiring a full rewrite of the 
      data
    * This enables seamless updates to the table structure as requirements evolve over time
  * Transactional Consistency:
    * Iceberg provides transactional guarantees for write operations, ensuring data consistency even in the presence of 
      concurrent writes and failures
    * This makes it suitable for use cases where data integrity is critical
  * Data Versioning:
    * Iceberg maintains a history of table versions, allowing users to query data as of a specific point in time
    * This enables reproducible analyses and facilitates auditing and compliance requirements
  * Partitioning and Sorting:
    * Iceberg supports partitioning and sorting of data, which can improve query performance by organizing data into 
      smaller, more manageable chunks and ensuring that data is stored in a sorted order
  * Metadata Management:
    * Iceberg stores table metadata separately from the underlying data, making it possible to efficiently query and 
      manage metadata without requiring access to the entire dataset
  * Compatibility:
    * Iceberg is designed to be compatible with existing data processing frameworks such as Apache Spark and Apache 
      Hive, making it easy to integrate with existing workflows and tools
* Overall, Apache Iceberg provides a flexible and scalable solution for managing large-scale data sets, with features 
  that address many of the challenges associated with data management in distributed environments