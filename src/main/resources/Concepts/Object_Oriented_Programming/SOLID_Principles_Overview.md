# SOLID Principles in OOP:

### Overview:
* The **SOLID principles** are a set of **design principles** in **object-oriented programming** that aim to create 
  **scalable**, **maintainable**, and **flexible software**
* These principles were introduced by **Robert C. Martin** and are widely used to **guide developers** in **designing 
  robust and maintainable systems**
* The SOLID acronym represents five individual principles:
  * **Single Responsibility Principle (SRP):**
    * A **class** should have **only one reason to change**, meaning it **should have only one responsibility**
    * This principle **encourages a class** to have a **single purpose or function** and to **encapsulate only the 
      behavior related to that purpose**
  * **Open/Closed Principle (OCP):**
    * **Software entities** (**classes**, **modules**, **functions**, etc.) should be **open for extension** but 
      **closed for modification**
    * This implies that the **behavior of a module can be extended without altering its source code**
    * This is often achieved through the use of **abstract classes**, **interfaces**, and **polymorphism**
  * **Liskov Substitution Principle (LSP):**
    * **Subtypes must be substitutable for their base types without altering the correctness of the program**
    * In other words, **objects of a superclass should be replaceable with objects of a subclass without affecting the 
      functionality of the program**
  * **Interface Segregation Principle (ISP):**
    * A **class should not be forced** to **implement interfaces it does not use**
    * Instead of having **large**, **monolithic interfaces**, it's better to have smaller, specific interfaces that are 
      **tailored to the needs of the implementing classes**
    * This helps **avoid unnecessary dependencies**
  * **Dependency Inversion Principle (DIP):**
    * **High-level modules should not depend** on **low-level modules**
    * **Both should depend on abstractions**
    * **Abstractions should not depend on details**; **details should depend on abstractions**
    * This principle **encourages** the use of **interfaces** or **abstract classes** to **define high-level policies**, 
      and **concrete implementations** can **depend on these abstractions**
* Applying the SOLID principles helps in achieving code that is **modular**, **flexible**, and **easy to understand**
* These principles contribute to the development of software that is **more maintainable**, **extensible**, and **less 
  prone to bugs as the system evolves** over time

### The Single Responsibility Principle (SRP):
* The **Single Responsibility Principle (SRP)** is one of the **SOLID principles** of **object-oriented design**
* It states that a **class** should have **only one reason to change**, meaning that a class should have **only one 
  responsibility**
* In other words, a **class should encapsulate only one aspect** of the **software's functionality**
* The idea behind SRP is to **promote maintainability**, **flexibility**, and **readability** in code
* When a class has a single responsibility, **changes to one aspect of the system won't affect other unrelated parts**
* **Example:**
```java
// Without adhering to SRP
class Report {
    private String content;

    public void generateReport() {
        // Logic to generate a report
        // This class now has the responsibility of 
        // both report generation and storing content
    }

    public void saveToFile() {
        // Logic to save the report content to a file
    }
}
```
* In the above example, the `Report` class has **two responsibilities**: **generating a report** and **saving it to a 
  file**
* This **violates the Single Responsibility Principle** because the **class** has **more than one reason to change**
* Now, let's **refactor** it to adhere to SRP:
```java
// Adhering to SRP
class Report {
    private String content;

    public void generateReport() {
        // Logic to generate a report
    }

    // Separate class responsible for saving to a file
    class ReportSaver {
        public void saveToFile(Report report) {
            // Logic to save the report content to a file
        }
    }
}
```
* In this refactored version, the **`Report` class** now has the **single responsibility** of **generating a report**
* The **saving functionality** has been **moved to a separate class `ReportSaver`**, adhering to the **Single 
  Responsibility Principle**
* This way, **each class** has a **clear and single purpose**, making the code **more modular** and **maintainable**

### The Open/Closed Principle (OCP):
* The **Open/Closed Principle (OCP)** is one of the **SOLID principles** of **object-oriented design**
* It states that a **class** should be **open for extension** but **closed for modification**
* In other words, the **behavior of a module can be extended without modifying its source code**
* The idea behind the Open/Closed Principle is to **design classes and modules** in a way that **allows for future 
  enhancements or changes in behavior without altering existing code**
* This promotes a **modular** and **flexible codebase**
* **Example:**
```java
// Without adhering to OCP
class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // Method to calculate area
    public double calculateArea() {
        if (type.equals("Circle")) {
            // Calculation logic for circle
            return /* calculated area */;
        } else if (type.equals("Square")) {
            // Calculation logic for square
            return /* calculated area */;
        } else {
            throw new UnsupportedOperationException("Unsupported shape type");
        }
    }
}
```
* In the above example, the **`Shape` class violates the Open/Closed Principle** because **if a new shape is added**, 
  the **`calculateArea` method needs to be modified**
