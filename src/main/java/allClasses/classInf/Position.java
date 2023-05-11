package allClasses.classInf;

public enum Position {
    ENGINEER,
    HEAD_OF_DIVISION,
    COOK,
    CLEANER;

    @Override
    public String toString(){
        return this.name();
    }
}
