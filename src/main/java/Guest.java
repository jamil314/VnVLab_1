import java.util.ArrayList;

public class Guest extends ProductViewer{
    public Customer getRegistered(String name, String address, String phnNo) {
        Customer customer = new Customer(name, address, phnNo);
        Shop.getShop().customers.add(customer);
        return customer;
    }
}
