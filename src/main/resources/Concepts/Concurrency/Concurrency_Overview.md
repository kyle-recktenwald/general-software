# Concurrency Overview:

### Race Condition:
* A **race condition** is a **scenario** in **concurrent programming** where the **behavior of a system or program** 
  depends on the **sequence or timing of executio**n of **multiple threads or processes**
* In essence, it arises when the **correct execution** of a program **depends on the order or timing of different 
  operations**, and the **outcome becomes unpredictable or unintended** due to the **non-deterministic nature** of **how 
  the threads are scheduled**
* These conditions **typically occur in multi-threaded or concurrent systems** where **multiple threads or processes 
  access shared resources** (like **variables**, **memory**, **files**, or **databases**) and **modify them 
  concurrently**
* Here's a simplified example in Java:
```java
class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```
* Suppose you have **two threads concurrently accessing and modifying** an **instance of this `Counter` class**:
```
Counter counter = new Counter();

// Thread 1
counter.increment();

// Thread 2
counter.increment();
```
* **Both threads** are **incrementing the count variable**
* However, if the **increment operation** is **not thread-safe** or **properly synchronized**, a **race condition can 
  occur**
* For instance, if **both threads read the value of count**, **increment it**, and then **write the incremented value 
  back**, **one thread's update might overwrite the other**, leading to **incorrect results**
* Race conditions can lead to various issues, including:
  * **Data Corruption:**
    * **Shared data** might end up in an **inconsistent state** due to **conflicting updates from multiple threads**
  * **Unpredictable Behavior:**
    * The program might produce **unexpected results** or **behave differently each time it runs**, making it 
      **difficult to debug**
* To **mitigate race conditions**, **synchronization mechanisms** like **locks**, **semaphores**, or using **thread-safe 
  data structures** are employed
* These mechanisms ensure that **only one thread can access and modify shared resources at a time**, **preventing 
  conflicting updates** and **maintaining data integrity** in multi-threaded environments

### Deadlock:
* **Deadlock** is a situation in **concurrent programming** where **two or more threads or processes** are **unable to 
  proceed** because **each is waiting for the other to release a resource that they need in order to continue**
* It's a scenario where **two or more tasks** are **perpetually blocked** because they're **each holding a resource** 
  that the **other task requires**
* Deadlocks generally occur in a system with **multiple threads/processes** and involve a **circular waiting 
  condition**, where **each thread is waiting for a resource that's held by another thread**, creating a **cyclic 
  dependency** among them
* For example, consider **two threads**, **Thread A** and **Thread B**, and two resources, **Resource 1** and **Resource 
  2**:
  * **Thread A** has **acquired Resource 1** and **needs Resource 2 to proceed**
  * **Thread B** has **acquired Resource 2** and **needs Resource 1 to proceed**
* If **both threads** are **waiting indefinitely** for the **other resource to be released**, **neither will be able to 
  progress**, resulting in a **deadlock situation**
* Deadlocks can lead to a **complete halt** in the **affected parts of the system**, causing a **loss of productivity** 
  or even **system crashes** in extreme cases
* **Preventing deadlocks** involves **careful design** and **use of synchronization mechanisms** (like **locks**) and 
  **resource allocation strategies**
* Techniques such as **resource allocation ordering**, **avoiding circular waits**, and **using timeouts for resource 
  acquisition** can **help mitigate the risk** of deadlocks in concurrent systems
* Additionally, **ensuring that locks are acquired and released** in a **consistent order across threads** can **prevent 
  many potential deadlock scenarios**
* **Java Example:**
```java
public class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try {
                    Thread.sleep(100);
                    // Introducing a delay to allow Thread 2 to acquire resource 2
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding resource 1 and 2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding resource 1 and 2...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
```
* In this example, **`Thread 1` locks `resource1`** and then **tries to lock `resource2`**, while **`Thread 2` locks
  `resource2`** and **tries to lock `resource1`**
* **Both threads** are **waiting for the other resource to be released**, causing a **deadlock situation**
* When you run this code, it may appear to **hang or freeze** because **both threads are blocked indefinitely**, 
  **waiting for the resources** that the **other thread holds**
* Remember, this is a **simplified example** to **illustrate the concept of deadlock**
* In real-world scenarios, deadlocks can involve **more complex interactions** among **multiple threads and resources**

### Livelock:
* Livelock is a situation in concurrent systems where **two or more threads or processes** are **effectively stuck** in a 
  state of **actively trying to resolve a resource conflict** but end up **repeatedly yielding to each other without 
  making progress**
* **Unlike deadlock**, where **threads are stuck waiting**, in a livelock scenario, **threads are constantly executing 
  and responding** to **each other's actions** but **cannot progress**
* Livelock **typically occurs** when **threads or processes continuously change their states in response to each other's 
  actions**, **creating a loop** where **none of them can move forward**
* This happens when **threads try to be considerate** and **avoid conflicts by giving way**, but this behavior results 
  in **none of them being able to proceed**
