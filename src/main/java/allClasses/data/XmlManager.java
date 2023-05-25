package allClasses.data;

import allClasses.classInf.*;
import exceptions.NoFileException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedHashSet;

import static allClasses.collection.Collection.collection;


public class XmlManager {
    private static final File xmlFile = new File("data.xml");
    public static Document document;
    private static Element workersIn;

    public static void saveDeclareXml() throws TransformerException, FileNotFoundException {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.newDocument();
            workersIn = document.createElement("workers");
            document.appendChild(workersIn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Worker[] workerArray = collection.toArray(new Worker[collection.size()]);
        for (Worker worker : workerArray) {
            saveWorker(worker, document);
        }
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream("data.xml")));
        DOMSource source = new DOMSource(document);
        StreamResult file = new StreamResult(new File("data.xml"));
        transformer.transform(source, file);
    }

    public static void saveWorker(Worker worker, Document document) throws FileNotFoundException, TransformerException {
        Element workerIn = document.createElement("worker");
        workersIn.appendChild(workerIn);
        Element id = document.createElement("id");
        workerIn.appendChild(id);
        Text idText = document.createTextNode(String.valueOf(worker.getId()));
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

    }

    public static void readWorker() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            doc.getDocumentElement().normalize();
            NodeList workerNodes = doc.getElementsByTagName("worker");
            LinkedHashSet<Worker> workers = new LinkedHashSet<>();

            for (int i = 0; i < workerNodes.getLength(); i++) {
                Node workerNode = workerNodes.item(i);
                if (workerNode.getNodeType() == Node.ELEMENT_NODE) {
//                    try {
                        Element workerElement = (Element) workerNode;
                        long id = Long.parseLong(workerElement.getElementsByTagName("id").item(0).getTextContent());
                        String name = workerElement.getElementsByTagName("name").item(0).getTextContent();
                        double salary = Double.parseDouble(workerElement.getElementsByTagName("salary").item(0).getTextContent());
                        LocalDateTime startDate = LocalDateTime.parse(workerElement.getElementsByTagName("startDate").item(0).getTextContent(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                        Position position = Position.valueOf(workerElement.getElementsByTagName("position").item(0).getTextContent());
                        Status status = Status.valueOf(workerElement.getElementsByTagName("status").item(0).getTextContent());
                        Double x = Double.parseDouble(workerElement.getElementsByTagName("x").item(0).getTextContent());
                        Float y = Float.parseFloat(workerElement.getElementsByTagName("y").item(0).getTextContent());
                        ZonedDateTime creationDate = ZonedDateTime.parse(workerElement.getElementsByTagName("creationDate").item(0).getTextContent(), DateTimeFormatter.ISO_ZONED_DATE_TIME);
                        LocalDate birthday = LocalDate.parse(workerElement.getElementsByTagName("birthday").item(0).getTextContent(), DateTimeFormatter.ISO_LOCAL_DATE);
                        long weight = Long.parseLong(workerElement.getElementsByTagName("weight").item(0).getTextContent());
                        Color eyeColor = Color.valueOf(workerElement.getElementsByTagName("eyeColor").item(0).getTextContent());
                        Country nationality = Country.valueOf(workerElement.getElementsByTagName("nationality").item(0).getTextContent());

                        Worker worker = new Worker(name, salary, position, status, startDate, birthday, eyeColor, weight, nationality, x, y);
                        worker.setId(id);
                        worker.setCreationDate(creationDate);
                        workers.add(worker);
//                    }catch (DateTimeParseException e){
//
//                    }
                }
            }
            System.out.println("\tФайл прочитан");
            collection.addAll(workers);
        } catch (FileNotFoundException e) {
            new NoFileException().printMessage();
            saveDeclareXml();
            System.out.println("\tФайл создан");
        }
    }
}