* This means the **class** is **not closed for modification**
* Now, let's **refactor** it to adhere to OCP:
```java
// Adhering to OCP
interface Shape {
    String getType();
    double calculateArea();
}

class Circle implements Shape {
    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double calculateArea() {
        // Calculation logic for circle
        return /* calculated area */;
    }
}

class Square implements Shape {
    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double calculateArea() {
        // Calculation logic for square
        return /* calculated area */;
    }
}
```
* In this refactored version, we've **introduced an interface `Shape`** and **created separate classes** (**`Circle`** 
  and **`Square`**) that **implement this interface**
* Now, if we want to **add a new shape**, we can **create a new class** that **implements the `Shape` interface**, 
  **extending the system without modifying existing code**

### The Liskov Substitution Principle (LSP):
* The **Liskov Substitution Principle (LSP)** is one of the **SOLID principles** of **object-oriented design**, named 
  after computer scientist **Barbara Liskov**
* It states that **objects of a superclass** should be able to be **replaced with objects of a subclass without 
  affecting the correctness of the program**
* In other words, if a **class S** is a **subclass of class T**, an **object of type T should be replaceable** with an **object of 
  type S without affecting** the **desirable properties of the program**
* To adhere to the Liskov Substitution Principle, the **subclass should extend the behavior of the superclass without 
  altering its intended functionality**
* This ensures that **code written to work with the base class** will **work seamlessly** with **any of its subclasses**
* The LSP helps in **achieving polymorphism**, allowing **different derived classes** to be **used interchangeably with 
  their base class**
* In practice, **violating the LSP** can lead to **unexpected behavior and errors** in a program, particularly when 
  working with **polymorphic code** that relies on the **interchangeability of objects** based on their **common base 
  type**
```java
// Base class representing a geometric shape
class Shape {
    public double calculateArea() {
        return 0.0; 
        // Default implementation for unknown shapes
    }
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square extending Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Client code using shapes
public class ShapeClient {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        printArea(circle); 
        // Output: Area: 78.53981633974483
        printArea(square); 
        // Output: Area: 16.0
    }
}
```
* In this example, the **`Shape` class** is the **base class**, and **`Circle`** and **`Square`** are **subclasses**
* The **`calculateArea` method** is **overridden** in **each subclass** to **provide specific implementations** for 
  **calculating the area** of a **circle** and a **square**
* The **`ShapeClient` class demonstrates the Liskov Substitution Principle** by **accepting any object** of **type 
  `Shape`** and calling the **`calculateArea` method without knowing** the **specific subclass**
* This allows for **easy substitution** of **different shapes without affecting the correctness of the program**
* **Each subclass** can be **used interchangeably with the base class** in the **`printArea` method**, showcasing 
  **polymorphism** and **adherence to the Liskov Substitution Principle**
* **Violating the Liskov Substitution Principle Example:**
```java
// Base class representing a Bird
class Bird {
    public void fly() {
        System.out.println("I can fly");
    }
}

// Subclass representing a Penguin, which 
// is a bird that cannot fly
class Penguin extends Bird {
    // Penguins cannot fly, so attempting 
    // to override the fly method would 
    // violate LSP
    @Override
    public void fly() {
        // Incorrect behavior for a bird
        System.out.println("I'm trying to fly, " +
                "but I'm a penguin!");
    }

    // Additional method specific to penguins
    public void swim() {
        System.out.println("I can swim");
    }
}

// Client code using Bird objects
public class BirdClient {
    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Bird penguin = new Penguin();
        // Using Penguin as a Bird

        makeBirdFly(sparrow);
        // Output: I can fly
        makeBirdFly(penguin);
        // Output: I'm trying to fly, but I'm a penguin!

        // This violates the Liskov Substitution Principle 
        // because the Penguin subclass
        // does not behave as expected for a typical Bird.
        // It overrides the fly method with incorrect 
        // behavior for a bird, leading to a violation of 
        // the LSP
    }
}
```
* In this example, the **`Penguin` class attempts to override** the **`fly` method** with **behavior that is 
  inconsistent with typical birds**
* **Penguins cannot fly**, so the **overridden method in `Penguin`** provides **incorrect behavior for a bird**
* Additionally, the **`Penguin` class introduces a new method `swim`**, which is **specific to penguins** but **not part 
  of the base `Bird` class**
* This **violates the Liskov Substitution Principle** because **substituting a `Penguin` for a `Bird`** leads to 
  **unexpected behavior**, and the **`Penguin` does not adhere** to the **expected behavior** of its **base class**

