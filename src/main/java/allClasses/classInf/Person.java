package allClasses.classInf;

import allClasses.interaction.console.InputManager;

import java.time.ZonedDateTime;

public class Person {
    private java.time.ZonedDateTime birthday; //Поле не может быть null
    private long weight; //Значение поля должно быть больше 0
    private Color eyeColor; //Поле не может быть null
    private Country nationality; //Поле может быть null

    public Person(ZonedDateTime birthday, long weight, Color eyeColor, Country nationality){
        this.birthday = birthday;
        this.weight = new InputManager(weight, ObjCharacteristic.MORE_THAN_0).longInput();
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }

    public void setBirthday(ZonedDateTime birthday) {
        this.birthday = birthday;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public Country getNationality() {
        return nationality;
    }

    public long getWeight() {
        return weight;
    }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                ", weight=" + weight +
                ", eyeColor=" + eyeColor +
                ", nationality=" + nationality +
                '}';
    }
}