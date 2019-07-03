package epam.data_service;

import data_service.XMLParser;

import epam.entity.*;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XMLParserImpl implements XMLParser {
    private ArrayList<entity.Product> productList;
    private String schemaLocation;
    private entity.Product product;

  /*  @Override
    public Schema getSchemaByPath(String schPath) throws SAXException {
        String xml = schPath;
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI );
        StreamSource streamSource = new StreamSource();
        try {
            streamSource = new StreamSource(this.getClass().getResourceAsStream(schPath));
            return schemaFactory.newSchema(streamSource);
        } catch (NullPointerException | SAXException e) {
            e.printStackTrace();
        }

        return schemaFactory.newSchema(streamSource);

    }*/

    @Override
    public ArrayList<entity.Product> getProductsFromXMLbyPath(String path) {
        String schemaLoc = getSchemaLocation();
        ArrayList<entity.Product> productArrayList = new ArrayList<>();
        XMLInputFactory xif = XMLInputFactory.newFactory();
        ;
        StreamSource xml = new StreamSource(path);
        try {

            JAXBContext jc = JAXBContext.newInstance(entity.Product.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();


            //unmarshaller.setSchema(getSchemaByPath(getSchemaLocation()));
            Products products = (Products) unmarshaller.unmarshal(new File(path).getAbsoluteFile());
            return products.getProductList();
           /* JAXBElement<Product> jb = unmarshaller.unmarshal(xsr, Product.class);
            xsr.close();

            prod = jb.getValue();*/
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return new ArrayList<entity.Product>();
    }

    public entity.Product getProduct() {
        return product;
    }

    public void setProduct(entity.Product product) {
        this.product = product;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }
}
