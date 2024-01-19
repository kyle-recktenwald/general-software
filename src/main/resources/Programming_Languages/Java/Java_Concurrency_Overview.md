# Java Concurrency Overview:

### Overview:
* **Concurrency** in Java refers to the **ability** of a **program** to **execute multiple tasks or processes
  simultaneously**
* It allows **different parts of a program** to be **executed independently**, **potentially overlapping in time**, to
  **improve overall performance** and **responsiveness**
* Key concepts related to concurrency in Java:
    * **Threads:**
        * In Java, **concurrency** is often **achieved using threads**
        * A **thread** is the **smallest unit of execution within a process**
        * Java **programs** can have **multiple threads running concurrently**, allowing **tasks** to **execute in
          parallel**
    * **Multithreading:**
        * Java supports **multithreading**, which involves creating **multiple threads** within a **single program** to
          **perform tasks concurrently**
        * **Each thread operates independently**, **executing** its **instructions simultaneously with other threads**
    * **Thread Synchronization:**
        * When **multiple threads** access **shared resources** or **critical sections of code**, there can be issues such
          as **race conditions** or **data inconsistency**
        * Thread synchronization mechanisms like **synchronized blocks**, **locks**, and **semaphores** are used to
          **control access** to **shared resources** and ensure **thread safety**
    * **Concurrency Utilities:**
        * Java provides **various classes and utilities** in the **`java.util.concurrent` package** to **facilitate
          concurrent programming**
        * This includes **constructs** like **`ExecutorService`**, **`ThreadPoolExecutor`**, **`CountDownLatch`**,
          **`Semaphore`**, **`ConcurrentHashMap`**, etc., which help in **managing threads**, **synchronization**, and
          **concurrent data structures**
    * **Thread States:**
        * Threads in Java can be in **different states** such as **`NEW`**, **`RUNNABLE`**, **`BLOCKED`**, **`WAITING`**,
          **`TIMED_WAITING`**, and **`TERMINATED`**
        * **Understanding these states** is **crucial** for **managing thread execution and synchronization**
* Concurrency in Java enables the development of **responsive** and **efficient applications** by **leveraging** the
  **capabilities** of **modern multi-core processors**
* However, writing concurrent programs requires **careful consideration** of **thread safety**, **synchronization**, and
  **potential issues** like **deadlock** and **livelock** to ensure **correct and efficient behavior**
* The Java platform offers **various tools and constructs** to **assist developers** in creating **robust** and
  **efficient concurrent applications**

### The `Thread` class in Java:
* In Java, the **`Thread` class** is a **fundamental class** in the **`java.lang package`** that allows you to **create
  and control threads**
* Threads represent **independent paths of execution within a program**
* To **use the `Thread` class**, you can either **extend it** by **creating a subclass** or **use it directly** by
  **providing a `Runnable` object to its constructor**
* Here's a brief overview:
* **Extending the Thread Class:**
```java
class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
    }
}
```
* You would then **create an instance** of this **subclass** and **call its `start()` method to begin execution**:
```
MyThread thread = new MyThread();
thread.start();
```
* **Implementing Runnable Interface:**
```java
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
    }
}
```
* Then, you can **create a `Thread` object** and **pass an instance of your `Runnable` implementation** to it:
```
MyRunnable myRunnable = new MyRunnable();
Thread thread = new Thread(myRunnable);
thread.start();
```
* The **`start()` method** is **crucial** as it **initiates the execution of the thread** by **calling its `run()`
  method**, where your **specific code logic** for that thread **resides**
* Additionally, the `Thread` class **provides methods to control thread behavior** like **`sleep()`**, **`join()`**,
  **`interrupt()`**, etc., allowing you to **manage the flow of execution between multiple threads**
* Remember, **starting multiple threads** should be **done with caution** to **prevent potential synchronization
  issues** and **race conditions**

### The `Thread.sleep()` Method in Java:
* In Java, `Thread.sleep()` is a **method** used to **pause the execution** of the **current thread** for a **specified
  amount of time**
* It allows you to **introduce delays or pauses** in your code
* This method can be helpful in various scenarios like **simulation**, **timing**, or **controlling the flow of
  execution**
  Here's the **basic syntax**:
