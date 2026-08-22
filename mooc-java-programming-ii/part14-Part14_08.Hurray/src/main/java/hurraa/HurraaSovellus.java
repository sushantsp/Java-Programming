package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        // TMC's submission compiler omits javafx-media. The application still
        // uses JavaFX AudioClip at runtime, but avoids a compile-time reference.
        Class<?> audioClipClass = Class.forName("javafx.scene.media.AudioClip");
        Object sound = audioClipClass
                .getConstructor(String.class)
                .newInstance("file:Applause-Yannick_Lemieux.wav");
        Method play = audioClipClass.getMethod("play");


        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

        nappi.setOnAction((event) -> {
            try {
                play.invoke(sound);
            } catch (IllegalAccessException | InvocationTargetException exception) {
                throw new RuntimeException(exception);
            }
        });


        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show(); 
    }

    public static void main(String[] args) {
        launch(HurraaSovellus.class);
    }

}
