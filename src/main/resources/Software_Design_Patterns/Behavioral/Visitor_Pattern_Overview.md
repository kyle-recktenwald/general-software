# Visitor Software Design Pattern:

### Overview:
* The **Visitor Design Pattern** is a **behavioral design pattern** that allows you to **define a new operation (or 
  algorithm) without changing the classes of the elements on which it operates**
* It is **particularly useful** when you have a **set** of **related classes** and you want to **perform operations on 
  their objects** in a way that **keeps the algorithms separate from the classes**
* Here's a **simplified explanation** of the Visitor pattern:
  * **Visitor Interface:**
    * **Declares** a `visit` method for each class of the element hierarchy
    * Each **`visit` method accepts an object of a specific class**
  * **Concrete Visitor:**
    * Implements the **`Visitor` interface** and **provides the implementation** for **each `visit` method**
  * **Element Interface:**
    * Declares an **`accept` method** that **accepts a visitor as an argument**
  * **Concrete Element:**
    * **Implements** the **`Element` interface** and **provides an implementation** of the **`accept` method**
  * **Object Structure:**
    * A **collection** or **structure of elements** that **accepts a visitor** and **allows the visitor** to **visit 
      each element in the structure**
* Now, let's look at a **simple Java example** to illustrate the Visitor pattern
* Let's consider a scenario with **different shapes** (**elements**) and a **visitor** that **calculates the area of 
  each shape**:
```java
// Visitor interface
interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
}

// Concrete Visitor
class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Calculating area of Circle");
        // Perform area calculation logic for Circle
    }

    @Override
    public void visit(Square square) {
        System.out.println("Calculating area of Square");
        // Perform area calculation logic for Square
    }
}

// Element interface
interface Shape {
    void accept(ShapeVisitor visitor);
}

// Concrete Element - Circle
class Circle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Element - Square
class Square implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Object Structure
class ShapeCollection {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void acceptVisitor(ShapeVisitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}

// Example usage
public class VisitorPatternExample {
    public static void main(String[] args) {
        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShape(new Circle());
        shapeCollection.addShape(new Square());

        AreaCalculator areaCalculator = new AreaCalculator();
        shapeCollection.acceptVisitor(areaCalculator);
    }
}
```
* In this example, the **`ShapeVisitor` interface** declares **`visit` methods for each shape** (Circle and Square)
* The **`AreaCalculator`** is a **concrete visitor** that **implements** the **area calculation logic for each shape**
* The **`Circle`** and **`Square` classes** are **concrete elements** that **implement the `Shape` interface**, 
  providing an **`accept` method** to **allow the visitor to visit them**
* The **`ShapeCollection`** is the **object structure** that **holds a collection of shapes** and **allows a visitor to 
  visit each shape**
* When you run this example, it will demonstrate how the **`AreaCalculator` visitor calculates the area for each shape 
  in the `ShapeCollection`**