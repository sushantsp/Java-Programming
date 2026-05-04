public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory warhouseHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.warhouseHistory = new ChangeHistory();
        this.warhouseHistory.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.warhouseHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amt = super.takeFromWarehouse(amount);
        this.warhouseHistory.add(super.getBalance());

        return amt;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.warhouseHistory);
        System.out.println("Largest amount of product: " + this.warhouseHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.warhouseHistory.minValue());
        System.out.println("Average: " + this.warhouseHistory.average());

    }
    public String history() {
        return this.warhouseHistory.toString();
    }
}
