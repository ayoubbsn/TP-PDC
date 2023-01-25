public class Food {
    private int itemno;
    private int quantity ;
    private double price;

    public Food(int itemno, int quantity, double price) {
        this.itemno = itemno;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }
}
