package allClasses.interaction.console;

import allClasses.classInf.Color;
import allClasses.classInf.Country;
import allClasses.classInf.Position;
import allClasses.classInf.Status;

import java.util.Objects;
import java.util.Scanner;

public class EnumManager {
    private static final ScannerInput enumScanner = new ScannerInput();


    public static Color colorChoose() {
        Color option = null;
        while (option==null) {
            switch (InputManager.declareEnum(4,"color")) {
                case (1):
                    option = Color.BLACK;
                    break;
                case (2):
                    option = Color.GREEN;
                    break;
                case (3):
                    option = Color.WHITE;
                    break;
                case (4):
                    option = Color.YELLOW;
                    break;
                default:
                    break;
            }
            ;
        }
        return option;
    }

    public static Country countryChoose() {
        Country option = null;
        while (option == null) {
            switch (InputManager.declareEnum(4,"country")) {
                case (1):
                    option = Country.FRANCE;
                    break;
                case (2):
                    option = Country.INDIA;
                    break;
                case (3):
                    option = Country.ITALY;
                    break;
                case (4):
                    option = Country.VATICAN;
                    break;
                default:
                    break;
            }
            ;
        }
        return option;
    }

    public static Position positionChoose() {
        Position option = null;
        while (option == null) {
            switch (InputManager.declareEnum(4,"position")) {
                case (1):
                    option = Position.CLEANER;
                    break;
                case (2):
                    option = Position.COOK;
                    break;
                case (3):
                    option = Position.ENGINEER;
                    break;
                case (4):
                    option = Position.HEAD_OF_DIVISION;
                    break;
                default:
                    break;
            }
            ;
        }
        return option;
    }

    public static Status statusChoose() {
        Status option = null;
        while (option == null) {
            switch (InputManager.declareEnum(4,"status")) {
                case (1):
                    option = Status.FIRED;
                    break;
                case (2):
                    option = Status.REGULAR;
                    break;
                case (3):
                    option = Status.RECOMMENDED_FOR_PROMOTION;
                    break;
                default:
                    break;
            }
            ;
        }
        return option;
    }
}
