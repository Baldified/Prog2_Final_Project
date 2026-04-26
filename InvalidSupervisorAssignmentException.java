public class InvalidSupervisorAssignmentException extends Exception{
    
    public InvalidSupervisorAssignmentException() {}

    public InvalidSupervisorAssignmentException(String msg) {
        super(msg);
    }

    public InvalidSupervisorAssignmentException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
