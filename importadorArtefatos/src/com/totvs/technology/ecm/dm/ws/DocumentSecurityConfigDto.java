
package com.totvs.technology.ecm.dm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentSecurityConfigDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentSecurityConfigDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attributionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="downloadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="foo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="securityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="securityVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="showContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "documentSecurityConfigDto", propOrder = {
    "attributionType",
    "attributionValue",
    "companyId",
    "documentId",
    "downloadEnabled",
    "foo",
    "permission",
    "securityLevel",
    "securityVersion",
    "sequence",
    "showContent",
    "version"
})
public class DocumentSecurityConfigDto {

    protected Integer attributionType;
    protected String attributionValue;
    protected long companyId;
    protected int documentId;
    protected Boolean downloadEnabled;
    @XmlElement(nillable = true)
    protected List<String> foo;
    protected Boolean permission;
    protected Integer securityLevel;
    protected Boolean securityVersion;
    protected int sequence;
    protected Boolean showContent;
    protected int version;

    /**
     * Gets the value of the attributionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributionType() {
        return attributionType;
    }

    /**
     * Sets the value of the attributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributionType(Integer value) {
        this.attributionType = value;
    }

    /**
     * Gets the value of the attributionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributionValue() {
        return attributionValue;
    }

    /**
     * Sets the value of the attributionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributionValue(String value) {
        this.attributionValue = value;
    }

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
     * Gets the value of the downloadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadEnabled() {
        return downloadEnabled;
    }

    /**
     * Sets the value of the downloadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadEnabled(Boolean value) {
        this.downloadEnabled = value;
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
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermission(Boolean value) {
        this.permission = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecurityLevel(Integer value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the securityVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecurityVersion() {
        return securityVersion;
    }

    /**
     * Sets the value of the securityVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecurityVersion(Boolean value) {
        this.securityVersion = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the showContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowContent() {
        return showContent;
    }

    /**
     * Sets the value of the showContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowContent(Boolean value) {
        this.showContent = value;
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
