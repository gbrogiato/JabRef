//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.18 at 01:12:59 AM BRT 
//


package org.jabref.logic.importer.fileformat.bibtexml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://bibtexml.sf.net/}article"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}book"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}booklet"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}manual"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}techreport"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}mastersthesis"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}phdthesis"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}inbook"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}incollection"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}proceedings"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}inproceedings"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}conference"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}unpublished"/>
 *           &lt;element ref="{http://bibtexml.sf.net/}misc"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "article",
    "book",
    "booklet",
    "manual",
    "techreport",
    "mastersthesis",
    "phdthesis",
    "inbook",
    "incollection",
    "proceedings",
    "inproceedings",
    "conference",
    "unpublished",
    "misc"
})
@XmlRootElement(name = "entry")
public class Entry {

    protected Article article;
    protected Book book;
    protected Booklet booklet;
    protected Manual manual;
    protected Techreport techreport;
    protected Mastersthesis mastersthesis;
    protected Phdthesis phdthesis;
    protected Inbook inbook;
    protected Incollection incollection;
    protected Proceedings proceedings;
    protected Inproceedings inproceedings;
    protected Conference conference;
    protected Unpublished unpublished;
    protected Misc misc;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setArticle(Article value) {
        this.article = value;
    }

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setBook(Book value) {
        this.book = value;
    }

    /**
     * Gets the value of the booklet property.
     * 
     * @return
     *     possible object is
     *     {@link Booklet }
     *     
     */
    public Booklet getBooklet() {
        return booklet;
    }

    /**
     * Sets the value of the booklet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booklet }
     *     
     */
    public void setBooklet(Booklet value) {
        this.booklet = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * @return
     *     possible object is
     *     {@link Manual }
     *     
     */
    public Manual getManual() {
        return manual;
    }

    /**
     * Sets the value of the manual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manual }
     *     
     */
    public void setManual(Manual value) {
        this.manual = value;
    }

    /**
     * Gets the value of the techreport property.
     * 
     * @return
     *     possible object is
     *     {@link Techreport }
     *     
     */
    public Techreport getTechreport() {
        return techreport;
    }

    /**
     * Sets the value of the techreport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Techreport }
     *     
     */
    public void setTechreport(Techreport value) {
        this.techreport = value;
    }

    /**
     * Gets the value of the mastersthesis property.
     * 
     * @return
     *     possible object is
     *     {@link Mastersthesis }
     *     
     */
    public Mastersthesis getMastersthesis() {
        return mastersthesis;
    }

    /**
     * Sets the value of the mastersthesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mastersthesis }
     *     
     */
    public void setMastersthesis(Mastersthesis value) {
        this.mastersthesis = value;
    }

    /**
     * Gets the value of the phdthesis property.
     * 
     * @return
     *     possible object is
     *     {@link Phdthesis }
     *     
     */
    public Phdthesis getPhdthesis() {
        return phdthesis;
    }

    /**
     * Sets the value of the phdthesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phdthesis }
     *     
     */
    public void setPhdthesis(Phdthesis value) {
        this.phdthesis = value;
    }

    /**
     * Gets the value of the inbook property.
     * 
     * @return
     *     possible object is
     *     {@link Inbook }
     *     
     */
    public Inbook getInbook() {
        return inbook;
    }

    /**
     * Sets the value of the inbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inbook }
     *     
     */
    public void setInbook(Inbook value) {
        this.inbook = value;
    }

    /**
     * Gets the value of the incollection property.
     * 
     * @return
     *     possible object is
     *     {@link Incollection }
     *     
     */
    public Incollection getIncollection() {
        return incollection;
    }

    /**
     * Sets the value of the incollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incollection }
     *     
     */
    public void setIncollection(Incollection value) {
        this.incollection = value;
    }

    /**
     * Gets the value of the proceedings property.
     * 
     * @return
     *     possible object is
     *     {@link Proceedings }
     *     
     */
    public Proceedings getProceedings() {
        return proceedings;
    }

    /**
     * Sets the value of the proceedings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proceedings }
     *     
     */
    public void setProceedings(Proceedings value) {
        this.proceedings = value;
    }

    /**
     * Gets the value of the inproceedings property.
     * 
     * @return
     *     possible object is
     *     {@link Inproceedings }
     *     
     */
    public Inproceedings getInproceedings() {
        return inproceedings;
    }

    /**
     * Sets the value of the inproceedings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inproceedings }
     *     
     */
    public void setInproceedings(Inproceedings value) {
        this.inproceedings = value;
    }

    /**
     * Gets the value of the conference property.
     * 
     * @return
     *     possible object is
     *     {@link Conference }
     *     
     */
    public Conference getConference() {
        return conference;
    }

    /**
     * Sets the value of the conference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conference }
     *     
     */
    public void setConference(Conference value) {
        this.conference = value;
    }

    /**
     * Gets the value of the unpublished property.
     * 
     * @return
     *     possible object is
     *     {@link Unpublished }
     *     
     */
    public Unpublished getUnpublished() {
        return unpublished;
    }

    /**
     * Sets the value of the unpublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unpublished }
     *     
     */
    public void setUnpublished(Unpublished value) {
        this.unpublished = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link Misc }
     *     
     */
    public Misc getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Misc }
     *     
     */
    public void setMisc(Misc value) {
        this.misc = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

}
