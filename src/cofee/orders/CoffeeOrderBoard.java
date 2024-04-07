package cofee.orders;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {

    private Queue<Order> orders;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void add(Order order) {
        orders.add(order);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.poll();
            System.out.println("Issuance of order # " + nextOrder.getOrderNumber() +
                    " for " + nextOrder.getCustomerName() + ".");
        } else {
            System.out.println("There are no orders.");
        }
    }

    public void deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                System.out.println("Issuance of order # " + order.getOrderNumber() +
                        " for " + order.getCustomerName() + ".");
                orders.remove(order);
                return;
            }
        }
        System.out.println("Order # " + orderNumber + " is available.");
    }

    public void draw() {
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}
