import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (getTotalWeight() < this.capacity || item.getWeight() == 0) {
            this.items.add(item);
        }
        
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        for(Item item: this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
