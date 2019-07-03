package epam;

import data_service.XMLParser;
import epam.data_service.XMLParserImpl;
import entity.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList;
        String pathXML = "data_service/ProductExample.xml";
        String pathSchema = "data_service/ProductSchema.xsd";

        XMLParser parser = new XMLParserImpl();
        ((XMLParserImpl) parser).setSchemaLocation(pathSchema);
        productList = parser.getProductsFromXMLbyPath(pathXML);
        for (Product prod : productList) {
            System.out.println(prod.toString());
        }

    }


}
