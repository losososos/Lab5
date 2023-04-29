package allClasses.commands;

import allClasses.classInf.*;

import allClasses.collection.Collection;
import allClasses.interaction.console.EnumManager;
import allClasses.interaction.console.ScannerInput;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Add{

    public static void addToCollection(){
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
        Collection.addWorker(worker);
    }
//    Scanner scanner = new Scanner(System.in);
//    ScannerInput scannerInput = new ScannerInput();
//    String name = scannerInput.nextString(scanner.nextLine());
//    Double salary = scannerInput.nextDouble(scannerInput.nextString(scanner.nextLine()));
//    Position position = EnumManager.positionChoose();
//    Status status = EnumManager.statusChoose();
//    LocalDateTime startDate = scannerInput.nextLocalDateTime(scannerInput.nextString(scanner.nextLine()));
//    ZonedDateTime birthday = scannerInput.nextZonedDateTime(scannerInput.nextString(scanner.nextLine()));
//    Color color = EnumManager.colorChoose();
//    Long weight = scannerInput.nextLong(scanner.nextLine());
//    Country country = EnumManager.countryChoose();
//    Double x = scannerInput.nextDouble(scannerInput.nextString(scanner.nextLine()));
//    Float y = scannerInput.nextFloat(scannerInput.nextString(scanner.nextLine()));
//
//    static Worker worker = new Worker(name, salary, position, status, startDate, birthday, color, weight, country, x, y);

//    Collection.addWorker(worker);

}
