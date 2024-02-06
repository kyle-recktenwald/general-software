# Facade Design Pattern Overview:

### Overview:
* The **facade pattern** is a **structural design pattern** that provides a **simplified interface** to a **set of 
  interfaces in a subsystem**, making it **easier to use**
* It involves **creating a class** that **represents a higher-level**, **unified interface** that makes it **easier for 
  clients to interact** with a **complex system** or **set of classes**
* **Example:**
  * Let's consider a scenario where we have a **complex subsystem** with **multiple classes**, and we want to create a 
    facade to **simplify interactions with that subsystem**
  * In this example, let's create a facade for a **multimedia system** that includes **various components** such as 
    **audio player**, **video player**, and **projector**
```java
// Subsystem Components

class AudioPlayer {
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}

class VideoPlayer {
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

class Projector {
    public void display() {
        System.out.println("Projecting image...");
    }
}

// Facade

class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private Projector projector;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.projector = new Projector();
    }

    public void playMovie() {
        System.out.println("Starting movie playback...");
        audioPlayer.playAudio();
        videoPlayer.playVideo();
        projector.display();
    }
}

// Client

public class FacadeExample {
    public static void main(String[] args) {
        // Using the Facade to simplify interactions
        MultimediaFacade multimediaFacade = new MultimediaFacade();
        multimediaFacade.playMovie();
    }
}
```
* In this example, **`MultimediaFacade`** provides a **simplified interface** for **playing a movie**
* The **client code interacts with the facade**, which **internally handles the complexities** of **interacting** with 
  the **audio player**, **video player**, and **projector**
* This way, the **client doesn't need to deal with** the **intricacies of the subsystem directly**