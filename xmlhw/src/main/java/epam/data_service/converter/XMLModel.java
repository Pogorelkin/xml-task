package epam.data_service.converter;

import epam.entity.Catalogue;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "root")
public class XMLModel {

    private Catalogue catalogue;

    public XMLModel() {
        super();
    }

    public XMLModel(Catalogue catalogue) {
        super();
        this.catalogue = catalogue;
    }

    @XmlElement(name = "store")
    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }


}