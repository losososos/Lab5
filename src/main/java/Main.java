import allClasses.classInf.Worker;
import allClasses.data.XmlManager;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) throws IOException, TransformerException, XMLStreamException, ParserConfigurationException, SAXException {
        XmlManager.readWorker();
        CommandCaller.commandCaller();
    }
}