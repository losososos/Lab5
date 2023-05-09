package allClasses.interaction.commands;

import interfaces.Informationable;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class Help extends AbstractCommand {
    @Override
    public String getInfo() {
        return getName() + "\t-\tвывести справку по доступным командам";
    }

    public static void execute() {
        Add add = new Add();
        Show show = new Show();
        Info info = new Info();
        Clear clear = new Clear();
        Exit exit = new Exit();
        System.out.println("Команды:\n"
                + add.getInfo() + "\n"
                + show.getInfo() + "\n"
                + info.getInfo() + "\n"
                + clear.getInfo() + "\n"
                + exit.getInfo());
//        Reflections reflections = new Reflections("classes.commands");
//        Set<Class<? extends Informationable>> allCommands = reflections.getSubTypesOf(Informationable.class);
//        String output = "";
//        for (Class<? extends Informationable> command : allCommands) {
//            try {
//                output += command.getDeclaredConstructor().newInstance().getInfo() + "\n";
//            } catch (IllegalAccessException | InstantiationException | InvocationTargetException |
//                     NoSuchMethodException e) {
//                return new RuntimeException(e).getMessage();
//            }
//        }
//        return output;
    }


}