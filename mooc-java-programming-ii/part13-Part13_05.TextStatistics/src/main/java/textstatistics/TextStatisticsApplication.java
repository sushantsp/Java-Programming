package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textBlock = new TextArea("Some Text");
        layout.setCenter(textBlock);

        HBox horizontalComponents = new HBox();
        horizontalComponents.getChildren().add(new Label("Letters: 0"));
        horizontalComponents.getChildren().add(new Label("Words: 0"));
        horizontalComponents.getChildren().add(new Label("The longest word is:"));

        layout.setBottom(horizontalComponents);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
