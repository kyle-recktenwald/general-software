# Databases on AWS:

### Introduction to Databases on AWS:
* **History Behind Enterprise Databases:**
  * **Choosing a database** **used to be a straightforward decision**
  * Customers had **only a few options to choose from**
  * Typically, they would **consider a few vendors** and then, inevitably, **choose one** for **all their applications**
  * Businesses **often selected** a **database technology before they fully understood their use case**
  * Since the 1970s, the database type **most commonly selected** by businesses was a **relational database**
* **Relational Databases:**
  * A **relational database organizes data into tables**
  * **Data in one table** can **link to data in other tables** to **create relationships**
  * Hence, the **relational part of the name**
  * A **table stores data** in **rows** and **columns**
  * A **row**, often called a **record**, **contains all information** about a **specific entry**
  * **Columns describe attributes of an entry**
  * The following image is an **example** of **three tables** in a **relational database**
  * <img src="images/Module_5/Relational_Database.png" width="600">
  * It shows a **table for books**, a **table for sales**, and a **table for authors**
  * In the **books table**, **each row includes** the **International Standard Book Number (ISBN)**, **title**, 
    **author**, and **format**
  * **Each of these attributes** is **stored in its own column**
  * The **books table** has the **author attribute in common** with the **other two tables**
  * That **common column** creates a **relationship between the tables**
  * The **tables**, **rows**, **columns**, and **relationships between them** is called a **logical schema**
  * With **relational databases**, a **schema is fixed**
  * **After the database is operational**, it **becomes difficult to change the schema**
  * Because of this, **most of the data modeling** is **done up front before the database is active**
* **Relational Database Management System:**
  * With a **relational database management system (RDBMS)**, you can **create**, **update**, and **administer** a 
    **relational database**
  * Some **common examples** of **RDBMSs** include the following:
    * **MySQL**
    * **PostgresQL**
    * **Oracle**
    * **Microsoft SQL Server**
    * **Amazon Aurora**
  * You **communicate with an RDBMS** by using **structured query language (SQL) queries**, similar to the following 
    **example**:
    * **`SELECT * FROM table_name`**
  * This **query selects all the data** from a **particular table**
  * However, the **power of SQL queries** is in **creating more complex queries** that **pull data from several tables** 
    to **identify patterns and answers** to **business problems**
  * For example, **querying the sales table** and the **books table together** to see **sales in relation to an author’s 
    books**
  * **Querying tables together** to **better understand their relationships** is made possible by a **"join"**
* **Relational Database Benefits:**
  * **Complex SQL:**
    * With SQL, you can **join multiple tables** so you can **better understand relationships between your data**
  * **Reduced Redundency:**
    * You can **store data in one table** and **reference it from other tables** instead of **saving the same data in 
      different places**
  * **Familiarity:**
    * Because relational databases have been a **popular choice since the 1970s**, **technical professionals** often 
      have **familiarity** and **experience** with them
  * **Acuracy:**
    * Relational databases ensure that your data has **high integrity** and adheres to the **atomicity**, 
      **consistency**, **isolation**, and **durability (ACID) principle**
* **Relational Database Use Cases:**
  * **Much of the world** runs on relational databases
  * In fact, they’re **at the core** of **many mission-critical applications**, some of which you might use in your 
    day-to-day life
  * **Applications That Have a Fixed Schema:**
    * These are applications that have a **fixed schema** and **don't change often**
    * An example is a **lift-and-shift application** that **lifts an app from on-premises** and **shifts it to the 
      cloud**, with **little or no modifications**
  * **Applications That Need Persistent Storage:**
    * These are applications that **need persistent storage** and follow the **ACID principle**, such as:
      * **Enterprise resource planning (ERP) applications**
      * **Customer relationship management (CRM) applications**
      * **Commerce and financial applications**
