public class Empty extends IState{

    public Empty(AbstractRoom room) {
        super.room = room;
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
