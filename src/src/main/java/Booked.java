public class Booked extends IState{

    public Booked(AbstractRoom room) {
        this.room = room;
    }

    @Override
    public boolean book() {
        return false;
    }

    @Override
    public boolean dellocate() {
        return false;
    }


}
