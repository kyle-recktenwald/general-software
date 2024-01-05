# Javascript Overview:

### Overview:
* JavaScript is a **versatile**, **high-level programming language** primarily used to create **dynamic**, **interactive
  content** on web pages
* **Initially developed by Netscape**, it has **evolved** into a **universal language** supported by **all modern 
  web browsers**
* JavaScript allows developers to **manipulate webpage elements**, **handle events**, **create animations**, and 
  **interact with users** in **real-time**
* It's known for its **flexibility**, as it can be used **both on the client-side (within browsers) and server-side 
  (with Node.js)**
* JavaScript is **essential** for **modern web development** and is **widely used** in **building web applications**,
  **games**, **mobile apps**, and more

### Variables in Javascript:
* In JavaScript, **variables** are used to **store data values**
* You can **declare variables** using the `var`, `let`, or `const` keywords
* Here's a breakdown:
  * `var`:
    * `var` was **traditionally used** to declare variables in JavaScript
    * Variables declared with `var` are **function-scoped** or **globally scoped**, but they are **not block-scoped**
      (prior to ES6)
    * Variables declared with `var` can be **reassigned** and **redeclared within their scope**
    * `var greeting = "Hello";`
  * `let`:
    * Introduced in ES6, `let` allows you to **declare variables** that are **block-scoped**
    * Variables declared with `let` can be **reassigned but not redeclared within the same scope**
    * `let count = 10;`
  * `const`:
    * Also introduced in ES6, `const` is used to **declare variables** that **cannot be reassigned**
    * However, it's important to note that for **complex data types** (like **objects** and **arrays**), while the
      **reference cannot change**, the **content of the object or array can still be modified**
    * `const PI = 3.14;`
* Variables in JavaScript can hold different types of data:
  * **Numbers:**
    * `let age = 25;`
  * **Strings:**
    * `let name = "John";`
  * **Booleans:**
    * `let isLogged = true;`
  * **Arrays:**
    * `let fruits = ["apple", "banana", "orange"];`
  * **Objects:**
```
let person = {
name: "Alice",
age: 30
};
```
* **Variable Syntax:**
  * Variables can be named using **letters**, **digits**, **underscores** (_), and **dollar signs** ($)
  * They **cannot start with a digit**
  * JavaScript is **case-sensitive**, so `myVar` and `myvar` would be **considered different variables**
* Remember, when choosing between `var`, `let`, and `const`, **consider the scope** you need for the variable and
  whether you want its value to be **mutable** or **immutable**

### Functions in Javascript:


### Variable Scope:
* **Global Scope:**
  * Globally scoped variables in JavaScript are variables declared outside of any function or block
  * They have a global scope, meaning they are accessible from anywhere within the entire script or across multiple
    functions
```
var globalVar = "I am a globally scoped variable";

function myFunction() {
  console.log(globalVar);
  // Output: "I am a globally scoped variable"
}

console.log(globalVar);
// Output: "I am a globally scoped variable"
myFunction();
```
* **Global Scope (Cont.):**
  * In this example:
    * `globalVar` is declared outside of any function, making it globally scoped
    * It can be accessed both within the `myFunction()` and outside of it
  * Variables declared with `var` at the global level become properties of the global object (window in browsers,
    global in Node.js)
  * However, it's important to note that using global variables excessively can lead to several issues:
    * **Namespace Pollution:**
      * Since global variables are accessible from anywhere, naming collisions can occur if different parts of the code
        use the same variable names unintentionally
    * **Unintended Modifications:**
      * Global variables can be modified from anywhere in the code, making it harder to track changes and debug issues
    * **Security Risks:**
      * In certain cases, exposing variables globally might lead to security vulnerabilities
  * To mitigate these issues, it's often recommended to minimize the usage of global variables and instead use more
    localized scopes (like function or block scopes) whenever possible
  * ES6 introduced let and const, which are block-scoped, allowing developers to reduce the need for global variables
    by confining variables to smaller, more controlled scopes
* **Function Scope:**
  * **Function-scoped variables** in JavaScript are variables that are **bound to the function in which they are 
    declared**
  * This means their **accessibility** is **limited to the function scope**
  * Variables **declared with `var` keyword** have **function scope**
  * **For Example:**
