import java.util.HashMap;
import java.util.Map;
import java.util.Set;;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productStocks.put(product, stock);
        this.productPrices.put(product, price);
    }

    public int price(String product) {
        if (productPrices.containsKey(product)) {
            return productPrices.get(product);
        }

        return -99; 
    }

    public int stock(String product) {
        if (productStocks.containsKey(product)) {
            return productStocks.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (productStocks.containsKey(product)) {
            if (productStocks.get(product) > 0) {
                int newStock = productStocks.get(product) - 1;
                productStocks.put(product, newStock);
                return true;
            }
        }
        return false;
    } 

    public Set<String> products() {
        return this.productStocks.keySet();
    }

}
