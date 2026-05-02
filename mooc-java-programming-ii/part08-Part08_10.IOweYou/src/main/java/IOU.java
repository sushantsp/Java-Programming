import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iouList;

    public IOU() {
        this.iouList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.iouList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.iouList.getOrDefault(toWhom, 0.0);
    }
}
