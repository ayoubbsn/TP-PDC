public class SingleRoom extends AbstractRoom{

    public SingleRoom(Person firstPerson, IType type, IState state) {
        super(firstPerson, type, state);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
