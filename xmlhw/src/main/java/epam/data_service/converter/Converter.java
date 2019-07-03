package epam.data_service.converter;

import epam.entity.Catalogue;
import epam.entity.Category;
import epam.entity.Subcategory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.List;

public class Converter {
    String filePath;
    XMLService xmlService = new XMLService();
    XMLModel xmlModel = xmlService.getObjectFromXmlFile(filePath);

    public Converter() {

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(epam.entity.Products.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Marshaller marshallerObj = jaxbContext.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


}
