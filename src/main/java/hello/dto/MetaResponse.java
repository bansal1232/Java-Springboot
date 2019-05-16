package hello.dto;
public class MetaResponse {
    private String code;
    private String message;
    private String requestId;
    private String responseId;

    public MetaResponse(String code, String message, String requestId, String responseId) {
        this.code = code;
        this.message = message;
        this.requestId = requestId;
        this.responseId = responseId;
    }

//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getRequestId() {
//        return requestId;
//    }
//
//    public void setRequestId(String requestId) {
//        this.requestId = requestId;
//    }
//
//    public String getResponseId() {
//        return responseId;
//    }
//
//    public void setResponseId(String responseId) {
//        this.responseId = responseId;
//    }
}