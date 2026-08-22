package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage window) {

        Button button = new Button("Button Text");
        TextField textField = new TextField("Some Filled Text");

        // FlowPane componentGroup = new FlowPane();
        // componentGroup.getChildren().add(button);
        // componentGroup.getChildren().add(textField);

        VBox componentGroup = new VBox();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textField);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
