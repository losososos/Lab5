import allClasses.interaction.console.CommandCaller;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, TransformerException, XMLStreamException, ParserConfigurationException, SAXException {
        CommandCaller.commandCaller();
    }
}