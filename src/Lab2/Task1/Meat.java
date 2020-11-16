package Lab2.Task1;

public class Meat extends Food{
    private String meatOwner;

    //constructors
    public Meat() {
    }

    public Meat(String meatOwner, String habitat) {
        super(habitat);
        this.meatOwner=meatOwner;
    }
}
