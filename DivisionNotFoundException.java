public class DivisionNotFoundException extends Exception{
    
    public DivisionNotFoundException() {}

    public DivisionNotFoundException(String msg) {
        super(msg);
    }

    public DivisionNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