* A classic example of livelock involves two people walking towards each other in a narrow corridor:
  * **Person A moves to the left** to **let Person B pass**
  * **Person B moves to the left** to **let Person A pass**
* As a result, **both individuals keep sidestepping in the same direction**, always **trying to yield to the other 
  person** but **never managing to pass each other**
* In a software context, livelock might occur in a **distributed system** when **nodes repeatedly retry an action after 
  perceiving congestion or conflicts**, resulting in an **endless loop of retries without any meaningful progress**
* **Mitigating livelock** often involves **implementing strategies** to **break the repetitive loop** by **introducing randomness**, 
  **timeouts**, or **other algorithms** that **help the threads or processes avoid consistently making the same 
  decisions in response to each other's actions**
* It's essential to **design systems** in such a way that they can **recover from livelock scenarios** or **prevent 
  them** by using **proper synchronization techniques** and **handling resource conflicts effectively**
* Java Example:
  * **Creating a Java example** to **explicitly demonstrate livelock** can be a **bit contrived** because livelock 
    situations often involve **nuanced interactions between threads** that **continually attempt to resolve a 
    conflict**, but their **actions keep them in a perpetual loop without making progress**
  * However, here is a **simple scenario** to **simulate a potential livelock-like situation** where **two threads try 
    to be overly polite** and **repeatedly yield to each other without making progress**:
```java
public class LivelockExample {
static boolean flag = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (flag) {
                System.out.println("Thread 1 is yielding...");
                try {
                    Thread.sleep(100);
                  // Introducing a delay to simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = false;
                // Thread 1 yields by setting flag to false
                while (!flag) {
                    // Thread 1 waits for flag to change
                }
                flag = true;
                // Thread 1 attempts to be polite and yield again
            }
        });

        Thread thread2 = new Thread(() -> {
            while (flag) {
                System.out.println("Thread 2 is yielding...");
                try {
                    Thread.sleep(100);
                    // Introducing a delay to simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = false;
                // Thread 2 yields by setting flag to false
                while (!flag) {
                    // Thread 2 waits for flag to change
                }
                flag = true;
                // Thread 2 attempts to be polite and yield again
            }
        });

        thread1.start();
        thread2.start();
    }
}
```
* This example simulates a scenario where **two threads (`thread1` and `thread2`)** are **attempting to yield to each 
  other** by **toggling a shared flag back and forth**
* **Both threads yield** by **setting the flag to false** and then **waiting for the other thread to set it back to 
  true**
* However, since **both threads are constantly yielding in response to the other**, **neither can proceed**, resulting 
  in a situation that **resembles a livelock**
* In practice, livelocks are often **more complex** and **context-specific**, involving **intricate interactions between 
  threads** **or processes** where they **keep retrying actions** or **making decisions in response to each other's 
  behavior**, leading to a **state** where they **cannot make progress**

### Semaphore:
* In computer science, a **semaphore** is a **synchronization primitive** used to **control access to a shared 
  resource** in a **concurrent system**
* It's a **signaling mechanism** that helps **manage access** to a **limited number of resources** among **multiple 
  threads or processes**
* Semaphores **maintain a counter**, which **represents the number of available permits** or the **count of available 
  resources**
* Threads can **request access to a resource** by **acquiring a permit from the semaphore**
* If a **permit is available**, the **thread takes it**, and the **semaphore decrements its counter**
* If **no permits are available**, the **thread might be blocked** (if using a **blocking semaphore**) or **receive a 
  failure indication** (if using a **non-blocking semaphore**)
* There are **two primary types** of semaphores:
  * **Counting Semaphore:**
    * This type of semaphore allows a **fixed number of permits to be acquired**
    * It can be **initialized** with a **certain number of permits**, and **each acquire operation decrements the 
      counter**, while **each release operation increments it**
    * Threads can **acquire permits** until the **counter reaches zero**, after which they **have to wait** for **other 
      threads to release permits** 
  * **Binary Semaphore (Mutex):**
    * A **binary semaphore** is a **special case** of a **counting semaphore** with a **limit of one**
    * It **essentially acts as a lock**
    * It can be **either in the locked or unlocked state**, allowing **only one thread to acquire the resource at a 
      time**
* In Java, the **`java.util.concurrent.Semaphore` class** provides an **implementation of semaphores**
* It allows threads to **acquire and release permits** and **supports both blocking and non-blocking operations**
* Here's a **simple example** of **using a semaphore** in **Java**:
```java
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); 
        // Creating a semaphore with 2 permits

        Runnable task = () -> {
            try {
                semaphore.acquire(); // Acquiring a permit
                System.out.println("Thread " + Thread.currentThread().getName() 
                        + " acquired a permit.");
                Thread.sleep(2000); // Simulating some work
                System.out.println("Thread " + Thread.currentThread().getName() 
                        + " releasing the permit.");
                semaphore.release(); // Releasing the permit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
```
* In this example, a **semaphore with two permits is created**
* **Three threads** try to **acquire permits**
* **Only two threads will successfully acquire the permits** while the **third will be blocked** until a **permit is 
  released by one of the running threads**



