package moving.squares;
// Importing packages
import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
public class Square {
    Random position = new Random(); // Create a random object
    // Create a square with random position and 100 pixeles width and 100 pixels height
    Rectangle square = new Rectangle(position.nextInt(800),position.nextInt(800),100,100);
    Timeline move;      // Create a timeline to move squares
    // Create a constructor
    public Square(Paint color){             // Make color as an argument
        square.setFill(Color.TRANSPARENT);  // Make square transparent
        square.setStroke(color);            // Make a colorful stroke for square
        square.setStrokeWidth(10);          // Set Stroke width
        moveSquare();                       // Call the method to move the square
    }
    public Rectangle getSquare(){   // A method returning square as a node
        return square;
    }
    private void moveSquare(){  // A method moves square every second
        move = new Timeline(new KeyFrame(Duration.millis(1000),e->{ // Set duration to 1 second
            square.setX(position.nextInt(800)); // Change X position randomly
            square.setY(position.nextInt(800)); // Change Y position randomly
        }));
        move.setCycleCount(Timeline.INDEFINITE);// To make the timeline works forever
        move.play();                            // To play timeline
    }
    public void move(){ // A method plays timeline
        move.play();
    }
    public void stop(){ // A method stops timeline
        move.stop();
    }
    public void speedUp(){  // A method increases speed
        move.setRate(3);
    }
    public void speedDown(){    // A method decreases speed
        move.setRate(0.2);
    }
    public void setNormal(){    // A method setting speed to its default
        move.setRate(1);
    }}