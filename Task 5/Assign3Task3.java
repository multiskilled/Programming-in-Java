 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author Mukesh
 */

public class Assign3Task3 extends Application {
@Override 
public void start(Stage primaryStage) {
// Create a Border Pane
BorderPane pane = new BorderPane();
//Place the nodes in the Borderpane
pane.setTop(top());                 //sets the pane to top position
pane.setCenter(center());           //sets the pane  position to center
pane.setBottom(bottom());           //sets the pane  position to Bottom
// Create a scene with window values
Scene scene = new Scene(pane,380,400);
primaryStage.setTitle(" 9 Playing Cards"); // Setting the stage title

primaryStage.setScene(scene);               // Placing the scene in the stage
primaryStage.show();                     // Displays the stage
}
  //private 1st hbox method positioned at Top
private HBox top() {  
HBox top = new HBox(50);            //creating top Hbox
top.setPadding(new Insets(20, 20, 20, 20));         //settign padding for top Hbox
ArrayList<String> PlayingCards = new ArrayList<>();         //new array list for storing cards

        for (int i = 0; i < 52; i++) {                          //for loop runs untill total number of cards
            PlayingCards.add(String.valueOf(i + 1));            //adds the card png images to playing cards array llist
        }
        //Used shuffle instead of Random 
        java.util.Collections.shuffle(PlayingCards);            //shuffles the cards and gets random cards
        ImageView view1 = new ImageView(new Image("Images//" + PlayingCards.get(0) + ".png")); //gets random cards into image view
        ImageView view2 = new ImageView(new Image("Images//" + PlayingCards.get(1) + ".png"));
        ImageView view3 = new ImageView(new Image("Images//" + PlayingCards.get(2) + ".png"));
        
        top.getChildren().add(view1);           //get the children for top hbox and add the Image to image view
        top.getChildren().add(view2);
        top.getChildren().add(view3);

return top;         //returns the top hbox
}
//private 2nd hbox method positioned at center
private HBox center() {
HBox center = new HBox(50);     //creating center Hbox
center.setPadding(new Insets(20, 20, 20, 20));      //Setting padding for center hbox
ArrayList<String> PlayingCards = new ArrayList<>();      //new array list for storing cards

        for (int i = 0; i < 52; i++) {                  //for loop runs untill total number of cards
            PlayingCards.add(String.valueOf(i + 1));    //adds the card png images to playing cards array llist
        }
        java.util.Collections.shuffle(PlayingCards);              //shuffles the cards and gets random cards
        ImageView view1 = new ImageView(new Image("Images//" + PlayingCards.get(0) + ".png")); //gets random cards into image view
        view1.setRotate(45);                        //rotates the image view to 45
        ImageView view2 = new ImageView(new Image("Images//" + PlayingCards.get(1) + ".png"));
        view2.setRotate(90);                        //rotates the image view to 90
        ImageView view3 = new ImageView(new Image("Images/" + PlayingCards.get(2) + ".png"));
        view3.setRotate(135);                       //rotates the image view to 135
        center.getChildren().add(view1);        //get the children for top hbox and add the Image to image view
        center.getChildren().add(view2);
        center.getChildren().add(view3);

return center;
}
//private 3rd hbox method positioned at bottom
private HBox bottom() {   
HBox bottom = new HBox(50);                             //creating Bottom Hbox
bottom.setPadding(new Insets(20, 20, 20, 20));              //Setting padding for bottom hbox
ArrayList<String> PlayingCards = new ArrayList<>();

        for (int i = 0; i < 52; i++) {                          //for loop runs untill total number of cards
            PlayingCards.add(String.valueOf(i + 1));            //adds the card png images to playing cards array llist
        }
        java.util.Collections.shuffle(PlayingCards);
        ImageView view1 = new ImageView(new Image("Images//" + PlayingCards.get(0) + ".png"));//gets random cards into image view
        view1.setRotate(135);               //rotates the image view to 135
        ImageView view2 = new ImageView(new Image("Images//" + PlayingCards.get(1) + ".png"));
        view2.setRotate(90);                //rotates the image view to 90
        ImageView view3 = new ImageView(new Image("Images//" + PlayingCards.get(2) + ".png"));
        view3.setRotate(45);                   //rotates the image view to 45
        bottom.getChildren().add(view1);        //get the children for top hbox and add the Image to image view
        bottom.getChildren().add(view2);
        bottom.getChildren().add(view3);
return bottom;
}
//main method
public static void main(String[] args) {
launch(args);
}
}