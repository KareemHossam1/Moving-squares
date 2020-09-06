package moving.squares;
// Importing packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class MovingSquares extends Application {
    /* Creating objects (squares) from Square
    class and passing color as an argument*/
    Square square1 = new Square(Color.BLACK);
    Square square2 = new Square(Color.BLUE);
    Square square3 = new Square(Color.RED);
    Square square4 = new Square(Color.GREEN);
    Square square5 = new Square(Color.YELLOW);
    Square square6 = new Square(Color.PINK);
    Square square7 = new Square(Color.ORANGE);
    Square square8 = new Square(Color.LAWNGREEN);
    Square square9 = new Square(Color.GRAY);
    Square square10 = new Square(Color.OLIVE);
    Square square11 = new Square(Color.CHOCOLATE);
    // Creating buttons and passing text as an argument
    Button play = new Button("Play");
    Button stop = new Button("Stop");
    Button speedUp = new Button("Speed Up");
    Button speedDown = new Button("Speed Down");
    Button normalSpeed = new Button("Normal Speed");
    // Adding back ground image
    Image backGround = new Image("File:image/high-resolution-white-wood-background-anstract-vintage-close-up-109275453.jpg");
    ImageView imageView = new ImageView(backGround);
    VBox v = new VBox(10);  // Creating VBox to order buttons
    Pane root = new Pane(); // Pane to add nodes
    @Override
    public void start(Stage primaryStage) {
        imageView.setFitHeight(915);                    // Background height
        imageView.setFitWidth(915);                     // Background width
        play.setDisable(true);                          // Disable play button
        normalSpeed.setDisable(true);                   // Disable normal speed button
        // Making buttons text bold
        play.setStyle("-fx-font-weight: bold");
        stop.setStyle("-fx-font-weight: bold"); 
        speedUp.setStyle("-fx-font-weight: bold"); 
        speedDown.setStyle("-fx-font-weight: bold"); 
        normalSpeed.setStyle("-fx-font-weight: bold"); 
        // Setting buttons size
        play.setPrefSize(120,20);
        stop.setPrefSize(120,20);
        speedUp.setPrefSize(120,20);
        speedDown.setPrefSize(120,20);
        v.getChildren().addAll(play,stop,speedUp,speedDown,normalSpeed);// Order buttons
        v.setPadding(new Insets(10,0,0,10));                            // Buttons position
        // Add all elements to pane
        root.getChildren().addAll(imageView,square1.getSquare(),square2.getSquare(),square3.getSquare()
                ,square4.getSquare(),square5.getSquare(),square6.getSquare(),square7.getSquare(),
                square8.getSquare(),square9.getSquare(),square10.getSquare(),square11.getSquare(),v);
        /* Handling buttons
        Handle play button*/
        play.setOnAction(e->{
            // Move squares
            square1.move();
            square2.move();
            square3.move();
            square4.move();
            square5.move();
            square6.move();
            square7.move();
            square8.move();
            square9.move();
            square10.move();
            square11.move();
            stop.setDisable(false); // Enable stop button
            play.setDisable(true);  // Disable play button
        });
        // Handling stop button
        stop.setOnAction(e->{
            // Stop squares movement
            square1.stop();
            square2.stop();
            square3.stop();
            square4.stop();
            square5.stop();
            square6.stop();
            square7.stop();
            square8.stop();
            square9.stop();
            square10.stop();
            square11.stop();
            stop.setDisable(true);  // Disable stop button
            play.setDisable(false); // Enable play button
        });
        // Handling speed up button
        speedUp.setOnAction(e->{
            // Increase movement speed
            square1.speedUp();
            square2.speedUp();
            square3.speedUp();
            square4.speedUp();
            square5.speedUp();
            square6.speedUp();
            square7.speedUp();
            square8.speedUp();
            square9.speedUp();
            square10.speedUp();
            square11.speedUp();
            speedUp.setDisable(true);       // Disable speed up button
            speedDown.setDisable(false);    // Enable speed down button
            normalSpeed.setDisable(false);  // Enable normal speed button
        });
        // Handling speed down button
        speedDown.setOnAction(e->{
            // Decrease movement speed
            square1.speedDown();
            square2.speedDown();
            square3.speedDown();
            square4.speedDown();
            square5.speedDown();
            square6.speedDown();
            square7.speedDown();
            square8.speedDown();
            square9.speedDown();
            square10.speedDown();
            square11.speedDown();
            speedUp.setDisable(false);      // Enable speed up button
            speedDown.setDisable(true);     // Disable speed down button 
            normalSpeed.setDisable(false);  // Enable normal speed button
        });
        // Handling normal speed button
        normalSpeed.setOnAction(e->{
            // Resetting speed
            square1.setNormal();
            square2.setNormal();
            square3.setNormal();
            square4.setNormal();
            square5.setNormal();
            square6.setNormal();
            square7.setNormal();
            square8.setNormal();
            square9.setNormal();
            square10.setNormal();
            square11.setNormal();
            speedUp.setDisable(false);      // Enable speed up button
            speedDown.setDisable(false);    // Enable speed down button
            normalSpeed.setDisable(true);   // Disable normal speed button
        });
        Scene scene = new Scene(root, 900, 900);    // Create scene with 900 pixels width and 900 pixels height
        primaryStage.setResizable(false);           // Prevent user from changing scene size
        primaryStage.setTitle("MOVING SQUARES");    // Primary stage title
        primaryStage.setScene(scene);               // Add scene
        primaryStage.show();                        // Show primary stage
    }
    public static void main(String[] args) {
        launch(args);
    }}