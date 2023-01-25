public abstract class AbstractRoom {
    protected Person firstPerson ;
    protected IType type;
    protected IState state;

    public AbstractRoom(Person firstPerson, IType type, IState state) {
        this.firstPerson = firstPerson;
        this.type = type;
        this.state = state;
    }

    public abstract double calculatePrice();
    public IType getType(){return this.type;}
    public IState getState(){return this.state;}
    public void setstate(String state){};
    public void resetperson(){};

}
