# React Overview:

### Overview:
* React is an **open-source JavaScript library** developed by **Facebook** for building **user interfaces (UIs)** and
  **single-page applications**
* It's renowned for its **simplicity**, **efficiency**, and its ability to create **interactive** and **dynamic UIs**
* **Key Features of React:**
  * **Component-Based:**
    * React is built around the concept of **reusable components**
    * These components **manage their own state** and can be **composed together** to **create complex UIs**
  * **Virtual DOM:**
    * React uses a **virtual DOM** for **performance optimization**
    * It maintains a **lightweight representation** of the **actual DOM**, allowing it to efficiently **update and 
      render only the components that have changed**
  * **Declarative:**
    * React uses a **declarative programming approach** where **developers describe** the **desired outcome**, and 
      **React takes care of updating the DOM** to **match that state**
    * This **simplifies development** by **abstracting away** the **manual DOM manipulation**
  * **JSX:**
    * React uses **JSX** (**JavaScript XML**) to **write components**, which is a **syntax extension** that **allows 
      mixing HTML-like code** with **JavaScript**
    * It provides a **concise** and **familiar** way to **define UI components**
  * **Unidirectional Data Flow:**
    * React enforces a **unidirectional data flow**, which means **data flows down** the **component hierarchy**
    * This helps in **managing state changes** and **makes applications easier to debug**
  * **React Hooks:**
    * Introduced in React 16.8, **hooks** are **functions** that **enable functional components** to **use state**, 
      **lifecycle methods**, **context**, and other React features
    * They **allow developers** to **reuse stateful logic across components without writing classes**
* **How React Works:**
  * **Component Rendering:**
    * **React components render UI elements** based on their **state** and **`props`**
  * **Virtual DOM:**
    * React **maintains** a **lightweight virtual representation** of the **actual DOM**
    * When the **state changes**, React **calculates the difference** (**virtual DOM diffing**) **between the previous
      and current states** to **determine** the **minimal number of updates needed**
  * **Efficient Updates:**
    * React **updates** the **actual DOM** with **only the necessary changes**, making the **rendering process highly 
      efficient**
  * **Lifecycle Methods:**
    * **Class components** have **lifecycle methods** (e.g., `componentDidMount`, `componentWillUnmount`) that **allow 
      developers** to **perform actions** at **specific points** in a **component's lifecycle**
  * **Reusable Components:**
    * **Components** in React are **highly reusable**, allowing developers to **build a library of UI components** that 
      can be **used across different parts of an application** or in **different projects**
* React has gained **widespread adoption** among developers due to its **simplicity**, **performance**, and its 
  **vibrant ecosystem** with **tools** and **libraries** that **complement its functionality**
* It's **widely used** in building **web applications**, **mobile apps** (with **React Native**), and even for 
  **server-side rendering** with frameworks like **Next.js**

### To Uninstall a Project's Packages:
* `rm -rf node_modules package-lock.json`

### Components:
* In React, a **component** is a **reusable**, **self-contained building block** that **encapsulates** a **part of a 
  user interface**
* It can be a **piece of UI** like a **button**, **form**, **header**, or even a **more complex element** like a 
  **sidebar** or a **modal**
* Components are created using **JavaScript classes or functions**, and they **manage their own state and properties**
* They can be **composed together** to create larger, more complex UIs
* Components in React follow a **unidirectional data flow** and can have their **own lifecycle methods**, allowing for 
  **dynamic** and **interactive** user interfaces
```
import React from 'react';

// Functional component
function MyButton(props) {
  return (
    <button onClick={props.onClick}>
      {props.text}
    </button>
  );
}

// Example usage
function App() {
  const handleClick = () => {
    alert('Button clicked!');
  };

  return (
    <div>
      <h1>React Component Example</h1>
      <MyButton onClick={handleClick} text="Click Me" />
    </div>
  );
}

export default App;
```
* **In this example:**
  * `MyButton` is a **functional component** that takes `onClick` and `text` as `props` and **renders a `<button>` 
    element**
  * `App` is the **parent component** that uses `MyButton` and passes a `handleClick` function as the `onClick` prop 
    and "Click Me" as the `text` prop
  * When the **button is clicked**, it **triggers** the **`handleClick` function**, displaying an **alert message**
