package Lab2.Task5;

import java.util.Arrays;
import java.util.TreeSet;

public class Task5_example {
    public static void main(String[] args) {
        //create treeSet (save order)
        TreeSet <Integer> set = new TreeSet<>();
        //array for generation int
        int[] arr= new int[100];

        //generate and add to set numbers
        for (int i = 0; i < 100; i++) {
           arr[i] =  (int)(Math.random()* 7) + 1;
           set.add(arr[i]);
        }
        // output array
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("---------------------------");
        //output treeSet
        System.out.println("set = "+set);

    }
}
