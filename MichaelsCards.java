// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 07/03/2022
// Assignment: Module 8 Assignment
// Purpose: Create a program that displays 4 images randomly selected from 52 cards.

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MichaelsCards extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        boolean[] usedCards = new boolean[52];
        int count = 0;
        while (count < 4) {
            int card = (int) (Math.random() * 52);
            if (!usedCards[card]) {
                usedCards[card] = true;
                pane.add(new ImageView(new Image("cards/"+(++card)+".png")), count, 0);
                count++;
            }
        }
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("4 Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }


}
