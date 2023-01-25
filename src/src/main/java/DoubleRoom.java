public class DoubleRoom extends AbstractRoom {
    private Person secondPerson;
    public DoubleRoom(Person firstPerson, IType type, IState state,Person secondPerson) {
        super(firstPerson, type, state);
        this.secondPerson = secondPerson;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
