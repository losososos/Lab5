package allClasses.interaction.commands;

import interfaces.Informationable;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

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
        FilterStartsWithName filterStartsWithName = new FilterStartsWithName();
        System.out.println("Команды:\n"
                + add.getInfo() + "\n"
                + show.getInfo() + "\n"
                + info.getInfo() + "\n"
                + clear.getInfo() + "\n"
                + help.getInfo() + "\n"
                + save.getInfo() + "\n"
                + filterStartsWithName.getInfo() + "\n"
                + exit.getInfo());
    }
}