# Module 4: AWS Storage

### Storage Types:
* **Introduction:**
  * AWS storage services are grouped into three categories: **file storage**, **block storage**, and **object storage**
  * In **file storage**, data is **stored as files** in a **hierarchy**
  * In **block storage**, data is stored in **fixed-size blocks**
  * And in **object storage**, data is stored as **objects in buckets**
* **File Storage:**
  * You might be familiar with file storage if you have interacted with **file storage systems** like **Windows File 
    Explorer** or **Finder on macOS**
  * Files are **organized** in a **tree-like hierarchy** that consist of **folders and subfolders**
  * For **example**, if you have **hundreds of cat photos** on your laptop, you might want to **create a folder** called 
    **Cat photos**, and **place the images inside that folder to organize them**
  * Because you **know that these images** will be **used in an application**, you might want to **place the Cat photos 
    folder inside another folder** called **Application files**
  * Each file has **metadata** such as **file name**, **file size**, and the **date the file was created**
  * The file also has a **path**, for example, **`computer/Application_files/Cat_photos/cats-03.png`**
  * When you need to **retrieve a file**, your system can use the **path** to **find it in the file hierarchy**
  * File storage is **ideal** when you require **centralized access to files** that must be **easily shared and 
    managed** by **multiple host computers**
  * Typically, this storage is **mounted** onto **multiple hosts**, and **requires file locking** and **integration with 
    existing file system communication protocols**
  * **Use cases for File Storage:**
    * **Web Serving:**
      * **Cloud file storage solutions** follow **common file-level protocols**, **file naming conventions**, and 
        **permissions** that **developers are familiar with**
      * Therefore, **file storage can be integrated into web applications**
    * **Analytics:**
      * Many **analytics workloads interact with data through a file interface** and rely on features such as **file 
        lock** or **writing to portions of a file**
      * **Cloud-based file storage** supports **common file-level protocols** and has the ability to **scale capacity 
        and performance**
      * Therefore, file storage can be **conveniently integrated** into **analytics workflows**
    * **Media and Entertainment:**
      * Many businesses use a **hybrid cloud deployment** and need **standardized access using file system protocols 
        (NFS or SMB)** or **concurrent protocol access**
      * **Cloud file storage** follows **existing file system semantics**
      * Therefore, **storage of rich media content** for **processing and collaboration** can be integrated for 
        **content production**, **digital supply chains**, **media streaming**, **broadcast playout**, **analytics**, 
        and **archive**
    * **Home Directories:**
      * Businesses wanting to **take advantage** of the **scalability** and **cost benefits of the cloud** are 
        **extending access to home directories** for **many of their users**
      * **Cloud file storage systems** adhere to **common file-level protocols** and **standard permissions models**
      * Therefore, customers can **lift and shift applications** that **need this capability to the cloud**
* **Block Storage:**
  * File storage treats files as a singular unit, but block storage splits files into fixed-size chunks of data called 
    blocks that have their own addresses
  * Each block is an individual piece of data storage
  * Because each block is addressable, blocks can be retrieved efficiently
  * Think of block storage as a more direct route to access the data
  * When data is requested, the addresses are used by the storage system to organize the blocks in the correct order to 
    form a complete file to present back to the requestor
  * Besides the address, no additional metadata is associated with each block
  * If you want to change one character in a file, you just change the block, or the piece of the file, that contains 
    the character
  * This ease of access is why block storage solutions are fast and use less bandwidth
  * Use Cases for Block Storage:
    * Because block storage is optimized for low-latency operations, it is a preferred storage choice for 
      high-performance enterprise workloads and transactional, mission-critical, and I/O-intensive applications
    * **Transactional Workloads:**
      * Organizations that process time-sensitive and mission-critical transactions store such workloads into a 
        low-latency, high-capacity, and fault-tolerant database
      * Block storage allows developers to set up a robust, scalable, and highly efficient transactional database
      * Because each block is a self-contained unit, the database performs optimally, even when the stored data grows
    * **Containers:**
      * Developers use block storage to store containerized applications on the cloud
      * Containers are software packages that contain the application and its resource files for deployment in any 
        computing environment
      * Like containers, block storage is equally flexible, scalable, and efficient
      * With block storage, developers can migrate the containers seamlessly between servers, locations, and operating 
        environments
    * **Virtual Machines:**
      * Block storage supports popular virtual machine (VM) hypervisors
      * Users can install the operating system, file system, and other computing resources on a block storage volume
      * They do so by formatting the block storage volume and turning it into a VM file system
      * So they can readily increase or decrease the virtual drive size and transfer the virtualized storage from one 
        host to another
* **Object Storage:**
  * In object storage, files are stored as objects
  * Objects, much like files, are treated as a single, distinct unit of data when stored
  * However, unlike file storage, these objects are stored in a bucket using a flat structure, meaning there are no 
    folders, directories, or complex hierarchies
  * Each object contains a unique identifier
  * This identifier, along with any additional metadata, is bundled with the data and stored
  * Changing just one character in an object is more difficult than with block storage
  * When you want to change one character in an object, the entire object must be updated
  * **Use Cases for Object Storage:**
    * With object storage, you can store almost any type of data, and there is no limit to the number of objects stored, 
      which makes it readily scalable
    * Object storage is generally useful when storing large or unstructured data sets
    * **Data Archiving:**
      * Cloud object storage is excellent for long-term data retention
      * You can cost-effectively archive large amounts of rich media content and retain mandated regulatory data for 
        extended periods of time
      * You can also use cloud object storage to replace on-premises tape and disk archive infrastructure
      * This storage solution provides enhanced data durability, immediate retrieval times, better security and 
        compliance, and greater data accessibility
    * **Backup and Recovery:**
      * You can configure object storage systems to replicate content so that if a physical device fails, duplicate 
        object storage devices become available
      * This ensures that your systems and applications continue to run without interruption
      * You can also replicate data across multiple data centers and geographical regions
    * **Rich Media:**
      * With object storage, you can accelerate applications and reduce the cost of storing rich media files such as 
        videos, digital images, and music
      * By using storage classes and replication features, you can create cost-effective, globally replicated 
        architecture to deliver media to distributed users
* **Relating Back to Traditional Storage Systems:**
  * If you have worked with on-premises storage, you might already be familiar with block, file, and object storage
  * Consider the following technologies and how they relate to systems that you might have seen before:
    * Block storage in the cloud is analogous to direct-attached storage (DAS) or a storage area network (SAN)
    * File storage systems are often supported with a network-attached storage (NAS) server
  * Adding storage in a traditional data center is a rigid process—the storage solutions must be purchased, installed, 
    and configured
  * With cloud computing, the process is more flexible
  * You can create, delete, and modify storage solutions within a matter of minutes
