package allClasses.interaction.console;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class  InputManager {
    private static final ScannerInput scannerInput = new ScannerInput();
    private static final Scanner scanner = new Scanner(System.in);

    protected static String declareName() {
        String name = null;
        while (name == null) {
            System.out.println("Имя>");
            name = scannerInput.nextString(scanner.nextLine());
        }
        return name;
    }

    protected static LocalDateTime declareStartDate() {
        LocalDateTime startDate = null;
        while (startDate == null) {
            System.out.println("Дата (yyyy-MM-dd HH:mm)>");
            startDate = scannerInput.nextLocalDateTime(scanner.nextLine());
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
            System.out.println("Зарплата>");
            salary = scannerInput.nextDouble(scanner.nextLine());
        }
        return salary;
    }

    protected static Long declareWeight() {
        Long weight = null;
        while (weight == null) {
            System.out.println("Вес>");
            weight = scannerInput.nextLong(scanner.nextLine());
        }
        return weight;
    }

    protected static Double declareX() {
        Double x = null;
        while (x == null) {
            System.out.println("Координата X>");
            x = scannerInput.nextDouble(scanner.nextLine());
        }
        return x;
    }

    protected static Float declareY() {
        Float y = null;
        while (y == null) {
            System.out.println("Координата Y>");
            y = scannerInput.nextFloat(scanner.nextLine());
        }
        return y;
    }
}

//    private Object value;
//    private ObjCharacteristic[] characteristics;
//
//        public InputManager(Object value, ObjCharacteristic... characteristics){
//        this.characteristics = characteristics;
//        this.value = value;
//    }
//    public Long longInput(){
//        return (Long) value;
//    }
//    public int intInput(){return (int) value;}
//    public String stringInput() {
//        return (String) value;
//    }
//    public Object objectInput(){return (Object) value;}
//    public Double doubleInput(){return (Double) value;}
//    public LocalDateTime localDateTimeInput(){return (LocalDateTime) value;}
//    public static LocalDateTime dateInput(String userInput) {
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
//        LocalDateTime date = LocalDateTime.parse(userInput, dateFormat);
//        return date;
//    }

