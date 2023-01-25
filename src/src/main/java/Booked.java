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

    public boolean confirmbook(){
        this.room.state = new occupied();
    }
    public boolean deletebook(){
        this.room.state = new Empty();
    }
}