* Components like `MyButton` can be **reused throughout the application**, making it **easy to manage** and **maintain 
  UI elements**

### Class Component:
* In React, a **class component** is a **JavaScript ES6 class** that **extends `React.Component` or 
  `React.PureComponent`**
* It's a way to **create a component** with **more advanced features** like **state management** and 
  **lifecycle methods**
* **Characteristics of Class Components:**
  * **State Management:**
    * Class components have a **state property** where **data can be stored and updated** using `this.setState()`
    * This allows components to **manage their own data**
  * **Lifecycle Methods:**
    * They include **lifecycle methods** such as `componentDidMount`, `componentDidUpdate`, `componentWillUnmount`, etc.
    * These methods allow developers to **perform actions** at **different points** in the **component's lifecycle**
  * **Syntax:**
    * Class components are written using the **class syntax** in **JavaScript**
  * **Stateful Components:**
    * Class components are typically used for **creating stateful components**, i.e., components that **manage their own 
      state**
  * **Property Initialization:**
    * They often use a **constructor** to **initialize state** and **bind event handlers**
```
import React, { Component } from 'react';

class MyComponent extends Component {
  constructor(props) {
  super(props);
  this.state = {
    count: 0
  };
}

  incrementCount = () => {
      this.setState({ count: this.state.count + 1 });
  }
  
  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={this.incrementCount}>Increment</button>
      </div>
    );
  }
}
```
* **In this example:**
  * `MyComponent` is a **class** that **extends `Component`**
  * `constructor` **initializes the initial state** using `this.state`
  * `incrementCount` is a **method** used to **update the state** using `this.setState`
  * The **component's UI** is **defined** in the **render method**, which **returns JSX representing the component's 
    structure**
* **Class components were the primary way** to **create components** in **React before the introduction of hooks**
* However, **functional components with hooks** have become **more popular** due to their **simplicity**, 
  **reusability**, and ability to **handle state** and **lifecycle functionalities effectively**

### Functional Components in React:
* **Functional components** in React are a **simpler** and **more concise** way of **creating components** using 
  **JavaScript functions**
* Prior to React 16.8, functional components were **stateless** and **didn't have their own state or lifecycle methods**
* However, with the introduction of **React Hooks**, functional components **can now manage state and lifecycle through 
  hooks** like `useState`, `useEffect`, and more
* **Key characteristics of functional components in React include:**
  * **Use of Functions:**
    * Functional components are defined as **JavaScript functions**
    * They **take in props as an argument** and **return JSX elements** to **describe what should be rendered**
  * **Statelessness (Prior to Hooks):**
    * Before Hooks were introduced, functional components were **stateless**, meaning they **couldn't hold or manage 
      their own state**
    * They were primarily used for **presentational purposes**
  * **Hooks for State and Lifecycle (After Hooks):**
    * With the addition of React Hooks, functional components can now use hooks like `useState`, `useEffect`, 
      `useContext`, etc., to **manage component state**, **perform side effects**, and **tap into React's lifecycle 
      methods**
  * **Simplicity and Readability:**
    * Functional components are generally **more straightforward** and **easier to read than class components**, especially for 
      **simpler UI elements**
* Here's an **example** of a **functional component** that uses the `useState` hook to **manage a piece of state**:
```
import React, { useState } from 'react';

function Counter() {
  // useState hook to manage state
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  return (
    <div>
      <h2>Counter</h2>
      <p>Count: {count}</p>
      <button onClick={increment}>Increment</button>
    </div>
  );
}
```
* In this example, `useState` is used inside the `Counter` component to **declare a state variable `count`** and a 
  **function `setCount`** to **update that state**
* When the "Increment" button is clicked, it **updates the count state**, and the **component re-renders** to **display 
  the updated count value**

### Hooks in React:
* A **React Hook** is a **function** that allows you to use **React state** and **other features** in **functional 
  components**
* They enable you to **tap into React features** like **state management**, **lifecycle methods**, **context**, and more 
  **without writing a class**
