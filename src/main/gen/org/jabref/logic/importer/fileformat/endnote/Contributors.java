//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:31:05 PM BRT 
//


package org.jabref.logic.importer.fileformat.endnote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authors",
    "secondaryAuthors",
    "tertiaryAuthors",
    "subsidiaryAuthors",
    "translatedAuthors"
})
@XmlRootElement(name = "contributors")
public class Contributors {

    protected Authors authors;
    @XmlElement(name = "secondary-authors")
    protected SecondaryAuthors secondaryAuthors;
    @XmlElement(name = "tertiary-authors")
    protected TertiaryAuthors tertiaryAuthors;
    @XmlElement(name = "subsidiary-authors")
    protected SubsidiaryAuthors subsidiaryAuthors;
    @XmlElement(name = "translated-authors")
    protected TranslatedAuthors translatedAuthors;

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    public Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    public void setAuthors(Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the secondaryAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryAuthors }
     *     
     */
    public SecondaryAuthors getSecondaryAuthors() {
        return secondaryAuthors;
    }

    /**
     * Sets the value of the secondaryAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryAuthors }
     *     
     */
    public void setSecondaryAuthors(SecondaryAuthors value) {
        this.secondaryAuthors = value;
    }

    /**
     * Gets the value of the tertiaryAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link TertiaryAuthors }
     *     
     */
    public TertiaryAuthors getTertiaryAuthors() {
        return tertiaryAuthors;
    }

    /**
     * Sets the value of the tertiaryAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TertiaryAuthors }
     *     
     */
    public void setTertiaryAuthors(TertiaryAuthors value) {
        this.tertiaryAuthors = value;
    }

    /**
     * Gets the value of the subsidiaryAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryAuthors }
     *     
     */
    public SubsidiaryAuthors getSubsidiaryAuthors() {
        return subsidiaryAuthors;
    }

    /**
     * Sets the value of the subsidiaryAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryAuthors }
     *     
     */
    public void setSubsidiaryAuthors(SubsidiaryAuthors value) {
        this.subsidiaryAuthors = value;
    }

    /**
     * Gets the value of the translatedAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link TranslatedAuthors }
     *     
     */
    public TranslatedAuthors getTranslatedAuthors() {
        return translatedAuthors;
    }

    /**
     * Sets the value of the translatedAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslatedAuthors }
     *     
     */
    public void setTranslatedAuthors(TranslatedAuthors value) {
        this.translatedAuthors = value;
    }

}
