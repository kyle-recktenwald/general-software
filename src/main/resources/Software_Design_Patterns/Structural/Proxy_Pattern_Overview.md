# Proxy Design Pattern Overview:

### Overview:
* The **Proxy pattern** is a **structural design pattern** that provides a **surrogate** or **placeholder for another 
  object** to **control access to it**
* This pattern is useful in scenarios where you want to add an **extra layer of control** over the **access to an 
  object**, often for the purpose of **security**, **logging**, or **optimization**
* Key Participants in the Proxy Pattern:
  * **Subject:**
    * This is the **interface** or **abstract clas**s that the **Proxy** and the **RealSubject both implement**
    * It defines the **common interface** for the **RealSubject** and **Proxy** so that a **Proxy** can be used 
      **wherever a RealSubject is expected**
  * **RealSubject:**
    * This is the **real object** that the **Proxy represents**
    * It **implements the Subject interface**, and the **Proxy delegates operations** to the **RealSubject when needed**
  * **Proxy:**
    * This is the class that acts as a **surrogate** or **placeholder** for the **RealSubject**
    * It **implements the Subject interface** and **maintains a reference to the RealSubject**
    * The Proxy **controls access** to the **RealSubject** and may perform **additional tasks before or after delegating 
      to the RealSubject**
* **Example:**
  * Let's consider a simple example where we have an **`Image` interface**, a **`RealImage` class** that **implements 
    this interface**, and an **`ImageProxy` class** that acts as a **proxy for `RealImage`**
  * The **proxy** is **responsible for loading the real image only when it's necessary**

```java
// Subject interface
interface Image {
    void display();
}

// RealSubject
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Proxy
class ImageProxy implements Image {
    private RealImage realImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

// Client
public class ProxyExample {
    public static void main(String[] args) {
        // Using Proxy to control access to the RealSubject
        Image proxyImage1 = new ImageProxy("image1.jpg");
        Image proxyImage2 = new ImageProxy("image2.jpg");

        // RealSubject is loaded only when display is called
        proxyImage1.display();
        proxyImage2.display();
    }
}
```
* In this example, the **`ImageProxy`** acts as a **proxy** for the **`RealImage`**
* The **`ImageProxy` loads the real image only when the `display` method is called**, providing a way to **control 
  access to the real object**
* This can be beneficial, for example, if **loading the real image** is an **expensive operation** that should be 
  **deferred until necessary**