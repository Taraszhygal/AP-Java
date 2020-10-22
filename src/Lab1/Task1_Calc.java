package Lab1;

import java.util.Scanner;

public class Task1_Calc {
    private static Scanner in = new Scanner(System.in);
    private static String s;
    private static char operator;
    private static String[]s2;
    private static boolean valid = true;
    private static boolean loop = true;
    public static void main(String[] args) {
       while (loop){
        operator=' ';
        valid=true;
        System.out.println("Введіть вираз для обрахування");
        //прийом введених  даних
        s = in.nextLine();

        //перевірка на корекнтність введеного знаку
        while (valid) {
            char[] chars = s.toCharArray();
            for (char c: chars) {
                if(c=='/'||c=='*'||c=='+'||c=='-') {
                    operator = c;
                }
            }
            //розбиття рядка на під-рядки даними знаками
            s2=s.split("[+-/*]");
            //якщо знак не зустріто то виведеться помилка
            if(s2.length==1){
            System.err.println("Введено некоректний знак операції\nЩераз ведіть вираз для обрахування");
            s = in.nextLine();}else valid=false;
        }

        // Обрахунок введених даних
        Calculator calculator=new Calculator(Double.parseDouble(s2[0]),Double.parseDouble(s2[1]),operator);
        System.out.println(calculator.calculate());
       }
        in.close();
    }

// клас що відповідає за обрахунки
//    знаю що не бажано декілька класів в одному файлі , але для простоти перевірки зробив так\о/
    private static class Calculator{
        final double operand1;
        final double operand2;
        final char operation;
//конструктор класу
        public Calculator(double num1, double num2, char operation) {
            this.operand1 = num1;
            this.operand2 = num2;
            this.operation = operation;
        }
// метод для обрахунку
        public double calculate(){
            double res=-1;
            try{
                switch (operation){
                case '/' :
                    if (operand2==0){
                        System.err.println("Ділення на ноль заборонено");
                    }
                    res = operand1/operand2;
                    break;
                case '*' :
                    res = operand1*operand2;
                    break;
                case '-' :
                    res = operand1-operand2;
                    break;
                case '+' :
                    res = operand1+operand2;
                    break;
                default:
                    System.err.println("Введено некоректний знак операції");
                }
            }catch (ArithmeticException e){
                System.err.println(e);
            }
            return res;}
    }

}