```
function myFunction() {
  var localVar = "I am a function-scoped variable";
  console.log(localVar);
}

myFunction();
// Output: "I am a function-scoped variable"

console.log(localVar);
// Throws an error - localVar is not defined
```
* **Function Scope (Cont.):**
  * In the above example:
    * `localVar` is declared using `var` inside the `myFunction()`
    * This variable is **accessible within the function** itself **but not outside of it**
    * If you try to access `localVar` outside of the function, it will **throw an error** because it's **limited** to the 
      **function scope**
  * Function-scoped variables are **useful** for **encapsulating variables within a specific function**, preventing
    **unintended modifications** or **collisions** with **variables** in **other parts of the code**
  * However, it's **essential** to be **cautious** with **function-scoped variables**, as they can lead to issues like
    **variable hoisting** (where **variables** are **lifted to the top of their scope**) and **potential confusion** due
    to their **global accessibility within the function**

* **Block Scope:**
  * Block-scoped variables were introduced in ES6 (ECMAScript 2015) with the `let` and `const` keywords
  * These variables are **scoped** to the **nearest enclosing block** (usually defined by {}), such as **loops**, 
    **conditional statements (if, switch)**, or **any code block**
```
function myFunction() {
  if (true) {
    let blockVar = "I am a block-scoped variable";
    console.log(blockVar);
    // Output: "I am a block-scoped variable"
  }

  console.log(blockVar);
  // Throws an error - blockVar is not defined
}
```
* **Block Scope (Cont.):**
  * In this example, `blockVar` is declared using `let` inside the **if block**
    * It is **accessible only within that block**
    * Once the block is exited, the variable `blockVar` is **no longer accessible**, **unlike function-scoped variables**
      declared with `var`
  * Similarly, **variables declared with `let` within loops** have **block scope**:
```
for (let i = 0; i < 3; i++) {
  console.log(i);
  // Output: 0, 1, 2
}
console.log(i);
// Throws an error - i is not defined

const PI = 3.14;
  if (true) {
    const radius = 5;
    const area = PI * radius * radius;
    console.log(area);
    // Output: 78.5
  }
  console.log(radius);
  // Throws an error - radius is not defined
  console.log(PI);
  // Output: 3.14
```
* **Block Scope (Cont.):**
  * In the above example:
    * The **variable `i` declared with `let`** is **only accessible within the for loop block**
    * Once the **loop finishes**, the variable `i` is **no longer accessible outside of it**
  * Block-scoped variables (`let` and `const`) provide **better control over variable scope**, **prevent issues like 
    hoisting**, and **reduce unintended side effects** by **confining variables** to the **smallest possible scope**
  * Additionally, `const` also creates **block-scoped constants** that **cannot be reassigned after declaration**

### Event Handlers:
* In JavaScript, an event handler is a function that gets triggered or executed in response to a specific event 
  occurring on a DOM element
* These events can be user actions like clicks, keystrokes, mouse movements, form submissions, etc.
* **Characteristics of Event Handlers:**
  * Function Execution:
    * An event handler is a function that is executed in response to an event occurring on an HTML element
  * Event Binding:
    * Event handlers are bound to specific events on DOM elements using event listeners
    * These listeners wait for the specified event to happen and then trigger the associated handler function
  * Event Object:
    * When an event occurs, an event object containing information about the event (e.g., type, target, additional data) 
      is passed as an argument to the event handler function
* **Example of Event Handler in JavaScript:**
```html
<button id="myButton">Click me</button>

<script>
    // Get the button element
    const button = document.getElementById('myButton');

    // Define an event handler function
    function handleClick(event) {
        console.log('Button clicked!');
        console.log('Event details:', event);
    }

    // Add an event listener to the button
    button.addEventListener('click', handleClick);
</script>
```
* In this example:
  * The button element with the ID myButton is selected using document.getElementById
  * An event handler function named handleClick is defined
  * addEventListener is used to attach a click event listener to the button
  * When the button is clicked, the handleClick function is executed
  * The event object contains details about the event, like the type of event, the element that triggered it 
    (event.target), etc.
