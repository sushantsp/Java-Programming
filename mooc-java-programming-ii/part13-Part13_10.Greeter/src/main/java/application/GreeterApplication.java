package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        // define UI Components
        Label instructionText = new Label("Enter you name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");

        Label welcomeText = new Label("");


        // define Layouts for scene 1

        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(nameField, 0, 1);
        layout.add(startButton, 0, 2);

        // styling the layout for scene 1
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // scene 1

        Scene nameScene = new Scene(layout);

        // define the layout for scene 2

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        // scene 2

        Scene welcomeScene = new Scene(welcomeLayout);

        startButton.setOnAction((event) -> {
            welcomeText.setText("Welcome " + nameField.getText() + "!" );
            window.setScene(welcomeScene);
        });

        window.setScene(nameScene);
        window.show();
    }


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
