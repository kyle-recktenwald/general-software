# Decorator Design Pattern Overview:

### Overview:
* The **Decorator Design Pattern** is a **structural pattern** that allows **behavior to be added to an individual 
  object**, either **statically** or **dynamically**, **without affecting the behavior of other objects from the same 
  class**
* It is a type of design pattern that comes under the **Gang of Four (GoF) design patterns**
* **Key Components:**
  * **Component Interface:**
    * **Defines the interface** for **objects that can have responsibilities added or removed dynamically**
  * **Concrete Component:**
    * **Implements the Component interface** and **defines** the **basic behavior of the object to which additional 
      responsibilities can be added**
  * **Decorator:**
    * **Maintains a reference to a Component object** and **conforms to the Component interface**
    * It also has an **association with the Component**
  * **Concrete Decorator:**
    * **Extends** the **behavior of the Component** by **adding responsibilities** or **modifying its behavior**
* **How it Works:**
  * **Component Interface:**
    * Defines the **basic interface** that **all concrete components and decorators must implement**
  * **Concrete Component:**
    * **Implements** the **basic functionality defined by the Component interface**
  * **Decorator:**
    * **Holds a reference to a Component** and **implements the same interface**
    * **Forwards requests to the wrapped Component** and **may perform additional actions before or after forwarding**
  * **Concrete Decorator:**
    * **Adds specific responsibilities** or **modifies the behavior** of the **wrapped Component**
    * **Extends the behavior of the Component without altering its structure**
* **Benefits:**
  * Provides a **flexible alternative to subclassing** for **extending behavior**
  * Allows **adding or altering behavior without modifying existing code**
* **Example:**
  * Consider a **simple coffee ordering system** with a **`Coffee` interface as the component**, a **`SimpleCoffee` 
    class as the concrete component**, and **two decorators** (**`MilkDecorator`** and **`SugarDecorator`**) that **add 
    functionalities to the coffee**
```java
// Component Interface
interface Coffee {
    int cost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public int cost() {
        return 5;
    }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost();
    }
}

// Concrete Decorator 1
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}

// Concrete Decorator 2
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}

// Usage
public class CoffeeShop {
    public static void main(String[] args) {
        // Order a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: $" + simpleCoffee.cost());

        // Order a coffee with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of Milk Coffee: $" + milkCoffee.cost());

        // Order a coffee with milk and sugar
        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost of Milk and Sugar Coffee: $" + milkSugarCoffee.cost());
    }
}
```
* In this example, the **`MilkDecorator`** and **`SugarDecorator`** are **concrete decorators** that **extend the 
  `CoffeeDecorator` class**
* They **add the cost of milk and sugar**, respectively, to the **existing cost of the coffee**
* The **`CoffeeShop` class** demonstrates **how to create different combinations of coffee using decorators**
* **Problematic Approach without Decorator:**
  *  Imagine you are working on a system that **allows users** to **customize and order different types of pizzas**
  * **Without using the Decorator pattern**, you might be tempted to create a **large number of subclasses** for **each 
    possible combination of pizza toppings**
  * This approach can lead to several problems:
```java
// Problematic Approach without Decorator

// Base Pizza class
class Pizza {
    public String getDescription() {
        return "Plain Pizza";
    }

    public double cost() {
        return 10.0;
    }
}

// Subclasses for different pizza types
class MargheritaPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }
}

class PepperoniPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Pepperoni Pizza";
    }
}

// Subclasses for pizza types with additional toppings
class MargheritaWithExtraCheese extends MargheritaPizza {
    @Override
    public String getDescription() {
        return super.getDescription() + " with Extra Cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}

class PepperoniWithExtraMushrooms extends PepperoniPizza {
    @Override
    public String getDescription() {
        return super.getDescription() + " with Extra Mushrooms";
    }

    @Override
    public double cost() {
        return super.cost() + 3.0;
    }
}

// Usage
public class PizzaShop {
    public static void main(String[] args) {
        Pizza margheritaWithExtraCheese = new MargheritaWithExtraCheese();
        System.out.println("Description: " + margheritaWithExtraCheese.getDescription());
        System.out.println("Cost: $" + margheritaWithExtraCheese.cost());

        Pizza pepperoniWithExtraMushrooms = new PepperoniWithExtraMushrooms();
        System.out.println("Description: " + pepperoniWithExtraMushrooms.getDescription());
        System.out.println("Cost: $" + pepperoniWithExtraMushrooms.cost());
    }
}
```
* **Issues with this Approach:**
  * **Class Explosion:**
    * As you **introduce more toppings and combinations**, the **number of subclasses grows exponentially**
    * This leads to a **large** and **difficult-to-maintain class hierarchy**
  * **Code Duplication:**
    * **Similar code** for **describing the pizza** and **calculating its cost** is **duplicated across multiple 
      subclasses**, **violating the DRY (Don't Repeat Yourself) principle**
  * **Limited Flexibility:**
    * **Adding or removing toppings becomes challenging**, and the system is **not flexible enough** to **accommodate 
      new combinations without creating new classes**
* Using the Decorator pattern can address these issues by allowing you to **dynamically add toppings and behaviors to 
  pizzas at runtime**, **without the need for an excessive number of subclasses**