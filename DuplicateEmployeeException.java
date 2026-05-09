public class DuplicateEmployeeException extends RuntimeException{

    public DuplicateEmployeeException() {}

    public DuplicateEmployeeException(String msg) {
        super(msg);
    }

    public DuplicateEmployeeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
