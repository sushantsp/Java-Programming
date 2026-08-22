package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{

    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();

        Label topText = new Label(""); 
        topText.setFont(Font.font("Monospaced", 40));

        layout.setTop(topText);

        GridPane middleLayout = new GridPane();

        middleLayout.setAlignment(Pos.CENTER);
        middleLayout.setVgap(10);
        middleLayout.setHgap(10);
        middleLayout.setPadding(new Insets(10, 10, 10, 10));     
        
        String[] turn = {"X"};
        topText.setText("Turn: X");

        Button[][] buttons = new Button[3][3];
        for(int i=0; i<=2; i++) {
            for(int j=0; j<=2; j++) {
                Button b = new Button();
                b.setFont(Font.font("Monospaced", 40));
                b.setMinSize(80, 80);
                buttons[i][j] = b;

                b.setOnAction((event) -> {
                    if (!b.getText().isEmpty())  {
                        return;
                    }

                    b.setText(turn[0]);
                    // swap turn
                    turn[0] = (turn[0].equals("X")) ? "O" : "X";
                    topText.setText("Turn: " + turn[0]);
                    String winner = checkWinner(buttons);
                    if (winner != null) {
                        topText.setText("The end!");
                        // disable all buttons to stop play
                        for (int x = 0; x < 3; x++) {
                            for (int y = 0; y < 3; y++) {
                                buttons[x][y].setDisable(true);
                            }
                        }
                    } else {
                        topText.setText("Turn: " + turn[0]);
                    }
                });

                middleLayout.add(b, i, j);
            }
        }

        layout.setCenter(middleLayout);

        Scene scene = new Scene(layout, 400, 400);

        window.setScene(scene);
        window.show();

    }


    private String checkWinner(Button[][] buttons) {
        // check rown
        for(int i=0; i<=2; i++) {

                // check rows
                String a = buttons[i][0].getText();
                String b = buttons[i][1].getText();
                String c = buttons[i][2].getText();
                if (!a.isEmpty() && a.equals(b) && b.equals(c)) {
                    return a;  // a is the winner
                }
            }
            
        // check cols
        for(int j=0; j<=2; j++) {
                // check columns
                String a = buttons[0][j].getText();
                String b = buttons[1][j].getText();
                String c = buttons[2][j].getText();
                if (!a.isEmpty() && a.equals(b) && b.equals(c)) {
                    return a;  // a is the winner
                }

            }

        // check digonals

            // main diagonal
            String a = buttons[0][0].getText();
            String b = buttons[1][1].getText();
            String c = buttons[2][2].getText();
            if (!a.isEmpty() && a.equals(b) && b.equals(c)) return a;

            // anti-diagonal: [0][2], [1][1], [2][0]

            String d = buttons[0][2].getText();
            String e = buttons[1][1].getText();
            String f = buttons[2][0].getText();
            if (!d.isEmpty() && d.equals(e) && e.equals(f)) return d;
            // ...same pattern

            return null;
        }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
