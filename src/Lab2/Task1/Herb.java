package Lab2.Task1;

public class Herb extends Food{
    private String plantName;
    //constructors
    public Herb() {
    }

    public Herb(String name, String habitat) {
        super(habitat);
        this.plantName=name;
    }
}
