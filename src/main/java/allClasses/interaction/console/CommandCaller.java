package allClasses.interaction.console;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.interaction.commands.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class CommandCaller {

    public static final ArrayDeque<String> history = new ArrayDeque<>(15);

    public static void commandCaller() throws IOException, TransformerException, XMLStreamException, ParserConfigurationException, SAXException {
        String command = InputManager.declareCommand();
        while (!Objects.equals(command, "exit")) {
            switch (command) {
                case ("add"):
                    Add.execute(ScannerInput.readWorker());
                    break;
                case ("info"):
                    Info.execute();
                    break;
                case ("show"):
                    Show.execute();
                    break;
                case ("help"):
                    Help.execute();
                    break;
                case ("clear"):
                    Clear.execute();
                    break;
                case ("save"):
                    Save.execute();
                    break;
                case ("filestartswithname"):
                    FilterStartsWithName.execute();
                case ("history"):
                    History.execute();
                case ("removebyid"):
                    RemoveById.execute();
                default:
                    break;
            }
            command = InputManager.declareCommand();
        }
    }

}
