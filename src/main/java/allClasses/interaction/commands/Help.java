package allClasses.interaction.commands;

import allClasses.interaction.console.CommandCaller;
public class Help extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести справку по доступным командам";
    }

    public static void execute() {
        Add add = new Add();
        Show show = new Show();
        Info info = new Info();
        Clear clear = new Clear();
        Exit exit = new Exit();
        Help help = new Help();
        Save save = new Save();
        AddIfMin addIfMin = new AddIfMin();
        ExecuteScript executeScript = new ExecuteScript();
        FilterStartsWithName filterStartsWithName = new FilterStartsWithName();
        History history = new History();
        MaxByPosition maxByPosition = new MaxByPosition();
        MinByStartDate minByStartDate = new MinByStartDate();
        RemoveLower removeLower = new RemoveLower();
        RemoveById removeById = new RemoveById();
        Update update = new Update();

        System.out.println("Команды:\n"
                + add.getInfo() + "\n"
                + show.getInfo() + "\n"
                + info.getInfo() + "\n"
                + clear.getInfo() + "\n"
                + help.getInfo() + "\n"
                + save.getInfo() + "\n"
                + filterStartsWithName.getInfo() + "\n"
                + addIfMin.getInfo() + "\n"
                + executeScript.getInfo() + "\n"
                + history.getInfo() + "\n"
                + maxByPosition.getInfo() + "\n"
                + minByStartDate.getInfo() + "\n"
                + removeLower.getInfo() + "\n"
                + removeById.getInfo()+ "\n"
                + update.getInfo()+ "\n"
                + exit.getInfo());
        CommandCaller.history.add(help.getName());
        CommandCaller.executed = true;
    }
}