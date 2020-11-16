package Lab2.Task1;

public abstract class Animal {

    private String habitat;
    private String type;
     private int speed;

 // constructors
    public Animal() {
    }

    public Animal(String habitat, String type, int speed) {
        this.habitat = habitat;
        this.type = type;
        this.speed = speed;
    }


//abstract method
    abstract boolean eat(Object obj);


    public String run(){
        return "" + speed;
    }


    //getters
    public String getHabitat() {
        return habitat;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

}
