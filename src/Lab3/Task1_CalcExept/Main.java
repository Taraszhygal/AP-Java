package Lab3.Task1_CalcExept;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static char operator;
    private static String[] operands;
    private static boolean loop = true;

    public static void main(String[] args) {
        while (loop) {
            // operator = ' ';
            boolean valid = true;
            System.out.println("Введіть вираз для обрахування або \"exit\" для виходу");
            //прийом введених  даних
            String inputString = in.nextLine();

            //перевірка на код виходу
            if (inputString.trim().equals("exit")) {
                loop = false;
                break;
            }

            //перевірка на корекнтність введеного знаку
            while (valid) {
                char[] chars = inputString.toCharArray();
                for (char c : chars) {
                    if (c == '/' || c == '*' || c == '+' || c == '-') {
                        operator = c;
                    }
                }
                //розбиття рядка на під-рядки даними знаками
                operands = inputString.split("[+-/*]");
                //якщо знак не зустріто то виведеться помилка
                if (operands.length == 1) {
                    System.err.println("Введено некоректний знак операції\nЩераз ведіть вираз для обрахування");
                    inputString = in.nextLine();
                } else valid = false;
            }

            // Обрахунок введених даних
            if (!valid) {
                try {
                    Calculator calculator = new Calculator(
                            Double.parseDouble(operands[0]),
                            Double.parseDouble(operands[1]),
                            operator);
                    System.out.println(calculator.calculate());
                } catch (DivideByZeroException e) {
                    System.out.println(e.getLocalizedMessage());
                }

            }
        }
        in.close();
    }

    // клас що відповідає за обрахунки
//    знаю що не бажано декілька класів в одному файлі , але для простоти перевірки зробив так\о/
    private static class Calculator {
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
        public double calculate() throws DivideByZeroException {
            double res = 0;
            switch (operation) {
                case '/':
                    if (operand2 == 0) {
                        throw new DivideByZeroException(" Arithmetical Exception", "Ви не можете ділити на ноль");
                    }
                    res = operand1 / operand2;
                    break;
                case '*':
                    res = operand1 * operand2;
                    break;
                case '-':
                    res = operand1 - operand2;
                    break;
                case '+':
                    res = operand1 + operand2;
                    break;
                default:
                    System.err.println("Введено некоректний знак операції");
            }
            return res;
        }
    }

}