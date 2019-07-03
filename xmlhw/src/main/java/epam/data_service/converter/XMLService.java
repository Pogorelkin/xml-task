package epam.data_service.converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLService {

    public XMLModel getObjectFromXmlFile(String filePath) {
        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLModel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            XMLModel root = (XMLModel) jaxbUnmarshaller.unmarshal(file);

            return root;
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void parseObjectToXml(String filePath, XMLModel xmlModel) {
        try {
            JAXBContext contextObj = JAXBContext.newInstance(XMLModel.class);

            Marshaller marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshallerObj.marshal(xmlModel, new FileOutputStream(filePath));
        } catch (JAXBException je) {
            System.out.println("JAXBException");
        } catch (IOException ie) {
            System.out.println("IOException");
        }
    }
}
