//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 01:34:14 AM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for digitalOriginDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="digitalOriginDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="born digital"/>
 *     &lt;enumeration value="reformatted digital"/>
 *     &lt;enumeration value="digitized microfilm"/>
 *     &lt;enumeration value="digitized other analog"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "digitalOriginDefinition", namespace = "http://www.loc.gov/mods/v3")
@XmlEnum
public enum DigitalOriginDefinition {

    @XmlEnumValue("born digital")
    BORN_DIGITAL("born digital"),
    @XmlEnumValue("reformatted digital")
    REFORMATTED_DIGITAL("reformatted digital"),
    @XmlEnumValue("digitized microfilm")
    DIGITIZED_MICROFILM("digitized microfilm"),
    @XmlEnumValue("digitized other analog")
    DIGITIZED_OTHER_ANALOG("digitized other analog");
    private final String value;

    DigitalOriginDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalOriginDefinition fromValue(String v) {
        for (DigitalOriginDefinition c: DigitalOriginDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
