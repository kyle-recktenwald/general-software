# Java Overview:

### Overview:
* Java is a **high-level**, **object-oriented** **programming language** that was developed by **James Gosling** and 
  his team at **Sun Microsystems** (now owned by **Oracle Corporation**) in the **mid-1990s**
* It has since become one of the **most popular** and **widely used** programming languages for a **wide range** of 
  applications, from **web and mobile development** to **embedded systems** and **enterprise software**
* Java's main features include:
  * **Platform Independence (Write Once, Run Anywhere):**
    * Java **programs** are **compiled** into an **intermediate form** known as **bytecode**
    * This **bytecode** can run on **any platform** with a **Java Virtual Machine (JVM)**, which **interprets and 
      executes** the **bytecode**
    * This "**write once, run anywhere**" principle makes Java **platform-independent**
  * **Object-Oriented:**
    * Java is a **purely object-oriented** programming language, which means that **everything in Java is an object**
    * It **encourages** the use of **classes** and **objects** for building **modular** and **maintainable** software
  * **Robust and Secure:**
    * Java's **strong type-checking**, **runtime checking**, and **exception handling** contribute to its **robustness**
    * Java also has **built-in security features** to protect against **unauthorized access**, **viruses**, and 
      **other security threats**
  * **Automatic Memory Management (Garbage Collection):**
    * Java **manages memory automatically** through a process called **garbage collection**
    * This helps **prevent memory leaks** and **simplifies memory management for developers**
  * **High Performance:**
    * Java's **Just-In-Time (JIT) compilation** allows it to achieve good performance by **converting bytecode** into 
      **native machine code at runtime**
  * **Multi-Threaded and Concurrency Support:**
    * Java provides **built-in support** for **multi-threading** and **concurrency**, allowing developers to create 
      applications that can **efficiently handle multiple tasks simultaneously**
  * **Rich Standard Library (Java API):**
    * Java comes with a **comprehensive set** of **libraries and APIs** (Application Programming Interfaces) that 
      cover various aspects of development, including **I/O**, **networking**, **data structures**, and **graphical 
      user interfaces**
  * **Community and Ecosystem:**
    * Java has a **vast and active developer community**
    * It also has a **rich ecosystem** of **third-party libraries**, **frameworks**, and **tools** that make it easier 
      to build a **wide range of applications**
  * **Portability and Scalability:**
    * Java's **platform independence** and **support for networking and distributed computing** make it suitable for 
      developing **portable and scalable applications**, including **web and enterprise systems**
  * **Open Source:**
    * **Java itself**, as well as **many of its libraries and tools**, are **open source**, which **fosters innovation** 
      and **collaboration** in the **development community**
  * **Modern Language Features:**
    * Over the years, Java has introduced **modern language features and improvements**, such as **lambdas** (in Java 8), 
      **modules** (in Java 9), and **pattern matching** (in Java 16), to make the language **more expressive** and 
      **developer-friendly**
  * **Dynamic and Extensible:**
    * Java allows for **dynamic loading of classes and extensions**, enabling applications to **adapt** to **changing 
      requirements** and **incorporate new functionality**
* Java's versatility, portability, and wide range of applications have contributed to its enduring popularity in the 
  software development industry
* It is used for developing web and mobile applications, desktop software, backend services, embedded systems, and 
  much more
* <img src="images/Java_Diagram.gif" width="400">

### A Class in Java:
* In Java, a **class** is a **blueprint** or **template** used to **create objects**
* It serves as a **blueprint for objects**, **defining** their **structure**, **behavior**, and **attributes**
* **Each object created from a class** is an **instance of that class**
* Here are the key components of a class in Java:
* **Class Declaration:**
  * To **define a class** in Java, you use the `class` keyword followed by the **class name**
  * The **class body** is **enclosed within curly braces `{}`**
```java
public class MyClass {
    // Class members (fields, methods, constructors, etc.) go here
}
```
* **Fields (Variables):**
  * **Fields** are **variables declared within a class** to **represent its data or state**
  * These can be **instance variables** (**belonging to each object**) or **static variables** (**shared across all 
    instances**)
```java
public class MyClass {
  // Instance variable
  private int age;

  // Static variable
  public static String name;
}
```
* **Methods:**
  * Methods are **functions defined within a class** to **specify its behavior**
  * They **perform operations** and **manipulate the data of the class**
```java
public class MyClass {
  // Method
  public void displayInfo() {
      System.out.println("Information...");
  }
}
```
* **Constructors:**
  * Constructors are **special methods** used to **initialize objects when they are created**
  * They have the **same name as the class** and **may take parameters**
```java
public class MyClass {
  // Constructor
  public MyClass(int initialAge) {
      this.age = initialAge;
  }
}
```
* **Access Modifiers:**
  * Java allows the use of **access modifiers** (like **`public`**, **`private`**, **`protected`**) to **control the 
    visibility of fields**, **methods**, and **constructors within a class or from outside**
```java
public class MyClass {
  private int secretData; // Private field
  
  public void displayInfo() { // Public method
    System.out.println("Information...");
  }
}
```
* **Class Members:**
  * **Members of a class** in Java refer to the **various components** or **entities within a class** that **define 
    its structure, behavior, and characteristics**
  * These members include **fields (variables)**, **methods**, **constructors**, and **nested classes or interfaces**
* Classes serve as the **foundation** for **object-oriented programming** in Java, providing a way to **model real-world 
  entities** or **abstract concepts** by **encapsulating their data and behavior**
* They **enable code reusability**, **maintainability**, and a **structured approach to software development** by 
  **organizing related functionalities** into **coherent units**
* **Instances** of **classes** (**objects**) can be **created**, allowing **manipulation** and **interaction** with 
  their **defined attributes and behaviors**


### The String.split() Method:
* The `String.split()` method in Java is used to **split a string into an array of strings** based on a **specified 
  delimiter**
* The delimiter can be a **single character** or a **regular expression**
* The `String.split()` method can take one or two parameters:
* `delimiter`:
  * The **delimiter** that you want to use **to split the string**
* `limit`:
  * The **maximum number of strings** to **include in the array**
  * If you specify a **negative limit**, the method will split the string into **as many strings as possible**
  * If you specify a **limit of 0** (**default**), the method will split the string into **an array containing the entire string**
* The `String.split()` method returns an array of strings, where each string is a part of the original string that is 
  separated by the delimiter
* If the **delimiter does not appear** in the original string, the method will return an array containing a **single 
  string**, which is the **original string**
* Here are some examples of how to use the String.split() method:
```
// Split a string on whitespace.
String[] stringArray = "This is a string.".split(" ");

// Split a string on a comma.
stringArray = "This,is,a,string.".split(",");

// Split a string on a regular expression.
stringArray = "This is a string.".split("\\s+");
```
* In the first example, the `String.split()` method will split the string `"This is a string."` on **whitespace** and 
  return an array containing the following strings: `["This", "is", "a", "string."]`
* In the second example, the `String.split()` method will split the string `"This,is,a,string."` on a **comma** and 
  return an array containing the following strings: `["This", "is", "a", "string"]`
* In the third example, the `String.split()` method will split the string `"This is a string."` on the **regular 
  expression** `\\s+`
  * The regular expression `\\s+` matches **one or more whitespace characters**
  * The `String.split()` method will return an array containing the following strings: `["This", "is", "a", "string"]`
* The `String.split()` method is a powerful tool for **splitting strings into arrays**
* It can be used to split strings on a variety of **delimiters**, including **whitespace**, **commas**, and **regular 
  expressions**

### The String Substring Method:
* The **`substring()` method** in **Java** is used to **extract a substring from a given string**
* It can be used to **extract any substring**, **regardless** of its **length or position** within the **original 
  string**
* The substring() method has **two overloaded variants**:
* `substring(int beginIndex)`:
  * This method returns a new string that is a substring of the original string, **starting at the specified index** and 
    **extending to the end of the string**
