package epam.data_service.converter;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import entity.Product;
import epam.entity.Category;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONService {

    public void writeDataToJsonFile(String filePath, List<Category> categories, List<entity.Product> products) {
        try {
            JsonWriter writer = new JsonWriter(new FileWriter(filePath));

            writer.setIndent("    ");

            writer.beginObject();

            writer.name("roles");

            writer.beginArray();

            for (Category category : categories) {
                writer.beginObject();
                writer.name("name").value(category.getName());
                writer.name("persons");
                writer.beginArray();

                for (entity.Product product : products) {
                    writer.beginObject();
                    writer.name("name").value(product.getName());
                    writer.name("manufacturer").value(product.getManufacturer());
                    writer.name("model").value(product.getModel());
                    writer.name("color").value(product.getColor());
                    writer.name("manufactureDate").value(product.getDateOfManufacture().toString());
                    writer.name("price").value(product.getPrice());
                    writer.name("amount").value(product.getAmount());
                    writer.endObject();

                }

                writer.endArray();

                writer.endObject();
            }

            writer.endArray();

            writer.endObject();

            writer.close();
        } catch (IOException e) {

        }
    }

    public void getDataFromJsonFile(String filePath, List<Category> categories, List<entity.Product> products) {
        try {
            JsonReader reader = new JsonReader(new FileReader(filePath));

            reader.beginObject();

            while (reader.hasNext()) {
                String nameRoot = reader.nextName();

                if (nameRoot.equals("roles")) {
                    reader.beginArray();

                    while (reader.hasNext()) {
                        reader.beginObject();

                        Category category = new Category();

                        while (reader.hasNext()) {
                            String nameCategory = reader.nextName();

                            if (nameCategory.equals("name")) {
                                category.setName(reader.nextString());
                            } else if (nameCategory.equals("name")) {
                                category.setName(reader.nextString());
                            }
                            {
                                reader.beginArray();

                                while (reader.hasNext()) {
                                    reader.beginObject();

                                    entity.Product product = new Product();

                                    product.setCategory(category.getName());

                                    while (reader.hasNext()) {
                                        String nameProduct = reader.nextName();

                                        if (nameProduct.equals("name")) {
                                            product.setName(reader.nextString());
                                        } else if (nameProduct.equals("name")) {
                                            product.setName(reader.nextString());
                                        }
                                    }

                                    products.add(product);

                                    reader.endObject();
                                }

                                reader.endArray();
                            }
                        }

                        categories.add(category);

                        reader.endObject();
                    }

                    reader.endArray();
                }
            }

            reader.endObject();

            reader.close();
        } catch (IOException e) {

        }
    }

}
