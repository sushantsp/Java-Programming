import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        } 

        double max = this.changeHistory.get(0);

        for (double change: this.changeHistory) {
            if (change>max) {
                max = change;
            }
        }

        return max;
    }

    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }

        double min = this.changeHistory.get(0);

        for (double change: this.changeHistory) {
            if (change < min) {
                min = change;
            }
        }
        return min;
    }

    public double average() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for(double change: this.changeHistory) {
            sum += change;
        }

        return sum/this.changeHistory.size();
    }

    public String toString() {
        return this.changeHistory.toString();
    }

}
