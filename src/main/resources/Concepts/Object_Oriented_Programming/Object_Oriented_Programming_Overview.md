# Object Oriented Programming Overview:

### Overview:
* Object-Oriented Programming (OOP) is a popular and powerful **programming paradigm** based on the concept of 
  "**objects**"
* In OOP, software is designed and structured around objects, which are **instances of classes**
* These objects **encapsulate data** and the **operations** that can be performed on that data
* OOP is characterized by several key principles:
  * **Objects:**
    * Objects are the **fundamental building blocks** of OOP
    * They represent **real-world entities or concepts** and bundle both **data (attributes or properties)** and the 
      **functions (methods or behaviors)** that operate on that data
  * **Classes:**
    * Classes are **blueprint or template definitions** for objects
    * They describe the **structure** and **behavior** of objects
    * You can create **multiple instances (objects)** from a **single class**
  * **Encapsulation:**
    * Encapsulation is the concept of **bundling data** (**attributes**) and the **methods that operate on that data** 
      within a single unit, the class
    * It **hides the internal details** of **how an object works** and **provides an interface** for interacting with 
      the object
    * Access to the object's data is controlled through **access modifiers (public, private, protected, etc.)**
  * **Inheritance:**
    * Inheritance allows you to **create new classes based on existing classes**, **inheriting their attributes and 
      methods**
    * It **promotes code reuse** and the creation of **class hierarchies**
    * **Subclasses** (derived classes) can **add new attributes and methods** or **override** inherited ones
  * **Polymorphism:**
    * Polymorphism enables **objects of different classes** to be treated as **objects of a common superclass**
    * This allows for the **implementation of generic code** that can work with **objects of different types** in a more 
      **generalized way**
    * It includes **compile-time (method overloading)** and **run-time (method overriding)** polymorphism
* OOP is widely used in software development because it offers several benefits:
  * **Modularity:**
    * OOP encourages the development of **modular** and **organized** code
    * Classes act as **self-contained units** that can be **developed, tested, and maintained independently**
  * **Reusability:**
    * **Inheritance** and the ability to **create new classes based on existing ones** promote code reuse, **reducing 
      redundancy** and making it **more efficient** to **create and maintain software**
  * **Abstraction:**
    * OOP allows you to **define abstract data types and interfaces**, which provide a **high-level view** of objects 
      and their behavior while **hiding** the **underlying implementation details**
  * **Simplicity and Understandability:**
    * OOP **models real-world objects and their relationships**, making code **more intuitive** and **easier to 
      understand and maintain**
  * **Extensibility:**
    * OOP makes it **easier** to **add new features** or **modify existing ones** by **extending** or **modifying** 
      classes
* Common OOP languages include **Java**, **C++**, **Python**, **C#**, and many others
* These languages provide the tools and syntax for defining classes and creating object-oriented software
* <img src="images/OOP_Diagram.jpeg" width="500">

### Polymorphism:
* **Polymorphism** is a fundamental concept in **object-oriented programming (OOP)** that allows **objects of different 
  classes** to be treated as objects of a **common superclass**
* It enables you to write code that can work with objects in a **more generalized way**, making your programs more 
  **flexible** and **extensible**
* Polymorphism is one of the four **fundamental principles** of OOP, known as the "**Four Pillars of OOP**," which also 
  include encapsulation, inheritance, and abstraction
* There are two main types of polymorphism in OOP:
  * **Compile-time (or Static) Polymorphism:**
    * This is also known as **method overloading**
    * It occurs when **multiple methods** in the **same class** have the **same name but different parameters** 
      (different method signatures)
    * The appropriate method to be executed is **determined** by the **method's name** and the **number or type of its 
      parameters at compile time**
    * **Compile-time polymorphism** is **resolved during the compilation phase**
```java
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```
* **Run-time (or Dynamic) Polymorphism:**
  * This is also known as **method overriding**
  * It occurs when a **subclass** provides a **specific implementation** of a **method** that is **already defined in 
    its superclass**
  * The choice of **which method to execute** is **determined at runtime based on the actual object type**
  * Run-time polymorphism is **achieved through inheritance** and the **`@Override` annotation** in **Java**
```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
```
* In this example, the **`makeSound` method** is **overridden** in the **`Dog` and `Cat` subclasses**, providing 
  **specific implementations** for each type of animal
* The method to execute is **determined at runtime based on the actual object type**
* Polymorphism allows you to write code that works with objects at a **higher level of abstraction**, promoting code 
  **reusability**, **flexibility**, and **easier maintenance**
* It is a powerful concept in OOP and is commonly used to achieve dynamic behavior in software systems

### Encapsulation:
* **Encapsulation** is one of the fundamental principles of Object-Oriented Programming (OOP)
* It refers to the concept of **bundling the data** (**attributes** or **properties**) and the **methods** 
  (**functions** or **behaviors**) that operate on that data into a **single unit** called a **class**
* In encapsulation:
  * **Data Hiding:**
    * The **internal details** of **how data is represented and manipulated** are **hidden from the outside world**
    * This means that the **internal state of an object**, which is **represented by its attributes**, is typically 
      **not directly accessible from outside the class**
  * **Access Control:**
    * **Access** to the **data and methods of an object** is controlled by **access modifiers** such as **public, 
      private, protected, and package-private (default access)**
    * These access modifiers **specify who can access the data and methods**, and **to what extent**
      * `public`:
        * Accessible **from anywhere, both inside and outside the class**
      * `private`:
        * Accessible **only within the class**
        * **Encapsulated data** is **often marked** as `private` to **prevent unauthorized external access**
      * `protected`:
        * Accessible **within the class** and **its subclasses**
      * `package-private` (default):
        * Accessible **within the same package** (**Java-specific**)
      * <img src="images/Access_Modifiers_Diagram.png" width="500">
  * **Public Interface:**
    * Encapsulation provides a **controlled** and **well-defined public interface** to **interact with an object**
    * This **interface** consists of **public methods** that **allow users of the class** to perform **specific 
      operations** on the data, while **keeping the internal implementation hidden**
  * **Data Validation and Consistency:**
    * By encapsulating data and operations, a class can **ensure** that **data is maintained in a consistent and 
      valid state**
    * The **class** can **enforce constraints and rules**, **preventing external code** from **inadvertently violating** 
      them
* The benefits of encapsulation in OOP include:
  * **Information Hiding:**
    * Encapsulation helps **protect the integrity** of an object's data by **preventing unintended modifications** from 
      **external code**
    * This is **crucial for maintaining data consistency** and **reducing potential errors**
  * **Abstraction:**
    * Encapsulation allows you to **define a high-level abstract view** of an **object's behavior** while **hiding the 
      implementation details**
    * **Users** of the class can **interact with the object** based on **what it does**, **rather than how it's 
      implemented**
  * **Modularity:**
    * Encapsulation **promotes modularity** by **isolating the internal details** of a class
    * This makes it **easier to maintain and extend** the codebase because **changes to one class won't necessarily 
      affect other parts of the program**
  * **Security:**
    * By **controlling access** to data, encapsulation **helps improve security** by **preventing unauthorized access** 
      and **manipulation** of **sensitive information**
* In summary, encapsulation in OOP is a key concept that emphasizes the **bundling of data and methods within a class**, 
  along with **access control mechanisms** to **ensure** that data is **accessed** and **manipulated** in a **controlled 
  and consistent manner**
* It helps in creating **well-organized**, **maintainable**, and **secure** software systems
* <img src="images/Encapsulation_Diagram.jpeg" width="500">
