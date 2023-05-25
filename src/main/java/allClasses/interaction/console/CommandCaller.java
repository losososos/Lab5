package allClasses.interaction.console;

import allClasses.interaction.commands.*;
import exceptions.WarningException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class CommandCaller {
    public static boolean executed = true;
    public static final Queue<String> history = new ArrayDeque<>(15);

    public static void commandCaller() throws IOException, TransformerException, XMLStreamException, ParserConfigurationException, SAXException {

        String command = InputManager.declareCommand();

        while (true) {
            String commandName;
            commandName = command.split(" ")[0];
            String commandArgument = null;
            if (command.split(" ").length > 1) {
                commandArgument = command.split(" ")[1];
            }
            switch (commandName) {
                case ("add") -> Add.execute(ScannerInput.readWorker());
                case ("info") -> Info.execute();
                case ("show") -> Show.execute();
                case ("help") -> Help.execute();
                case ("clear") -> Clear.execute();
                case ("save") -> Save.execute();
                case ("filter_starts_with_name") -> FilterStartsWithName.execute(commandArgument,false);
                case ("history") -> History.execute();
                case ("remove_by_id") -> RemoveById.execute(commandArgument,false);
                case ("exit") -> Exit.execute();
                case ("update") -> Update.execute(commandArgument,false);
                case ("execute_script") -> ExecuteScript.execute(commandArgument,false);
                case ("remove_lower") -> RemoveLower.execute(commandArgument,false);
                case ("min_by_start_date") -> MinByStartDate.execute();
                case ("max_by_position") -> MaxByPosition.execute();
                case ("add_if_min") -> AddIfMin.execute(ScannerInput.readWorker());
                default -> new WarningException("Неизвестная команда, help - для помощи").printMessage();
            }
            command = InputManager.declareCommand();

        }
    }

}
