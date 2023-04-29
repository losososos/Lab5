package allClasses.interaction.console;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerInput {
    private final static Scanner scanner = new Scanner(System.in);
    public Long nextLong(String inputText) {
        System.out.println("Введите число");
        Long value = null;
        boolean wasInput = false;
        while (!wasInput) {
//            System.out.print(inputText);
//            String inputValue = scanner.nextLine();
            if (!inputText.isBlank())
                value = Long.valueOf(inputText);
            wasInput = true;
        }
        return value;
    }

    public Double nextDouble(String inputText) {
        System.out.println("Введите число");
        Double value = null;
        boolean wasInput = false;
        while (!wasInput) {
//            System.out.print(inputText);
//            String inputValue = scanner.nextLine();
                if (!inputText.isBlank())
                    value = Double.valueOf(inputText);
                wasInput = true;
        }
        return value;
    }

    public Float nextFloat(String inputText) {
        System.out.println("Введите число");
        Float value = null;
        boolean wasInput = false;
        while (!wasInput) {
//            System.out.print(inputText);
//            String inputValue = scanner.nextLine();
                if (!inputText.isBlank())
                    value = Float.valueOf(inputText);
                wasInput = true;
        }
        return value;
    }

    public Integer nextInt(String inputText) {
        System.out.println("Введите число");
        Integer value = null;
        boolean wasInput = false;
        while (!wasInput) {
//            System.out.print(inputText);
//            String inputValue = scanner.nextLine();
            if (!inputText.isBlank())
                value = Integer.valueOf(inputText);
            wasInput = true;
        }
        return value;
    }

    public String nextString(String inputText) {
        System.out.println("Введите строку");
        String value = null;
        boolean wasInput = false;
        while (!wasInput) {
            if (inputText.trim().length() != 0 & inputText != null){
                value = inputText;
                wasInput = true;
            }else {
                System.out.println("Пустое значение. Введите значение");
                inputText = scanner.nextLine();
            }
//            System.out.print(inputText);
//            value = scanner.nextLine();
        }
        return value;
    }
    public LocalDateTime nextLocalDateTime(String inputText){
        System.out.println("Введите дату (yyyy-MM-dd HH:mm)");
        boolean wasInput = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime value = null;
        while (!wasInput) {
//            System.out.print(inputText);
//            String inputValue = scanner.nextLine();
            if (!inputText.isBlank())
                value = LocalDateTime.parse(inputText, formatter);
            wasInput = true;
        }
        return value;
    }

    public ZonedDateTime nextZonedDateTime(String inputText){
        System.out.println("Введите дату (yyyy-MM-dd HH:mm:ss am/pm +)");
        boolean wasInput = false;
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss VV");
        ZonedDateTime value = null;
//        while (!wasInput) {
//            System.out.print(inputText);
//            String inputValue = scanner.nextLine();
            if (!inputText.isBlank()){
                value = ZonedDateTime.parse(inputText, formatter);
                wasInput = true;
            }
        return value;
    }

}
