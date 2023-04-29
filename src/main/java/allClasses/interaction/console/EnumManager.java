package allClasses.interaction.console;

import allClasses.classInf.Color;
import allClasses.classInf.Country;
import allClasses.classInf.Position;
import allClasses.classInf.Status;
import allClasses.interaction.console.ConsoleInput;
import allClasses.interaction.console.InputManager;

import java.util.Scanner;

public class EnumManager {
    private final static Scanner enumScanner = new Scanner(System.in);
    public static Color colorChoose() {
        System.out.println("Выберите цвет");
        System.out.println("1 - Black, 2 - Green, 3 - White, 4 - Yellow");
        return switch (enumScanner.nextInt()) {
            case (1) -> Color.BLACK;
            case (2) -> Color.GREEN;
            case (3) -> Color.WHITE;
            case (4) -> Color.YELLOW;
            default -> null;
        };
    }

    public static Country countryChoose() {
        System.out.println("Выберите страну");
        System.out.println("1 - France, 2 - India, 3 - Italy, 4 - Vatican");
        return switch (enumScanner.nextInt()) {
            case (1) -> Country.FRANCE;
            case (2) -> Country.INDIA;
            case (3) -> Country.ITALY;
            case (4) -> Country.VATICAN;
            default -> null;
        };
    }
    public static Position positionChoose() {
        System.out.println("Выберите позицию");
        System.out.println("1 - France, 2 - India, 3 - Italy, 4 - Vatican");
        return switch (enumScanner.nextInt()) {
            case (1) -> Position.CLEANER;
            case (2) -> Position.COOK;
            case (3) -> Position.ENGINEER;
            case (4) -> Position.HEAD_OF_DIVISION;
            default -> null;
        };
    }
    public static Status statusChoose() {
        System.out.println("Выберите статус");
        System.out.println("1 - Fired, 2 - Regular, 3 - Recommended for promotion");
        return switch (enumScanner.nextInt()) {
            case (1) -> Status.FIRED;
            case (2) -> Status.REGULAR;
            case (3) -> Status.RECOMMENDED_FOR_PROMOTION;
            default -> null;
        };
    }
}