* `substring(int beginIndex, int endIndex)`:
  * This method returns a new string that is a substring of the original string, **starting at the specified index** and 
    **extending to the character at the specified end index - 1**
* The `beginIndex` parameter is the **index of the first character in the substring**
* The `endIndex` parameter is the **index of the last character in the substring, plus 1**
* Both variants of the `substring()` method can throw an `IndexOutOfBoundsException` if any of the following conditions 
  are met:
  * The `beginIndex` is **negative**
  * The `endIndex` is **larger than the length** of the **original string**
  * The `beginIndex` is **larger than the endIndex**
* Here is an example of how to use the substring() method:
```
String originalString = "Hello, world!";

// Extract the substring "llo, world!" from the original string.
String substring = originalString.substring(2);

// Extract the substring "Hello" from the original string.
String substring = originalString.substring(0, 5);
```
* The `substring()` method can be used to perform a variety of tasks, such as:
  * **Extracting substrings** from larger strings
  * **Removing prefixes or suffixes** from strings
  * Checking if a string **contains** a **particular substring**
  * **Splitting a string** into **multiple substrings**

### Format Strings in Java:
* In Java, a **format string** is a string that contains placeholders for values that will be **substituted during 
  runtime**
* The `String.format()` method and `System.out.printf()` method are commonly used to create formatted strings in Java
* Here's a basic overview of how format strings work in Java:
  * **Format Specifiers:**
    * **Format specifiers** are **placeholders in the format string** that **indicate where and how values should be 
      inserted**
    * They start with a **percent sign** `%` followed by a **character** that **specifies** the **type of data** (e.g., 
      `%d` for **integers**, `%f` for **floating-point numbers**, `%s` for **strings**)
  * **Argument List:**
    * After the format string, you provide a **list of arguments** that **correspond to the placeholders** in the format 
      string
    * The **order of the arguments** should **match** the **order of the placeholders** in the format string
```java
public class FormatExample {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double height = 5.9;

        // Using String.format()
        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
        System.out.println(formattedString);

        // Using System.out.printf()
        System.out.printf("Name: %s, Age: %d, Height: %.2f%n", name, age, height);
    }
}
```
* In this example:
  * `%s` is a placeholder for a **string** (`name`)
  * `%d` is a placeholder for an **integer** (`age`)
  * `%.2f` is a placeholder for a **floating-point number** (`height`) with **two decimal places**
* The output will be something like:
```
Name: John, Age: 25, Height: 5.90
Name: John, Age: 25, Height: 5.90
```
* This allows you to create **well-formatted strings** with **dynamic content**
* The format specifiers **provide control** over the appearance of the output
* **The Integer Format Specifier (`%d`):**
  * **Width:**
    * The **width specifier** in the **integer format** controls the **minimum number of characters used** to **represent 
      the integer**
    * It allows you to **ensure a consistent width** for your output
    * The **syntax** is `%[flags][width]d`, where **width** is the **minimum width**, and `[flags]` can include options 
      like **left justification** (`-`) or **zero padding** (`0`)
    * In the example below, the **width** is set to **5 characters**, so the integer is **right-aligned**, and **any 
      extra spaces** are **added to the left**
  * **Leading Zeros:**
    * The **leading zero flag** (`0`) is used to **pad the integer with leading zeros instead of spaces**
    * This is often useful for **aligning numbers in columns**
    * In the example below, the **width** is set to **5 characters**, and the **leading zero flag** ensures that **if 
      the integer has fewer than 5 digits**, it is **padded with leading zeros**
  * **Combining Width and Leading Zeros:**
    * You can **combine width and leading zeros** for a **specific formatting effect**
    * In the example below, the **width is set to 5 characters**, and the **leading zero ensures** that if the integer 
      **has fewer than 5 digits**, it is **padded with leading zeros**
  * **Negative Numbers:**
    * When dealing with **negative numbers**, the **width specifier includes the negative sign as one of the 
      characters**
    * In the example below, the width specifier **accounts for the negative sign** in the **total width**
```
//Width Example:
int num = 123;
String formatted = String.format("%5d", num);
// Output: "  123"

//Leading Zeroes Example:
int num = 7;
String formatted = String.format("%05d", num);
// Output: "00007"

//Combining Width and Leading Zeros Example:
int num = 123;
String formatted = String.format("%05d", num);
// Output: "00123"

//Negative Numbers Example:
int negativeNum = -42;
String formatted = String.format("%5d", negativeNum);
// Output: "  -42"
```
* **The Floating Point Format Specifier (`%f`):**
  * **Width and Precision:**
    * The **width and precision specifiers** in the **floating-point format** control the **minimum width** and the 
      **number of digits after the decimal point, respectively**
    * The **syntax** is `%[flags][width][.precision]f`
    * In the example below:
      * The **minimum width** is set to **10 characters**, and **any extra spaces** are **added to the left** to meet 
        this **width**
      * The **precision** is set to **2 decimal places after the decimal point**
  * **Leading Zeros:**
    * The **leading zero flag (`0`)** can be used to **pad the floating-point number with leading zeros instead of 
      spaces**
    * **In the example below:**
      * The **minimum width** is set to **8 characters**
      * The **precision** is set to **2 decimal places after the decimal point**
      * **Leading zeros** are **added** to **fill the width**
  * **Combining Width, Precision, and Leading Zeros:**
    * You can **combine width, precision, and leading zeros** for specific formatting effects
    * In the example below:
      * The **minimum width** is set to **10 characters**
      * The **precision** is set to **3 decimal places after the decimal point**
      * **Leading zeros** are **added** to **fill the width**
  * **Scientific Notation:**
    * **Scientific notation** can be represented using the **`%e` or `%E` format specifier**
    * It is useful for **very large** or **very small numbers**
    * In the example below:
      * `%e` represents the number in **lowercase scientific notation**
      * `%E` represents the number in **uppercase scientific notation**
  * **Negative Numbers:**
    * Similar to integers, when dealing with **negative floating-point numbers**, the **width specifier includes the negative
      sign** as **one of the characters**
    * In the example below, the **width specifier accounts for the negative sign** in the **total width**
```
//Width and Precision Example:
double num = 3.14159;
String formatted = String.format("%10.2f", num);
// Output: "      3.14"

//Leading Zeros Example:
double num = 7.5;
String formatted = String.format("%08.2f", num);
// Output: "00007.50"

//Combining Width, Precision and Leading Zeros:
double num = 123.456789;
String formatted = String.format("%010.3f", num);
// Output: "00123.457"

//Scientific Notation Example:
double num = 1.23e6;
String formatted = String.format("%e", num);
// Output: "1.230000e+06"

//Negative Numbers Example:
double negativeNum = -42.75;
String formatted = String.format("%10.2f", negativeNum);
// Output: "    -42.75"
```

### Primitive Types in Java:
* In Java, primitive types are **basic data types** that represent **simple values**
* They are **not objects** and **don't have methods**
* Java has **eight primitive data types**, which can be categorized into two groups: **numeric types** and **non-numeric 
  types**
* Here's an overview of each:
* **Numeric Types:**
  * **`byte` (8 bits):**
    * **Range:**
      * `-128` to `127`
    * Used for **small integers**
  * **`short` (16 bits):**
    * **Range:**
      * `-32,768` to `32,767`
    * Used for **larger integers**
  * **`int` (32 bits):**
    * **Range:**
      * `-2^31` to `2^31 - 1`
      * `2^31` = `2,147,483,648` (**~two billion**)
    * Used for integers
  * **`long` (64 bits):**
    * **Range:**
      * `-2^63` to `2^63 - 1`
      * `2^63` = `9,223,372,036,854,776,000` (**~nine quintillion**)
      * Used for **large integers**
  * **`float` (32 bits):**
    * Used for **floating-point numbers**
    * **Example:**
      * `float myFloat = 3.14f`;
  * **`double` (64 bits):**
    * Used for **double-precision floating-point** numbers
    * **Example:**
      * `double myDouble = 3.14;`
