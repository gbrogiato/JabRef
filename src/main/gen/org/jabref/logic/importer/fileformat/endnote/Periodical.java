//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.16 at 09:28:14 PM BRT 
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
    "fullTitle",
    "abbr1",
    "abbr2",
    "abbr3"
})
@XmlRootElement(name = "periodical")
public class Periodical {

    @XmlElement(name = "full-title")
    protected FullTitle fullTitle;
    @XmlElement(name = "abbr-1")
    protected Abbr1 abbr1;
    @XmlElement(name = "abbr-2")
    protected Abbr2 abbr2;
    @XmlElement(name = "abbr-3")
    protected Abbr3 abbr3;

    /**
     * Gets the value of the fullTitle property.
     * 
     * @return
     *     possible object is
     *     {@link FullTitle }
     *     
     */
    public FullTitle getFullTitle() {
        return fullTitle;
    }

    /**
     * Sets the value of the fullTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTitle }
     *     
     */
    public void setFullTitle(FullTitle value) {
        this.fullTitle = value;
    }

    /**
     * Gets the value of the abbr1 property.
     * 
     * @return
     *     possible object is
     *     {@link Abbr1 }
     *     
     */
    public Abbr1 getAbbr1() {
        return abbr1;
    }

    /**
     * Sets the value of the abbr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abbr1 }
     *     
     */
    public void setAbbr1(Abbr1 value) {
        this.abbr1 = value;
    }

    /**
     * Gets the value of the abbr2 property.
     * 
     * @return
     *     possible object is
     *     {@link Abbr2 }
     *     
     */
    public Abbr2 getAbbr2() {
        return abbr2;
    }

    /**
     * Sets the value of the abbr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abbr2 }
     *     
     */
    public void setAbbr2(Abbr2 value) {
        this.abbr2 = value;
    }

    /**
     * Gets the value of the abbr3 property.
     * 
     * @return
     *     possible object is
     *     {@link Abbr3 }
     *     
     */
    public Abbr3 getAbbr3() {
        return abbr3;
    }

    /**
     * Sets the value of the abbr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abbr3 }
     *     
     */
    public void setAbbr3(Abbr3 value) {
        this.abbr3 = value;
    }

}