* **Choose Between Unmanaged and Managed Databases:**
  * If you want to **trade your on-premises database** for a **relational database on AWS**, you first need to select 
    **how you want to run it**; **managed** or **unmanaged**
  * Managed services and unmanaged services are **handled similar** to the **shared responsibility model**
  * The shared responsibility model **distinguishes between AWS security responsibilities** and the **customer’s 
    security responsibilities**
  * Likewise, managed compared to unmanaged can be understood as a **trade-off between convenience and control**
  * **Unmanaged Databases:**
    * If you operate a relational database **on premises**, you are **responsible for all aspects of operation**
      * This includes **data center security and electricity**, **host machines management**, **database management**, 
        **query optimization**, and **customer data management**
      * You are **responsible for absolutely everything**, which means you have **control over absolutely everything**
    * Now, suppose you want to **shift some of the work to AWS** by running your relational database on **Amazon Elastic 
      Compute Cloud (Amazon EC2)**
      * If you **host a database on Amazon EC2**, **AWS implements and maintains the physical infrastructure and 
        hardware** and **installs the EC2 instance operating system (OS)**
      * However, **you are still responsible** for **managing the EC2 instance**, **managing the database on that host**, 
        **optimizing queries**, and **managing customer data**
      * This is called an **unmanaged database option**
      * In this option, **AWS is responsible for** and **has control** over the **hardware** and **underlying 
        infrastructure**
      * **You are responsible** for and **have control over management of the host and database**
    *   <img src="images/Module_5/Unmanaged_Database.png" width="500">
    * **You are responsible** for **everything in a database hosted on-premises**
    * **AWS** takes on **more of that responsibility** in **databases hosted in Amazon EC2**
  * **Managed Databases:**
    * To **shift more of the work to AWS**, you can use a **managed database service**
    * These services provide the **setup** of **both the EC2 instance and the database**, and they p**rovide systems** 
      for **high availability**, **scalability**, **patching**, and **backups**
    * However, in this model, **you’re still responsible** for **database tuning**, **query optimization**, and ensuring 
      that your **customer data is secure**
    * This option provides the **ultimate convenience** but the **least amount of control** compared to the two previous 
      options
    * <img src="images/Module_5/Managed_Database.png" width="300">
  
### Amazon RDS:
* **Amazon RDS Overview:**
  * Amazon RDS is a managed database service customers can use to create and manage relational databases in the cloud 
    without the operational burden of traditional database management
  * For example, imagine you sell healthcare equipment, and your goal is to be the number-one seller on the West Coast 
    of the United States
  * Building a database doesn’t directly help you achieve that goal
  * However, having a database is a necessary component to achieving that goal
  * With Amazon RDS, you can offload some of the unrelated work of creating and managing a database
  * You can focus on the tasks that differentiate your application, instead of focusing on infrastructure-related tasks, 
    like provisioning, patching, scaling, and restoring
  * Amazon RDS supports most of the popular RDBMSs, ranging from commercial options to open-source options and even a 
    specific AWS option
  * Supported Amazon RDS engines include the following:
    * **Commercial:** Oracle, SQL Server
    * **Open Source:** MySQL, PostgreSQL, MariaDB
    * **Cloud Native:** Aurora
* Database Instances:
  * Just like the databases you build and manage yourself, Amazon RDS is built from compute and storage
  * The compute portion is called the database (DB) instance, which runs the DB engine
  * Depending on the engine selected, the instance will have different supported features and configurations
  * A DB instance can contain multiple databases with the same engine, and each DB can contain multiple tables
  * Underneath the DB instance is an EC2 instance
  * However, this instance is managed through the Amazon RDS console instead of the Amazon EC2 console
  * When you create your DB instance, you choose the instance type and size
  * The DB instance class you choose affects how much processing power and memory it has
  * <img src="images/RDS_Instance_Config.png" width="600">
    * **1. Standard Classes:**
      * Standard instancess provide a balance of compute, memory, and network resources
      * They are a good choice for many database workloads
    * **2. Memory Optimized Classes:**
      * Memory opttimized instances accelerate performance for workloadss that process large datasets in memory
    * **3. Burstable Classes:**
      * Burstable performance instances provide baseline level of CPU performance with the ability to burst above the 
        baseline
    * **4. Amazon RDS Instance Configiuration Dropdown Menu:**
      * By choosing the dropdown menu, you can select from a range of instance configurations with different 
       computational, networking, and memory capacity
* Storage on Amazon RDS:
  * The storage portion of DB instances for Amazon RDS use Amazon Elastic Block Store (Amazon EBS) volumes for database and log storage. This includes MySQL, MariaDB, PostgreSQL, Oracle, and SQL Server.

When using Aurora, data is stored in cluster volumes, which are single, virtual volumes that use solid-state drives (SSDs). A cluster volume contains copies of your data across three Availability Zones in a single AWS Region. For nonpersistent, temporary files, Aurora uses local storage.

Amazon RDS provides three storage types: General Purpose SSD (also called gp2 and gp3), Provisioned IOPS SSD (also called io1), and Magnetic (also called standard). They differ in performance characteristics and price, which means you can tailor your storage performance and cost to the needs of your database workload.

To learn more about the different storage types, choose each of the three numbered markers.
  
  