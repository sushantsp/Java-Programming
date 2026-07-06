package application;

public class StandardSensor implements Sensor{

    private int sensorReading;

    public StandardSensor(int number) {
        this.sensorReading = number;
    }


    public boolean isOn() { // returns true if the sensor is on
        return true;
    };    
    public void setOn() { // sets the sensor on
        return;
    };      
    
    public void setOff() { // sets the sensor off
        return;
    };     

    public int read() {
        return this.sensorReading;
    };        // returns the value of the sensor if it's on
}
