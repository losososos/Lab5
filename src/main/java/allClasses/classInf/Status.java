package allClasses.classInf;

public enum Status {
    FIRED("Fired"),
    RECOMMENDED_FOR_PROMOTION("Recommended for promotion"),
    REGULAR("Regular");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
