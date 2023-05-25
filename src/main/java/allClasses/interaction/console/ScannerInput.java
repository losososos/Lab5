package allClasses.interaction.console;

import allClasses.classInf.*;
import exceptions.WarningException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
        String inputText = scanner.nextLine().trim();
        boolean wasInput = false;
        try {
        while (!wasInput) {
                if (!inputText.isBlank())
                    value = Long.valueOf(inputText);
                wasInput = true;
            }
        } catch (NumberFormatException e) {
            new WarningException("Ввод должен быть числом").printMessage();
        }
        return value;
    }

    public Double nextDouble() {
        Double value = null;
        String inputText = scanner.nextLine().trim();
        boolean wasInput = false;
        try {
            while (!wasInput) {
                    if (!inputText.isBlank())
                        value = Double.valueOf(inputText);
                    wasInput = true;
            }
        } catch (NumberFormatException e) {
            new WarningException("Ввод должен быть числом").printMessage();
        }
        return value;
    }

    public Float nextFloat() {
        Float value = null;
        String inputText = scanner.nextLine().trim();
        boolean wasInput = false;
        try {
            while (!wasInput) {
                    if (!inputText.isBlank())
                        value = Float.valueOf(inputText);
                    wasInput = true;
            }
        } catch (NumberFormatException e) {
            new WarningException("Ввод должен быть числом").printMessage();
        }
        return value;
    }

    public Integer nextInt() {
        Integer value = 0;
        String inputText = scanner.nextLine().trim();
        boolean wasInput = false;
        try {
            while (!wasInput) {
                    if (!inputText.isBlank() & inputText!=null)
                        value = Integer.valueOf(inputText);
                    wasInput = true;
            }
        }catch (NumberFormatException e){
            new WarningException("Ввод должен быть числом").printMessage();
        }
        return value;
    }

    public String nextString() {
        String value = null;
        String inputText = scanner.nextLine().trim();
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
        String inputText = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime value = null;
        try {
            while (!wasInput) {
                try {
                    if (!inputText.isBlank())
                        value = LocalDateTime.parse(inputText, formatter);
                    wasInput = true;
                } catch (NumberFormatException e) {
                    new WarningException("Неверный формат даты").printMessage();
                }
            }
        }catch (DateTimeParseException e){
            new WarningException("Формат ввода даты: yyyy-MM-dd HH:mm").printMessage();
        }
        return value;
    }

    public LocalDate nextLocalDate(){
        boolean wasInput = false;
        String inputText = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate value = null;
        try {
            while (!wasInput) {
                try {
                    if (!inputText.isBlank())
                        value = LocalDate.parse(inputText, formatter);
                    wasInput = true;
                } catch (NumberFormatException e) {
                    new WarningException("Неверный формат даты").printMessage();
                }
            }
        }catch (DateTimeParseException e){
            new WarningException("Формат ввода даты: yyyy/MM/dd").printMessage();
        }
        return value;
    }

}
