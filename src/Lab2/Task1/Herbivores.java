package Lab2.Task1;

public class Herbivores extends Animal {

    private String favouriteFood;

    //constructors
    public Herbivores() {
    }

    public Herbivores(String habitat,String herbivorType, int speed, String favouriteFood) {
        super( habitat, herbivorType, speed);
        this.favouriteFood=favouriteFood;
    }

    @Override
    boolean eat(Object obj) {
       if(obj instanceof Herb){
           return true;
       }
       return false;
    }
//polymorphism example
    @Override
    public String run(){
        return this.getType()+" average speed = " + this.getSpeed();
    }
}
