package exceptions;

public class EmptyCollectionException extends WarningException{
    @Override
    public String getMessage() {
        return "\tКоллекция пуста, невозможно выполнить программу";
    }
}
