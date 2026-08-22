package application;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {


    private XYChart.Series<Number, Number> savings = new XYChart.Series<>();
    private XYChart.Series<Number, Number> interest = new XYChart.Series<>();

    @Override
    public void start(Stage window) {

        
        BorderPane layout = new BorderPane();
        VBox top = new VBox();
        BorderPane firstBorderPane = new BorderPane();
        BorderPane secondBorderPane = new BorderPane();

        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative Support");

        // Create aline chart.
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings");

        Slider montlySavingsSlider = new Slider(25, 250, 25);
        montlySavingsSlider.setShowTickMarks(true);
        montlySavingsSlider.setShowTickLabels(true);
        montlySavingsSlider.setMajorTickUnit(25f);
        montlySavingsSlider.setBlockIncrement(0.1f);
    
        Slider yearlyInterstSlider = new Slider(0, 10, 0);
        yearlyInterstSlider.setShowTickMarks(true);
        yearlyInterstSlider.setShowTickLabels(true);
        yearlyInterstSlider.setMajorTickUnit(1f);
        yearlyInterstSlider.setBlockIncrement(0.1f);

        top.setSpacing(20);

        Label monthlySavingsLabel = new Label("Monthly savings");
        Label yearlyInterstLabel = new Label("Yearly interest rate");

        Label monthlySavingsValue = new Label("25.0");
        Label yearlyInterestValue = new Label("0.0");

        updateChart((int) montlySavingsSlider.getValue(), (double) yearlyInterstSlider.getValue());

        montlySavingsSlider.valueProperty().addListener((obs, oldValue, newValue)-> {
             monthlySavingsValue.setText(String.format("%.1f",newValue.doubleValue()));
             updateChart((int) montlySavingsSlider.getValue(), (double) yearlyInterstSlider.getValue());
        });

        yearlyInterstSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            yearlyInterestValue.setText(String.format("%.1f",newValue.doubleValue()));
            updateChart((int) montlySavingsSlider.getValue(), (double) yearlyInterstSlider.getValue());
        });

        firstBorderPane.setLeft(monthlySavingsLabel);
        firstBorderPane.setCenter(montlySavingsSlider);
        firstBorderPane.setRight(monthlySavingsValue);
        secondBorderPane.setLeft(yearlyInterstLabel);
        secondBorderPane.setCenter(yearlyInterstSlider);
        secondBorderPane.setRight(yearlyInterestValue);

        top.getChildren().add(firstBorderPane);
        top.getChildren().add(secondBorderPane);
        layout.setCenter(lineChart);
        layout.setTop(top);

        savings.setName("Annual Savings");
        interest.setName("Compounded Savings");

        lineChart.getData().add(savings);
        lineChart.getData().add(interest);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    // Part 2 - update saving


    private void updateChart(int monthly, double rate) {
        savings.getData().clear();
        interest.getData().clear();
        double balance = 0.0;
        for(int year =0; year <=30; year++) {
            savings.getData().add(new XYChart.Data<>(year, year*monthly*12.0));

            interest.getData().add(new XYChart.Data<>(year, balance));
            balance += monthly*12.0;
            balance += balance * rate/100;
        }
    }



    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

} 
