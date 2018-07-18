//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 01:13:02 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identifierDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifierDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusLanguage">
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="yes" />
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifierDefinition", namespace = "http://www.loc.gov/mods/v3")
public class IdentifierDefinition
    extends StringPlusLanguage
{

    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "typeURI")
    @XmlSchemaType(name = "anyURI")
    protected String typeURI;
    @XmlAttribute(name = "invalid")
    @XmlSchemaType(name = "anySimpleType")
    protected String invalid;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;

    /**
     * Gets the value of the displayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Sets the value of the displayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabel(String value) {
        this.displayLabel = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeURI() {
        return typeURI;
    }

    /**
     * Sets the value of the typeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeURI(String value) {
        this.typeURI = value;
    }

    /**
     * Gets the value of the invalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalid() {
        if (invalid == null) {
            return "yes";
        } else {
            return invalid;
        }
    }

    /**
     * Sets the value of the invalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalid(String value) {
        this.invalid = value;
    }

    /**
     * Gets the value of the altRepGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRepGroup() {
        return altRepGroup;
    }

    /**
     * Sets the value of the altRepGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRepGroup(String value) {
        this.altRepGroup = value;
    }

}
