package allClasses.interaction.console;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class  InputManager {
    private static final ScannerInput scannerInput = new ScannerInput();

    protected static String declareCommand() {
        String command = null;
        while (command == null) {
            System.out.println("<Введите команду>");
            command = scannerInput.nextString();
        }
        return command;
    }

    public static String declareName() {
        String name = null;
        while (name == null) {
            System.out.println("<Имя>");
            name = scannerInput.nextString();
        }
        return name;
    }

    protected static LocalDateTime declareStartDate() {
        LocalDateTime startDate = null;
        while (startDate == null) {
            System.out.println("<Дата (yyyy-MM-dd HH:mm)>");
            startDate = scannerInput.nextLocalDateTime();
        }
        return startDate;
    }
    protected static ZonedDateTime declareBirthday() {
        ZonedDateTime birthday = null;
//        while (birthday == null) {
//            System.out.println("Дата (yyyy-MM-dd HH:mm:ss VV)>");
//            birthday = scannerInput.nextZonedDateTime(scanner.nextLine());
//        }
        birthday = ZonedDateTime.now();
        return birthday;
    }

    protected static Double declareSalary() {
        Double salary = null;
        while (salary == null) {
            System.out.println("<Зарплата>");
            salary = scannerInput.nextDouble();
        }
        return salary;
    }

    protected static Long declareWeight() {
        Long weight = null;
        while (weight == null) {
            System.out.println("<Вес>");
            weight = scannerInput.nextLong();
        }
        return weight;
    }

    protected static Double declareX() {
        Double x = null;
        while (x == null) {
            System.out.println("<Координата X>");
            x = scannerInput.nextDouble();
        }
        return x;
    }

    protected static Float declareY() {
        Float y = null;
        while (y == null) {
            System.out.println("<Координата Y>");
            y = scannerInput.nextFloat();
        }
        return y;
    }

    protected static int declareEnum(int amountOfOptions, String enumOption) {
        Integer numEnum = 0;
        while (numEnum == null | numEnum < 1 | numEnum > amountOfOptions) {
            switch (enumOption) {
                case ("color") -> {
                    System.out.println("<Выберите цвет>");
                    System.out.println("(1 - Black, 2 - Green, 3 - White, 4 - Yellow)");
                }
                case ("position") -> {
                    System.out.println("<Выберите позицию>");
                    System.out.println("(1 - Cleaner, 2 - Cook, 3 - Engineer, 4 - Head of Division)");
                }
                case ("country") -> {
                    System.out.println("<Выберите страну>");
                    System.out.println("(1 - France, 2 - India, 3 - Italy, 4 - Vatican)");
                }
                case ("status") -> {
                    System.out.println("<Выберите статус>");
                    System.out.println("(1 - Fired, 2 - Regular, 3 - Recommended for promotion)");
                }
            }
            ;
            numEnum = scannerInput.nextInt();
        }
        return numEnum;
    }
}