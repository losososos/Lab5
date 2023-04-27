package allClasses.classInf;

public enum Position {
    ENGINEER("Engineer"),
    HEAD_OF_DIVISION("Head of division"),
    COOK("Cook"),
    CLEANER("Cleaner");

    private final String position;

    Position(String profession) {
        this.position = profession;
    }

    @Override
    public String toString() {
        return position;
    }
}
