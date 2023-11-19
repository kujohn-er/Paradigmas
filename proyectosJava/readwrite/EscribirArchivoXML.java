package readwrite;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EscribirArchivoXML {
    public static void main(String[] args) {
        try {
            // new xml
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // creates a root element
            Element rootElement = doc.createElement("user");
            doc.appendChild(rootElement);

            
            Element user1 = doc.createElement("user1");
            rootElement.appendChild(user1);
            Element name1 = doc.createElement("name1");
            name1.appendChild(doc.createTextNode("Jonathan"));
            user1.appendChild(name1);

            // Save the content to an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            File xmlFile = new File("users.xml");
            FileOutputStream fileOutputStream = new FileOutputStream(xmlFile);
            StreamResult result = new StreamResult(fileOutputStream);
            transformer.transform(source, result);

            System.out.println("XML file created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("XML file not created");
        }
    }
}