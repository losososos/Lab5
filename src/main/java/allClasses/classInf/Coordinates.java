package allClasses.classInf;

public class Coordinates {
    private Double x; //Максимальное значение поля: 678, Поле не может быть null
    private Float y; //Поле не может быть null

    public Coordinates(Double x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates" + "\n"+
                "\t{" + "\n"+
                "\t\tx=" + x + "\n"+
                "\t\ty=" + y + "\n"+
                "\t}";
    }
}