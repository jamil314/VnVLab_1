import java.util.ArrayList;

public class Shop {
    private static Shop onlineShop = null;
    Admin admin;
    ArrayList<Product> products;
    ArrayList<Customer> customers;

    public Shop() {
        admin = new Admin("Manager");
        products = new ArrayList<Product>();
        customers = new ArrayList<Customer>();

    }

    public static Shop getShop() {
        return onlineShop == null ? onlineShop = new Shop() : onlineShop ;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Admin getAdmin() {
        return admin;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
