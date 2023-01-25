public class Empty extends IState{

    public Empty(AbstractRoom room) {
        super.chambre = room;
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
