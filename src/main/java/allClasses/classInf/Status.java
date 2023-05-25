package allClasses.classInf;

public enum Status {
    FIRED,
    RECOMMENDED_FOR_PROMOTION,
    REGULAR;

    public String toString(){
        return this.name();
    }
}
