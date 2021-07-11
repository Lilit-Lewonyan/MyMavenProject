public class SignUpResponseBodyModel {
    private  String status;
    private  String message;
    private   String username;
    private  String key;
    private  String nextUrl;
    private   Response response;
    private  class Response{
        private  String id;
        private  String key;

    }

    public  void setStatus(String status) {
        this.status = status;
    }

    public  void setMessage(String message) {
        this.message = message;
    }

    public  void setUsername(String username) {
        this.username = username;
    }

    public  void setKey(String key) {
        this.key = key;
    }

    public  void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public  void setResponse(Response response) {
        this.response = response;
    }

    public  String getStatus() {
        return status;
    }

    public  String getMessage() {
        return message;
    }

    public  String getUsername() {
        return username;
    }

    public  String getKey() {
        return key;
    }

    public  String getNextUrl() {
        return nextUrl;
    }

    public  Response getResponse() {
        return response;
    }
}
