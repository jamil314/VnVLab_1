import java.util.ArrayList;

public class Customer extends ProductViewer {
    private long Id;
    private String name, address, phnNo;
    private Cart cart;

    public Customer(String name, String address, String phnNo) {
        this.name = name;
        this.address = address;
        this.phnNo = phnNo;
        this.Id = System.currentTimeMillis();
        cart = new Cart();
    }

    public String addToCart(Product product){
        return cart.addProduct(product);
    }

    public String deleteFromCart(Product product){
        return cart.removeProduct(product);
    }
    public String makePayment(double amount, String cardType, String cardNo){
        Payment payment = new Payment(Id, name, cardType, cardNo, amount);
        return "Paid "+payment.pay()+"$ with "+cardType;
    }

    public String buyProducts(String cardType, String cardNo){
        String paymentStatus = makePayment(cart.getPrice(), cardType, cardNo);
        Shop.getShop().admin.makeShipment(cart);
        cart.clear();
        return  paymentStatus;
    }
}
