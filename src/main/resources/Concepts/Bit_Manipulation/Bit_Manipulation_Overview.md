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

### Bitmask:
* A **bitmask** is a **sequence of bits** used for **various bitwise operations** to **manipulate or represent data**
* It's a **technique** in computer science where **specific bits** within a **binary number** or **sequence** are used 
  to **convey certain information**, **toggle settings**, or **perform logical operations**
* **Key Points about Bitmasks:**
  * **Bit-Level Operations:**
    * Bitmasks allow you to work at the level of individual bits within binary numbers using bitwise operations
  * **Flags and Settings:**
    * Bitmasks are often used to represent settings or flags, where each bit represents a specific setting
    * For example, in a system with multiple options, each bit might indicate the activation or deactivation of a 
      particular feature
  * **Logical Operations:**
    * Bitwise AND, OR, XOR, and NOT operations are commonly applied using bitmasks to perform tasks like setting, 
      clearing, or toggling specific bits
  * **Efficient Memory Usage:**
    * Bitmasks can be used to efficiently store multiple boolean flags or settings within a single integer or a
      sequence of bits, saving memory compared to using separate variables for each setting
  * **Bitwise Shifts:**
    * Left and right shifts are often used with bitmasks to move bits left or right, effectively multiplying or 
      dividing by powers of two
* **Example Usage:**
  * Let's consider a scenario where we use a bitmask to **represent different permission levels** in a system:
```
// Define permission levels using bitmasks
int READ = 1;     // Binary: 0001
int WRITE = 2;    // Binary: 0010
int DELETE = 4;   // Binary: 0100

// User permissions
// Combined permission: READ and WRITE
int userPermissions = READ | WRITE;  

// Checking permissions using bitwise AND
if ((userPermissions & READ) != 0) {
    // User has READ permission
}

// Adding DELETE permission
// Combined permission: READ, WRITE, and DELETE
userPermissions |= DELETE;
```
* **In this example:**
  * **Each permission level** is **represented** using a **different bit position within an integer**
  * Bitwise `OR` (`|`) is used to **combine permissions** for a user
  * Bitwise `AND` (`&`) is used to check if a user has a **specific permission**
  * Bitwise `OR` assignment (`|=`) is used to **add a new permission** to the **user's existing permissions**
* Bitmasks are **versatile** and **powerful** for **handling low-level operations**, **optimizing memory usage**, and 
  managing **multiple settings** or **flags** within a **compact representation of bits**


### Flipping the Bits in a Number:
* **Flipping all the bits** within a number means **changing each 0 bit to 1** and **each 1 bit to 0**
* In Java, you can achieve this using the **XOR (`^`) operation with a bitmask**
* Here's how it works step by step:
  * **Create a Bitmask with All 1s:**
    * To **create a bitmask with all 1s**, you can use the **left shift (`<<`) operator**
    * For a **32-bit integer**, the bitmask can be created as follows:
      * `long bitmask = (1L << 32) - 1;`
  * This **shifts** the **binary representation of 1 32 positions to the left**, creating a bitmask with all 1s
* **Use XOR Operation to Flip Bits:**
  * The XOR (`^`) operation works by **toggling each bit**:
    * `0 ^ 1` results in 1
    * `1 ^ 0` results in 1
    * `0 ^ 0` results in 0
    * `1 ^ 1` results in 0
  * XORing a number with the bitmask will flip all its bits:
    * `long flippedNumber = originalNumber ^ bitmask;`
```
public static long flippingBits(long n) {
        // Create a bitmask with all 1s
        long bitmask = (1L << 32) - 1;

        // Use XOR to flip all the bits
        long flippedNumber = n ^ bitmask;

        return flippedNumber;
    }
```

### Using XOR to Find a Unique Integer in an Array:
* To **find** a **unique element** in the **array** where **all elements occur more than once except one**, you can use 
  the **XOR (exclusive OR) operation**
* The **XOR of a number with itself is 0**, and **XORing any number with 0 gives the number itself**
* So, if you **XOR all the elements in the array**, the **result will be the unique element**
```
public static int lonelyinteger(List<Integer> a) {
        int result = 0;

        // XOR all elements in the array
        for (int num : a) {
            result ^= num;
        }

        return result;
    }
```
* The XOR-based approach for finding the unique element in an array would work with **any data type** that **supports 
  the bitwise XOR operation**
* This includes **integer types** (`byte`, `short`, `int`, `long`), characters (`char`), and boolean types (`boolean`)
* However, it would **not work as-is** for **floating-point types** (`float` and `double`) because they **don't support 
  bitwise operations in Java**
* For floating-point types, you would need to use a different approach, such as **sorting the array** or using a data 
  structure like `HashMap`