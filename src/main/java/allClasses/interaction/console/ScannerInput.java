package allClasses.interaction.console;

import allClasses.classInf.*;
import allClasses.collection.Collection;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerInput {

    public Worker addToCollection(){
        Scanner scanner = new Scanner(System.in);
        ScannerInput scannerInput = new ScannerInput();
        String name  = scannerInput.nextString(scanner.nextLine());
        Double salary = scannerInput.nextDouble(scannerInput.nextString(scanner.nextLine()));
        Position position = EnumManager.positionChoose();
        Status status = EnumManager.statusChoose();
        LocalDateTime startDate = scannerInput.nextLocalDateTime(scannerInput.nextString(scanner.nextLine()));
        ZonedDateTime birthday = ZonedDateTime.now()/*scannerInput.nextZonedDateTime(scannerInput.nextString(scanner.nextLine()))*/;
        Color color = EnumManager.colorChoose();
        Long weight = scannerInput.nextLong(scanner.nextLine());
        Country country = EnumManager.countryChoose();
        Double x = scannerInput.nextDouble(scannerInput.nextString(scanner.nextLine()));
        Float y = scannerInput.nextFloat(scannerInput.nextString(scanner.nextLine()));
        Worker worker = new Worker(name, salary, position, status, startDate, birthday, color, weight, country, x, y);
        return worker;
    }

    private final static Scanner scanner = new Scanner(System.in);
    public Long nextLong(String inputText) {
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