* **Non-Numeric Types:**
  * `char` (16 bits):
    * Represents a single character
    * **Example:**
      * `char myChar = 'A';`
  * `boolean` (8 bits):
    * Represents a boolean value (`true` or `false`)
    * **Example:**
      * `boolean myBoolean = true;`
* These primitive types are **essential** for **storing and manipulating simple values efficiently**
* They are **directly supported** by the **Java programming language** and are **not objects**
* However, Java also has corresponding **wrapper classes** (e.g., `Integer`, `Double`, `Boolean`) that allow these 
  primitives to be used in a **more object-oriented context**, as they are **objects** and can be **used with collections 
  that require objects**
* The use of wrapper classes is especially common when working with **Java generics** and **certain Java APIs**

### Absolute Value in Java:
* The **`Math.abs` function** in Java is a **built-in method** provided by the `java.lang.Math` class
* It is used to **calculate** the **absolute value** of a **given numeric expression**
* The **absolute value** is the **magnitude** of a **real number** **without regard to its sign**
* In other words, it **returns the distance of the number from zero on the number line**
* Here's the signature of the `Math.abs` method:
```
public static int abs(int a)
public static long abs(long a)
public static float abs(float a)
public static double abs(double a)
```
* For **integer types** (`int` and `long`), it returns the **absolute value** as an **integer or long**
* For **floating-point types** (`float` and `double`), it returns the absolute value as a **floating-point number**
```
int intValue = -5;
int absIntValue = Math.abs(intValue);
System.out.println("Absolute value of " + intValue + ": " + absIntValue);
// Output: 5

double doubleValue = -7.5;
double absDoubleValue = Math.abs(doubleValue);
System.out.println("Absolute value of " + doubleValue + ": " + absDoubleValue);
// Output: 7.5
```
* **Use Case:**
  * The `Math.abs` function is **commonly used** when you need to **ensure** that a **value** is **non-negative**
  * It's useful in situations where you want to **ignore the sign** of a **number** and **work with its magnitude**
  * Keep in mind that if the result of `Math.abs` is **assigned to a variable** or **used directly in an expression**, 
    the **type of the result matches the type of the input**
  * If the **input** is an **integer**, the **result** is an **integer**; if the **input** is a **floating-point number**, 
    the **result** is a **floating-point number**

### The `static` Keyword in Java:
* In Java, the `static` keyword is used to create **class-level variables and methods** (**members**) that **belong to 
  the class itself rather than to instances (objects) of that class**
* There are **two main usages** of `static`:
  * **Static Variables (Class Variables):**
    * When a **variable** is **declared as `static` within a class**, it becomes a **class-level variable shared by all 
      instances (objects) of that class**
    * These variables are **initialized only once**, at the **start of the program execution**, and **retain their 
      values throughout the program's lifetime**
  * **Static Methods:**
    * When a **method** is **declared as `static`**, it becomes a **class-level method** that is **associated with the 
      class rather than with instances of the class**
    * Static methods can be **called using the class name without creating an object of that class**

* **Static Method Example:**
```java
public class MyClass {
public static void doSomething() { // Static method
// Method logic
}
// Other class members...
}
```
* You can call the `doSomething()` method using **`MyClass.doSomething()` without instantiating the `MyClass`**
* **Static Variables Example:**
```java
public class MyClass {
  public static int count = 0; // Static variable
  // Other class members...
}
```
* Here, `count` is a static variable that is **shared among all instances** of `MyClass` and can be **accessed using
  `MyClass.count`**
* **Key Points About Static:**
  * **Static members (variables/methods)** can be **accessed directly** using the **class name**, **without the need to 
    create an instance of the class**
  * They are **initialized** when the **class is loaded by the Java Virtual Machine (JVM)** and **exist throughout the 
    lifetime of the program**
  * **Static members can access other static members of the class but cannot directly access instance variables or 
    methods (non-static members) without an object reference**
  * They are **often used** for **constants** (`static final`) and **utility methods** that **don't require 
    instantiation** of the class
  * However, it's important to **use `static` judiciously**, as **excessive use** of static variables and methods can 
    lead to **issues** with **code maintainability**, **testability**, and can **limit flexibility** in some cases, 
    especially when dealing with **inheritance** and **polymorphism**

### Static Variables in Java:
* In Java, a **static variable** is a **class-level variable** that **belongs to the class itself**, rather than to 
  **any instance of the class**
* It's also known as a "**class variable**" because its value is **shared across all instances of that class**
* Key points about static variables:
  * **Belongs to the Class:**
    * A static variable is **associated with the class rather than with any specific instance of the class**
    * It's **created** when the **class** is **loaded into memory** and **exists throughout the lifetime of the 
      program**
  * **Shared Value:**
    * All instances (objects) of the class share the **same static variable**
    * If **one instance modifies its value**, the **change** will be **reflected** across **all other instances as well 
      as in the class itself**
  * **Accessed via Class Name:**
    * Static variables are **accessed using the class name** followed by the **dot operator**, **not through instances 
      of the class**
* Here's an example demonstrating the **usage** of a static variable:
```java
public class MyClass {
// Static variable
public static int count = 0;

    // Other class members and methods

    public MyClass() {
        count++;
      // Incrementing count each time an instance is created
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        System.out.println("Count: " + MyClass.count);
      // Accessing static variable using class name

        MyClass obj2 = new MyClass();
        System.out.println("Count: " + obj2.count);
      // Also can be accessed via an instance, but not recommended

        System.out.println("Count: " + MyClass.count);
      // Output: Count: 2 (incremented from both instances)
    }
}
```
* In this example, **`count`** is a **static variable** of the **`MyClass`**
* Each time an **instance** of **`MyClass`** is **created**, the **`count`** is **incremented**
* As it's a **static variable**, it is **accessed** using the **class name** (**`MyClass.count`**) rather than through 
  an **instance of the class**

### Static Constants in Java:
* A **`static final` variable** in Java is a **constant variable** that is **both `static`** (**belongs to the class 
  itself**) and **`final`** (its **value cannot be changed once initialized**)
* Here are the key characteristics of a static final variable:
  * **Class-Level Constant:**
    * It's **associated with the class**, **not with any instance of the class**
    * Therefore, its value **remains the same across all instances of the class**
  * **Cannot be Reassigned:**
    * **Once initialized**, its value **cannot be modified**
    * It is **effectively a constant**, and **any attempt to reassign its value** will result in a **compilation error**
  * **Initialized at Compile Time or in a Static Block:**
    * A **`static final` variable** can be **initialized at the time of declaration** or **within a static 
      initialization block** (which **runs when the class is loaded into memory**)
* Here's an example demonstrating the usage of a `static final` variable:
```java
public class Constants {
// Static final variable initialized at declaration
public static final int MAX_VALUE = 100;

    // Other class members and methods

    public static void main(String[] args) {
        // Accessing the static final variable
        System.out.println("Max Value: " + Constants.MAX_VALUE);

        // Attempting to modify the final variable results in 
        // a compilation error:
        // Constants.MAX_VALUE = 200;
    }
}
```
* In this example, **`MAX_VALUE`** is declared as a **`static final` variable** in the **`Constants` class**
* It is **initialized** with a value of **`100`** and **cannot be changed afterwards**
* **Any attempt** to reassign a value to `MAX_VALUE` will result in a **compilation error** due to its `final` nature
* This **constant variable** can be **accessed** using the **class name followed by the variable name** 
  (**`Constants.MAX_VALUE`**)

### Static Methods in Java:
* In Java, a **static method** is a **method associated with a class rather than with instances (objects) of that 
  class**
* It's **denoted** by the **`static` keyword** in the **method declaration**
* Here are the key characteristics of static methods:
  * **Belongs to the Class:**
    * Static methods are **associated** with the **class itself**, **not** with **individual instances** of the 
      **class**
    * They **can be invoked directly** using the **class name without needing to create an object** of that class
  * **Accessing Static Methods:**
    * You can **call a static method** using the **class name followed by the method name**, e.g., 
      **`ClassName.methodName()`**
  * **No Access to Instance Variables:**
    * Static methods **cannot directly access instance variables or non-static methods** of the class **without an 
      object reference** because they **don't belong to any particular instance**
  * **Cannot be Overridden:**
    * **Unlike instance methods**, static methods **cannot be overridden** in **subclasses**
    * They are **resolved at compile-time** based on the **reference type** rather than the **actual object type**
