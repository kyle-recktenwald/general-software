# Java String Overview:

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