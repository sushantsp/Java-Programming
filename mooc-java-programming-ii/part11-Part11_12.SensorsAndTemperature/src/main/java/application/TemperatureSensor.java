package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean sensorStatus;

    public TemperatureSensor() {
        this.sensorStatus = false;
    }


    public boolean isOn() { // returns true if the sensor is on
        return this.sensorStatus;
    };    
    public void setOn() { // sets the sensor on
        this.sensorStatus = true;
    };      
    
    public void setOff() { // sets the sensor off
        this.sensorStatus = false;
    };     

    public int read() {

        if (this.sensorStatus) {
            int number = new Random().nextInt(61) - 30;
            return number;
        }

        throw new IllegalStateException("Sensor is off!");
        
        
    };        // returns the value of the sensor if it's on
}
