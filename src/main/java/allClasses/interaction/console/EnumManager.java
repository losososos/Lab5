package allClasses.interaction.console;

import allClasses.classInf.Color;
import allClasses.classInf.Country;
import allClasses.classInf.Position;
import allClasses.classInf.Status;
import exceptions.UnknownEnumException;

public class EnumManager {
    private static final ScannerInput enumScanner = new ScannerInput();


    public static Color colorChoose() {
        Color option = null;
        while (option==null) {
            switch (InputManager.declareEnum(4, "color")) {
                case (1) -> option = Color.BLACK;
                case (2) -> option = Color.GREEN;
                case (3) -> option = Color.WHITE;
                case (4) -> option = Color.YELLOW;
                default -> {new UnknownEnumException(4).printMessage();
                }
            }
            ;
        }
        return option;
    }

    public static Country countryChoose() {
        Country option = null;
        while (option == null) {
            switch (InputManager.declareEnum(4, "country")) {
                case (1) -> option = Country.FRANCE;
                case (2) -> option = Country.INDIA;
                case (3) -> option = Country.ITALY;
                case (4) -> option = Country.VATICAN;
                default -> {new UnknownEnumException(4).printMessage();
                }
            }
            ;
        }
        return option;
    }

    public static Position positionChoose() {
        Position option = null;
        while (option == null) {
            switch (InputManager.declareEnum(4, "position")) {
                case (1) -> option = Position.CLEANER;
                case (2) -> option = Position.COOK;
                case (3) -> option = Position.ENGINEER;
                case (4) -> option = Position.HEAD_OF_DIVISION;
                default -> {new UnknownEnumException(4).printMessage();
                }
            }
            ;
        }
        return option;
    }

    public static Status statusChoose() {
        Status option = null;
        while (option == null) {
            switch (InputManager.declareEnum(3, "status")) {
                case (1) -> option = Status.FIRED;
                case (2) -> option = Status.REGULAR;
                case (3) -> option = Status.RECOMMENDED_FOR_PROMOTION;
                default -> {new UnknownEnumException(3).printMessage();
                }
            }
            ;
        }
        return option;
    }
}
