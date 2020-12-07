package Lab3.Task2_UncheckExept;

public class InvalidDataException extends RuntimeException {
    private ResponseCode responseCode;
    private String fullDetail;
    private String conditions;

    public InvalidDataException(ResponseCode responseCode, String fullDetail, String conditions) {
        super("Error "+responseCode.CODE_400.getResponsesDetail()+"("+fullDetail+")\nInput error: "+ conditions);
        this.responseCode = responseCode;
        this.fullDetail = fullDetail;
        this.conditions = conditions;
    }
}
