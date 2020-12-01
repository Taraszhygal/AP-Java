package Lab3.Task1_CalcExept;

public class DivideByZeroException extends Exception {
    private String type;
    private String message;

    public DivideByZeroException(String type, String message) {
        super("Error:"+type+" log: "+message);
        this.type = type;
        this.message = message;
    }
}
