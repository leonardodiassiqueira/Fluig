
package com.totvs.technology.ecm.dm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approverDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approverDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvelMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="approverType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="foo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="levelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "approverDto", propOrder = {
    "approvelMode",
    "approverType",
    "colleagueId",
    "companyId",
    "documentId",
    "foo",
    "levelDescription",
    "levelId",
    "version"
})
public class ApproverDto {

    protected int approvelMode;
    protected int approverType;
    protected String colleagueId;
    protected long companyId;
    protected int documentId;
    @XmlElement(nillable = true)
    protected List<String> foo;
    protected String levelDescription;
    protected int levelId;
    protected int version;

    /**
     * Gets the value of the approvelMode property.
     * 
     */
    public int getApprovelMode() {
        return approvelMode;
    }

    /**
     * Sets the value of the approvelMode property.
     * 
     */
    public void setApprovelMode(int value) {
        this.approvelMode = value;
    }

    /**
     * Gets the value of the approverType property.
     * 
     */
    public int getApproverType() {
        return approverType;
    }

    /**
     * Sets the value of the approverType property.
     * 
     */
    public void setApproverType(int value) {
        this.approverType = value;
    }

    /**
     * Gets the value of the colleagueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueId() {
        return colleagueId;
    }

    /**
     * Sets the value of the colleagueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueId(String value) {
        this.colleagueId = value;
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
     * Gets the value of the levelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelDescription() {
        return levelDescription;
    }

    /**
     * Sets the value of the levelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelDescription(String value) {
        this.levelDescription = value;
    }

    /**
     * Gets the value of the levelId property.
     * 
     */
    public int getLevelId() {
        return levelId;
    }

    /**
     * Sets the value of the levelId property.
     * 
     */
    public void setLevelId(int value) {
        this.levelId = value;
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
