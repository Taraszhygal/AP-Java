package Lab2.Task2;

public class Vegetable extends Plant{
    //static block
    static {
        System.out.println("Static block in Vegetable class");
    }
    //constructor
    public Vegetable(String soilType) {
        //parent constructor
        super(soilType);
        System.out.println("Constructor in Vegetable class");

    }
}
