package Lab2.Task1;

public class Carnivorous extends Animal {

    private int numberOfTeeth;
// constructors
    public Carnivorous() {
    }

    public Carnivorous(String habitat,String predatorType, int speed , int numberOfTeeth) {
       //parent constructor
        super(habitat,predatorType, speed);
        this.numberOfTeeth=numberOfTeeth;
    }

    // override method
    @Override
    boolean eat(Object obj) {
        if(obj instanceof Meat){
            return true;
        }
        return false;
    }

    // Polymorphism example
    @Override
    public String run(){
        return this.getType()+" speed in a jerk = " + this.getSpeed();
    }
}
