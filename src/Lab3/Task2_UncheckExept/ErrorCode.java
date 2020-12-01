package Lab3.Task2_UncheckExept;

public enum ErrorCode {
            CODE_500("Code: 500  -  Desc: Server error responses"),
            CODE_400("Code: 400  -  Desc: Client error responses "),
            CODE_200("Code: 200  -  Desc: Successful responses");

            private String responsesDetail;

    ErrorCode(String responsesDetail) {
        this.responsesDetail = responsesDetail;
    }

    public String getResponsesDetail() {
        return responsesDetail;
    }

}
