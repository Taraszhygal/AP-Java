package Lab3.Task4_MultiThreedCalc;

import Lab3.Task1_CalcExept.DivideByZeroException;
import Lab3.Task1_CalcExept.Main;

public class  CalculationThread implements Runnable {
     public static double result;
    @Override
    public synchronized void run() {
        try {
            //create object for method calculate call
            Main.Calculator calculator = new Main.Calculator(Double.parseDouble(InputDataThread.operands[0]),
                    Double.parseDouble(InputDataThread.operands[1]),
                    InputDataThread.operator);
            // method call and return result to var
            result = calculator.calculate();
        } catch (DivideByZeroException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}