* Hooks were introduced in React 16.8 and provided a way to **use state** and **other React features** in **functional
  components**, which were **previously limited to stateless behavior**
* **Characteristics of React Hooks:**
  * **Use in Functional Components:**
    * Hooks are **specifically designed** to be used **inside functional components**
  * They allow you to **use state** and **other React features** **without needing to convert** a **functional 
    component** into a **class-based component**
  * **Built-In Hooks and Custom Hooks:**
    * React comes with a **set of built-in hooks** like **`useState`**, **`useEffect`**, **`useContext`**, etc., which 
      provide **different functionalities**
    * Additionally, developers can **create their own custom hooks** to **encapsulate logic** and **share it across 
      components**
  * **Encapsulation of Logic:**
    * Hooks allow you to **encapsulate** and **reuse stateful logic across multiple components**, enhancing **code 
      reusability** and **maintainability**
* **Example of a Built-in Hook - `useState`:**
```
import React, { useState } from 'react';

function Counter() {
    const [count, setCount] = useState(0);

    return (
        <div>
            <p>Count: {count}</p>
            <button onClick={() => setCount(count + 1)}>Increment</button>
        </div>
    );
}
```
* Here, `useState` is a **built-in React Hook** that **allows the `Counter` component** to **use state**
* It declares a **state variable `count`** and a **function `setCount`** to **update its value**
* Hooks follow a **consistent naming convention** in that they **start with the word "use"** (e.g., `useState`, 
  `useEffect`)
* **Custom Hook Example:**
```
import { useState, useEffect } from 'react';

function useWindowWidth() {
    const [width, setWidth] = useState(window.innerWidth);

    useEffect(() => {
        const handleResize = () => setWidth(window.innerWidth);
        window.addEventListener('resize', handleResize);

        return () => {
            window.removeEventListener('resize', handleResize);
        };
    }, []);

    return width;
}

function MyComponent() {
    const windowWidth = useWindowWidth();

    return (
        <div>
            <p>Window Width: {windowWidth}</p>
        </div>
    );
}
```
* In this example, `useWindowWidth` is a **custom hook** that uses `useState` and `useEffect` to **track the window 
  width**
* The **`MyComponent`** then **utilizes this custom hook** to **access the window width** in a **declarative manner**
* **Custom hooks** allow you to **abstract complex logic** and **reuse it across components**

### The useState Hook in React:
* `useState` is a **React hook** that **allows functional components** to **manage state**
* **Before hooks were introduced**, **state management** was **primarily handled** by **class components** using 
  **`this.state`** and **`this.setState()`**
* With the **introduction of hooks** in React 16.8, **functional components** gained the ability to **manage state** 
  using the **`useState` hook without the need for classes**
* Here's how `useState` works:
  * `const [state, setState] = useState(initialState);`
* **Explanation:**
  * `useState` is a **function provided by React**
  * `state` is the **current state value**, which **gets initialized** to **`initialState`**
  * **`setState`** is a **function** used to **update the state**
  * **`initialState`** is the **initial value** of the **state**
```
import React, { useState } from 'react';

const Counter = () => {
    // Initializing state using useState
    const [count, setCount] = useState(0);

    // Function to increment count
    const increment = () => {
        // Updating count using setCount
        setCount(count + 1);
    };

    return (
        <div>
            <p>Count: {count}</p>
            <button onClick={increment}>Increment</button>
        </div>
    );
};

export default Counter;
```
* In this example, `useState` is used to **declare a state variable** called `count` with an **initial value of 0**
* `setCount` is a **function provided by `useState`** to **update the value of `count`**
* When the **button** is **clicked**, it **triggers** the **increment function**, which in turn **updates the `count` 
  state using `setCount`**, causing the **component** to **re-render with the updated count value**
* **`useState`** allows **functional components** to **have their own state**, making it **easier to manage and update 
  data within these components**

### The `useEffect` Hook in React
* `useEffect` is a **powerful React hook** used for **handling side effects** in **functional components**
* **Side effects** refer to **any code** that **interacts with the outside world**, such as **fetching data**, 
  **subscribing to services**, **manually changing the DOM**, and more
