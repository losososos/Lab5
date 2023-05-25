package exceptions;

public class NoFileException extends WarningException {
    @Override
    public String getMessage() {
        return "Файл не найден";
    }
}
