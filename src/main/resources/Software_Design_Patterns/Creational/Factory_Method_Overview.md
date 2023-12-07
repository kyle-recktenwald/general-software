# Factory Method Design Pattern Overview:

### Overview:
* The **Factory Method** is a **creational design pattern** that **provides an interface** for **creating objects** but 
  **allows subclasses to alter the type of objects that will be created**
* **In this pattern:**
  * There is an **interface** (**or an abstract class**) **defining the method(s)** to create objects
  * This method is often called the "**factory method**"
  * **Subclasses implement this factory method** to **produce objects** that are **suitable for their context**
  * The **client code calls the factory method** to **create objects without specifying the exact class of the object 
    being created**
* **Key Components and Features of the Factory Method Pattern:**
  * **Product:**
    * This is the **interface** or **abstract class defining the type of object** the **factory method creates**
  * **Concrete Product:**
    * These are the **classes that implement** the **Product interface** or **extend the Product abstract class**
    * **Each Concrete Product** provides a **specific implementation** of the **product**
  * **Creator:**
    * This is the **interface or abstract class** that **declares the factory method**
    * It also **contains other methods** that **may use the products returned by the factory method**
  * **Concrete Creator:**
    * These are **subclasses of the Creator** that **override the factory method** to **produce specific types of 
      products**
* **Benefits of Using the Factory Method Pattern:**
  * **Provides** a way to **delegate the creation of objects to subclasses**, allowing the **client code** to **work 
    with these objects without knowing their specific classes**
  * **Enables easy extension** by **adding new subclasses without modifying the client code**
  * Helps to enforce the **Open/Closed Principle** - **open for extension but closed for modification**
* **Example:**
  * Consider a framework for a **vehicle manufacturing system**
  * The **`VehicleFactory` interface** may have a **method** called `createVehicle()`
  * The `CarFactory` and `TruckFactory` are **Concrete Creators implementing this interface**, each **producing specific 
    types of vehicles** like **cars or trucks** (**Concrete Products**) using their `createVehicle()` methods
* This pattern is **commonly used** in frameworks where the **exact type of object to be created may vary based on 
  context or requirements**, allowing **flexibility and encapsulation** in **object creation**
```java
// Vehicle interface (Product)
interface Vehicle {
    void manufacture();
}

// Concrete Product: Car
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a Car.");
    }
}

// Concrete Product: Truck
class Truck implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a Truck.");
    }
}

// VehicleFactory interface (Creator)
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete Creator: CarFactory
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// Concrete Creator: TruckFactory
class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
```
* Now, let's create a **client** that **uses these factories** to **create vehicles without knowing the specific type 
  of the vehicle being created**:
```java
public class Main {
    public static void main(String[] args) {
        // Client code using factories to create vehicles
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture(); // Output: Manufacturing a Car.

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.manufacture(); // Output: Manufacturing a Truck.
    }
}
```
* In this example, the **`Vehicle` interface** defines the common behavior for different types of vehicles
* The `Car` and `Truck` classes are **concrete implementations** of the **`Vehicle` interface**, representing **specific 
  types of vehicles**
* The **`VehicleFactory` interface declares the `createVehicle()` factory method**
* `CarFactory` and `TruckFactory` are **concrete implementations** of the **`VehicleFactory` interface**, each 
  **implementing the `createVehicle()` method** to **produce specific types of vehicles (`Car` or `Truck`)**
* The **client code** (**`Main` class**) **uses these factories** to **create vehicles** (`Car` and `Truck`) **without 
  directly instantiating them**, demonstrating the **decoupling of the client from the specific implementations of the 
  products**
* This way, **new types of vehicles can be added** (by **creating new concrete products and factories**) **without 
  modifying the client code**

### Pitfalls of Not Using Factory Method Pattern:
* Imagine you're developing an application that involves **creating different types of vehicles** such as **cars**, 
  **bicycles**, and **trucks**
* **Without using the factory method design pattern**, you **might end up scattering the creation logic** for these vehicles
  **throughout your codebase**
* For instance, in various parts of your code, you might have **separate methods** to **create a car, a bicycle, and a 
  truck**
* If the **way these objects are created needs to change** or if you **need to add more types of vehicles later**, you'd 
  have to **hunt down and modify all those places in your code where the creation logic exists**
* This could lead to **code duplication**, **inconsistency**, and **difficulties in maintenance**
* However, by **implementing the factory method design pattern**, you could **centralize the creation** of these 
  vehicles in **dedicated factory classes**
* **Each factory class** would be responsible for **creating a specific type of vehicle**, allowing for **easier 
  maintenance**, **scalability**, and **code organization**
```java
class Vehicle {
    // Common properties and methods for vehicles
}

class Car extends Vehicle {
    // Car-specific properties and methods
}

class Bicycle extends Vehicle {
    // Bicycle-specific properties and methods
}

class Truck extends Vehicle {
    // Truck-specific properties and methods
}

public class Application {
    // Creating vehicles without a factory 
    // method pattern
    public static void main(String[] args) {
        // Creating a car
        Car myCar = new Car(); 
        
        // Creating a bicycle
        Bicycle myBicycle = new Bicycle();
        
        // Creating a truck
        Truck myTruck = new Truck();
        
        // ... more code using these objects 
        // scattered throughout the application
    }
}
```
* In this scenario, without a factory method pattern, the creation of Car, Bicycle, and Truck objects happens 
  **directly in the main method**
* As the application grows, suppose you need to **change the way these objects are instantiated**, or you need to 
  **add more types of vehicles**
* You'd have to go through the **entire codebase** to make modifications wherever these objects are created, leading to 
  potential **code duplication** and **maintenance issues**
* Implementing the **factory method design pattern** would **centralize this creation logic**, making it **easier to 
  maintain and extend**