* **Example of a Static Method:**
```java
public class MyClass {
private static int count = 0; // Static variable

    public static void incrementCount() { // Static method
        count++; // Modifies the static variable
    }

    public static int getCount() { // Another static method
        return count; // Returns the static variable
    }
}
```
* In this example, **`incrementCount()`** and **`getCount()`** are **both static methods**
* You can call these methods using **`MyClass.incrementCount()`** and **`MyClass.getCount()`** **without creating an 
  instance** of `MyClass`
* Static methods are **commonly used** for **utility methods**, **factory methods**, or **methods** that **perform 
  operations related to the class as a whole**, **rather than dealing with specific instances**
* However, it's essential to **use static methods appropriately** and **understand their implications**, such as their 
  **inability to access instance-specific data** and their **compile-time binding behavior**


### The Collections Class in Java:
* The `java.util.Collections` class in Java is a **utility class** that provides **various static methods** for 
  operating on **collections**, including **lists**, **sets**, and **maps**
* It contains methods for **sorting**, **searching**, **shuffling**, and **synchronizing collections**, among other 
  tasks
* Here are some **common operations** and methods provided by the `Collections` class:
  * **Sorting:**
    * `sort(List<T> list)`:
      * **Sorts** the specified list into **ascending order**
    * `sort(List<T> list, Comparator<? super T> c)`:
      * Sorts the specified list according to the **order induced by the specified comparator**
  * **Searching:**
    * `binarySearch(List<? extends Comparable<? super T>> list, T key)`:
      * Searches for the specified element in the specified list using the **binary search algorithm**
    * `binarySearch(List<? extends T> list, T key, Comparator<? super T> c)`:
      * Searches for the specified object in the specified list using the **binary search algorithm**
  * **Shuffling:**
    * `shuffle(List<?> list)`:
      * **Randomly permutes** the specified list
    * `shuffle(List<?> list, Random rnd)`:
      * Randomly permutes the specified list using the **specified source of randomness**
  * **Finding Maximum:**
    * `max(Collection<? extends T> coll)`:
      * Returns the **maximum element** of the given collection, according to the **natural ordering** of elements
    * `max(Collection<? extends T> coll, Comparator<? super T> comp)`:
      * Returns the **maximum element** of the given collection, according to the order induced by the **specified 
        comparator**
  * **Finding Minimum:**
    * `min(Collection<? extends T> coll)`:
      * Returns the **minimum element** of the given collection, according to the **natural ordering** of elements
    * `min(Collection<? extends T> coll, Comparator<? super T> comp)`:
      * Returns the **minimum element** of the given collection, according to the order induced by the **specified comparator**
  * **Synchronization:**
    * `synchronizedCollection(Collection<T> c)`:
      * Returns a **synchronized (thread-safe) view** of the specified collection
    * `synchronizedList(List<T> list)`:
      * Returns a **synchronized (thread-safe) list** backed by the specified list
  * **Creating Immutable Collections:**
    * `emptyList()`, `emptySet()`, `emptyMap()`:
      * Returns an **empty, immutable list, set, or map**, respectively
    * `singletonList(T o), singleton(T o)`:
      * Returns an **immutable list or set** containing **only the specified object**
    * `unmodifiableList(List<? extends T> list)`, `unmodifiableSet(Set<? extends T> s)`:
      * Returns an **unmodifiable view** of the **specified list** or set
  * **Filling and Copying:**
    * `fill(List<? super T> list, T obj)`:
      * **Replaces** all of the elements of the specified list with the **specified element**
    * `copy(List<? super T> dest, List<? extends T> src)`:
      * **Copies all of the elements** from **one list** into **another**
* These are just a few examples of the many methods provided by the Collections class
* It's a powerful utility class that simplifies common operations on collections and provides useful tools for working 
  with them
```java
public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 4, 6, 8, 2, 5);

        // Finding maximum element
        Integer max = Collections.max(numbers);
        System.out.println("Maximum element: " + max);

        // Finding minimum element
        Integer min = Collections.min(numbers);
        System.out.println("Minimum element: " + min);

        // Using a custom comparator for finding maximum
        Integer maxWithComparator = Collections.max(numbers, Collections.reverseOrder());
        System.out.println("Maximum element with reverse order comparator: " + maxWithComparator);
    }
}
```

### Modulo:
* In Java, the **modulo operator** (`%`) returns the remainder of dividing the left operand by the right operand
  * For example:
    * `a % b` returns the remainder when `a` is divided by `b`
    * `5 % 3` would evaluate to 2 because 5 divided by 3 is 1 with a remainder of 2
* The modulo operation has various applications across different domains:
  * **Remainder Calculation:**
    * Modulo is often used to **find remainders** in arithmetic operations
    * For instance, in programming, it's commonly used to determine **whether a number is even or odd** (`number % 2`)
    * If the **result is 0**, it's **even**; otherwise, it's **odd**
  * **Cycle and Wrapping:**
    * In **array** or **circular buffer operations**, modulo helps in **wrapping around the indices**
    * For example, when implementing a **circular queue** or **rotating elements** in an array, the modulo operation 
      can be used to **ensure the indices remain within bounds**
  * **Hashing:**
    * In hash table implementations, modulo is used to **map a key to an index** in an **array**
    * It's used as **part of the hash function** to **limit the output** to a **specific range of indices**
  * **Time and Date Operations:**
    * Modulo can be used in handling **time-related calculations**
    * For instance, **converting seconds into minutes and seconds** (`seconds % 60` gives the **remaining seconds** 
      after removing full minutes)
  * **Encryption and Cryptography:**
    * Modulo operations can be utilized in **encryption algorithms** for hashing or modular arithmetic in cryptography
  * **Pattern Generation:**
    * In computer graphics or algorithms related to repetitive patterns, modulo can be used to **create repeating 
      patterns or cycles**
  * **Data Distribution:**
    * In parallel and distributed computing, modulo can help **distribute data across nodes or processes** by mapping 
      data elements to specific ranges or partitions
  * **Error Checking:**
    * In various algorithms and protocols, modulo can be used for **error detection and correction**
* In essence, the modulo operation is versatile and finds application in many computational tasks where **cyclic 
  behavior**, **remainders**, or **bounded arithmetic** are involved

### Using the Modulo for Cycle and Wrapping:
* **Cycle:**
  * In terms of **arrays** or **sequences**, a **cycle** refers to a **repeating pattern or sequence** of elements
  * For instance, in a **circular queue** or **buffer**, **after reaching the end of the array**, the **next element** 
    should be **considered as the first element**, creating a **cycle**
  * Consider an array of size `N` and you want to **access elements** at positions `i + k` where `k` is **some integer**
  * **Without any considerations**, this **could lead to an index out of bounds error**
  * However, with the modulo operation, you can **ensure that the index stays within the range of the array**
  * For example, let's say you have an array `arr` of length `N` and you want to access `arr[(i + k) % N]`
  * This ensures that even if `i + k` exceeds the length of the array, the **modulo operation** will **"wrap around" 
    the index**, making it valid and **ensuring** that it's **within the range** of **0 to `N - 1`**
