package allClasses.interaction.commands;

public class  Exit extends AbstractCommand {
    @Override
    public String getInfo() {
        return getName() + "\t-\tзавершить программу (без сохранения в файл)";
    }

    public String execute(Object inputData) {
        System.out.println("Завершение работы...");
        Runtime.getRuntime().exit(0);
        return "Выполнено";
    }
}
