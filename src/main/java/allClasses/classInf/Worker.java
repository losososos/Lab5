package allClasses.classInf;

import allClasses.interaction.console.InputManager;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Worker {
    private UUID id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private Person person;
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double salary; //Значение поля должно быть больше 0
    private java.time.LocalDateTime startDate; //Поле не может быть null
    private Position position; //Поле может быть null
    private Status status; //Поле может быть null
    //private Person person; //Поле не может быть null

    public Worker(String name, double salary, Position position, Status status, LocalDateTime startDate, ZonedDateTime birthday, Color eyeColor, long weight, Country nationality, Double x, Float y) {
        Person person = new Person(birthday, weight, eyeColor, nationality);
        Coordinates coordinates = new Coordinates(x, y);
        this.person = person;
        this.coordinates = coordinates;
        this.id = java.util.UUID.randomUUID();
        this.creationDate = ZonedDateTime.now();
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.status = status;
        this.startDate = startDate;

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public Position getPosition() {
        return position;
    }

    public Status getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Worker" + "\n"+
                "{" + "\n"+
                "\tid=" + id + "\n" +
                "\t" + person + "\n" +
                "\tname='" + name + "\'\n" +
                "\t" + coordinates + "\n" +
                "\tcreationDate=" + creationDate + "\n" +
                "\tsalary=" + salary + "\n" +
                "\tstartDate=" + startDate + "\n" +
                "\tposition=" + position + "\n" +
                "\tstatus=" + status + "\n" +
                '}';
    }
}
