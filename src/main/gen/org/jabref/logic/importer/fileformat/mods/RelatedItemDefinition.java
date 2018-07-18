//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 01:13:02 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for relatedItemDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedItemDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.loc.gov/mods/v3}modsGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="preceding"/>
 *             &lt;enumeration value="succeeding"/>
 *             &lt;enumeration value="original"/>
 *             &lt;enumeration value="host"/>
 *             &lt;enumeration value="constituent"/>
 *             &lt;enumeration value="series"/>
 *             &lt;enumeration value="otherVersion"/>
 *             &lt;enumeration value="otherFormat"/>
 *             &lt;enumeration value="isReferencedBy"/>
 *             &lt;enumeration value="references"/>
 *             &lt;enumeration value="reviewOf"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="otherType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="otherTypeAuth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="otherTypeAuthURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="otherTypeURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedItemDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "modsGroup"
})
public class RelatedItemDefinition {

    @XmlElements({
        @XmlElement(name = "abstract", namespace = "http://www.loc.gov/mods/v3", type = AbstractDefinition.class),
        @XmlElement(name = "accessCondition", namespace = "http://www.loc.gov/mods/v3", type = AccessConditionDefinition.class),
        @XmlElement(name = "classification", namespace = "http://www.loc.gov/mods/v3", type = ClassificationDefinition.class),
        @XmlElement(name = "extension", namespace = "http://www.loc.gov/mods/v3", type = ExtensionDefinition.class),
        @XmlElement(name = "genre", namespace = "http://www.loc.gov/mods/v3", type = GenreDefinition.class),
        @XmlElement(name = "identifier", namespace = "http://www.loc.gov/mods/v3", type = IdentifierDefinition.class),
        @XmlElement(name = "language", namespace = "http://www.loc.gov/mods/v3", type = LanguageDefinition.class),
        @XmlElement(name = "location", namespace = "http://www.loc.gov/mods/v3", type = LocationDefinition.class),
        @XmlElement(name = "name", namespace = "http://www.loc.gov/mods/v3", type = NameDefinition.class),
        @XmlElement(name = "note", namespace = "http://www.loc.gov/mods/v3", type = NoteDefinition.class),
        @XmlElement(name = "originInfo", namespace = "http://www.loc.gov/mods/v3", type = OriginInfoDefinition.class),
        @XmlElement(name = "part", namespace = "http://www.loc.gov/mods/v3", type = PartDefinition.class),
        @XmlElement(name = "physicalDescription", namespace = "http://www.loc.gov/mods/v3", type = PhysicalDescriptionDefinition.class),
        @XmlElement(name = "recordInfo", namespace = "http://www.loc.gov/mods/v3", type = RecordInfoDefinition.class),
        @XmlElement(name = "relatedItem", namespace = "http://www.loc.gov/mods/v3", type = RelatedItemDefinition.class),
        @XmlElement(name = "subject", namespace = "http://www.loc.gov/mods/v3", type = SubjectDefinition.class),
        @XmlElement(name = "tableOfContents", namespace = "http://www.loc.gov/mods/v3", type = TableOfContentsDefinition.class),
        @XmlElement(name = "targetAudience", namespace = "http://www.loc.gov/mods/v3", type = TargetAudienceDefinition.class),
        @XmlElement(name = "titleInfo", namespace = "http://www.loc.gov/mods/v3", type = TitleInfoDefinition.class),
        @XmlElement(name = "typeOfResource", namespace = "http://www.loc.gov/mods/v3", type = TypeOfResourceDefinition.class)
    })
    protected List<Object> modsGroup;
    @XmlAttribute(name = "type")
    protected String atType;
    @XmlAttribute(name = "otherType")
    protected String otherType;
    @XmlAttribute(name = "otherTypeAuth")
    protected String otherTypeAuth;
    @XmlAttribute(name = "otherTypeAuthURI")
    protected String otherTypeAuthURI;
    @XmlAttribute(name = "otherTypeURI")
    protected String otherTypeURI;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Gets the value of the modsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractDefinition }
     * {@link AccessConditionDefinition }
     * {@link ClassificationDefinition }
     * {@link ExtensionDefinition }
     * {@link GenreDefinition }
     * {@link IdentifierDefinition }
     * {@link LanguageDefinition }
     * {@link LocationDefinition }
     * {@link NameDefinition }
     * {@link NoteDefinition }
     * {@link OriginInfoDefinition }
     * {@link PartDefinition }
     * {@link PhysicalDescriptionDefinition }
     * {@link RecordInfoDefinition }
     * {@link RelatedItemDefinition }
     * {@link SubjectDefinition }
     * {@link TableOfContentsDefinition }
     * {@link TargetAudienceDefinition }
     * {@link TitleInfoDefinition }
     * {@link TypeOfResourceDefinition }
     * 
     * 
     */
    public List<Object> getModsGroup() {
        if (modsGroup == null) {
            modsGroup = new ArrayList<Object>();
        }
        return this.modsGroup;
    }

    /**
     * Gets the value of the atType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtType() {
        return atType;
    }

    /**
     * Sets the value of the atType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtType(String value) {
        this.atType = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the otherTypeAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTypeAuth() {
        return otherTypeAuth;
    }

    /**
     * Sets the value of the otherTypeAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTypeAuth(String value) {
        this.otherTypeAuth = value;
    }

    /**
     * Gets the value of the otherTypeAuthURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTypeAuthURI() {
        return otherTypeAuthURI;
    }

    /**
     * Sets the value of the otherTypeAuthURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTypeAuthURI(String value) {
        this.otherTypeAuthURI = value;
    }

    /**
     * Gets the value of the otherTypeURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTypeURI() {
        return otherTypeURI;
    }

    /**
     * Sets the value of the otherTypeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTypeURI(String value) {
        this.otherTypeURI = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
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
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
