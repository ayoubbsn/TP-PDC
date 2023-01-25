public class Occupied implements IState{
    private AbstractRoom room;

    public Occupied(AbstractRoom room) {
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
