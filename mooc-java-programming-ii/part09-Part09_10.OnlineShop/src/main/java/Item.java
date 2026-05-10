public class Item {

    private String product;
    private int quantity;
    private int productPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.productPrice = unitPrice;
    }

    public int price() {
        return this.productPrice * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity += 1;
    }

    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
