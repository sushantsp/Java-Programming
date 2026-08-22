package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JokeApplication extends Application{

    @Override
    public void start(Stage window) throws Exception {
    
        // Main 
        BorderPane layout = new BorderPane();

        // Define menu buttons
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);

        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");

        menu.getChildren().addAll(first, second, third);

        layout.setTop(menu);

        // Define the sub views.

        StackPane firstLayout = createSubView("What do you call a bear with no teeth?");
        StackPane secondLayout = createSubView("A gummy bear.");
        StackPane thirdLayout = createSubView("A Joke's bad explanation");


        first.setOnAction((event) -> {
            layout.setCenter(firstLayout);
        });

        second.setOnAction((event) -> {
            layout.setCenter(secondLayout);
        });

        third.setOnAction((event) -> {
            layout.setCenter(thirdLayout);
        });


        layout.setCenter(firstLayout);

        // define the scene

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }

    private StackPane createSubView(String text) {
        
        StackPane layout = new StackPane();
        layout.setPrefSize(180, 160);
        layout.getChildren().add(new Label(text));

        layout.setAlignment(Pos.CENTER);
        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
