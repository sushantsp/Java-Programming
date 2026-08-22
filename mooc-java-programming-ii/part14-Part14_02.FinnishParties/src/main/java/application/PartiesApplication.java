package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.stage.Stage;


public class PartiesApplication extends Application{

    @Override
    public void start(Stage stage) {

    // create the x and y axes that the chart is going to use
    NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
    NumberAxis yAxis = new NumberAxis();

    xAxis.setLabel("Year");
    yAxis.setLabel("Relative Support");

    // Create aline chart.
    LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
    lineChart.setTitle("Relative support of the parties");

    //Create the data KOK
    XYChart.Series kokData = new XYChart.Series<>();
    kokData.setName("KOK");

    kokData.getData().add(new XYChart.Data(1968,16.1));
    kokData.getData().add(new XYChart.Data(1972,18.1));
    kokData.getData().add(new XYChart.Data(1976,20.9));
    kokData.getData().add(new XYChart.Data(1980,22.9));
    kokData.getData().add(new XYChart.Data(1984,23.0));
    kokData.getData().add(new XYChart.Data(1988,22.9));
    kokData.getData().add(new XYChart.Data(1992,19.1));
    kokData.getData().add(new XYChart.Data(1996,21.6));
    kokData.getData().add(new XYChart.Data(2000,20.8));
    kokData.getData().add(new XYChart.Data(2004,21.8));
    kokData.getData().add(new XYChart.Data(2008,23.4));



    //Create the data SDP
    XYChart.Series sdpData = new XYChart.Series<>();
    sdpData.setName("SDP");

    sdpData.getData().add(new XYChart.Data(1968,23.9));
    sdpData.getData().add(new XYChart.Data(1972,27.1));
    sdpData.getData().add(new XYChart.Data(1976,24.8));
    sdpData.getData().add(new XYChart.Data(1980,25.5));
    sdpData.getData().add(new XYChart.Data(1984,24.7));
    sdpData.getData().add(new XYChart.Data(1988,25.2));
    sdpData.getData().add(new XYChart.Data(1992,27.1));
    sdpData.getData().add(new XYChart.Data(1996,24.5));
    sdpData.getData().add(new XYChart.Data(2000,23.0));
    sdpData.getData().add(new XYChart.Data(2004,24.1));
    sdpData.getData().add(new XYChart.Data(2008,21.2));


    //Create the data KESK

    XYChart.Series keskData = new XYChart.Series<>();
    keskData.setName("KESK");

    keskData.getData().add(new XYChart.Data(1968,18.9));
    keskData.getData().add(new XYChart.Data(1972,18.0));
    keskData.getData().add(new XYChart.Data(1976,18.4));
    keskData.getData().add(new XYChart.Data(1980,18.7));
    keskData.getData().add(new XYChart.Data(1984,20.2));
    keskData.getData().add(new XYChart.Data(1988,21.1));
    keskData.getData().add(new XYChart.Data(1992,19.2));
    keskData.getData().add(new XYChart.Data(1996,21.8));
    keskData.getData().add(new XYChart.Data(2000,23.8));
    keskData.getData().add(new XYChart.Data(2004,22.8));
    keskData.getData().add(new XYChart.Data(2008,20.1));

    //Create the data VIHR
    XYChart.Series vihrData = new XYChart.Series<>();
    vihrData.setName("VIHR");

    vihrData.getData().add(new XYChart.Data(1984,2.8));
    vihrData.getData().add(new XYChart.Data(1988,2.3));
    vihrData.getData().add(new XYChart.Data(1992,6.9));
    vihrData.getData().add(new XYChart.Data(1996,6.3));
    vihrData.getData().add(new XYChart.Data(2000,7.7));
    vihrData.getData().add(new XYChart.Data(2004,7.4));
    vihrData.getData().add(new XYChart.Data(2008,8.9));

    // //Create the data VAS
    XYChart.Series vasData = new XYChart.Series<>();
    vasData.setName("VAS");

    vasData.getData().add(new XYChart.Data(1968,16.9));
    vasData.getData().add(new XYChart.Data(1972,17.5));
    vasData.getData().add(new XYChart.Data(1976,18.5));
    vasData.getData().add(new XYChart.Data(1980,16.6));
    vasData.getData().add(new XYChart.Data(1984,13.1));
    vasData.getData().add(new XYChart.Data(1988,12.6));
    vasData.getData().add(new XYChart.Data(1992,11.7));
    vasData.getData().add(new XYChart.Data(1996,10.4));
    vasData.getData().add(new XYChart.Data(2000,9.9));
    vasData.getData().add(new XYChart.Data(2004,9.6));
    vasData.getData().add(new XYChart.Data(2008,8.8));

    //Create the data PS
    XYChart.Series psData = new XYChart.Series<>();
    psData.setName("PS");

    psData.getData().add(new XYChart.Data(1968,7.3));
    psData.getData().add(new XYChart.Data(1972,5.0));
    psData.getData().add(new XYChart.Data(1976,2.1));
    psData.getData().add(new XYChart.Data(1980,3.0));
    psData.getData().add(new XYChart.Data(1984,5.3));
    psData.getData().add(new XYChart.Data(1988,3.6));
    psData.getData().add(new XYChart.Data(1992,2.4));
    psData.getData().add(new XYChart.Data(1996,0.9));
    psData.getData().add(new XYChart.Data(2000,0.7));
    psData.getData().add(new XYChart.Data(2004,0.9));
    psData.getData().add(new XYChart.Data(2008,5.4));

    // Create the data RKP
    XYChart.Series rkpData = new XYChart.Series<>();
    rkpData.setName("RKP");

    rkpData.getData().add(new XYChart.Data(1968,5.6));
    rkpData.getData().add(new XYChart.Data(1972,5.2));
    rkpData.getData().add(new XYChart.Data(1976,4.7));
    rkpData.getData().add(new XYChart.Data(1980,4.7));
    rkpData.getData().add(new XYChart.Data(1984,5.1));
    rkpData.getData().add(new XYChart.Data(1988,5.3));
    rkpData.getData().add(new XYChart.Data(1992,5.0));
    rkpData.getData().add(new XYChart.Data(1996,5.4));
    rkpData.getData().add(new XYChart.Data(2000,5.1));
    rkpData.getData().add(new XYChart.Data(2004,5.2));
    rkpData.getData().add(new XYChart.Data(2008,4.7));

    lineChart.getData().add(kokData);
    lineChart.getData().add(sdpData);
    lineChart.getData().add(keskData);
    lineChart.getData().add(vihrData);
    lineChart.getData().add(vasData);
    lineChart.getData().add(psData);
    lineChart.getData().add(rkpData);

    Scene view = new Scene(lineChart, 640, 480);
    stage.setScene(view);
    stage.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