```java
public class ClockSimulation {
    public static void main(String[] args) {
        int hours = 0;

        // Simulating the clock running for 15 hours
        for (int i = 0; i < 15; i++) {
            int currentHour = hours % 12; // Using modulo to simulate the 12-hour cycle
            System.out.println("Current hour: " + currentHour);

            hours++; // Incrementing hours
        }
    }
}
```
* **Wrapping:**
  * **Wrapping**, often associated with **cyclic behavior**, refers to the idea of "**wrapping around**" or "**looping 
    back**" to the **beginning** when an **operation reaches the end** of a range or sequence
  * For instance, consider **rotating an array** to the right by `k` steps, where `k` **might be greater than the array 
    length**
  * In this scenario, you want the **elements that go beyond the end of the array** to **wrap around** and become the 
    **first elements** of the **resulting array**
  * The **modulo operation** plays a **crucial role** here
  * If you have an **index `i`** and you want to **ensure it wraps around within the array bounds**, you can use `(i + 
    k) % N`, where `N` is the size of the array
  * This ensures that `i + k` remains within the range of the array indices, effectively **"wrapping" around the array**
```java
public class ArrayWrapping {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int index = 7; // Index that exceeds the array size

        // Wrapping the index to stay within the array bounds
        int wrappedIndex = index % arr.length;

        System.out.println("Original Index: " + index);
        System.out.println("Wrapped Index: " + wrappedIndex);
        System.out.println("Value at Wrapped Index: " + arr[wrappedIndex]);
        
        // Original Index: 7
        // Wrapped Index: 2
        // Value at Wrapped Index: 30
    }
}
```
* These concepts are fundamental in scenarios where cyclic behavior or wrapping around data structures, such as arrays, 
  queues, or circular buffers, is required
* Modulo helps in maintaining continuity and preventing index out of bounds errors by ensuring the indices remain 
  within a defined range

### The String Class in Java:
* **Overview:**
  * In Java, the `String` class is a **fundamental** and **widely used class** that represents a **sequence of 
    characters**
  * It's part of the `java.lang` package and is **immutable**, meaning **once a ``String object` is created**, its 
    **value cannot be changed**
* **Key Features and Characteristics of Java's String Class:**
  * **Immutable Nature:**
    * Once a **`String` object** is **created**, its **value cannot be modified**
    * Any operation that **seems to modify** a `String` **actually creates a new `String` object**
  * **Sequence of Characters:**
    * It represents a **sequence of characters** and provides various methods to perform operations on strings, such as 
      **concatenation**, **substring extraction**, **comparison**, **searching**, and **manipulation**
  * **Stored in String Pool:**
    * Java maintains a **string pool** (also known as a **string constant pool**) for **storing string literals**
    * This pool helps in **optimizing memory usage** by **reusing strings**
  * **Instantiation:**
    * Strings can be created using either **string literals** or the **`new` keyword**
    * **Example:**
      * `String str1 = "Hello"; // Using string literal`
      * `String str2 = new String("World"); // Using new keyword`
  * **Common Operations:**
    * **String manipulation methods:**
      * `length()`, `charAt()`, `substring()`, `concat()`, `indexOf()`, `startsWith()`, `endsWith()`, `toLowerCase()`, 
        `toUpperCase()`, and more
    * **String comparison:**
      * `equals()`, `equalsIgnoreCase()`, `compareTo()`, `compareToIgnoreCase()`
    * **String modification:**
      * `replace()`, `replaceAll()`, `trim()`
    * **Conversion to/from other types:**
      * `valueOf()`, `toCharArray()`, `getBytes()`
    * **Regular expressions:**
      * `matches()`, `split()`
  * **Supports Unicode:**
    * Strings in Java are **based on the Unicode character set**, allowing **representation** of a **wide range** of 
      **characters** from **various languages and scripts**
  * **Used Heavily:**
    * Strings are extensively used in Java programming for **text manipulation**, **file I/O**, **network 
      communication**, and more
* The String class plays a **pivotal role in Java programming** due to its **ubiquitous nature** and the wide range of 
  functionalities it provides for working with **text** and **character** data
* **Iterating Through a String:**
* **Using a For Loop:**
```
String str = "Hello, world!";
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    System.out.println(ch);
}
```
* **Using a For-Each Loop:**
```
String str = "Hello, world!";
for (char ch : str.toCharArray()) {
    System.out.println(ch);
}
```
* **Using Java Streams:**
```
String str = "Hello, world!";
str.chars().forEach(ch -> {
    System.out.println(ch);
});
```
* **Using Java 8+ String's codePoints() (for Unicode characters):**
```
String str = "Hello, world!";
str.codePoints().forEach(codePoint -> {
    char ch = (char) codePoint;
    System.out.println(ch);
});
```
* This method retrieves a stream of **Unicode code points** and allows you to perform actions for **each Unicode 
  character** in the string

### The `replaceAll` Method:
* The `replaceAll()` method in Java is used to **replace all occurrences** of a **specified substring** or **matching pattern**
  **within a string** with **another string**
* It's a powerful tool when working with string manipulation
* Here's the **general syntax**:
  * `String newString = originalString.replaceAll(regex, replacement);`
  * `originalString`:
    * The **string** in which you want to **perform replacements**
  * `regex`:
    * A **regular expression** (or a **plain string**) representing the **substring or pattern** to be **replaced**
  * `replacement`:
    * The **string** that **replaces** the **matched substrings** or **pattern**
* For instance, to **replace all occurrences** of a **specific substring** in a string, you can use `replaceAll()`
  like this:
```
String original = "Hello, World! Hello, Universe!";
String replaced = original.replaceAll("Hello", "Hi");
System.out.println(replaced);
// Output: "Hi, World! Hi, Universe!"
```
* In this example, **all instances** of the substring **"Hello"** in the original string are replaced with **"Hi"**
* Remember that `replaceAll()` uses **regular expressions**, so **characters** with **special meanings in regex** (like
  `.`, `*`, `+`, etc.) need to be **properly escaped** if you want to treat them as **literals**
* If you're **replacing** a **simple string without any regex pattern**, you can use **`replace()`** instead
* **Common Use Cases:**
  * To **remove all non-alphanumeric characters** from a string:
    * `String alphanumericOnly = originalString.replaceAll("[^a-zA-Z0-9]", "");`
  * To **remove all white space** from a String:
    * `String noWhiteSpace = originalString.replaceAll("\\s", "");`

### The Java String `trim` Method:
* In Java, the **`trim()` method** is part of the String class, and it's used to **remove leading and trailing 
  whitespace** (**spaces**, **tabs**, etc.) from a string
* It **doesn't remove whitespace within the string**, only from the **beginning** and **end**
* Note that the `trim()` method **only removes ASCII whitespace**, and **not Unicode whitespace** like the `strip()` 
  method
* **Example:**
```java
public class TrimExample {
    public static void main(String[] args) {
        String str = "   Hello, this is a string with spaces.    ";

        // Using trim() to remove leading and trailing spaces
        String trimmedString = str.trim();
        
        System.out.println("Original string: '" + str + "'");
        System.out.println("Trimmed string: '" + trimmedString + "'");
    }
}
```
* **Output:**
```
Original string: '   Hello, this is a string with spaces.    '
Trimmed string: 'Hello, this is a string with spaces.'
```

### The Java String `strip` Method:
* The `strip()` method in Java was introduced in **Java 11** as part of the **String class**
* It serves a **similar purpose** to the **`trim()` method** but with **added functionality**, particularly regarding 
  **Unicode whitespace characters**
* Here's an overview of `strip()`:
  * **Purpose:**
    * The `strip()` method **removes leading and trailing whitespace** from a string, **just like `trim()`**
    * However, it **goes further** by handling **all Unicode whitespace characters**, **not just ASCII spaces**
  * **Unicode Awareness:**
    * `strip()` **removes not only spaces** (' ') but also **other whitespace characters** recognized by the **Unicode 
      standard**, such as **tabs**, **line breaks**, **non-breaking spaces**, and **other space-like characters**
* **Usage:**
```java
public class StripExample {
  public static void main(String[] args) {
    String str = "   Hello, this is a string with spaces.    ";
  
    // Using strip() to remove leading and trailing 
    // spaces, including other whitespace characters
    String strippedString = str.strip();
    
    System.out.println("Original string: '" + str + "'");
    System.out.println("Stripped string: '" + strippedString + "'");
  }
}
```
```
Original string: '   Hello, this is a string with spaces.    '
Stripped string: 'Hello, this is a string with spaces.'
```
* As seen in the example, `strip()` **effectively removes all leading and trailing whitespace**, **including Unicode 
  whitespace characters**, providing **more extensive whitespace trimming capabilities** compared to `trim()`
