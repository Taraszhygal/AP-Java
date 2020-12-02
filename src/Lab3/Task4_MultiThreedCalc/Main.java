package Lab3.Task4_MultiThreedCalc;

public class Main {

    public static void main(String[] args) {
           //create 3 threads for input,calculate and output)
            Thread input = new Thread(new InputDataThread());
            Thread calculate = new Thread(new CalculationThread());
            Thread output = new Thread(new OutputThread());
            //run 1 thread
            input.start();
            //waiting for thread terminate
            try {
                input.join();
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
            //run 2 thread
            calculate.start();
            try {
                calculate.join();
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
            //run 3 thread
            output.start();
    }
}
