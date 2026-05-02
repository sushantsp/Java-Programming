public class Container {

    private int containerAmount;

    public Container() {
        this.containerAmount = 0;
    }

    public int contains() {
        return this.containerAmount;
    }

    public void add(int amount) {
        if (amount >= 0) {
            this.containerAmount += amount;
            if (this.containerAmount > 100) {
                this.containerAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            this.containerAmount -= amount;
            if (this.containerAmount < 0) {
                this.containerAmount = 0;
            }
        }
    }

    public String toString(){
        return this.containerAmount + "/100";
    }
}
