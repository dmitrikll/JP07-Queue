package cofee.orders;

public class Order {

    private int orderCounter = 0;
    private int orderNumber;
    private String customerName;

    public Order(String customerName) {
        this.orderNumber = orderCounter += 1;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
