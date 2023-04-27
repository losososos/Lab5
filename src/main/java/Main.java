import allClasses.classInf.*;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
import allClasses.interaction.console.CommandCaller;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, TransformerException {


        Worker worker1 = new Worker("aa", 12, Position.CLEANER, Status.FIRED, LocalDateTime.now(), ZonedDateTime.now(), Color.BLACK, 12, Country.FRANCE, 11.0, 11F);
        Worker worker2 = new Worker("ab", 12, Position.CLEANER, Status.FIRED, LocalDateTime.now(), ZonedDateTime.now(), Color.BLACK, 12, Country.FRANCE, 11.0, 11F);
        XmlManager.DeclareXml();
        Collection.addWorker(worker1);
        Collection.addWorker(worker2);
        XmlManager.SaveWorker(worker1);
        System.out.println(Collection.collection);

        //Scanner scanner = new Scanner(System.in);
        //Collection.addWorker(worker1);

    }
}