package allClasses.interaction.console;

import exceptions.WarningException;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static allClasses.interaction.console.CommandCaller.executed;

public class InputManager {
    private static final ScannerInput scannerInput = new ScannerInput();

    public static String declareCommand() {
        String command = null;
        while (command == null) {
            System.out.println("<Введите команду>");
            command = scannerInput.nextString();
            if (!executed) {
                new WarningException("Неизвестная команда, help - для помощи").printMessage();
            }
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

    public static String declareString() {
        String string = null;
        while (string == null) {
            System.out.println("<Строка>");
            string = scannerInput.nextString();
        }
        return string;
    }

    protected static LocalDateTime declareStartDate() {
        LocalDateTime startDate = null;
        while (startDate == null) {
            System.out.println("<Дата начала (yyyy-MM-dd HH:mm)>");
            startDate = scannerInput.nextLocalDateTime();
        }
        return startDate;
    }

    protected static LocalDate declareBirthday() {
        LocalDate birthday = null;
        while (birthday == null) {
            System.out.println("<Дата рождения (yyyy-MM-dd)>");
            birthday = scannerInput.nextLocalDate();
        }
        return birthday;
    }

    public static Double declareSalary() {
        Double salary = null;
        while (salary == null) {
            System.out.println("<Зарплата>");
            salary = scannerInput.nextDouble();
        }
        return salary;
    }

    public static Long declareWeight() {
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

    public static Long declareId() {
        Long id = null;
        while (id == null) {
            System.out.println("<Id>");
            id = scannerInput.nextLong();
        }
        return id;
    }

    protected static Float declareY() {
        Float y = null;
        while (y == null) {
            System.out.println("<Координата Y>");
            y = scannerInput.nextFloat();
        }
        return y;
    }

    public static String declareFile() {
        String file = null;
        while (file == null) {
            System.out.println("<Имя файла>");
            file = scannerInput.nextString();
        }
        return file;
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