# Monitoring, Load Balancing, and Scaling:

### Monitoring:
* **Purpose of Monitoring:**
  * When **operating a website** like the **employee directory application** on AWS, you might have questions like the 
    following:
    * **How many people** are **visiting my site day to day**?
    * How can I **track the number of visitors over time**?
    * How will I know if the website is having **performance or availability issues**?
    * What happens if my **Amazon Elastic Compute Cloud (Amazon EC2) instance runs out of capacity**?
    * **Will I be alerted** if my **website goes down**?
  * You need a way to **collect and analyze data** about the **operational health and usage of your resources**
    * The **act** of **collecting**, **analyzing**, and **using data** to **make decisions** or **answer questions about 
      your IT resources and systems** is called **monitoring**
  * Monitoring provides a **near real-time pulse on your system** and **helps answer the previous questions**
  * You can **use the data you collect** to **watch for operational issues caused by events** like **overuse of 
    resources**, **application flaws**, **resource misconfiguration**, or **security-related events**
  * Think of the **data collected through monitoring** as **outputs of the system**, or **metrics**
* **Use Metrics to Solve Problems:**
  * The **AWS resources** that **host your solutions create various forms of data**** that you **might be interested in 
    collecting**
  * **Each individual data point** that a **resource creates** is a **metric**
  * **Metrics** that are **collected and analyzed over time** become **statistics**, such as **average CPU utilization 
    over time showing a spike**
  * One way to **evaluate the health of an EC2 instance** is through **CPU utilization**
    * Generally speaking, if an **EC2 instance** has a **high CPU utilization**, it can mean a **flood of requests**
    * Or it can reflect a **process that has encountered an error** and is **consuming too much of the CPU**
    * When **analyzing CPU utilization**, take a **process** that **exceeds a specific threshold** for an **unusual length 
      of time**
    * Use that **abnormal event** as a **cue** to **either manually or automatically resolve the issue** through **actions 
      like scaling the instance**
  * **CPU utilization** is **one example of a metric**
  * **Other examples of metrics** that **EC2 instances** have are **network utilization**, **disk performance**, 
    **memory utilization**, and the **logs** created by the applications running on top of Amazon EC2
* **Types of Metrics:**
  * **Different resources** in AWS create **different types of metrics**
  * To see examples of metrics associated with different resources, flip each of the following flashcards by choosing 
    them
    * **Amazon Simple Storage Service (Amazon S3) Metrics:**
      * **Size of objects** stored in a bucket
      * **Number of objects** stored in a bucket
      * **Number of HTTP request made** to a bucket
    * **Amazon Relational Database Service (Amazon RDS) Metrics:**
      * **Database connections**
      * **CPU utilization** of an instance
      * **Disk space consumption**
    * **Amazon EC2 Metrics:**
      * **CPU utilization**
      * **Network utilization**
      * **Disk performance**
      * **Status checks**
  * This is **not a complete list** of metrics for any of the services mentioned, but you can see how **different 
    resources create different metrics**
  * You might be interested in a **wide variety of metrics** depending on your **resources**, **goals**, and 
    **questions**
* **Monitoring Benefits:**
  * Monitoring gives you **visibility into your resources**, but the question now is, "**Why is that important?**"
  * This section describes some of the **benefits of monitoring**
    * **Respond Proactively:**
      * **Respond to operational issues proactively before your end users are aware of them**
      * **Waiting for end users** to **let you know** when your **application is experiencing an outage** is a **bad 
        practice**
      * Through monitoring, you can **keep tabs on metrics** like **error response rate** and **request latency**
      * Over time, the metrics help **signal** when an **outage is going to occur**
      * You can **automatically or manually perform actions** to **prevent the outage** from happening and **fix the 
        problem before your end users are aware of it**
    * **Improve Performance and Reliability:**
      * Monitoring can **improve the performance and reliability** of your resources
      * Monitoring the various resources that comprise your application provides you with a **full picture** of **how 
        your solution behaves as a system**
      * Monitoring, if done well, can **illuminate bottlenecks** and **inefficient architectures**
      * This helps you **drive performance** and **improve reliability**
    * **Recognize Security Threats and Events:**
      * By monitoring, you can recognize **security threats and events**
      * When you **monitor resources, events, and systems over time**, you create what is called a **baseline**
      * A **baseline defines normal activity**
      * Using a baseline, you can **spot anomalies** like **unusual traffic spikes** or **unusual IP addresses accessing 
        your resources**
      * When an **anomaly occurs**, an **alert can be sent out** or an **action can be taken** to **investigate the 
        event**
    * **Make Data Driven Decisions:**
      * Monitoring helps you make **data-driven decisions** for your business
      * Monitoring keeps an eye on **IT operational health** and **drives business decisions**
      * For example, suppose you launched a **new feature** for your **cat photo app** and now you **want to know if 
        it’s being used**
        * You can collect **application-level metrics** and view the **number of users who use the new feature**
      * With your findings, you can decide **whether to invest more time into improving the new feature**
    * **Create Cost-Effective Solutions:**
      * Through monitoring, you can create **more cost-effective solutions**
      * You can view **resources that are underused** and **rightsize your resources to your usage**
      * This helps you **optimize cost** and make sure you **aren’t spending more money than necessary**

### Amazon CloudWatch:
* **Visibility Using CloudWatch:**
  * AWS resources create data that you can monitor through metrics, logs, network traffic, events, and more
  * This data comes from components that are distributed in nature
  * This can lead to difficulty in collecting the data you need if you don’t have a centralized place to review it all
  * AWS has taken care of centralizing the data collection for you with a service called CloudWatch
  * CloudWatch is a monitoring and observability service that collects your resource data and provides actionable 
    insights into your applications
  * With CloudWatch, you can respond to system-wide performance changes, optimize resource usage, and get a unified view 
    of operational health

You can use CloudWatch to do the following:


bullet
Detect anomalous behavior in your environments.


bullet
Set alarms to alert you when something is not right.


bullet
Visualize logs and metrics with the AWS Management Console.


bullet
Take automated actions like scaling.


bullet
Troubleshoot issues.


bullet
Discover insights to keep your applications healthy.

How CloudWatch works

With CloudWatch, all you need to get started is an AWS account. It is a managed service that you can use for monitoring without managing the underlying infrastructure.

To learn more, choose each numbered marker. 