* This method is particularly useful when dealing with strings containing **various types of whitespace** in 
  **international** or **multilingual contexts**

### The Java Character `isLetter`, `isDigit`, `isLetterOrDigit` Methods:
* In **Java**, the **`Character` class** provides several **useful methods** for **checking** the **type of characters**
* These methods help determine whether a character is a **letter**, **digit**, or a **combination of both**
* **`isLetter(char ch)` Method:**
  * **`Character.isLetter(char ch)`** is a **method** that checks if the **specified character** is an **uppercase** or 
    **lowercase** letter (a-z or A-Z)
* **`isDigit(char ch)` Method:**
  * **`Character.isDigit(char ch)`** checks if the specified character is a **digit (0-9)**
* **`isLetterOrDigit(char ch)` Method:**
  * **`Character.isLetterOrDigit(char ch)`** determines if the specified character is **either a letter or a digit**
* **Examples:**
```
char ch = 'A';
boolean isLetter = Character.isLetter(ch);
// Returns true

char ch = '7';
boolean isDigit = Character.isDigit(ch);
// Returns true

char ch = '@';
boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
// Returns false
```

### Anonymous Function (Lambda):
* In Java, an **anonymous function** is a function that **doesn't have a name** and is **defined without a formal 
  declaration**
* It's **also known as a lambda expression** when used with **functional interfaces**
* Anonymous functions are primarily used to **create instances** of **functional interfaces** in a **more concise and 
  readable way**
* In Java, **anonymous functions** are commonly created using **lambda expressions**, which are a **shorthand way** to 
  **represent an implementation** of a **functional interface**
* Lambda expressions provide a way to **create an instance** of a **functional interface without explicitly defining a 
  separate named method**
* For instance, consider the following example of an anonymous function (lambda expression) that squares a number:
```java
// Defining a functional interface with 
// a single abstract method:
interface MyInterface {
    int operate(int x);
}

public class Main {
    public static void main(String[] args) {
      // Creating an instance of 
      // MyInterface using a lambda expression:
        MyInterface square = (x) -> x * x;

      // Using the anonymous function 
      // to square a number
        int result = square.operate(5); 
        System.out.println("Result: " + result);
      // This will result in 25
    }
}
```
* In the above example:
  * `MyInterface` is a **functional interface** with a **single abstract method**, `operate`
  * `(x) -> x * x;` is the lambda expression that implements the operate method by **squaring the input `x`**
  * `square` is an instance of `MyInterface` created using the lambda expression
* **Lambda Syntax:**
  * **General Syntax:**
    * `(parameters) -> { body }` or `(parameter1, parameter2, ...) -> { body }` 
  * For example, a lambda expression that doubles a number:
    * `Function<Integer, Integer> doubler = (num) -> num * 2;`
  * The syntax for a lambda expression consists of the following parts:
    * **Parameter List:**
      * If the lambda expression **takes parameters**, they are **enclosed in parentheses**
      * For example, `(int x, int y)` or just `(x, y)` **if the types can be inferred**
    * **Arrow Operator:**
      * It's represented by the `->` symbol, which **separates** the **parameter list from the body** of the lambda 
        expression
    * **Body:**
      * The body of the lambda expression contains the **code** that **performs the action** of the **function**
      * It can be a **single expression** or a **block of code enclosed in curly braces {}**
      * If it's a **single expression**, it can **implicitly return the result**
      * If it's a **block**, you **need to use a return statement explicitly**

### The Java `equals` Method:
* In Java, the `equals()` method is a **fundamental method** used to **compare two objects** to **check whether they are 
  equal or not**
* It's **inherited** from the **`Object` class** and is **often overridden** in **custom classes** to provide a 
  **specific definition of equality** for **objects of that class**
* The **default implementation** of **`equals()`** in the **`Object` class compares object references** to check if 
  they **refer to the same memory location**
* This is **equivalent** to using the **`==` operator**
* However, in **many cases**, you want to **define equality based on the content or specific attributes of objects 
  rather than their memory addresses**
* Therefore, when you override the `equals()` method in your own class, you **typically compare the instance variables 
  or fields of objects** to **determine if they are equal according to your class's logic**
* Commonly, the `equals()` method follows these general steps:
  * **Check for Reference Equality:**
    * This is usually the first step, **comparing memory addresses** using `==`
    * If the **references are the same**, the **objects are considered equal**
  * **Check for Type Compatibility:**
    * Ensure the **object being compared** is of the **same type** or a **compatible type** before proceeding further
    * You'll often use `instanceof` to verify this
  * **Compare Fields:**
    * Compare the **individual fields or attributes** of the objects to **ascertain whether they are equal** based on 
      your **class's definition of equality**
    * This could involve **comparing primitive types directly** or using their respective `equals()` methods for objects
  * Return the Result:
    * **Return `true`** if **all conditions for equality are met**, **otherwise return `false`**
* Here's a basic example of how equals() might be overridden in a custom class:
```java
public class Person {
    private String name;
    private int age;

    // Constructor, getters, setters...

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different types or null object
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
}
```
* Remember, **when overriding `equals()`**, it's **also recommended** to **override `hashCode()`** to **maintain the 
  contract between these two methods**
* The `hashCode()` method **generates a hash code based on the object's contents** and is **used in hash-based 
  collections** like `HashMap`, `HashSet`, etc., for **efficient retrieval of objects**

### The Java `hashCode` Method:
* In Java, the **`hashCode()` method** is used to **generate a hash code** for an **object**
* It's **inherited** from the **`Object` class** and **serves as part of the contract** for **hashing-based 
  collections** like **`HashMap`**, **`HashSet`**, and others
* The **primary purpose** of `hashCode()` is to provide a **numerical representation** of an **object's contents**
* This **numerical value** is used by **hash-based data structures** to **quickly determine potential equality** and 
* **efficient storage or retrieval** of **objects in collections**
* Key points about `hashCode()`:
  * **Hash Code Contract:**
    * **Objects** that are **equal** according to the **`equals()` method** must have the **same hash code**
    * However, **objects** with the **same hash code** are **not necessarily equal**
  * **Efficient Retrieval:**
    * **Hash-based collections** use **hash codes** to **distribute objects across buckets**, allowing for **faster 
      retrieval**
  * **Overriding `hashCode()`:**
    * It's **often necessary** to **override `hashCode()` when you override the `equals()` method** in your **custom 
      class**
    * This ensures that **objects** that are **considered equal** have the **same hash code**
  * **Implementation Considerations:**
    * A **good `hashCode()` implementation** should **distribute hash codes uniformly across the range of possible hash 
      values** to **prevent excessive collisions**
* Here's a **basic example** of **overriding `hashCode()` along with `equals()`** in a custom class:
```java
public class Person {
private String name;
private int age;

    // Constructor, getters, setters...

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different types or null object
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```
* In this example, the `hashCode()` method uses the **`Objects.hash()` utility method** to **generate a hash code based 
  on the name and age fields of the `Person` class**
* This ensures that objects with the **same name and age** will produce the **same hash code**

### Overriding the `equals` and `hashCode` Methods in Java:
* Overriding the `equals()` and `hashCode()` methods in Java is **crucial** for **ensuring proper behavior** when 
  **working with collections**, particularly **hash-based collections** like **`HashMap`**, **`HashSet`**, etc.
