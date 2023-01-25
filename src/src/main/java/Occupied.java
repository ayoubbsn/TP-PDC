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
    public boolean dellocate() {
        this.room.setstate(new Empty(););

    }
}
