package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        Button firstViewButton = new Button("To the second view!");
        Button secondViewButton = new Button("To the third view!");
        Button thirdViewButton = new Button("To the First View!");

        // define layouts containing the above buttons
        BorderPane layout1 = new BorderPane();
        layout1.setTop(new Label("First View!"));
        layout1.setCenter(firstViewButton);

        VBox layout2 = new VBox();
        layout2.getChildren().addAll(secondViewButton, new Label("Second view!"));

        GridPane layout3 = new GridPane();
        layout3.add(new Label("Third view!"), 0, 0);
        layout3.add(thirdViewButton, 1, 1);

        // define scenes

        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(layout2);
        Scene scene3 = new Scene(layout3);

        // define setOnAction buttons.

        firstViewButton.setOnAction((event) -> {
            window.setScene(scene2);
        });

        secondViewButton.setOnAction((event) -> {
            window.setScene(scene3);
        });

        thirdViewButton.setOnAction((event) -> {
            window.setScene(scene1);
        });

        window.setScene(scene1);
        window.show();
    }


    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}