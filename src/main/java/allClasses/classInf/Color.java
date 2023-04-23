package allClasses.classInf;

public enum Color {
    GREEN,
    BLACK,
    YELLOW,
    WHITE;

    @Override
    public String toString(){
        return this.name();
    }
}
