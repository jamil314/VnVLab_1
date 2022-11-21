import java.util.ArrayList;

public class Cart {
    private long Id;
    private int numberOfProducts;
    ArrayList<Product>products;
    private double totalPrice;

    public Cart() {
        this.Id = System.currentTimeMillis();
        numberOfProducts = 0;
        totalPrice = 0;
        products = new ArrayList<Product>();
    }

    public String addProduct(Product product){
        this.products.add(product);
        this.numberOfProducts++;
        this.totalPrice += product.getPrice();
        return numberOfProducts+" products valued "+totalPrice;
    }

    public String removeProduct(Product product){
        this.products.remove(product);
        this.numberOfProducts--;
        this.totalPrice -= product.getPrice();
        return numberOfProducts+" products valued "+totalPrice;
    }

    public double getPrice(){
        return this.totalPrice;
    }

    public void clear(){
        numberOfProducts = 0;
        totalPrice = 0;
        products.clear();
    }
}