* Here's why it's essential:
  * `equals()` Method:
    * **Correct Comparison of Object Equality:**
      * The **default implementation of `equals()`** in the `Object` class **compares references**, **not the actual 
        content** of objects
      * By **overriding `equals()`**, you **define** how **two instances of your class** should be **considered equal** 
        based on your **class's logic**
    * **Use in Collections:**
      * **Collections** like **`ArrayList`**, **`LinkedList`**, and others use `equals()` to **determine whether an 
        object is present in the collection or not**
      * If you want **objects** of your class to be **compared based on their content**, **rather than their memory 
        addresses**, you need to provide a **custom `equals()` method**
  * **`hashCode()` Method:**
    * **Efficient Hashing:**
      * **Hash-based collections** (**`HashMap`**, **`HashSet`**, etc.) use **hash codes** to **distribute objects 
        across buckets** for **efficient storage and retrieval**
      * If you **override `equals()`**, you **must also override `hashCode()`** to **maintain the contract** that 
        **equal objects must have the same hash code**
    * **Consistency with `equals()`:**
      * It ensures that **objects** that are **considered equal according to `equals()`** will **produce the same 
        hash code**
      * This **consistency is crucial** for **hash-based collections** to **correctly identify and manage objects**
  * **Relationship between `equals()` and `hashCode()`:**
    * **Contract:**
      * If **two objects are equal according to `equals()`**, their **`hashCode()` must be the same**
    * **Performance:**
      * **Good `hashCode()` implementations** aim to **distribute objects uniformly across hash buckets** to **minimize 
        collisions**, which can **improve the performance** of **hash-based collections**
* By **providing custom implementations** for **`equals()`** and **`hashCode()`**, you **maintain consistency** and 
  **correctness** when **using instances of your class** in **collections**, enabling **proper comparison** and 
  **storage** based on the **defined criteria for equality**

### Concurrency in Java:
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

### Serialization / Deserialization:
* **Serialization** in software refers to the process of **converting an object's state into a format that can be easily 
  stored, transmitted, or reconstructed later**
* It **allows objects** to be **converted into a byte stream**, which **can be saved to a file**, **sent over a 
  network**, or **stored in a database**
* The **reverse process** of **recreating objects from the serialized data** is called **deserialization**
* The main purposes of serialization are:
  * **Persistence:**
    * **Saving the state of an object to disk** so that it can be **retrieved later**, even **after the program has 
      stopped running**
  * **Inter-Process Communication:**
    * **Sending objects between different applications** or **across a network**
  * **Caching:**
    * **Storing objects in memory or on disk** for **faster access**
* In **Java**, for instance, the **`Serializable` interface** is used to **mark classes as serializable**
* When a class **implements `Serializable`**, it signifies that its **instances can be serialized**
* It acts as a **marker interface** and **doesn't have any methods that need to be implemented**; rather, it **indicates 
  that the class can be serialized** by **Java's default serialization mechanism**
```java
import java.io.*;

class MyClass implements Serializable {
    // Class members and methods
}
```
* To **serialize an object of this class**, you can use **`ObjectOutputStream`**:
```
MyClass objectToSerialize = new MyClass();

try {
    FileOutputStream fileOut = new FileOutputStream("file.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(objectToSerialize);
    out.close();
    fileOut.close();
} catch (IOException e) {
    e.printStackTrace();
}
```
* And to **deserialize**:
```
try {
    FileInputStream fileIn = new FileInputStream("file.ser");
    ObjectInputStream in = new ObjectInputStream(fileIn);
    MyClass deserializedObject = (MyClass) in.readObject();
    in.close();
    fileIn.close();
} catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
}
```
* Serialization is a **powerful tool** but comes with **considerations** such as **versioning**, **security**, and 
  **compatibility between different versions of serialized objects**
* Additionally, **alternative serialization mechanisms or libraries** might be used in **different programming languages
  or environments**, each with its **own features and optimizations**

### Generics in Java:
* Generics in Java allow you to **create classes**, **interfaces**, and **methods** that can **work with any data type**
* They provide a way to create **flexible**, **reusable code** that is **not tied to a specific type**
* The main purposes of generics are to:
  * **Ensure Type Safety:**
    * Generics enable the **detection of type errors at compile time rather than at runtime**, **reducing the chance of 
      runtime errors** related to **incorrect data types**
  * **Code Reusability:**
    * Writing generic code allows you to **create classes**, **methods**, or **data structures** that can be **used with 
      different types without duplicating code**
* In Java, you can define a generic class using **angle brackets** and a **placeholder type parameter**
* Here's a simple example of a generic class:
```java
public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```
* In this example, **`T`** is a **placeholder** for a **type that will be specified** when **creating an instance of the 
  `Box` class**
* For instance:
```
Box<Integer> integerBox = new Box<>();
integerBox.setValue(10);
int value = integerBox.getValue();
// No need for casting, value is of type Integer

Box<String> stringBox = new Box<>();
stringBox.setValue("Hello");
String text = stringBox.getValue();
// No need for casting, text is of type String
```
* Generics are **also used** with **methods** and **interfaces**
* For instance, you can define a **generic method**:
```
public <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```
* And then use this method with **different types of arrays**:
```
Integer[] intArray = { 1, 2, 3, 4, 5 };
String[] stringArray = { "Hello", "Generics", "Java" };

printArray(intArray);
// Output: 1 2 3 4 5
printArray(stringArray);
// Output: Hello Generics Java
```
* Generics provide **flexibility** and **type safety**, making Java code more **robust** and **adaptable** to **various 
  data types** while **ensuring compile-time type checking**

### Bounded Type Parameters in Java Generics:
* the **`<T extends ...>` syntax** is used to **define bounded type parameters**
* It allows you to r**estrict the types** that **can be used as parameters** in a **generic class**, **method**, or 
  **interface**
* The **`extends` keyword** in this context **doesn't only mean "extends" as in class inheritance**; it's **used more 
  broadly** to **indicate** that the **specified type parameter must be a subtype** of a **particular type** or 
  **implement a specific interface**
* For example, consider a **generic method** that **accepts only types** that **implement the `Comparable` interface**:
```
public <T extends Comparable<T>> int compare(T obj1, T obj2) {
    return obj1.compareTo(obj2);
}
```
* In this case, `<T extends Comparable<T>>` specifies that **`T`** can be **any type** that **extends** (**or 
  implements**) the **`Comparable<T>` interface**
* This ensures that the method can **only accept objects of types that can be compared to themselves** (**`compareTo` 
  method is available**), providing **type safety at compile time**
* Another common use is **restricting a type parameter** to be a **subclass of a specific class**
* For instance:
```java
class Vehicle {
    // Vehicle properties and methods
}

class Car extends Vehicle {
    // Car-specific properties and methods
}

class Garage<T extends Vehicle> {
    private T vehicle;

    public void park(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }
}
```
* Here, **`<T extends Vehicle>`** in the **`Garage` class** specifies that **`T` can only be a type** that **extends the 
  `Vehicle` class** or **is a `Vehicle` itself**
* This ensures that the **`Garage` class** can only store **instances of `Vehicle`** or its **subclasses**
* Using **bounded type parameters** helps in writing **more generic** and **reusable code** while **maintaining type 
  safety** and ensuring that **operations specific to certain types** are **supported within the generic context**

### Regular Expressions in Java:
* In Java, **regular expressions** (**regex**) are **sequences of characters** that **define a search pattern**
* They are used for **pattern matching within strings**, allowing you to **search**, **manipulate**, and **validate 
  text** based on **specific criteria**
* Java's **`java.util.regex` package** provides **classes** and **methods** for **working with regular expressions**
* The key classes involved are **`Pattern`** and **`Matcher`**
* Here's a basic breakdown of how regular expressions are used in Java:
* **Pattern Class:**
  * The **`Pattern` class** represents a **compiled version of a regular expression**
* **Creating a Pattern:**
```
import java.util.regex.Pattern;

String regex = "pattern_to_match";
Pattern pattern = Pattern.compile(regex);
```
* **Matcher Class:**
  * The **`Matcher` class** is used to **match a `Pattern`** against a **specific input string**
