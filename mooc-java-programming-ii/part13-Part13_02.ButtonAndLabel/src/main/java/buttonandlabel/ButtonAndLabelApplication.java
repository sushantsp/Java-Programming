package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("This is a button");
        Label labelComponent = new Label("Text Element");

        VBox componentGroup = new VBox();
        componentGroup.getChildren().add(labelComponent);
        componentGroup.getChildren().add(buttonComponent);
        

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
