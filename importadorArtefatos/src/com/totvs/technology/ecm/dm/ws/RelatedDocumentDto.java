
package com.totvs.technology.ecm.dm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relatedDocumentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedDocumentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="foo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedDocumentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedDocumentDto", propOrder = {
    "companyId",
    "documentId",
    "foo",
    "relatedDocumentId",
    "version"
})
public class RelatedDocumentDto {

    protected long companyId;
    protected int documentId;
    @XmlElement(nillable = true)
    protected List<String> foo;
    protected int relatedDocumentId;
    protected int version;

    /**
     * Gets the value of the companyId property.
     * 
     */
    public long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     */
    public void setCompanyId(long value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     */
    public int getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     */
    public void setDocumentId(int value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the foo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFoo() {
        if (foo == null) {
            foo = new ArrayList<String>();
        }
        return this.foo;
    }

    /**
     * Gets the value of the relatedDocumentId property.
     * 
     */
    public int getRelatedDocumentId() {
        return relatedDocumentId;
    }

    /**
     * Sets the value of the relatedDocumentId property.
     * 
     */
    public void setRelatedDocumentId(int value) {
        this.relatedDocumentId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

}
