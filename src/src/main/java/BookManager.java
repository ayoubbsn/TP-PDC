import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static BookManager instance;

    List<AbstractRoom> listofRooms ;
    List<Person> listOfpersons ;
    private BookManager() {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.listOfpersons = new ArrayList<Person>();
        this.listofRooms = new ArrayList<AbstractRoom>();
    }
    public static BookManager getInstance(String value) {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

}
