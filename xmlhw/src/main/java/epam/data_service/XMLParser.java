package data_service;

import entity.Product;
import org.xml.sax.SAXException;

import javax.xml.validation.Schema;
import java.util.ArrayList;

public interface XMLParser {
    ArrayList<Product> getProductsFromXMLbyPath(String path);

    //Schema getSchemaByPath(String s) throws SAXException;
}
