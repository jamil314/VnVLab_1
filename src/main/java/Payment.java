public class Payment {
    private long customerId;
    private String name, cardType, cardNo;
    private double amount;

    public Payment(long customerId, String name, String cardType, String cardNo, double amount) {
        this.customerId = customerId;
        this.name = name;
        this.cardType = cardType;
        this.cardNo = cardNo;
        this.amount = amount;
    }

    public double pay(){
        return amount;
    }
}
