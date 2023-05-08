package allClasses.interaction.console;

import allClasses.classInf.*;
import allClasses.collection.Collection;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ScannerInput {

    public static Worker readWorker(){
        Worker worker = null;
        while (worker==null){
            worker = new Worker(
                    InputManager.declareName(),
                    InputManager.declareSalary(),
                    EnumManager.positionChoose(),
                    EnumManager.statusChoose(),
                    InputManager.declareStartDate(),
                    InputManager.declareBirthday(),
                    EnumManager.colorChoose(),
                    InputManager.declareWeight(),
                    EnumManager.countryChoose(),
                    InputManager.declareX(),
                    InputManager.declareY()
            );
        }
        return worker;
    }
    private final Scanner scanner = new Scanner(System.in);

    public Long nextLong() {
        Long value = null;
        String inputText = scanner.nextLine();
        boolean wasInput = false;
        while (!wasInput) {
            if (!inputText.isBlank())
                value = Long.valueOf(inputText);
            wasInput = true;
        }
        return value;
    }

    public Double nextDouble() {
        Double value = null;
        String inputText = scanner.nextLine();
        boolean wasInput = false;
        while (!wasInput) {
                if (!inputText.isBlank())
                    value = Double.valueOf(inputText);
                wasInput = true;
        }
        return value;
    }

    public Float nextFloat() {
        Float value = null;
        String inputText = scanner.nextLine();
        boolean wasInput = false;
        while (!wasInput) {
                if (!inputText.isBlank())
                    value = Float.valueOf(inputText);
                wasInput = true;
        }
        return value;
    }

    public Integer nextInt() {
        Integer value = null;
        String inputText = scanner.nextLine();
        boolean wasInput = false;
        while (!wasInput) {
            if (!inputText.isBlank())
                value = Integer.valueOf(inputText);
            wasInput = true;
        }
        return value;
    }

    public String nextString() {
        String value = null;
        String inputText = scanner.nextLine();
        boolean wasInput = false;
        while (!wasInput) {
            if (!inputText.isBlank()){
                value = inputText;
                wasInput = true;
            }else{
                return null;
            }
        }
        return value;
    }
    public LocalDateTime nextLocalDateTime(){
        boolean wasInput = false;
        String inputText = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime value = null;
        while (!wasInput) {
            if (!inputText.isBlank())
                value = LocalDateTime.parse(inputText, formatter);
            wasInput = true;
        }
        return value;
    }

    public ZonedDateTime nextZonedDateTime(String inputText){
//        System.out.println("Введите дату (yyyy-MM-dd HH:mm:ss am/pm +)");
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
