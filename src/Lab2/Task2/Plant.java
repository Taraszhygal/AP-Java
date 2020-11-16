package Lab2.Task2;

public class Plant {
static String livelihood;
 private  String soilType;
    //static block
    static {
        livelihood = "water";
        System.out.println("Static block in Plant class");
    }
    //constructor
    public Plant(String soilType) {
        this.soilType = soilType;
        System.out.println("Constructor in Plant class");
    }
}
