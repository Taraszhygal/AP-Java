package Lab2.Task2;

public class Potato extends Vegetable {
    //static block
    static {
        System.out.println("Static block in Potato class");

    }
    //constructor
    public Potato(String soilType) {
        super(soilType);
        System.out.println("Constructor in Potato class");
    }
}
