import java.util.ArrayList;

public class ProductViewer {
    public ArrayList<Product> viewProducts(){
        return Shop.getShop().getProducts();
    }
}
