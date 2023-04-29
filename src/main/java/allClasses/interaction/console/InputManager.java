package allClasses.interaction.console;


import allClasses.classInf.ObjCharacteristic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  InputManager {
    private Object value;
    private ObjCharacteristic[] characteristics;

    public InputManager(Object value, ObjCharacteristic... characteristics){
        this.characteristics = characteristics;
        this.value = value;
    }


    public Long longInput(){
        return (Long) value;
    }
    public int intInput(){return (int) value;}
    public String stringInput() {
        return (String) value;
    }
    public Object objectInput(){return (Object) value;}
    public Double doubleInput(){return (Double) value;}
    public LocalDateTime localDateTimeInput(){return (LocalDateTime) value;}
//    public static LocalDateTime dateInput(String userInput) {
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
//        LocalDateTime date = LocalDateTime.parse(userInput, dateFormat);
//        return date;
//    }
}