```
try {
    Thread.sleep(milliseconds);
    // Sleep for the specified number of milliseconds
} catch (InterruptedException e) {
    // Handle InterruptedException if necessary
}
```
* **`milliseconds`:**
    * The **duration** for which the **thread should sleep**, specified in **milliseconds**
    * This argument represents the **length of time** the **thread** should **remain inactive**
* An **`InterruptedException` can be thrown** if **another thread interrupts the current thread while it's sleeping**
* It's a **checked exception**, so you need to handle it using a **`try-catch` block**, as shown in the example above
* For instance, to make a thread pause for **1 second**:
```
try {
    Thread.sleep(1000);
    // Sleep for 1000 milliseconds (1 second)
} catch (InterruptedException e) {
    // Handle InterruptedException if necessary
}
```
* Remember that `Thread.sleep()` **might not always guarantee an exact duration of sleep** due to factors like **system
  load**, **scheduler decisions**, and **precision limitations**

### The `Runnable` Interface in Java:
* In Java, `Runnable` is an **interface** used to **represent** a **task** or **block of code** that can be **executed
  by a thread**
* It's part of Java's **concurrency framework** and is **commonly used** to **create threads** or **specify** the
  **code to be executed** in a **separate thread**
* The `Runnable` interface **defines** a **single method** called **`run()`**, which **contains the code that needs to
  be executed concurrently** when a **thread is started**
* **Any class implementing** the **`Runnable` interface must provide** an **implementation** for the **`run()` method**
* Here's the basic structure of the `Runnable` interface:
```java
public interface Runnable {
    public abstract void run();
}
```
* To use the `Runnable` interface, you typically **create a class** that **implements the `Runnable` interface** by
  providing an  **implementation** for the **`run()` method**
* Then, you can **pass an instance** of this class to a **`Thread` object** to **execute the code** in a **separate
  thread**
* **Example:**
```java
public class MyRunnable implements Runnable {
  public class MyRunnable implements Runnable {
    @Override
    public void run() {
      // Code to be executed concurrently
      for (int i = 0; i < 5; i++) {
        System.out.println("Hello from MyRunnable: " + i);
      }
    }
  }

  public class Main {
    public static void main(String[] args) {
      MyRunnable myRunnable = new MyRunnable();

      // Create a Thread and pass the Runnable object
      Thread thread = new Thread(myRunnable);

      // Start the thread
      thread.start();
    }
  }
}
```
* In this example, **`MyRunnable`** **implements** the **`Runnable` interface** by **providing an implementation** for
  the **`run()` method**
* An **instance** of **`MyRunnable`** is then **passed to a `Thread` object**, and the **`start()` method** of the
  **`Thread` class** is invoked to **start the execution** of the **`run()` method** in a **separate thread**
* Using `Runnable` allows for **better separation of concerns** by **decoupling** the **task or code logic** (defined
  in the `run()` method) from the **thread management**, making the code more **flexible** and **easier to maintain**

### The `Timer` Class in Java:
* In Java, the **`Timer` class** is a **utility class** in the **`java.util` package** that allows **scheduling tasks to
  be executed** at **specified intervals or after a delay**
* It's part of Java's **concurrency utilities** and is commonly used for **scheduling recurring tasks** or **one-time
  delayed tasks**
* Key points about the `Timer` class:
    * **Task Scheduling:**
        * `Timer` allows you to **schedule tasks** (**`TimerTask` objects**) for **execution** at **specified times** or
          **after a specified delay**
    * **Repetitive Tasks:**
        * It can **schedule tasks** to be **executed repeatedly** at **fixed intervals**
    * **Single Threaded:**
        * **`Timer` internally uses** a **single background thread** for **scheduling tasks**
        * While this **simplifies usage**, it's important to note that **if one task takes too long to execute**, it can
          **delay the execution of subsequent tasks**
* Here's a basic usage example of Timer:
```java
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer();

        // Schedule a task to run after a delay of 2 seconds
        timer.schedule(new MyTask(), 2000);

        // Schedule a task to run every 3 seconds after an initial delay of 1 second
        timer.scheduleAtFixedRate(new MyRepetitiveTask(), 1000, 3000);
    }

    static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Task executed after delay");
        }
    }

    static class MyRepetitiveTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Repetitive task executed");
        }
    }
}
```
* In this example:
    * **`MyTask`** is a **class** that **extends `TimerTask`** and **defines** the **task to be executed after a delay of
      2 seconds**
    * **`MyRepetitiveTask`** is another class **extending `TimerTask`** that **defines a task** to be **executed
      repeatedly every 3 seconds after an initial delay of 1 second**
