package allClasses.classInf;

import allClasses.interaction.console.InputManager;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Worker {
    private final UUID id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private Person person;
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double salary; //Значение поля должно быть больше 0
    private java.time.LocalDateTime startDate; //Поле не может быть null
    private Position position; //Поле может быть null
    private Status status; //Поле может быть null
    //private Person person; //Поле не может быть null

    public Worker(String name, double salary, Position position, Status status, LocalDateTime startDate, ZonedDateTime birthday,  Color eyeColor,long weight, Country nationality, Double x, Float y) {
        Person person = new Person(birthday, weight, eyeColor, nationality);
        Coordinates coordinates = new Coordinates(x, y);
        this.person = person;
        this.coordinates = coordinates;
        id = java.util.UUID.randomUUID();
        this.creationDate = ZonedDateTime.now();
        this.name = new InputManager(name, ObjCharacteristic.NOT_NULL).stringInput();
        this.salary = new InputManager(salary, ObjCharacteristic.MORE_THAN_0).doubleInput();
        this.position = (Position) new InputManager(position, ObjCharacteristic.NOT_NULL).objectInput();
        this.status = (Status) new InputManager(status, ObjCharacteristic.NOT_NULL).objectInput();
        this.startDate = new InputManager(startDate,ObjCharacteristic.NOT_NULL).localDateTimeInput();

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
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", salary=" + salary +
                ", startDate=" + startDate +
                ", position=" + position +
                ", status=" + status +
                ", person=" + person +
                '}';
    }
}
