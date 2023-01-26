import java.util.List;

public class OrderFood {
    private List<Food> orederedFood;

    public OrderFood() {
        this.orederedFood = orederedFood;
    }
    public double calculatePrice(){
        double total = 0;
        for (Food food : this.orederedFood) {
            total += food.getQuantity() * food.getPrice();
        }
        return total;
    }
    public void add() {

    }

}
