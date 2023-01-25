public class Empty implements IState{
    private  AbstractRoom room;

    public Empty(AbstractRoom room) {
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
