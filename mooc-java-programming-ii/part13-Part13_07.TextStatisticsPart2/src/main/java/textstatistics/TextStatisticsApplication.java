package textstatistics;


import java.util.Arrays;

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

        TextArea textBlock = new TextArea();
        layout.setCenter(textBlock);

        Label letterLabel = new Label("Letters: 0");
        Label wordLabel = new Label("Words: 0");
        Label longestLabel = new Label("The longest word is:"); 


        textBlock.textProperty().addListener((change, oldValue, newValue) -> {
            int totalChars = newValue.length();
            String[] words = newValue.split(" ");
            int totalWords = words.length;

            String longest = Arrays.stream(words)
                .sorted((w1, w2) -> w2.length() - w1.length())
                .findFirst()
                .get();

            letterLabel.setText("Letters: " + totalChars);
            wordLabel.setText("Words: " + totalWords);
            longestLabel.setText("The longest word is: " + longest);

        });

        HBox horizontalComponents = new HBox(10);

        horizontalComponents.getChildren().addAll(letterLabel, wordLabel, longestLabel);



        layout.setBottom(horizontalComponents);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}

