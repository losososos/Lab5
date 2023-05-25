package exceptions;

public class WarningException extends Exception {

    private String message = "";
    public WarningException() {
    }

    public WarningException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("\t" + getMessage());
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "\t" + getMessage();
    }
}
