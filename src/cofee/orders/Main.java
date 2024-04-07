package cofee.orders;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add(new Order("Alen"));
        orderBoard.add(new Order("Yoda"));
        orderBoard.add(new Order("Obi-van"));
        orderBoard.add(new Order("John Snow"));
        orderBoard.add(new Order("Aria Stark"));
        orderBoard.add(new Order("C3-PO"));

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.deliver(27);
        orderBoard.deliver(33);
        orderBoard.deliver(2);
        orderBoard.deliver(4);
        orderBoard.deliver(4);

        orderBoard.draw();
    }
}
