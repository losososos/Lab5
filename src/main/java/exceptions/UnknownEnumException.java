package exceptions;

public class UnknownEnumException extends Exception{
    private int max;

    public UnknownEnumException(int max) {
        this.max = max;
    }

    public void printMessage() {
        System.out.println("\tНевозможно выбрать, выберите знечение 1-" + Integer.toString(getMax()));
    }

    public int getMax() {
        return max;
    }
}
