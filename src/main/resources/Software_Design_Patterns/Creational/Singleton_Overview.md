### Singleton Design Pattern Overview:

### Overview:
* The **Singleton pattern** is a **creational design pattern** that **ensures a class has only one instance** and 
  provides a **global point of access to that instance**
* In other words, it **restricts** the **instantiation** of a class to a **single object** and provides **a way to 
  access that object from anywhere within the application**
* Key characteristics of the Singleton pattern:
  * **Single Instance:**
    * The Singleton pattern guarantees that there is **only one instance of the class created**
    * It typically involves **creating the instance the first time it's requested** and then **reusing** that **same 
      instance** for **all subsequent requests**
  * **Global Access:**
    * The Singleton provides a **global point of access** to its instance, meaning that you can access the single 
      instance from **any part of the codebase**
    * This makes it a commonly used pattern for providing a **single point of control or coordination** in an 
      application
* To implement the Singleton pattern, you typically use a combination of the following techniques:
  * **Private Constructor:**
    * The **class's constructor** is made **private** to **prevent external instantiation**
  * **Static Method:**
    * A **static method** is **provided within the class** to **allow external code** to **access the single instance** 
      of the class
    * This method typically **checks whether an instance already exists** and **creates one if it doesn't**
  * **Lazy Initialization:**
    * The **instance** is **created** **only** when it is **first requested**
    * This is often done to **improve performance** by **not creating the instance until it's needed**
* Singletons are commonly used for **managing shared resources**, **configuration settings**, **logging**, and other 
  scenarios where a single point of control or access is required
* However, it's **important to be cautious** when using the Singleton pattern, as it can **introduce global state** and 
  make **testing and debugging more challenging**

### Java Implementation:

```java
public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist
            instance = new Singleton();
        }
        return instance;
    }

    // Example method of the Singleton class
    public void someMethod() {
        System.out.println("Singleton method is called.");
    }

    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.someMethod();
    }
}
```
* In this Java example:
  * The Singleton class has a **private static instance variable**, `instance`, which **will hold the single instance** 
    of the class
  * The **constructor** is **made private** to **prevent external instantiation** of the class
  * The `getInstance()` method provides a **public, static way** to **access the Singleton instance**
    * It checks **whether an instance exists** and **creates one if it doesn't**
  * There's an example method `someMethod()` to demonstrate that **you can perform actions** on the Singleton instance
  * In the main method, we **obtain the Singleton instance** and **call** the `someMethod()` to demonstrate **how to 
    use the Singleton**
  * This ensures that there is **only one instance** of the Singleton class, and you can access it globally using the 
    `getInstance()` method