public class Booked implements IState{

    private AbstractRoom room;

    public Booked(AbstractRoom room) {
        this.room = room;
    }

    @Override
    public boolean book() {
        return false;
    }

    @Override
    public Double calculatePrice() {
        return null;
    }
}
