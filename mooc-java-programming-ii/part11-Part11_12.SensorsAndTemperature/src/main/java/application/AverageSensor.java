package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings = new ArrayList<>();

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }


    public boolean isOn() { // returns true if the sensor is on
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    };    
    public void setOn() { // sets the sensor on
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    };      
    
    public void setOff() { // sets the sensor off
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }

    };     

    public int read() {
        if (isOn()) {
            int average = 0;
            for (Sensor sensor : sensors) {
                average += sensor.read();
                
            }

            average = average/this.sensors.size();
            readings.add(average);
            return average;
        }

        throw new IllegalStateException("Sensors are off!");
    }; 

    public List<Integer> readings() {

        return readings;
    }
}
