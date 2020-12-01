package Lab3.Task2_UncheckExept;

public class InvalidDataException extends RuntimeException {
    private ErrorCode responseCode;
    private String fullDetail;
    private String conditions;

    public InvalidDataException(ErrorCode responseCode, String fullDetail, String conditions) {
        super("Error "+responseCode.CODE_400.getResponsesDetail()+"("+fullDetail+")\nInput error: "+ conditions);
        this.responseCode = responseCode;
        this.fullDetail = fullDetail;
        this.conditions = conditions;
    }
}
