package allClasses.interaction.console;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.interaction.commands.*;

import java.util.Objects;
import java.util.Scanner;

public class CommandCaller {
//    private final Scanner scanner = new Scanner(System.in);
    public static void commandCaller(){
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
                case ("clear"):
                    Clear.execute();
                default:
                    break;
            }
            command = InputManager.declareCommand();
        }
    }

}