* The `Timer` class provides methods like **`schedule()`**, **`scheduleAtFixedRate()`**, and **`cancel()`** for
  **scheduling tasks** and **managing the timer**
* However, `Timer` has **some limitations**, such as the **inability** to **handle tasks** that **throw unchecked
  exceptions** and the **single-threaded nature** that **might affect** the **execution of tasks** if **one takes
  too long**
* For **more complex** or **robust scheduling needs**, **`ScheduledExecutorService`** from the `java.util.concurrent`
  package is **often preferred** due to its **enhanced functionalities** and **flexibility**

### The `ExecutorService` in Java:
* In Java, **`ExecutorService`** is an **interface** provided by the **`java.util.concurrent` package** that represents
  an **asynchronous execution framework** for **managing and executing tasks concurrently** using a **pool of threads**
* The **`ExecutorService` interface extends the `Executor` interface** and provides **additional functionalities** for
  **managing thread lifecycles**, **submitting tasks for execution**, **controlling task execution**, and **retrieving
  the results of tasks**
* Some key features of `ExecutorService` include:
    * **Task Execution:**
        * It allows **submitting tasks for execution asynchronously** using **methods** like **`execute(Runnable)`** or
          **`submit(Callable<T>)`**
        * These tasks can be **implemented as `Runnable` or `Callable` instances**
    * **Thread Pool Management:**
        * `ExecutorService` **manages a pool of threads**, **abstracting away** the complexities of **managing individual
          threads**
        * It **provides methods** to **control the size of the thread pool**, such as **`newFixedThreadPool(int)`** or
          **`newCachedThreadPool()`**
    * **Task Scheduling:**
        * It offers methods for **scheduling tasks to run** after a **specific delay** or at a **fixed rate** using
          `schedule(Runnable, long, TimeUnit)` or `scheduleAtFixedRate(Runnable, long, long, TimeUnit)`
    * **Control Over Shutdown:**
        * `ExecutorService` provides methods like **`shutdown()`** and **`shutdownNow()`** to **gracefully shut down the
          executor service**, allowing **in-flight tasks to complete** or **abruptly terminating all tasks**, respectively

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks for execution
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " executed by thread: " 
                        + Thread.currentThread().getName());
            });
        }

        // Shutdown the ExecutorService after tasks are done
        executorService.shutdown();
    }
}
```
* In this example, an **`ExecutorService`** is created with a **fixed-size thread pool** of **three threads** using
  `Executors.newFixedThreadPool(3)`
* **Tasks** are **submitted for execution** using `submit()` method with a **lambda expression representing the task**
* **After submitting tasks**, the **`shutdown()` method** is called to **initiate a graceful shutdown** of the executor
  service **after the tasks are completed**

### The `Future` Interface in Java:
* In Java, the **`Future` interface** is part of the **`java.util.concurrent` package** and is used to **represent the 
  result of an asynchronous computation**
* It provides a way to **check if the computation is complete**, and **if not**, to **wait for its completion**
* Here's a brief explanation:
  * A **`Future` instance** represents a **computation** that **may not have completed yet**
  * You can **submit a task for execution** and **receive a `Future` object as a result**
  * You can then use this **`Future` object** to **check if the computation is done**, r**etrieve the result when it's 
    ready**, or **cancel the computation**
* Here's a simple example of using `Future`:
```java
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future = executor.submit(() -> {
            // Simulate a time-consuming task
            Thread.sleep(2000);
            return "Task completed";
        });

        // Check if the task is done
        while (!future.isDone()) {
            System.out.println("Task is not yet complete...");
            Thread.sleep(500);
        }

        // Retrieve the result
        String result = future.get();
        System.out.println(result);

        executor.shutdown();
    }
}
```
* In this example, a **task** is **submitted to the executor**, and a **`Future` is obtained**
* The program then **checks whether the task is complete in a loop** and **retrieves the result when it's ready**
* Note that the **`get()` method will block until the result is available**
* It's important to **handle exceptions appropriately** when working with `Future`, as the **`get()` method can throw 
  exceptions** such as **`InterruptedException`** and **`ExecutionException`**