# Distributed Computing Overview:

### Overview:
* **Distributed computing** refers to a **model of computation** in which **multiple computers** or **processing units** 
  **work together** to **solve a problem** or **perform a task**
* Instead of relying on a **single centralized computer**, distributed computing **distributes the workload** across a 
  **network** of **interconnected computers**, also known as **nodes** or **hosts**
* Key characteristics of distributed computing include:
  * **Parallel Processing:**
    * **Tasks** are divided into **smaller sub-tasks** that can be **processed simultaneously** across **multiple 
      nodes**
    * This **parallel processing capability** allows for **faster execution of computations**
  * **Resource Sharing:**
    * Distributed computing enables the **sharing of resources** such as **processing power**, **memory**, and 
      **storage** among the **connected nodes**
    * This **pooling of resources** allows for **more efficient utilization** and **scalability**
  * **Fault Tolerance:**
    * Distributed systems are designed to be **resilient against individual node failures**
    * If **one node fails** or **becomes unavailable**, the **system** can **continue to operate** by **redistributing 
      the workload** to **other available nodes**
  * **Scalability:**
    * Distributed computing systems can **easily scale** by **adding more nodes** to the **network**
    * This scalability allows for **handling larger workloads** and **accommodating increased demand**
  * **Decentralization:**
    * Unlike traditional centralized systems, distributed computing systems often operate in a **decentralized manner**
    * They **don’t rely** on a **single point of control** and can function even **if some nodes or components fail**
  * **Interconnectedness:**
    * **Nodes** in a **distributed system communicate** and **coordinate** with each other through **network 
      connections**
    * **Communication protocols** and **technologies** enable **data sharing** and **coordination** among the nodes
* Distributed computing finds applications in various fields such as **scientific research**, **big data processing**, 
  **cloud computing**, **networking**, and more
* Technologies like **grid computing**, **peer-to-peer networks**, **MapReduce**, and **distributed databases** are 
  examples of **distributed computing paradigms** used to **address complex computational problems** by harnessing the 
  **collective power** of **multiple computing resources**
* <img src="images/Distributed_Computing_Diagram.png" width="500">

### The CAP Theorem:
* The **CAP theorem**, also known as **Brewer's theorem**, states that in a **distributed computer system**, it is 
  **impossible** to **simultaneously guarantee all three** of the following:
  * **Consistency (C):**
    * **Every read receives** the **most recent write** or an **error**
    * In other words, **all nodes in the system** see the **same data** at the **same time**, **ensuring consistency 
      across the system**
  * **Availability (A):**
    * **Every request gets a response**, even if **some nodes in the system have failed**
    * It ensures that the **system remains responsive despite failures** and **continues to serve requests**
  * **Partition tolerance (P):**
    * The system **continues to operate despite network partitions** or **communication failures between nodes**
    * This means the system can **handle** and **recover** from **network failures without failing the entire system**
* The CAP theorem asserts that in the event of a **network partition (P)**, a **trade-off must be made** between 
  **consistency (C)** and **availability (A)**
* In other words, in a **network partition**, if there is a **network failure** and **nodes are unable to communicate**, 
  you have to choose between:
    * **Consistency over Availability:**
      * You **prioritize consistency** by **sacrificing availability**
      * This means that **during a partition**, the **system may become unavailable until the network is restored**, 
        ensuring that **all nodes have consistent data**
    * **Availability over Consistency:**
      * You **prioritize availability** by **sacrificing consistency**
      * This means the **system remains available**, possibly **providing stale or divergent data** to **different 
        nodes** during the partition, but it **continues to function**
* It's important to note that the CAP theorem **doesn't imply** that you can **only choose one of the three properties 
  all the time**
* Instead, it **highlights** the **inherent trade-offs** that **must be considered** when **designing distributed 
  systems**
* **Different systems** may **prioritize consistency**, **availability**, or **partition tolerance differently** based 
  on their **specific requirements** and **use cases**
* Various distributed database systems employ **different strategies** and **trade-offs**, aiming to **balance these 
  properties** according to their application needs