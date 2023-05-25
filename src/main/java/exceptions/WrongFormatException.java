package exceptions;

public class WrongFormatException extends Exception{
    private String format = "";

    public WrongFormatException(String format) {
        this.format = format;
    }

    public void printMessage() {
        System.out.println("\tНеверный формат введенных данных, предполагается " + format);
    }

    public String getFormat() {
        return format;
    }
}
