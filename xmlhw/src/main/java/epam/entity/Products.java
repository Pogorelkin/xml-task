package epam.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "store")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {

    @XmlElement(name = "product")
    private ArrayList<entity.Product> productList = null;

    public void setProductList(ArrayList<entity.Product> productList) {
        this.productList = productList;
    }

    public ArrayList<entity.Product> getProductList() {
        return productList;
    }
}

