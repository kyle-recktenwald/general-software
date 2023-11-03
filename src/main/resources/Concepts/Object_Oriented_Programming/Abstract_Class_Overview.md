# Abstract Class Overview:

### Overview:
* An abstract class is a class that cannot be instantiated on its own and is typically used as a blueprint or template 
  for other classes
* It is a fundamental concept in object-oriented programming (OOP) and serves as a way to define a common interface or 
  set of methods and properties that subclasses must implement
* Abstract classes are often used to create a hierarchy of related classes with shared behavior and attributes
* Here are some key characteristics of abstract classes:
  * Cannot be instantiated:
    * You cannot create objects (instances) of an abstract class directly
    * Instead, you must create subclasses that inherit from the abstract class and provide concrete implementations for 
      its abstract methods
  * May have abstract methods:
    * Abstract classes can contain one or more abstract methods, which are declared but not defined in the abstract class 
      itself
    * Subclasses must provide concrete implementations for these abstract methods
    * Abstract methods are meant to define a contract that derived classes must adhere to
  * Can have concrete methods:
    * Abstract classes can also have regular (concrete) methods with implementations
    * These methods can provide shared functionality that is common to all subclasses
* Used for code reusability and polymorphism: Abstract classes are useful for promoting code reusability and 
  implementing polymorphism
* By defining a common interface in an abstract class, you can create a family of related classes that share some 
  common behavior while allowing each subclass to implement specific details

### Java Example:
```java
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double calculateArea();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```