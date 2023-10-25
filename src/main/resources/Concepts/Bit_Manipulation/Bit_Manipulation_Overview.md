# Bit Manipulation Overview:

### Overview:
* **Bit manipulation**, also known as **bitwise manipulation**, is a **fundamental technique** in computer programming 
  and computer science that involves **manipulating individual bits within binary representations of data**
* In **computing**, **data is typically stored in binary format**, which consists of **0s and 1s (bits)**
* Bit manipulation allows you to perform various operations at the **bit level**, such as **setting, clearing, toggling, 
  or extracting specific bits**, and performing **bitwise logical operations like AND, OR, XOR, and NOT**
* Common bit manipulation operations and concepts include:
  * **Bitwise AND (&):**
    * Performs a bitwise AND operation between two binary numbers, resulting in a new binary number where **each 
      bit** is set to **1** **if and only if** the corresponding bits in **both** input numbers are **1**
  * **Bitwise OR (|):**
    * Performs a bitwise OR operation, resulting in a new binary number where each bit is **set to 1** if **at 
      least one** of the corresponding bits in the input numbers is **1**
  * **Bitwise XOR (^):**
    * Performs a bitwise XOR (exclusive OR) operation, resulting in a new binary number where **each bit** is set to 
      **1** if **exactly one** of the corresponding bits in the input numbers is **1**
  * **Bitwise NOT (~):**
    * Performs a bitwise NOT operation, which **inverts each bit**, changing **0s to 1s** and **1s to 0s**
  * **Bitwise Shifts (<< and >>):**
    * These operators allow you to **shift the bits** of a binary number **left or right**
    * **Left shift (<<)** effectively **multiplies the number by 2** for **each shift**, and **right shift (>>)** 
      effectively **divides the number by 2** for **each shift**
* **Setting and Clearing Bits:**
  * You can use bitwise operations to set **specific bits** to 1 or 0, respectively, **without affecting other bits** in 
    the number
* Bit manipulation is commonly used in **low-level programming**, **embedded systems**, and scenarios where **optimizing 
  memory usage**, **performance**, or **communication protocols** is **essential**
* It can also be used in more **high-level programming** to perform various tasks, such as working with **binary 
  flags**, **packing and unpacking data structures**, and **solving specific algorithmic problems** that involve 
  **bitwise operations**
* <img src="images/Bit_Manipulation_Diagram.png" width="500">