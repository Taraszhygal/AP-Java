package Lab2.Task4;

import Lab2.Task1.*;

import java.util.ArrayList;

public class Task4_example {
        public static void main(String[] args) {
            //create Animal list from 1 Task
            ArrayList <Animal> animals = new ArrayList<>();

            //create and add items to list
            animals.add(new  Herbivores("Europe | USA","beaver",15,"bark"));
            animals.add(new Herbivores("Africa","rhinoceros",55,"bushes"));
            animals.add(new Carnivorous("Africa","lion",70,30));
            animals.add(new Carnivorous("Europe | USA","wolf",55, 42));

            // out animal speed
            for (Animal animal : animals) {
                System.out.println(animal.run()+" km/h");
            }




    }
}
