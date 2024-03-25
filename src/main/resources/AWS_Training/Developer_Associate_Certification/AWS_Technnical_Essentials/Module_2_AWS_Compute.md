# Module 2: AWS Compute:

### Compute as a Service:
* **Servers:**
  * The **first building block** that you **need to host an application** is a **server**
  * Servers can usually **handle HTTP requests** and **send responses to clients** following the **client-server model**
  * Although **any API-based communication** also **falls under this model**
  * A **client** is a **person or computer** that **sends a request**
  * A **server handling the requests** is a **computer**, or **collection of computers**, **connected to the internet 
    serving websites** to **internet users**
  * Servers **power your application** by providing **CPU**, **memory**, and **networking capacity** to **process users’ 
    requests** and **transform them into responses**
  * For context, **common HTTP servers** include the following:
    * **Windows options**, such as **Internet Information Services (IIS)**
    * **Linux options**, such as **Apache HTTP Server**, **Nginx**, and **Apache Tomcat**
  * To **run an HTTP server** on AWS, you must **find a service that provides compute power** in the **AWS Management 
    Console**
  * You can view the **complete list** of **AWS compute services** when you log in to the console
* **Choosing the Right Compute Option:**
  * If **you’re responsible** for **setting up servers** on AWS to **run your infrastructure**, you have **many compute 
    options**
  * First, you need to know **which compute service to use** for **each use case**
  * At a fundamental level, three types of compute options are available: **virtual machines (VMs)**, **container 
    services**, and **serverless**
  * If you have **prior infrastructure knowledge**, a **virtual machine** will often be the **easiest compute option to 
    understand**
  * This is because a **virtual machine emulates a physical server** and allows you to **install an HTTP server** to 
    **run your applications**, for example
  * To **run virtual machines**, you **install a hypervisor** on a **host machine**
  * In its simplest form, a **hypervisor** is **software or firmware** that makes it possible to **share physical 
    hardware resources across one or more virtual machines**
  * The **hypervisor provisions the resources** to **create and run your VMs**
  * In AWS, **Amazon Elastic Compute Cloud (Amazon EC2)** is a **web service** that provides **secure** and **resizable 
    compute capacity** in the cloud
  * You can **provision virtual servers** called **EC2 instances**
  * **Behind the scenes**, **AWS operates** and **manages the host machines and the hypervisor layer**
  * AWS also **installs** the **virtual machine operating system**, called the **guest operating system**
  * Beneath the surface, **some AWS compute services use Amazon EC2** or use **virtualization concepts**
  * You **should understand this service** before advancing to **container services** and **serverless compute**
* **Getting Started with Amazon EC2:**
  * **Amazon EC2:**
    * **Amazon EC2** is a **web service** that provides **secure, resizable compute capacity in the cloud**
    * With this service, you can **provision virtual servers** called **EC2 instances**
    * With Amazon EC2, you can do the following:
      * **Provision** and **launch one or more EC2 instances** in minutes
      * **Stop** or **shut down EC2 instances** when you **finish running a workload**
      * **Pay** by the **hour** or **second** for **each instance type** (minimum of 60 seconds)
    * You can **create** and **manage EC2 instances** through the **AWS Management Console**, **AWS CLI**, **AWS SDKs**, 
      **automation tools**, and **infrastructure orchestration services**
    * To **create an EC2 instance**, you **must define the following**:
      * **Hardware SSpecifications:**
        * **CPU**, **memory**, **network**, and **storage**
      * **Logical Configurations:**
        * **Networking location**, **firewall rules**, **authentication**, and the **operating system** of your choice
  * **Amazon Machine Image:**
    * When launching an EC2 instance, the first setting you configure is which operating system you want by selecting 
      an Amazon Machine Image (AMI)
    * In the traditional infrastructure world, spinning up a server consists of installing an operating system from 
      installation disks, drives, or wizards over the network
    * In the AWS Cloud, the operating system installation is not your responsibility
    * Instead, it's built into the AMI that you choose
    * An AMI includes the operating system, storage mapping, architecture type, launch permissions, and any additional 
      preinstalled software applications
  * **Relationship Between AMIs and EC2 Instances:**
    * EC2 instances are live instantiations (or versions) of what is defined in an AMI, as a cake is a live 
      instantiation of a cake recipe
    * If you are familiar with software development, you can also see this kind of relationship between a class and an 
      object
    * In this case, the AMI is how you model and define your instance
    * The EC2 instance is the entity you interact with, where you can install your web server and serve your content to 
      users
    * When you launch a new instance, AWS allocates a virtual machine that runs on a hypervisor
    * Then the AMI that you selected is copied to the root device volume, which contains the image that is used to boot 
      the volume
    * In the end, you get a server that you can connect to and install packages and additional software on
    * In the example, you install a web server along with the properly configured source code of your employee 
      directory application
    * One advantage of using AMIs is that they are reusable
    * You might choose a Linux-based AMI and configure the HTTP server, application packages, and additional software 
      that you need to run your application
    * If you want to create another EC2 instance with the same configurations, you could create and configure a new EC2 
      instance to match the first instance
    * Or you could create an AMI from your running instance and use the AMI to start a new instance
    * That way, your new instance would have the same configurations as your current instance because the configurations 
      set in the AMIs are the same