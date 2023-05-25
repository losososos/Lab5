package exceptions;

public class NullDocumentException extends WarningException {
    @Override
    public String getMessage() {
        return "Документ не найден, не удалось сохранить";
    }
}
