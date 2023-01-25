import java.util.List;

public class Orders {
    private List<Food> orederedFood;

    public Orders() {
        this.orederedFood = orederedFood;
    }
    public double calculatePrice(){
        double total = 0;
        for (Food food : this.orederedFood) {
            total += food.getQuantity() * food.getPrice();
        }
        return total;
    }

}