* Inline Event Handlers:
  * You can also define event handlers directly in HTML using inline event attributes:
  * `<button onclick="console.log('Button clicked!')">Click me</button>`
  * However, using inline event handlers isn't generally recommended due to concerns about separation of concerns and 
    maintainability
* Event handlers in JavaScript are essential for building interactive web applications
* They enable you to respond to user actions and create dynamic behavior on web pages

### Arrow Functions:
* **Arrow functions** are a **concise way** to **write functions** in **JavaScript**, introduced in 
  ES6 (ECMAScript 2015)
* They provide a **more compact syntax** compared to **traditional function expressions**
* Here's a breakdown of their syntax and behavior:
* **Basic Syntax:**
```
// Arrow function with parameters
(param1, param2) => {
    // Function body
};

// Arrow function with a single parameter 
// doesn't need parentheses around the parameter
param => {
    // Function body
};

// Arrow function with no parameters requires 
// empty parentheses
() => {
    // Function body
};
```
* **Implicit Return:**
  * Arrow functions have an **implicit return** if the **function body** is a **single expression**
  * In this case, the **curly braces `{}` are omitted**, and the **value of the expression** is **automatically returned**
* **Example:**
```
// Arrow function with implicit return
const double = x => x * 2;
console.log(double(5)); // Output: 10
```
* **Behavior:**
  * **Lexical `this` binding:**
    * Arrow functions **do not have their own `this` context**
    * Instead, they **inherit `this` from the surrounding code**
    * This behavior **contrasts with regular functions**, which have their **`this` context based on how they are 
      called**
  * **No `arguments` object:**
    * Arrow functions **do not have their own `arguments` object**
    * If you need to **access arguments**, you should use **rest parameters (`...args`)** or **traditional functions**
  * **No `new` keyword:**
    * Arrow functions **cannot be used as constructors** to **create new instances of objects**
    * They **lack their own `this` context**, so using **`new` with an arrow function** will **result in an error**
* Arrow functions are commonly used for **short**, **concise functions**, especially when working with **array methods** 
  like **`map`**, **`filter`**, and **`reduce`**, or for **functions** that **don't require their own `this` context**
* However, they **might not be suitable** for **every scenario**, particularly when the **use of `this` is necessar**y 
  or **when using the `arguments` object**

### Rest Parameters:

### Async/Await:
* **`async`** and **`await`** are **features in JavaScript** that provide a **more straightforward** and **readable** 
  way to work with **asynchronous code**
* `async`:
  * The **`async` keyword** is used to **declare** that a **function** will **operate asynchronously**
  * Functions marked as `async` **always return a promise implicitly**
  * Inside an **`async` function**, you can use the **`await` keyword**
* `await`:
  * The **`await` keyword** is used **inside an `async` function** to **pause the execution of the function until a 
    promise is resolved**
  * It can **only be used within an `async` function**
  * When `await` is used, it **waits for the promise to resolve** and **returns the resolved value**
* Here's an example to illustrate:
```
function resolveAfterSeconds(time) {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve(`Resolved after ${time} seconds`);
        }, time * 1000);
    });
}

async function asyncFunction() {
    console.log("Start");

    // Using await to pause execution until the promise resolves
    const result1 = await resolveAfterSeconds(2);
    console.log(result1); // Output: Resolved after 2 seconds

    const result2 = await resolveAfterSeconds(3);
    console.log(result2); // Output: Resolved after 3 seconds

    console.log("End");
}

asyncFunction();
```
* In the above example, **`resolveAfterSeconds`** is a **function** that **returns a promise** that **resolves after a 
  specified time**
* Inside **`asyncFunction`**, **`await` is used** to **pause execution until the promises returned by 
  `resolveAfterSeconds` are resolved**
* This results in the **logged messages being printed in sequence** due to the **asynchronous behavior controlled by 
  `await`**
* **`async`/`await`** makes **asynchronous code** look **more like synchronous code**, making it **easier to read and 
  understand** compared to **using callbacks** or **plain promises** for **handling asynchronous operations**






