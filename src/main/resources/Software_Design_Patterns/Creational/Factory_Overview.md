# Factory Design Pattern Overview:

### Overview:
* The **Factory Pattern** is a **creational design pattern** used in object-oriented programming
* It aims to **create objects without specifying the exact class of object that will be created**
* This pattern provides a way to **delegate the responsibility** of **instantiating objects** to a **separate factory 
  class or method**
* **Key Components:**
  * **Factory:**
    * This is a **class or method** responsible for **creating objects**
    * It contains the **logic** to **determine which type of object to create based on certain parameters or 
      conditions**
  * **Product:**
    * The **objects created by the factory**
    * These objects **typically share a common interface or base class**, allowing them to be **created without 
      specifying their concrete classes**
  * **Client:**
    * The client code that **uses the factory to create objects**
    * The client **interacts with the factory interface without being aware of the specific implementation of the 
      created objects**
* **Core Concepts:**
  * **Decoupling:**
    * The Factory Pattern **decouples the client code from the concrete classes being instantiated**
    * **Clients interact with the factory interface, abstracting the details of object creation**
  * **Abstraction:**
    * It provides an **abstraction layer** for **creating objects**
    * Instead of **directly creating objects** using **constructors** or **`new` keyword**, the **creation logic is 
      encapsulated within the factory**
* **Example:**
  * Consider a scenario where an application needs to create **different types of vehicles** (**car**, **bicycle**, 
    **truck**) **without knowing** the **specific classes involved**
  * Here's a basic example of how the Factory Pattern might be implemented in Java:
```java
// Product interface
interface Vehicle {
    void start();
    void stop();
}

// Concrete products
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle started");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }
}

// Factory interface
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete factory
class ConcreteVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        switch (type) {
            case "car":
                return new Car();
            case "bicycle":
                return new Bicycle();
            // Additional cases for other types of vehicles
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

// Client code
public class Client {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        // Creating a car
        Vehicle car = factory.createVehicle("car");
        car.start();
        car.stop();

        // Creating a bicycle
        Vehicle bicycle = factory.createVehicle("bicycle");
        bicycle.start();
        bicycle.stop();
    }
}
```
* In this example, the **`VehicleFactory` interface declares a method for creating vehicles**, and the 
  **`ConcreteVehicleFactory` implements this interface** to **create specific types of vehicles based on the provided 
  type parameter**
* The **client code uses the factory** to **create different vehicles without knowing the specific classes (Car or 
  Bicycle) being instantiated**