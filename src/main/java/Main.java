import allClasses.interaction.console.CommandCaller;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, TransformerException {


//        Worker worker1 = new Worker("aa", 12, Position.CLEANER, Status.FIRED, LocalDateTime.now(), ZonedDateTime.now(), Color.BLACK, 12, Country.FRANCE, 11.0, 11F);
//        Worker worker2 = new Worker("ab", 12, Position.CLEANER, Status.FIRED, LocalDateTime.now(), ZonedDateTime.now(), Color.BLACK, 12, Country.FRANCE, 11.0, 11F);
//        XmlManager.DeclareXml();
//        Collection.addWorker(worker1);
//        Collection.addWorker(worker2);
//        XmlManager.SaveWorker(worker1);
//        Add worker = new Add();
//        worker.execute(ConsoleInput.readWorker());
//        System.out.println(Collection.collection);
//        final ScannerInput scannerInput = new ScannerInput();
//        final Scanner scanner = new Scanner(System.in);
        CommandCaller.commandCaller();
//        CommandCaller commandCaller = new CommandCaller();
        //Scanner scanner = new Scanner(System.in);
        //Collection.addWorker(worker1);

    }
}