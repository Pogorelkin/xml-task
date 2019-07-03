package entity;

import javax.xml.bind.annotation.*;
import java.time.LocalDate;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    //@XmlAttribute
    //@XmlElement(name = "name")
    private String name;

    //@XmlElement(name = "manufacturer")
    private String manufacturer;

   // @XmlElement(name = "model")
    private String model;

    //@XmlElement(name = "manufactureDate")
    private LocalDate manufactureDate;

   // @XmlElement(name = "color")
    private String color;

    //@XmlElement(name = "price")
    private Double price;

   // @XmlElement(name = "amount")
    private Integer amount;

  //  @XmlElement(name = "category")
    private String category;

   // @XmlElement(name = "subcategory")
    private String subcategory;

    public Product() {
    }

    public Product(String name, String manufacturer, String model, LocalDate dateOfManufacture, String color, Double price, Integer amount) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.manufactureDate = dateOfManufacture;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @XmlElement(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @XmlElement(name = "manufactureDate")
    public LocalDate getDateOfManufacture() {
        return manufactureDate;
    }

    public void setDateOfManufacture(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @XmlElement(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @XmlElement(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @XmlElement(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @XmlElement(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement(name = "subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
}
