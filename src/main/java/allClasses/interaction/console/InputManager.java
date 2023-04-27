package allClasses.interaction.console;


import allClasses.classInf.ObjCharacteristic;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public String stringInput() {
        return (String) value;
    }
    public Object objectInput(){return (Object) value;}
    public Double doubleInput(){return (Double) value;}
    public LocalDateTime localDateTimeInput(){
        return (LocalDateTime) value;}
}
