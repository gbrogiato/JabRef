//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 01:34:14 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}placeTerm" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="supplied" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="yes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "placeTerm"
})
public class PlaceDefinition {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3", required = true)
    protected List<PlaceTermDefinition> placeTerm;
    @XmlAttribute(name = "supplied")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplied;

    /**
     * Gets the value of the placeTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceTermDefinition }
     * 
     * 
     */
    public List<PlaceTermDefinition> getPlaceTerm() {
        if (placeTerm == null) {
            placeTerm = new ArrayList<PlaceTermDefinition>();
        }
        return this.placeTerm;
    }

    /**
     * Gets the value of the supplied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplied() {
        if (supplied == null) {
            return "yes";
        } else {
            return supplied;
        }
    }

    /**
     * Sets the value of the supplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplied(String value) {
        this.supplied = value;
    }

}