* **Syntax:**
```
useEffect(() => {
    // Side effect code here
    return () => {
        // Cleanup code (optional)
    };
}, [dependencies]);
```
* **Explanation:**
  * `useEffect` is a **function** provided by React that **accepts a function** (often referred to as the **effect**) as 
    its **first argument**
  * The **function passed to `useEffect`** will be **executed after the component has been rendered**
  * The **second argument** is an **optional array** `[dependencies]`, which **contains values** (like **props** or 
    **state**) that the **effect depends on**
  * When these **dependencies change**, the **effect will re-run**
  * **If omitted**, the **effect runs after every render**
```
import React, { useState, useEffect } from 'react';

const DataFetchingComponent = () => {
    const [data, setData] = useState(null);

    useEffect(() => {
        // Simulating an API call with setTimeout
        const fetchData = () => {
            setTimeout(() => {
                setData('Fetched data!');
            }, 2000);
        };

        fetchData();

        // Cleanup function (optional)
        return () => {
            // Code to execute on unmount or before re-executing effect (cleanup)
            // For example, cancelling subscriptions, timers, etc.
        };
    }, []); // Empty array means this effect runs only once (on mount)

    return (
        <div>
            <p>{data ? data : 'Loading...'}</p>
        </div>
    );
};

export default DataFetchingComponent;
```
* In this example, **`useEffect`** is used to **simulate data fetching** with a **delay of 2 seconds** using 
  `setTimeout`
* The **effect runs once** (due to the **empty dependency array []**) **after the component is mounted**
* **Inside the effect**, **`setData` updates the data state after the timeout**, **triggering a re-render** to **display 
  the fetched data**
* The **optional cleanup function returned by `useEffect`** is used to **perform cleanup tasks**, like **unsubscribing 
  from subscriptions** or **clearing timers**, **when the component unmounts** or **before re-executing the effect if 
  dependencies change**
* `useEffect` is **incredibly versatile**, allowing you to **handle various side effects** in **functional components**, 
  promoting **clean** and **efficient code organization**

### The `useContext` Hook in React:
* The **`useContext` hook** in React is used to **consume values** from the **React context API**
* **Context** provides a way to **pass data through the component tree without having to pass props manually at 
  every level**
* It's **particularly useful** for passing down **global data**, like **themes**, **authentication status**, 
  **language preferences**, etc., to **deeply nested components**
* The `useContext` hook **allows functional components** to **access the value of a context**
* It **takes the context object** created by `React.createContext()` as an **argument** and **returns** the **current 
  context value**
* **Here's a basic example:**
```
import React, { createContext, useContext } from 'react';

// Create a context
const MyContext = createContext();

// Context provider
const MyContextProvider = ({ children }) => {
    const value = 'Hello from Context!'; // Value to be provided
    return <MyContext.Provider value={value}>{children}</MyContext.Provider>;
};

// A component consuming the context value using useContext
const MyComponent = () => {
    const contextValue = useContext(MyContext);
    return <div>{contextValue}</div>;
};

// Use the context provider in the component tree
const App = () => {
    return (
        <MyContextProvider>
            <MyComponent />
        </MyContextProvider>
    );
};

export default App;
```
* In this example, **`MyComponent`** uses the **`useContext(MyContext)` hook** to **access** the **value provided by 
  `MyContextProvider`**
* It **receives** and **displays** the **value within the `div`**

### The `useReducer` Hook in React:
* The `useReducer` hook in React is a **state management hook** that offers an **alternative to `useState`**
* It's **particularly useful** when the **state logic is complex** and **involves multiple sub-values** or when **state 
  transitions follow a clear pattern**
