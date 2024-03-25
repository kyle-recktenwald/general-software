# Rust Overview:

### Overview:
* The **Rust programming language** is a **systems programming language** initially developed by **Mozilla Research** 
  and **later maintained by the Rust project**
* It was **designed** to **address the shortcomings of existing languages** like **C** and **C++**, particularly in 
  terms of **memory safety**, **concurrency**, and **performance**, while still providing **low-level control** over 
  **hardware resources**
* Here are some **key features and characteristics** of the Rust programming language:
  * **Memory Safety:**
    * Rust **ensures memory safety** through its **ownership system**, which **tracks the ownership of data** and 
      ensures that **memory is managed correctly at compile time**
    * This **eliminates common issues** such as **null pointer dereferencing**, **dangling pointers**, and **data 
      races**
  * **Concurrency:**
    * Rust provides **powerful concurrency features without compromising safety****
    * It offers **lightweight threads** called "**tasks**" and a **message-passing mechanism** for **communication 
      between threads**
    * Additionally, Rust's **ownership system prevents data races at compile time**
  * **Performance:**
    * Rust aims to provide **performance comparable to C and C++** by allowing **low-level control over hardware 
      resources**, **minimizing runtime overhead**, and **optimizing code at compile time**
  * **Zero-cost Abstractions:**
    * Rust allows developers to **write high-level code without incurring runtime overhead**
    * It achieves this through **zero-cost abstractions**, where **high-level constructs** are **translated into 
      efficient machine code**
  * **Trait-based generics:**
    * Rust supports **generic programming** through **traits**, which **define behavior that types can implement**
    * This enables **code reuse** and **abstraction** while **maintaining performance**
  * **Pattern Matching:**
    * Rust includes a **powerful pattern matching feature** that allows developers to **match values against patterns** 
      and **destructure complex data types easily**
  * **Cargo:**
    * Rust comes with a **package manager** and **build system** called **Cargo**, which **simplifies dependency 
      management**, **building**, and **distributing Rust projects**
  * **Safety without Garbage Collection:**
    * **Unlike many other memory-safe languages** that **rely on garbage collection**, Rust achieves **memory safety** 
      through **compile-time checks** and **does not impose runtime overhead** for **garbage collection**
* Overall, Rust is designed to **empower developers** to **write safe and efficient system-level code**, making it 
  suitable for a **wide range of applications**, including **operating systems**, **game development**, **web servers**, 
  and **embedded systems**

