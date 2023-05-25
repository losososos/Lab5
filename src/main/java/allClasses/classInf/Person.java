package allClasses.classInf;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {
    private LocalDate birthday; //Поле не может быть null
    private long weight; //Значение поля должно быть больше 0
    private Color eyeColor; //Поле не может быть null
    private Country nationality; //Поле может быть null

    public Person(LocalDate birthday, long weight, Color eyeColor, Country nationality){
        this.birthday = birthday;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }

    public void setBirthday(LocalDate birthday) {
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

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person" +
                "\t{" + "\n"+
                "\t\tbirthday=" + birthday + "\n"+
                "\t\tweight=" + weight + "\n"+
                "\t\teyeColor=" + eyeColor + "\n"+
                "\t\tnationality=" + nationality + "\n"+
                "\t}";
    }
}