* Here's an overview of how `useReducer` works:
  * **State and Action:**
    * The **`useReducer` hook manages state** by **taking in a reducer function** and an **initial state**
    * The reducer function **receives two arguments**: the **current state** and an **action**
    * The **action** is an object that **describes what should happen to the state**
    * It typically **contains a type property** indicating the **action to perform** and **optionally other data 
      related to that action**
  * **Reducer Function:**
    * The reducer function's purpose is to **determine how the state should change in response to the given action**
    * **Based on the action type**, the **reducer function returns a new state or the unchanged state if the action 
      doesn't require any changes**
    * It **should be a pure function** (**no side effects**) that **relies only on its arguments** to **compute the next 
      state**
  * **Dispatching Actions:**
    * To **update the state managed by `useReducer`**, you use the **`dispatch` function**
    * **`dispatch` accepts an action object** and **triggers the execution of the reducer function**
    * When **`dispatch` is called with an action**, React **calls the reducer function with the current state and the 
      provided action**, and then **updates the state based on the returned value**
  * **Usage:**
    * You **invoke `useReducer`** by **providing the reducer function** and the **initial state**
    * It **returns an array** containing the **current state** and a **dispatch function** that you can use to 
      **dispatch actions** to **update the state**
* The **main advantage** of `useReducer` over `useState` is that it's **more suitable** for **managing complex state 
  logic**
* It's often favored when **state transitions involve multiple sub-values** or when the **same state transition logic** 
  is **reused across different parts of the application**
```
import React, { useReducer } from 'react';

// Reducer function
function reducer(state, action) {
    switch (action.type) {
        case 'INCREMENT':
            return { count: state.count + 1 };
        case 'DECREMENT':
            return { count: state.count - 1 };
        default:
            return state;
    }
}

function Counter() {
    const [state, dispatch] = useReducer(reducer, { count: 0 });

    return (
        <div>
            Count: {state.count}
            <button onClick={() => dispatch({ type: 'INCREMENT' })}>Increment</button>
            <button onClick={() => dispatch({ type: 'DECREMENT' })}>Decrement</button>
        </div>
    );
}
```
* In this example, the **`Counter` component manages its state** (`{ count: 0 }`) using `useReducer`, and the **buttons 
  dispatch actions** to **modify the count value** via the **`reducer` function**

### The `useCallback` Hook in React:
* The `useCallback` hook in React is used to **memoize functions**, primarily to **optimize performance** by **preventing 
  unnecessary re-creations of functions** in situations where a **component's re-render** might lead to **unnecessary 
  function reallocations**
* Here are the key aspects of `useCallback`:
  * **Memoization:**
    * It **memoizes** (**caches**) the **provided function instance between renders**
    * This means that as long as the **dependencies array** (**second argument of `useCallback`**) **remains the same**, 
      the **same memoized function instance** is **returned on subsequent renders**
  * **Dependency Array:**
    * `useCallback` **accepts** a **dependencies array** as its **second argument**
    * It **watches these dependencies** and **re-creates the function only if any of these dependencies change**
  * **Optimizing Performance:**
    * It's particularly useful when **passing callbacks to child components**
    * Without `useCallback`, **passing down a new function reference** to **child components** on **every render** might 
      cause **unnecessary re-renders** in those components
  * **Usage:**
    * The **typical use case** involves creating a **memoized callback function** and **passing it as a prop** to 
      **child components** or **using it internally within a component**
* **Example:**
```
import React, { useCallback, useState } from 'react';

function MyComponent() {
    const [count, setCount] = useState(0);

    // Without useCallback
    // const handleClick = () => {
    //   setCount(count + 1);
    // };

    // With useCallback
    const handleClick = useCallback(() => {
        setCount(prevCount => prevCount + 1);
    }, []);
    // Empty dependency array as there are no external dependencies

    return (
        <div>
            <p>Count: {count}</p>
            <button onClick={handleClick}>Increment</button>
        </div>
    );
}
```
* **In this example:**
  * Initially, there's a **commented-out version** of **`handleClick` without `useCallback`**
  * The **`handleClick` function increments the `count` state** when the **button is clicked**
  * Using **`useCallback`**, the **function** is **memoized** with an **empty dependency array** since it **doesn't 
    depend on any external variables or props**
* **Remember:**
  * `useCallback` is helpful for **optimizing performance** in **specific scenarios** where you want to **prevent 
    unnecessary function re-creation**
  * It's important to **use `useCallback` wisely** and **avoid overusing it**
  * **Only memoize functions when necessary**, especially if they're **passed as dependencies to child components** or 
    **used within `useEffect` hooks** to **avoid unnecessary re-renders**

