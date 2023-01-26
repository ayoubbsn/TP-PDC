import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name ;
    private Integer number ;
    private char gender ; // male or female
    List<OrderFood> orders ;

    public Person(String name, Integer number, char gender) {
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.orders = new ArrayList<OrderFood>();
    }
    public void addFood(OrderFood order){
        this.orders.add(order);
    }

}
