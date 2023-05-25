package allClasses.interaction.commands;

public class  Exit extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tзавершить программу";
    }

    public static void execute() {
        Runtime.getRuntime().exit(0);
    }
}
