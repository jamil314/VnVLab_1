public class Product {
    private long Id;
    private double price;
    private String name, group, subgroup;

    public Product(String name, double price, String group, String subgroup){
        this.name = name;
        this.price = price;
        this.group = group;
        this.subgroup = subgroup;
        this.Id = System.currentTimeMillis();
    }

    public long getId() {
        return Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }
}
