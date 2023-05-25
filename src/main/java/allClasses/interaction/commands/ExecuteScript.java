package allClasses.interaction.commands;

import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import allClasses.interaction.console.ScannerInput;
import exceptions.NoFileException;
import exceptions.WarningException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExecuteScript extends AbstractCommand {

    @Override
    public String getInfo() {
        return "\t" + getName() + " file_name\t-\tсчитать и исполнить скрипт из указанного файла";
    }

    public static void execute(String fileName, Boolean script) {
        ExecuteScript executeScript = new ExecuteScript();
        File file = new File(fileName);
        List<String> commands = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                commands.add(line);
            }
        } catch (FileNotFoundException e) {
            new NoFileException().printMessage();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        if (!commands.isEmpty()) {
            for (String command : commands) {
                String commandName = command.split(" ")[0];
                String commandArgument = null;
                String commandArgumentExtra = null;
                ArrayList<String> characteristics = new ArrayList<>();
                if (command.split(" ").length > 1) {
                    commandArgument = command.split(" ")[1];
                    if (commandArgument.startsWith("{") & commandArgument.endsWith("}")) {
                        for (int i = 0; i < commandArgument.substring(1, commandArgument.length() - 1).split(",").length; i++) {
                            characteristics.add(commandArgument.substring(1, commandArgument.length() - 1).split(",")[i]);
                        }
                    }
                }
                System.out.println(command);
                try {
                    switch (commandName) {
                        case ("add") -> Add.executeScript(characteristics);
                        case ("info") -> Info.execute();
                        case ("show") -> Show.execute();
                        case ("help") -> Help.execute();
                        case ("clear") -> Clear.execute();
                        case ("save") -> Save.execute();
                        case ("filter_starts_with_name") -> FilterStartsWithName.execute(commandArgument, true);
                        case ("history") -> History.execute();
                        case ("remove_by_id") -> RemoveById.execute(commandArgument, true);
                        case ("exit") -> Exit.execute();
                        case ("update") -> Update.execute(commandArgument, true);
                        case ("execute_script") -> ExecuteScript.execute(commandArgument, true);
                        case ("remove_lower") -> RemoveLower.execute(commandArgument, true);
                        case ("min_by_start_date") -> MinByStartDate.execute();
                        case ("max_by_position") -> MaxByPosition.execute();
                        case ("add_if_min") -> AddIfMin.executeScript(characteristics,true);
                        default -> {
                        }
                    }
                } catch (IOException | TransformerException | XMLStreamException |
                         ParserConfigurationException | SAXException e) {
                    new WarningException("Execute script is broken").printMessage();
                }
            }
        } else {
            new WarningException("Файл пуст").printMessage();
        }
        CommandCaller.history.add(executeScript.getName());
        CommandCaller.executed = true;
    }
}
