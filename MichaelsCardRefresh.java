// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 07/17/2022
// Assignment: Module 10 Assignment
// Purpose: Create a program that displays 4 images randomly selected from 52 cards and has a refresh option

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class MichaelsCardRefresh extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setPadding(new Insets(5, 5, 5, 5));

		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(5, 5, 5, 5));
		getCards(hBox);

		// add a refresh button
		Button btRefresh = new Button("Refresh");
		btRefresh.setOnAction(e -> getCards(hBox));

		// Place nodes in vbox
		vBox.getChildren().addAll(hBox, btRefresh);

		Scene scene = new Scene(vBox);
		primaryStage.setTitle("MichaelsCards2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void getCards(HBox pane) {
		pane.getChildren().clear();
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			cards.add(i + 1);
		}

        // refresh
		java.util.Collections.shuffle(cards);
		
		for (int i = 0; i < 4; i++) {
			pane.getChildren().add(new ImageView(new Image("cards/" + cards.get(i) + ".png")));
		}
	}
}

