### AWS Technical Essentials End of Course Assessment:

* **Question 1:**
  * **Question:**
    * Which of the following statements about containers and virtual machines is correct?
      * Containers share an operating system (OS) kernel
      * Virtual machines share an operating system (OS) kernel
      * Virtual machines must use the same operating system (OS) as the hypervisor
      * Containers each have their own kernel
  * **Answer:**
    * Containers share an operating system (OS) kernel:
      * Containers are designed to be lightweight compared to virtual machines
      * Containers share an OS kernel with the host OS. However, they have their own copies of any libraries they require 
        to be self-contained at the software level
* **Question 2:**
  * **Question:**
    * Which of the following elements are contained in an AWS Identity and Access Managment (IAM) policy? (Select THREE.)
      * Effect
      * Action
      * Object
      * Cause
      * Resource
      * Image
  * **Answer:**
    * Most IAM policies are stored in AWS as JSON documents
    * They have several policy elements, including a Version, Effect, Action, and Resource
* **Question 3:**
  * **Question:**
    * Users in a company are authenticated in the corporate network, and they want to use AWS services without signing 
      in again
    * Which AWS authentication option should the company use?
      * AWS Identity and Access Management (IAM) role
      * AWS root user
      * AWS Identity and Access Management (IAM) user
      * AWS Identity and Access Management (IAM) group
  * **Answer:**
    * Instead of creating an IAM user for each employee that needs access to an AWS account, you should use IAM roles 
      to federate users
* **Question 4:**
  * **Question:**
    * Which actions must be completed so resources in a public subnet can communicate with the internet? (Select TWO.)
      * Attach an internet gateway to the virtual private cloud (VPC)
      * Create a route in a route table to the internet gateway
      * Create a route to a private subnet
      * Connect resources to a virtual private network (VPN)
      * Turn off the firewall
  * **Answer:**
    * To facilitate internet connectivity for your VPC, you must create an internet gateway, attach it to the VPC, and 
      create a route to the internet gateway
* **Question 5:**
  * **Question:**
    * Which of the following components are NOT required to launch an Amazon EC2 instance? (Select TWO.)
      * Instance type
      * User data
      * Storage
      * Tenancy
      * Operating system (OS)
  * **Answer:**
    * When launching an EC2 instance, user data and tenancy are optional features you can include
    * Instance type, storage type, and the OS are required elements for launching an EC2 instance
* **Question 6:**
  * **Question:**
    * What is a typical use case for Amazon Elastic Block Store (Amazon EBS)?
      * Object storage for media hosting
      * Object storage for a boot drive
      * Block storage for an Amazon EC2 instance
      * File storage for multiple Amazon EC2 instances
  * **Answer:**
    * Amazon EBS is a block-level storage device that you can attach to an EC2 instance
* **Question 7:**
  * **Question:**
    * An employee at a healthcare facility is tasked with storing 7 years of patient information that is rarely accessed
    * Their boss wants them to consider one of the Amazon S3 storage tiers to store the information
    * Which storage tier should they use?
      * S3 Standard
      * S3 Glacier Deep Archive
      * S3 Standard-Infrequent Access (S3 Standard-IA)
      * S3 Intelligent-Tiering
  * **Answer:**
    * S3 Glacier Deep Archive is the lowest-cost Amazon S3 storage class
    * It supports long-term retention and digital preservation for data that might be accessed once or twice a year
    * It is designed for customers—particularly those in highly regulated industries, such as the financial services, 
      healthcare, and public sectors
    * These customers often retain data sets for 7–10 years or longer to meet regulatory compliance requirements
* **Question 8:**
  * **Question:**
    * Which database task is the customer's responsibility when using Amazon Relational Database Service (Amazon RDS)?
      * Optimizing the database
      * Provisioning and managing the underlying infrastructure
      * Installing the relational database management system (RDBMS) onto the database (DB) instance
      * Installing operating system (OS) patches for the database (DB) instance
  * **Answer:**
    * When using Amazon RDS, customers are no longer responsible for the underlying environment the database runs on
    * Instead they can focus on optimizing the database
    * This is because Amazon RDS has components that are managed by AWS
* **Question 9:**
  * **Question:**
    * A Multi-Availability Zone database (DB) deployment is beneficial when a customer wants to increase the availability 
      of their database
    * What are other benefits of a Multi-AZ deployment? (Select TWO.)
      * Automatic failover
      * Larger selection of db engines
      * Protect db performance
      * Guaranteed additional read capacity
  * **Answer:**
    * Running a Multi-AZ DB deployment with high availability can enhance availability during planned system maintenance 
      by providing automatic DB failover
    * It can also help protect DB performance by backing up from your standby instance while your primary DB is backing 
      up
    * If using a Multi-AZ DB deployment with one standby, your standby DB instance is only a passive failover target 
      for high availability
* **Question 10:**
  * **Question:**
    * What are the main components that make up Elastic Load Balancing (ELB)?
      * Rule, listener, target group
      * Scaling policies, security group, Amazon EC2 Auto Scaling group
      * Security group, instance type, key pair
      * Amazon Machine Image (AMI) ID, instance type, storage
  * **Answer:**
    * The ELB service is made up of these main components: rules, listeners, and target groups
    * Listeners will contain rules, which are used by the listeners to route requests to the target groups
* **Question 11:**
  * **Question:**
    * Which Elastic Load Balancing (ELB) load balancer type should be used for an application that uses a rule based on 
      a website's domain to choose target groups?
      * Application Load Balancer
      * Classic Load Balancer
      * Network Load Balancer
      * Target Load Balancer
  * **Answer:**
    * An Application Load Balancer makes routing decisions based on the HTTP and HTTPS protocol
    * This includes the URL path and host, HTTP headers and method, and the source IP address of the client