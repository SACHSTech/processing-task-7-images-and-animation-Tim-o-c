import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  /**
   * A sketch that outputs an image of Ed Sheeran moving in a sinosodial wave pattern back and forth across an image of a trampoline
   * @author: T. Chhor
   */
  public void settings() {
    size(400, 400);
  }

  // Declaring images
  PImage imgEd;
  PImage imgTrampoline;

  public void setup() {
    // Loading images
    imgEd = loadImage("Ed-Sheeran-PNG-High-Quality-Image.png");
    imgTrampoline = loadImage("OIP (5).jpg");
  }

  // Declaring and initializing variables
  int intXCoord = -35;
  int intSpeed = 1;

  public void draw() {
    // Drawing the trampoline background
    image(imgTrampoline, 0, 0, 400, 400);

    // Ed Sheeran
    image(imgEd, intXCoord, (int)(200 + 100 * sin(intXCoord)), 70, 70);

    // A white ball
    ellipse(intXCoord, 200, 50, 50);

    // Edge detection
    if (intXCoord > 400 || intXCoord < -35) {
      intSpeed = intSpeed * -1;
    }
    
    // Movement
    intXCoord += 10 * intSpeed;
  }
}
