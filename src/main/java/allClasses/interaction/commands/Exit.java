package allClasses.interaction.commands;

public class  Exit extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tзавершить программу";
    }

    public String execute() {
        System.out.println("Завершение работы...");
        Runtime.getRuntime().exit(0);
        return "Выполнено";
    }
}
