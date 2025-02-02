public class CustomException extends Exception {
    
    String str;

    public CustomException() {
        //default constructor
    }

    public CustomException(String str) {
        super(str); // pass the value to to base class constructor
    }
}
