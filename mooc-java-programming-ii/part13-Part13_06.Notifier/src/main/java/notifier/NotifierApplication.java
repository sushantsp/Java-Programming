package notifier;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {

    // @Override
    // public void start(Stage window) {

    //     TextField topText = new TextField();
    //     Button button = new Button("Update");


    //     Label label = new Label();

    //     button.setOnAction((event) -> {
    //         label.setText(topText.getText());
    //     });
    //     VBox componentGroup = new VBox();
    //     componentGroup.getChildren().addAll(topText, button, label);

    //     Scene scene = new Scene(componentGroup); 
    //     window.setScene(scene);
    //     window.show();

    // }


    @Override
    public void start(Stage window) {
        
        TextField leftText = new TextField();
        TextField rightText = new TextField();

        // Button button = new Button("Copy");

        // button.setOnAction((event) -> {
        //     rightText.setText(leftText.getText());
        // });

        leftText.textProperty().addListener(new ChangeListener<String>() {
            
            @Override
            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                System.out.println(change + " -> " + oldValue + " -> " + newValue);
                rightText.setText(newValue);
            }
        });

        HBox layout = new HBox();
        layout.setSpacing(10);

        layout.getChildren().addAll(leftText, rightText);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
