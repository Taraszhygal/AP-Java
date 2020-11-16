package Lab2.Task1;

public class Task1 {
    public static void main(String[] args) {
        //animal array initialisation
     Animal [] animals = {new Herbivores("Europe | USA","beaver",15,"bark"),
             new Herbivores("Africa","rhinoceros",55,"bushes"),
             new Carnivorous("Africa","lion",70,30),
             new Carnivorous("Europe | USA","wolf",55, 42),
     };
// Food instance
     Food cannabis = new Herb("cannabis","anywhere");

       // check for suitability
        for (Animal a : animals) {
            if(a.eat(cannabis)){
                System.out.println(a.getType()+ " really love eat cannabis");
            }else System.out.println(a.getType() + " won`t eat cannabis");
        }

        System.out.println("------------------------------------");
        // out animal speed
        for (Animal a : animals) {
            System.out.println(a.run()+" km/h");
        }
    }
}
