package allClasses.classInf;

import allClasses.interaction.console.InputManager;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Worker {
    private UUID id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double salary; //Значение поля должно быть больше 0
    private java.time.LocalDateTime startDate; //Поле не может быть null
    private Position position; //Поле может быть null
    private Status status; //Поле может быть null
    private Person person; //Поле не может быть null

    public Worker(String name, Coordinates coordinates, double salary, Position position, Status status, Person person, ZonedDateTime creationDate, LocalDateTime startDate) {
        id = java.util.UUID.randomUUID();
        this.name = new InputManager(name, ObjCharacteristic.NOT_NULL).stringInput();
        this.coordinates = (Coordinates) new InputManager(coordinates, ObjCharacteristic.NOT_NULL).objectInput();
        this.salary = new InputManager(salary, ObjCharacteristic.MORE_THAN_0).doubleInput();
        this.position = (Position) new InputManager(position,ObjCharacteristic.NOT_NULL).objectInput();
        this.status = (Status) new InputManager(status,ObjCharacteristic.NOT_NULL).objectInput();
        this.person = (Person) new InputManager(person,ObjCharacteristic.NOT_NULL).objectInput();
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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(Person person) {
        this.person = person;
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
}
