import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = Shop.getShop();

        Product burger = new Product("Chicken Burger", 15, "Food", "Fast food");
        Product book = new Product("Dance of Dragons", 20, "Book", "Thriller");
        Product racket = new Product("Racket", 35, "Sports", "Badminton");

        shop.admin.addProduct(burger);
        shop.admin.addProduct(book);
        shop.admin.addProduct(racket);

        Guest guest = new Guest();
        guest.viewProducts();

        Customer jamil = guest.getRegistered("Jamil", "Mirabazar", "01786623305");
        jamil.viewProducts();
        jamil.addToCart(racket);
        jamil.addToCart(burger);
        jamil.buyProducts("Visa", "9127832190");

        shop.admin.confirmDelivery();

        guest.viewProducts();
    }
}
