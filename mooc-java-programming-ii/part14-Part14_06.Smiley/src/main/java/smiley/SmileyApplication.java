package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();

        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);

        // paintingLayout.setOnMouseDragged((event) -> {
        //     double xLocation = event.getX();
        //     double yLocation = event.getY();

        //     painter.setFill(colorPalette.getValue());
        //     // painter.fillOval(xLocation, yLocation, 4, 4);
        //     painter.fillRect(xLocation, yLocation, 14, 14);
        // });

        painter.setFill(Color.BLACK);

        painter.fillRect(140, 130, 50, 50);
        painter.fillRect(340, 130, 50, 50);
        painter.fillRect(90, 280, 50, 50);
        painter.fillRect(390, 280, 50, 50);
        painter.fillRect(140, 330, 250, 50);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
