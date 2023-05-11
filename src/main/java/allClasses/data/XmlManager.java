package allClasses.data;

import allClasses.classInf.*;
import allClasses.collection.Collection;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.io.BufferedWriter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.UUID;

import static allClasses.collection.Collection.collection;

public class XmlManager {

//    Collection collection = new Collection();
    private static Document document;
    private static Element workersIn;
//    private static final String FILENAME = "data.xml";
//    private static final String WORKERS_TAG_START = "<workers>";
//    private static final String WORKERS_TAG_END = "</workers>";
    public static void DeclareXml() throws ParserConfigurationException, TransformerException/* throws IOException, XMLStreamException */{
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.newDocument();
            workersIn = document.createElement("workers");
            document.appendChild(workersIn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
//        FileWriter fileWriter = new FileWriter("data.xml", true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(bufferedWriter);
//
//        xmlStreamWriter.writeStartDocument();
//        xmlStreamWriter.writeCharacters("\n");
//        xmlStreamWriter.writeStartElement("workers");
//        xmlStreamWriter.writeCharacters("\n");

//        xmlStreamWriter.flush();
//        xmlStreamWriter.close();
//        bufferedWriter.close();

//        xmlStreamWriter.writeStartDocument();
//        xmlStreamWriter.writeCharacters("\n");
//        xmlStreamWriter.writeStartElement("workers");
//        xmlStreamWriter.writeEndDocument();

//        xmlStreamWriter.flush();
//        xmlStreamWriter.close();
//        bufferedWriter.close();
//    }
//    public static void saveWorkers(LinkedHashSet<Worker> workers) throws IOException, XMLStreamException {
//        Worker[] workersArray = workers.toArray(new Worker[workers.size()]);
//        for (Worker worker : workersArray) {
//            saveWorker(worker);
//        }
//    }


//        try {
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            document = dBuilder.newDocument();
//            workers = document.createElement("workers");
//            document.appendChild(workers);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public void addWorkerElementsToXmlFile(Collection.collection) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(xmlFilePath, true)); // Открываем файл на дозапись
//            Worker[] workerArray = workers.toArray(new Worker[0]); // Преобразуем коллекцию в массив
//            for (Worker worker : workerArray) {
//                SaveWorker(writer, worker); // Вызываем метод 3 для каждого элемента массива
//            }
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void saveWorker(Worker worker) throws FileNotFoundException, TransformerException {
        Element workerIn = document.createElement("worker");
        workersIn.appendChild(workerIn);
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

    public static LinkedHashSet<Worker> readWorker() throws IOException, SAXException, ParserConfigurationException {
            File xmlFile = new File("data.xml");
            if (!xmlFile.exists()) {
                throw new FileNotFoundException("XML file not found.");
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            doc.getDocumentElement().normalize();
            NodeList workerNodes = doc.getElementsByTagName("worker");
            LinkedHashSet<Worker> workers = new LinkedHashSet<>();

            for (int i = 0; i < workerNodes.getLength(); i++) {
                Node workerNode = workerNodes.item(i);
                if (workerNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element workerElement = (Element) workerNode;
                    String id = workerElement.getElementsByTagName("id").item(0).getTextContent();
                    String name = workerElement.getElementsByTagName("name").item(0).getTextContent();
                    double salary = Double.parseDouble(workerElement.getElementsByTagName("salary").item(0).getTextContent());
                    LocalDateTime startDate = LocalDateTime.parse(workerElement.getElementsByTagName("startDate").item(0).getTextContent(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    Position position = Position.valueOf(workerElement.getElementsByTagName("position").item(0).getTextContent());
                    Status status = Status.valueOf(workerElement.getElementsByTagName("status").item(0).getTextContent());
                    Double x = Double.parseDouble(workerElement.getElementsByTagName("x").item(0).getTextContent());
                    Float y = Float.parseFloat(workerElement.getElementsByTagName("y").item(0).getTextContent());
                    ZonedDateTime creationDate = ZonedDateTime.parse(workerElement.getElementsByTagName("creationDate").item(0).getTextContent(), DateTimeFormatter.ISO_ZONED_DATE_TIME);
                    ZonedDateTime birthday = ZonedDateTime.parse(workerElement.getElementsByTagName("birthday").item(0).getTextContent(), DateTimeFormatter.ISO_ZONED_DATE_TIME);
                    long weight = Long.parseLong(workerElement.getElementsByTagName("weight").item(0).getTextContent());
                    Color eyeColor = Color.valueOf(workerElement.getElementsByTagName("eyeColor").item(0).getTextContent());
                    Country nationality = Country.valueOf(workerElement.getElementsByTagName("nationality").item(0).getTextContent());

                    Worker worker = new Worker(name, salary, position, status, startDate, birthday, eyeColor, weight, nationality, x, y);
                    worker.setId(UUID.fromString(id));
                    worker.setCreationDate(creationDate);
                    workers.add(worker);
                }
            }

            return workers;
        }

    public static String readEmptyXMLCollection() throws IOException {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<movies>\n" +
                "\n" +
                "</movies>";
    }
}