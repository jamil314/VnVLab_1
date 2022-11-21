import java.util.ArrayList;

public class Admin extends ProductViewer{
    private long Id;
    private String name;

    public Admin(String name) {
        this.name = name;
        this.Id = System.currentTimeMillis();
    }

    public String addProduct(Product product){
        Shop.getShop().products.add(product);
        return Shop.getShop().products.size()+" products in stock";
    }
    public String deleteProduct(Product product){
        Shop.getShop().products.remove(product);
        return Shop.getShop().products.size()+" products in stock";
    }

    public String modifyProduct(long Id, String name, double price, String group, String subgroup){
        for(Product product: Shop.getShop().products) if(product.getId() == Id){
            product.setPrice(price);
            product.setName(name);
            product.setGroup(group);
            product.setSubgroup(subgroup);
            return "Success";
        }
        return "Failed";
    }

    public String makeShipment(Cart cart){
        for(Product product:cart.products)
            deleteProduct(product);
        return cart.products.size()+" product(s) Shipped";
    }

    public String confirmDelivery(){
        return "Delevered";
    }



}