### Resources:
* [The Rust Programming Language](https://doc.rust-lang.org/book/title-page.html)

### Writing and Running a Rust Program:
* Make a **new source file**, and name it **`main.rs`**
* Rust file **always end** with the **`.rs` extension**
* The convention for **filenames** with **more than one word** is to use an **underscore** (i.e. **`hello_world.rs`**)
* Add the following to the **`main.rs` file**:
```
fn main() {
    println!("Hello, world!");
}
```
* **Compile** and **run** in the project directory in the terminal:
```
rustc main.rs
./main
```

### Anatomy of a Rust Program:
* The **`main` function** is **always the first code that runs** in **every executable Rust program**
* Rust style is to **indent with four spaces**, **not a tab**
* `println!` calls a **Rust macro**
* **If it had called a function instead**, it would be entered as **`println` (without the !)**


### Cargo:
* Creating a project with Cargo:
```
cargo new hello_cargo
```
* Building and Running a Cargo Project:
```
cargo build
./target/debug/hello_cargo
```
* Or you can just run:
```
cargo run
```
* To make sure it compiles:
```
cargo check
```
* To compile for release with optimizations:
```
cargo build --release
```

### Setting up a New Project:
* To create a new project
```
cargo new guessing_game
```
* To view the documentation for dependencies within the project:
```
cargo doc --open
```


### Dependency Management:
* **Ensuring Reproducible Builds with the Cargo.lock File:**
  * Cargo has a mechanism that ensures you can **rebuild** the **same artifact** every time you or anyone else builds 
    your code
  * Cargo will use only the versions of the dependencies you specified until you indicate otherwise
  * For example, say that next week version `0.8.6` of the `rand` crate comes out, and that version contains an important
    bug fix, but it also contains a regression that will break your code
  * To handle this, Rust creates the `Cargo.lock` file the first time you run cargo build, so we now have this in the 
    guessing_game directory
  * When you build a project for the first time, Cargo figures out all the versions of the dependencies that fit the 
    criteria and then writes them to the `Cargo.lock` file
  * When you build your project in the future, Cargo will see that the Cargo.lock file exists and will use the versions 
    specified there rather than doing all the work of figuring out versions again
  * This lets you have a reproducible build automatically
  * In other words, your project will remain at 0.8.5 until you explicitly upgrade, thanks to the Cargo.lock file
  * Because the Cargo.lock file is important for reproducible builds, it’s often checked into source control with the 
    rest of the code in your project
* **Updating a Crate to Get a New Version:**
  * When you do want to update a crate, Cargo provides the command update, which will ignore the Cargo.lock file and 
    figure out all the latest versions that fit your specifications in Cargo.toml
  * Cargo will then write those versions to the Cargo.lock file
  * Otherwise, by default, Cargo will only look for versions greater than 0.8.5 and less than 0.9.0. If the rand crate 
    has released the two new versions 0.8.6 and 0.9.0, you would see the following if you ran cargo update:
```
cargo update
```

* Bookmark: https://doc.rust-lang.org/book/ch03-01-variables-and-mutability.html

### The Actix Framework:
* Actix is a **high-performance**, **actor-based framework** for building **concurrent**, **distributed**, and 
  **scalable applications** in **Rust**
* It is designed to **leverage Rust's strengths** in terms of **memory safety**, **concurrency**, and **performance** to 
  provide a **robust foundation** for **building web applications**, **network services**, and **other asynchronous 
  systems**
* Here are some **key features** of the Actix framework:
  * **Actor Model:**
    * Actix is based on the **actor model**, where **individual actors** are **lightweight**, **isolated units of 
      computation** that **communicate with each other** through **message passing**
    * **Actors** in Actix are designed to be **highly concurrent** and can **handle large numbers of concurrent requests 
      efficiently**
  * **Asynchronous:**
    * Actix is built around **asynchronous programming principles**, allowing **applications** to **handle many 
      connections concurrently without blocking the execution flow**
    * This enables **high throughput** and **scalability** for **network services** and **web applications**
  * **Actor System:**
    * Actix provides a **runtime environment** called the **Actor System**, which **manages the lifecycle of actors**, 
      **message passing**, and **concurrency**
    * The **Actor System abstracts away the complexity**** of **managing concurrency** and provides a **clean API** for 
      **building asynchronous systems**
  * **Web Framework:**
    * Actix includes a **powerful web framework** for **building HTTP servers** and **web applications**
    * It provides support for **routing**, **middleware**, **request handling**, **WebSocket communication**, and 
      **other web-related features**
  * **Performance:**
    * Actix is designed for **high performance** and **low overhead**
    * It **leverages Rust's zero-cost abstractions** and **compile-time checks** to ensure that **applications built 
      with Actix** can **achieve optimal performance without sacrificing safety**
  * **Scalability:**
    * Actix is **designed to scale horizontally across multiple cores and nodes**
    * It provides **tools** and **abstractions** for **building distributed systems** and can **easily be deployed in 
      clustered environments**
  * **Flexibility:**
    * Actix is designed to be **flexible** and **extensible**
    * It provides a **modular architecture** that allows developers to **plug in custom components** and **extensions as 
      needed**
* Overall, Actix is a **powerful framework** for **building high-performance**, **concurrent**, and **distributed 
  applications** in **Rust**
* It combines the **safety** and **expressiveness** of **Rust** with the **scalability** and **concurrency** of the 
  **actor model** to provide a **robust foundation** for **building modern, asynchronous systems**