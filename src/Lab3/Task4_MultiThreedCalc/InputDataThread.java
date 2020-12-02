package Lab3.Task4_MultiThreedCalc;

import java.util.Scanner;

public class InputDataThread implements Runnable {
    public static Scanner in = new Scanner(System.in);
    public static char operator;
    public static String[] operands;
    @Override
    public synchronized void run() {
        validate();
    }
    //method that apply and validate input data
   public void validate(){
       System.out.println("Введіть вираз для обрахування");
       String inputString = in.nextLine();

       boolean valid=true;
       while (valid) {
           char[] chars = inputString.toCharArray();
           for (char c : chars) {
               if (c == '/' || c == '*' || c == '+' || c == '-') {
                   operator = c;
               }
           }
           operands = inputString.split("[+-/*]");
           if (operands.length == 1) {
               System.err.println("Введено некоректний знак операції\nЩераз ведіть вираз для обрахування");
               inputString = in.nextLine();
           } else valid = false;
       }
   }
}