**Creating a Matcher and Matching:**
```
import java.util.regex.Matcher;

String input = "input_string_to_search";
Matcher matcher = pattern.matcher(input);

if (matcher.find()) {
    // Pattern found in the input string
    // Further actions can be performed here
}
```
* **Common Operations with Matchers:**
  * **`find()`**:
    * **Searches** for **occurrences of the pattern** in the **input string**
  * **`matches()`**:
    * Attempts to **match the entire input string against the pattern**
  * **`group()`**:
    * **Returns** the **matched substring**
  * **`start()` and `end()`**:
    * **Return** the **start and end indices** of the **matched substring**
```
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Regex to match any sequence of digits:
String regex = "\\b\\d+\\b";
String input = "123 Java 456 Regex";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);

while (matcher.find()) {
    System.out.println("Found: " + matcher.group());
}
```
* This example uses the **regex `\b\d+\b`** to **match sequences of digits in a string**, **printing out each found 
  occurrence**
* Regular expressions can be **quite powerful** but may have a **steep learning curve due** to their **syntax and 
  complexity**
* They are **used extensively** in **string manipulation**, **validation**, **parsing**, and **text search operations** 
  in Java and many other programming languages

### Regular Expression Syntax:
* **Basic Matchers:**
  * **`.` (dot):**
    * Matches **any single character except newline**
  * **`\d`:**
    * Matches **any digit** (**equivalent to `[0-9]`**)
  * **`\D`:**
    * Matches **any non-digit character** (**equivalent to `[^0-9]`**)
  * **`\w`:**
    * Matches **any word character** (**alphanumeric and underscore**, **equivalent to `[a-zA-Z0-9_]`**)
  * **`\W`:**
    * Matches **any non-word character** (**equivalent to `[^a-zA-Z0-9_]`**)
  * **`\s`:**
    * Matches **any whitespace character** (**space**, **tab**, **newline**, etc.)
  * **`\S`:**
    * Matches **any non-whitespace character**
  * **`[abc]`:**
    * Matches **any one of the characters inside the brackets**
  * **`[^abc]`:**
    * Matches **any character except those inside the brackets**
* **Quantifiers:**
  * **`*`:**
    * Matches **zero or more occurrences** of the **preceding pattern**
  * **`+`:**
    * Matches **one or more occurrences** of the **preceding pattern**
  * **`?`:**
    * Matches **zero or one occurrence** of the **preceding pattern**
  * **`{n}`:**
    * Matches **exactly `n` occurrences**
  * **`{n,}`:**
    * Matches **`n` or more occurrences**
  * **`{n,m}`:**
    * Matches **between `n` and `m` occurrences** (**inclusive**)
* **Anchors:**
  * **`^`:**
    * Matches the **start of a line/string**
  * **`$`:**
    * Matches the **end of a line/string**
  * **`\b`:**
    * Matches a **word boundary**
* **Grouping and Alternation:**
  * **`()`:**
    * **Groups patterns together**
  * **`|`:**
    * **Alternation**, matches **either the left or right side of the `|`**

### Records in Java:
* In Java, a **record** is a **new type of class** introduced in **Java 16**
* A record is a **concise way** to **declare simple classes** for the purpose of **bundling together multiple fields** 
  and **managing immutable data**
* It's particularly useful when you need a **data carrier without additional functionality** beyond **storing and 
  accessing the data**
* Here's an example of **defining a record** in Java:
```java
public record Person(String name, int age) {
    // This record automatically generates a constructor, 
    // accessor methods, equals, hashCode, and toString
    // Additional methods or fields can be added if necessary
}
```
* In this example, `Person` is a **record** that has **two components**: **`name` (a `String`)** and **`age` (an 
  `int`)**
* With records, you **don't need to explicitly define getter methods**, **constructors**, **`equals()`**, 
  **`hashCode()`**, or **`toString()`** methods
* These are **automatically generated based on the components defined within the record**
* Records are **immutable by default**, meaning their **fields cannot be changed after the record is created**
* This immutability **ensures predictability** and helps in writing **more robust** and **error-resistant code**
* You can **create instances of a record** and **access its components** as shown below:
```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        
        // Accessing components
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        
        // Records are immutable, so you can't modify their values
        // person.setName("Bob");
        // This would result in a compilation error
    }
}
```
* Records can **greatly simplify code** that involves **modeling data without adding unnecessary complexity**
* They provide a **concise syntax** for **defining classes whose main purpose is to hold data**

### Streams in Java:
* In Java, streams represent a **sequence of elements** that you can **process in a declarative way**
* Introduced in **Java 8** as part of the **Stream API** in the `java.util.stream package`, **streams** provide a 
  **higher-level abstraction** for **working with collections of data**, allowing for **concise and functional-style 
  operations**
* Streams enable you to perform a **series of aggregate operations** (such as **filtering**, **mapping**, **sorting**, 
  and **reducing**) on a **collection of data elements**
* These **operations** can be **chained together** to **form a pipeline**, where **each operation is applied to the 
  elements as they flow through the stream**
* Key characteristics of Java streams include:
  * **Declarative and Functional Approach:**
    * Streams **support functional programming paradigms**, allowing you to **express operations on data** in a **declarative 
      manner without explicitly handling iteration or mutable state**
  * **Lazy Evaluation:**
    * Many stream operations are **lazily evaluated**, meaning they are **executed only when necessary**
    * This allows for **efficiency**, especially with **large datasets**, as **operations** are **performed on elements 
      as they're needed in the pipeline**
  * **Pipelines:**
    * Streams enable you to **create pipelines** by **chaining multiple operations** (such as **`filter`**, **`map`**, 
      **`reduce`**, **`collect`**, etc.) to **process data in a sequence**
  * **Parallel Processing:**
    * Streams can take advantage of **parallel processing** via the **`parallel()` method**, allowing operations to be 
      **executed concurrently** on **multiple threads**, **potentially improving performance** for **certain types of 
      tasks**
* Example of using streams in Java:
```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example: Filter even numbers, square them, and find their sum
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * n) // Square each number
                .reduce(0, Integer::sum); // Sum the squared numbers

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}
```
* In this example, a **stream** is created **from a list of numbers**
* The **stream operations** (**`filter`**, **`map`**, and **`reduce`**) are **chained together** to **filter even 
  numbers**, **square them**, and **find their sum**
* However, the **power of streams** comes from their ability to **chain multiple operations together**, making the code 
  **concise**, **readable**, and **expressive** for **various data processing tasks**

### The `SortedSet` Interface in Java:
* In Java, a **`SortedSet`** is a **subtype of the `Set` interface** that **maintains its elements** in a **sorted 
  order**
* It **does not allow duplicate elements**
* The elements in a `SortedSet` are **arranged** either according to their **natural ordering** (**if they implement the 
  `Comparable` interface**) or by a **`Comparator` provided** at **set creation time**
* Some important characteristics of a SortedSet in Java:
  * **Sorted Order:**
    * Elements are stored in a sorted order defined by their **natural ordering** or a **custom `Comparator`**
  * **No Duplicates:**
    * A `SortedSet` **does not allow duplicate elements**
    * If you **try to add a duplicate**, the **method will return false**
  * **Subsets and Views:**
    * It supports methods for **obtaining subsets** of the `SortedSet` based on **ranges or specific elements**
  * **Implements `Set` Interface:**
    * It **inherits** the **methods** of the **`Set` interface** and **adds additional methods** for **navigation** and 
      **retrieval** based on the **sorted order**
* Here's an example of how you might create and use a `SortedSet` in Java:

```java
import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet (implementation of SortedSet)
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // Adding elements
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(2);
        // Won't be added since it's a duplicate

        // Printing elements in sorted order
        for (Integer element : sortedSet) {
            System.out.println(element);
        }
        
        // Using methods specific to SortedSet
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());

        // Creating a subset based on a range
        SortedSet<Integer> subset = sortedSet.subSet(2, 8);
        // Elements from 2 (inclusive) to 8 (exclusive)
        System.out.println("Subset: " + subset);
    }
}
```
* This code demonstrates the **basic usage** of a `SortedSet`, specifically a **`TreeSet`**, which is one of the 
  implementations of `SortedSet` in Java