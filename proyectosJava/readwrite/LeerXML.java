package readwrite;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import org.w3c.dom.NodeList;

public class LeerXML {
    public static void main(String[] args) {
        try {
            // set the file
            File xmlFile = new File("users.xml");

            // Set up XML parsing
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            // Print the root element name
            System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());

            // Get a list of "user" elements
            NodeList nodeList = doc.getElementsByTagName("user");

            // Iterate through each "user" element
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element user = (Element) nodeList.item(i);
                // Get "nombre" and "edad" elements from each "user"
                String name = user.getElementsByTagName("name1").item(0).getTextContent();
                // Print user details
                System.out.println("\nUser " + (i + 1) + ":");
                System.out.println("Name: " + name);
            }
        } catch (Exception e) {
            System.out.println("The XML document could not be loaded.");
            e.printStackTrace();
        }
    }
}