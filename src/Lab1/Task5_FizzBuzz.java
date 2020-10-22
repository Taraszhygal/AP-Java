package Lab1;

public class Task5_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
           //перевірка на кратність трьом, п'яти
            if (i%5==0&&i%3==0){
               System.err.print("FizzBuzz ");
           } else if (i%5==0){
               System.err.print("Buzz ");
           } else if (i%3==0){
               System.err.print("Fizz ");
           }else{ //стандартний вивід
               System.out.print(i+" ");
           }

            //перенос після 10 символів в рядку
            if (i%10==0){
                System.out.println();
            }

        }
    }
}
