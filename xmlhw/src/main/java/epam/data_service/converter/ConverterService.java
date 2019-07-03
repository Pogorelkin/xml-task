package epam.data_service.converter;

import epam.entity.Catalogue;
import epam.entity.Category;
import epam.entity.Subcategory;

import java.util.List;

public class ConverterService {

    Converter converter = new Converter();

    String filePath;
    XMLService xmlService = new XMLService();
    XMLModel xmlModel = xmlService.getObjectFromXmlFile(filePath);
    Catalogue catalogue = xmlModel.getCatalogue();
    List<Category> categories = catalogue.getCategories();
    List<Subcategory> subcategories = catalogue.getSubcategiries();
    List<entity.Product> products = catalogue.getProducts();

    JSONService jsonService = new JSONService();

    public void writeData(){


        jsonService.writeDataToJsonFile(filePath, categories, products);
        jsonService.getDataFromJsonFile(filePath, categories, products);
    }

    public void convertToXMK () {
        Catalogue catalogue= new Catalogue();
        catalogue.setCategories(categories);
        catalogue.setProducts(products);
        xmlModel.setCatalogue(catalogue);
        XMLService.parseObjectToXml(filePath, xmlModel);
    }

}