### Props in React:
* In React, "props" (short for **properties**) are a core concept used to pass data from one component to another
* They are immutable, meaning they cannot be modified by the component receiving them
* Props allow you to customize and configure a component when it's created and used within other components
* Key Features of Props:
  * Data Flow:
    * Props are passed down from parent components to child components
    * They allow the parent component to pass information to its children
  * Immutable:
    * Props are read-only and cannot be modified by the component receiving them
    * They are fixed throughout the component's lifecycle
* **Using Props:**
* **Parent Component Passing Props:**
```
import React from 'react';
import ChildComponent from './ChildComponent';

function ParentComponent() {
const greeting = "Hello, from Parent!";

    return (
        <div>
            {/* Passing greeting as a prop to ChildComponent */}
            <ChildComponent message={greeting} />
        </div>
    );
}
```
* **Child Component Receiving Props:**
```
import React from 'react';

function ChildComponent(props) {
return (
<div>
{/* Accessing the message prop */}
<p>{props.message}</p>
</div>
);
}
```
* **In this example:**
  * ParentComponent renders ChildComponent and passes the greeting variable as a prop named message
  * ChildComponent receives the prop message via the props object and displays its value within the <p> tag
* **Additional Notes:**
  * Props can contain any type of data, including strings, numbers, objects, functions, or even other React components
  * Props are useful for creating reusable and configurable components
  * They allow components to be more flexible and adaptable to different use cases
* Remember, `props` flow in **one direction**: **from parent to child**
* If you need to share data between components that aren't in a parent-child relationship, you might consider using 
  other React features like context or state management libraries like Redux

### State in React:
* In React, "**state**" refers to an **internal data storage mechanism** that **enables components** to **keep track of 
  information** that **may change over time**
* It **represents** the **current condition** or **data within a component** and **influences** the **rendering** of 
  the **user interface**
* **Characteristics of State in React:**
  * **Mutable Data:**
    * State holds **mutable data** that **can change during the component's lifecycle**
  * **Component-Specific:**
    * **Each component manages** its **own state independently**
    * **Changes** to a **component's state trigger re-rendering of that component**
  * **Managed Internally:**
    * **State** is **managed internally** by **React** and **can be modified using special functions** (e.g., `setState`
      in **class components** or the **state updater function** returned by **`useState`** in **functional components**)
* **Class Components:**
  * In class components, state is declared using the state property in the constructor and updated using the 
    `setState` method
* **Example:**
```
import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
}

  incrementCount = () => {
      this.setState({ count: this.state.count + 1 });
  }
  
  render() {
      return (
          <div>
              <p>Count: {this.state.count}</p>
              <button onClick={this.incrementCount}>Increment</button>
          </div>
      );
  }
}
```
* **Functional Components (using Hooks):**
  * In functional components, the `useState` hook allows you to add state to a component
* **Example:**
```
import React, { useState } from 'react';

function Counter() {
const [count, setCount] = useState(0);

    const incrementCount = () => {
        setCount(count + 1);
    }

    return (
        <div>
            <p>Count: {count}</p>
            <button onClick={incrementCount}>Increment</button>
        </div>
    );
}
```
* **Key Points:**
  * Changes to state using setState (in class components) or state updater functions (in functional components) will 
    trigger a re-render of the component
  * It's essential to manage state carefully to maintain a single source of truth and ensure proper rendering and
    behavior within your React application
  * State should be used for data that belongs to a single component and is subject to change during the component's 
    lifetime

### Using JSON Server to Mock a Server Call:
```
npm install json-server
json-server --watch --port 4000 ./_data/db.json
```

### React Resources:
* [Mark's Dev Blog](https://blog.isquaredsoftware.com/)
* [Redux Style Guide](https://redux.js.org/style-guide/)
* [Why React Context is Not a "State Management" Tool (and Why It Doesn't Replace Redux)](https://blog.isquaredsoftware.com/2021/01/context-redux-differences/)