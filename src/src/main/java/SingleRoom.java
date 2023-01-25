public class SingleRoom extends AbstractRoom{

    public SingleRoom(Person firstPerson, IType type, IState state) {
        super(firstPerson, type, state);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
    @Override
    public void setstate(IState state){
        super.state = state;
    }
    public void resetpersonne(){
        super.firstPerson = null;
        if (instanceof(super.room)==Doubleroom){
            this.secondPerson = null;
        }
    }
}
