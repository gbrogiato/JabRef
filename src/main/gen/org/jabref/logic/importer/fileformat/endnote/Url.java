//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 01:34:13 AM BRT 
//


package org.jabref.logic.importer.fileformat.endnote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "style"
})
@XmlRootElement(name = "url")
public class Url {

    @XmlAttribute(name = "has-ut")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hasUt;
    @XmlAttribute(name = "ppv-app")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ppvApp;
    @XmlAttribute(name = "ppv-ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ppvRef;
    @XmlAttribute(name = "ppv-ut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ppvUt;
    protected Style style;

    /**
     * Gets the value of the hasUt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasUt() {
        return hasUt;
    }

    /**
     * Sets the value of the hasUt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasUt(String value) {
        this.hasUt = value;
    }

    /**
     * Gets the value of the ppvApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpvApp() {
        return ppvApp;
    }

    /**
     * Sets the value of the ppvApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpvApp(String value) {
        this.ppvApp = value;
    }

    /**
     * Gets the value of the ppvRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpvRef() {
        return ppvRef;
    }

    /**
     * Sets the value of the ppvRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpvRef(String value) {
        this.ppvRef = value;
    }

    /**
     * Gets the value of the ppvUt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpvUt() {
        return ppvUt;
    }

    /**
     * Sets the value of the ppvUt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpvUt(String value) {
        this.ppvUt = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link Style }
     *     
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link Style }
     *     
     */
    public void setStyle(Style value) {
        this.style = value;
    }

}
