package exceptions;

public class WrongDataException extends WarningException{
    @Override
    public String getMessage() {
        return "Неподходящие данные, не удалось сохранить";
    }
}