### The Interface Segregation Principle (ISP):
* The **Interface Segregation Principle (ISP)** is one of the **SOLID principles of object-oriented design**
* It states that **a class should not be forced to implement interfaces it does not use**
* In other words, a **client should not be forced** to **depend** on **interfaces** it **does not use**
* The key idea behind ISP is to **keep interfaces small**, **specific**, and **client-focused**
* **Clients** (**classes** or **modules**) **should not be burdened** with **methods they do not need**
* This principle promotes the creation of **fine-grained** and **client-specific interfaces**
* **Example:**
```java
// Interface representing actions related to flying
interface Flyable {
    void fly();
}

// Interface representing actions related to swimming
interface Swimmable {
    void swim();
}

// Class implementing both Flyable and Swimmable interfaces
class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}

// Class implementing only the Flyable interface
class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}

// Class implementing only the Swimmable interface
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
}
```
* In this example, we have **two separate interfaces**, **`Flyable`** and **`Swimmable`**, each **representing** a 
  **specific behavior**
* The **`Bird` class implements both interfaces** because it **can fly and swim**
* The **`Sparrow` class implements only the `Flyable` interface**, and the **`Fish` class implements only the 
  `Swimmable` interface**
* This **adheres to the Interface Segregation Principle** because **each class or module** can **choose to implement 
  only the interfaces** that are **relevant to its behavior**, and **clients are not forced to depend on methods they 
  do not need**

### The Dependency Inversion Principle (DIP):
* The **Dependency Inversion Principle (DIP)** is one of the **SOLID principles** of **object-oriented design**
* It emphasizes **two key points**:
  * **High-level modules should not depend** on **low-level modules**, but **both should depend on abstractions**
  * **Abstractions should not depend on details**, but **details should depend on abstractions**
* In simpler terms, the Dependency Inversion Principle **encourages the use of abstractions** (**interfaces** or 
  **abstract classes**) to **decouple high-level modules from low-level modules**, allowing for **flexibility** and 
  **easier maintenance**
* **Example:**
```java
// High-level module representing a switch
interface Switch {
    void turnOn();
    void turnOff();
}

// Low-level module representing a light bulb
class LightBulb implements Switch {
    @Override
    public void turnOn() {
        System.out.println("LightBulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb turned off");
    }
}

// High-level module representing a fan
interface Fan {
    void start();
    void stop();
}

// Low-level module representing a ceiling fan
class CeilingFan implements Fan {
    @Override
    public void start() {
        System.out.println("CeilingFan started");
    }

    @Override
    public void stop() {
        System.out.println("CeilingFan stopped");
    }
}

// High-level module using abstractions to depend on 
// low-level modules
class HomeAutomation {
    private Switch device;

    public HomeAutomation(Switch device) {
        this.device = device;
    }

    public void performAction() {
        // Using the abstraction (Switch) without 
        // depending directly on the low-level module 
        // (LightBulb or CeilingFan)
        device.turnOn();
        // Additional actions can be performed here
    }
}
```
* In this example, we have a **`Switch` interface representing the abstraction** for **turning devices on and off**
* The **`LightBulb`** and **`CeilingFan`** are **low-level modules** that **implement the `Switch` interface**
* The **`HomeAutomation` class** is a **high-level module** that **depends on the abstraction** (**`Switch`**), and it 
  **can work with different devices without directly depending on their specific implementations**
* This **adheres to the Dependency Inversion Principle**, allowing for **flexibility** and the **ability to introduce 
  new devices without modifying the high-level module**
* The **high-level module depends on abstractions**, and **low-level modules depend on those same abstractions**, 
  promoting a **more maintainable** and **scalable design**
* **Example of a  Violation of the Dependency Inversion Principle:**
  * In this example, we have **high-level modules depending directly** on **low-level modules**, **without using 
    abstractions**:
```java
// Low-level module representing a light bulb
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb turned on");
    }

    public void turnOff() {
        System.out.println("LightBulb turned off");
    }
}

// High-level module representing home automation 
// that directly depends on the low-level module
class HomeAutomation {
    private LightBulb lightBulb;

    public HomeAutomation(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void performAction() {
        // Direct dependency on the low-level 
        // module (LightBulb)
        lightBulb.turnOn();
        // Additional actions can be performed here
    }
}
```
* In this example, **`HomeAutomation`** is a **high-level module representing home automation**, and it **directly 
  depends** on the **low-level module `LightBulb`**
* This **violates the Dependency Inversion Principle** because **high-level modules should not depend directly** on 
  **low-level modules**
* **High / Low Level Modules:**
  * In the context of these examples and the Dependency Inversion Principle (DIP), "**high-level**" and "**low-level**" 
    refer to the **level of abstraction** and the **dependency relationships between modules**
  * **High-Level Module:**
    * This typically represents a **module** or **class** that **contains business logic** or **application-specific 
      functionality**
    * High-level modules are **meant to orchestrate and coordinate** the **overall behavior of the system**
    * In the context of DIP, **high-level modules should not depend directly** on the **implementation details** of 
      **low-level modules**
  * **Low-Level Module:**
    * This represents a **module** or **class** that deals with **specific implementation details** or **low-level 
      functionalities**
    * **Low-level modules** are **often responsible** for **handling specific operations** or **managing resources**
    * In the context of DIP, **low-level modules should not be directly depended upon** by **high-level modules**