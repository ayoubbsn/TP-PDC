import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static BookManager instance;

    List<AbstractRoom> listofRooms;

    private BookManager() {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.listofRooms = new ArrayList<AbstractRoom>();
    }

    public static BookManager getInstance(String value) {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public void addChambreLuxury(int persons, Person person) {
        if (persons == 1) {
            Luxury luxtype = new Luxury().;
            AbstractRoom newroom = new SingleRoom(person,)
        } else if (persons == 2) {

        }
    }

}
