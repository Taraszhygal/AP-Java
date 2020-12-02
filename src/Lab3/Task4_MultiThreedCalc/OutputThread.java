package Lab3.Task4_MultiThreedCalc;

public class OutputThread implements Runnable {
    @Override
    public synchronized void run() {
        // output static var result
           System.out.println("result = "+CalculationThread.result);
    }
}

