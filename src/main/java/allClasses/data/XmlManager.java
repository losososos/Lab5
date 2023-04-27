package allClasses.data;

import allClasses.classInf.Coordinates;
import allClasses.classInf.Person;
import allClasses.classInf.Worker;
import allClasses.classInf.Workers;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class XmlManager {


    private static Document document;
    private static Element workers;

    public static void DeclareXml() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.newDocument();
            workers = document.createElement("workers");
            document.appendChild(workers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void SaveWorker(Worker worker) throws FileNotFoundException, TransformerException {
        Element workerIn = document.createElement("worker");
        workers.appendChild(workerIn);
        Element id = document.createElement("id");
        workerIn.appendChild(id);
        Text idText = document.createTextNode(worker.getId().toString());
        id.appendChild(idText);

        Element name = document.createElement("name");
        workerIn.appendChild(name);
        Text nameText = document.createTextNode(worker.getName());
        name.appendChild(nameText);

        Element coordinatesIn = document.createElement("coordinates");
        workerIn.appendChild(coordinatesIn);
        Element x = document.createElement("x");
        Element y = document.createElement("y");
        coordinatesIn.appendChild(x);
        coordinatesIn.appendChild(y);
        Text xText = document.createTextNode(String.valueOf(worker.getCoordinates().getX()));
        Text yText = document.createTextNode(String.valueOf(worker.getCoordinates().getY()));
        x.appendChild(xText);
        y.appendChild(yText);

        Element creationDate = document.createElement("creationDate");
        workerIn.appendChild(creationDate);
        Text creationDateText = document.createTextNode(String.valueOf(worker.getCreationDate()));
        creationDate.appendChild(creationDateText);

        Element salary = document.createElement("salary");
        workerIn.appendChild(salary);
        Text salaryText = document.createTextNode(String.valueOf(worker.getSalary()));
        salary.appendChild(salaryText);

        Element startDate = document.createElement("startDate");
        workerIn.appendChild(startDate);
        Text startDateText = document.createTextNode(worker.getStartDate().toString());
        startDate.appendChild(startDateText);

        Element position = document.createElement("position");
        workerIn.appendChild(position);
        Text positionText = document.createTextNode(String.valueOf(worker.getPosition()));
        position.appendChild(positionText);

        Element status = document.createElement("status");
        workerIn.appendChild(status);
        Text statusText = document.createTextNode(String.valueOf(worker.getStatus()));
        status.appendChild(statusText);

        Element personIn = document.createElement("person");
        workerIn.appendChild(personIn);
        Element birthday = document.createElement("birthday");
        personIn.appendChild(birthday);
        Text birthdayText = document.createTextNode(worker.getPerson().getBirthday().toString());
        birthday.appendChild(birthdayText);

        Element weight = document.createElement("weight");
        personIn.appendChild(weight);
        Text weightText = document.createTextNode(String.valueOf(worker.getPerson().getWeight()));
        weight.appendChild(weightText);

        Element eyeColor = document.createElement("eyeColor");
        personIn.appendChild(eyeColor);
        Text eyeColorText = document.createTextNode(String.valueOf(worker.getPerson().getEyeColor()));
        eyeColor.appendChild(eyeColorText);

        Element nationality = document.createElement("nationality");
        personIn.appendChild(nationality);
        Text nationalityText = document.createTextNode(String.valueOf(worker.getPerson().getNationality()));
        nationality.appendChild(nationalityText);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream("data.xml")));
    }
    public static String readEmptyXMLCollection() throws IOException {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<movies>\n" +
                "\n" +
                "</movies>";
    }
}