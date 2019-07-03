package epam.entity;

import entity.Product;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "store")
public class Catalogue {


    private List<Category> categories;
    private List<Subcategory> subcategiries;
    private List<entity.Product> products;

    public Catalogue() {
        super();

    }

    public Catalogue(List<Category> categories, List<Subcategory> subcategiries) {
        super();
        this.categories = categories;
        this.subcategiries = subcategiries;
    }

    public Catalogue(List<Category> categories, List<Subcategory> subcategiries, List<Product> products) {
        super();
        this.categories = categories;
        this.subcategiries = subcategiries;
        this.products = products;
    }


    @XmlElementWrapper(name = "categories")
    @XmlElement(name = "category")
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
    @XmlElementWrapper(name = "subcategories")
    @XmlElement(name = "subcategory")
    public List<Subcategory> getSubcategiries() {
        return subcategiries;
    }

    public void setSubcategiries(List<Subcategory> subcategiries) {
        this.subcategiries = subcategiries;
    }


    @XmlElementWrapper(name = "products")
    @XmlElement(name = "product")
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
