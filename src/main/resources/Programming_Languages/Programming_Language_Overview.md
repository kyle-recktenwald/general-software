# Programming Language Overview:

### Functional Programming:
* **Functional programming** is a **programming paradigm** that **treats computation** as the **evaluation of 
  mathematical functions** and **avoids changing-state and mutable data**
* It's **based on the principles** of **mathematical functions**, emphasizing the use of **immutable data** and **pure 
  functions without side effects**
* Key concepts in functional programming include:
  * **First-Class and Higher-Order Functions:**
    * **Functions** are treated as **first-class citizens**, meaning they can be **passed as arguments to other 
      functions**, **returned as values from other functions**, and **assigned to variables**
    * **Higher-order** functions are **functions** that **can take other functions as arguments** or **return functions 
      as results**
  * **Pure Functions:**
    * These functions have **no side effects** and **always produce** the **same output** for the **same input**,
      **without modifying any external state or data**
    * They rely **only on their input arguments** to **produce an output**
  * **Immutability:**
    * Data is treated as **immutable**, meaning **once created**, it **cannot be changed**
    * **Instead of modifying existing data**, functional programming favors **creating new data structures** with the 
      **required modifications**
  * **Avoidance of State and Mutability:**
    * Programs **avoid mutable state** and strive for **stateless programming**
    * **Changes to data** are achieved through **transformations** and **operations** that **generate new values**
  * **Recursion:**
    * **Recursion** is **often used** in functional programming **instead of loops** for **repetitive tasks**
* Functional programming languages like **Haskell**, **Lisp**, **Clojure**, and **functional paradigms** in languages 
  like **JavaScript**, **Python**, and **Java** encourage these principles
* They promote writing code that is **concise**, **maintainable**, and **less error-prone** by focusing on the 
  **application of functions to data**, promoting a **declarative style of programming**, and **minimizing side 
  effects**
* Functional programming is **especially useful** in **concurrent** or **parallel programming** because of its emphasis 
  on **immutability** and **statelessness**, which can **reduce bugs** related to **shared mutable state** in 
  concurrent systems
* <img src="images/Functional_Programming_Diagram.png" width="500">

### Declarative Programming:
* **Declarative programming** is a **programming paradigm** that **emphasizes expressing the logic of a computation 
  without explicitly describing the control flow or step-by-step instructions**
* Instead of focusing on **how to achieve a task**, declarative programming focuses on **what the program should 
  accomplish**
* Key characteristics of declarative programming include:
  * **Describing What Should Be Done:**
    * Declarative programming emphasizes **stating** the **desired outcome** or the **end result**, **rather** than 
      **specifying** the **sequence of steps** or **procedures needed** to **achieve that outcome**
  * **Abstraction:**
    * It often involves the use of **high-level abstractions** and **domain-specific languages** to express the **logic 
      of a program** concisely and clearly
  * **Minimization of Side Effects:**
    * Declarative programming tends to **minimize or eliminate side effects**, such as **modifying state** or 
      **variables**, and favors **immutable data structures** and **pure functions**
  * **Focus on Data Transformations:**
    * It revolves around **transforming data** from **one form to another**, typically using **functions** or 
      **operations** that **describe these transformations**
  * **Separation of Concerns:**
    * It encourages **separating** the **description of the problem** from the **implementation details**, promoting 
      **modularity** and **easier maintenance**
* Declarative programming **contrasts** with **imperative programming**, where the focus is on describing **how a 
  task should be accomplished** through a **series of explicit steps and commands**
* **Declarative paradigms** are **often found** in **functional programming languages** and in **certain aspects of 
  languages** like **SQL**, **HTML**, and **CSS**, where the **programmer specifies what should be done rather than how 
  to do it**
* This approach often leads to **more concise**, **readable**, and **maintainable code**

### Side Effects in Imperative Programming:
* In **imperative programming**, a **side effect** refers to **any change** or **interaction** that **occurs beyond the 
  scope** of a **function's return value**
* Here's an example in Java that demonstrates a side effect by **modifying a variable external to the function**:
```java
public class SideEffectExample {
  // This is external to any function
  static int globalValue = 10;
  
  // Modifying the global variable
  public static void modifyGlobalValue(int newValue) {
      globalValue = newValue; 
  }
  
  public static void main(String[] args) {
      // Initial value
      System.out.println("Initial globalValue: " + globalValue);
      // Function call that modifies the global variable
      modifyGlobalValue(20);
      // Output after modification
      System.out.println("Modified globalValue: " + globalValue); 
  }
}
```
* In this example, `modifyGlobalValue` is a **function** that **modifies** the `globalValue` **variable**, which 
  **exists outside the scope of the function**
* When `modifyGlobalValue` is called with an argument of 20, it **changes the value** of `globalValue` from 10 to 20
* This **demonstrates a side effect** because the **function not only returns a value or performs a computation but also 
  alters a variable external to its scope**
* Side effects like this can make code **harder to reason about** and can **introduce unexpected behavior** in **larger 
  systems**

### Imperative Programming:
* **Imperative programming** is a **programming paradigm** that focuses on describing a **sequence of statements or 
  instructions** to be **executed by the computer** in order to **perform a task**
* In imperative programming, the **emphasis** is on **how to achieve the desired outcome**, detailing **step-by-step 
  commands** and **altering the program state as needed**
* Key characteristics of imperative programming include:
  * **Sequence of Commands:**
    * Programs are structured as a **series of instructions** that **explicitly state how to accomplish a task**, often 
      involving **loops**, **conditionals**, and **explicit variable manipulation**
  * **Mutable State:**
    * Imperative programming involves the use of **mutable data structures**, where the **values of variables can be
      changed throughout the program execution**
  * **Control Flow Structures:**
    * It relies heavily on **control flow structures** like **loops** (**for**, **while**), **conditionals** (**if**, 
      **else**), and **function calls** to **execute actions** and **modify the program state**
  * **Focus on Procedures and Actions:**
    * Imperative programming focuses on **describing procedures**, **actions**, and **steps to be executed**, which 
      **directly manipulate** the program's **state**
* Languages like **C**, **C++**, **Python**, and **Java** support **imperative programming paradigms**
* While imperative programming provides **explicit control** over **how tasks are executed** and allows for **precise
  manipulation of the program state**, it can sometimes lead to code that is **more complex**, **harder to reason 
  about**, and potentially **prone to errors** related to **mutable state** and **side effects**
