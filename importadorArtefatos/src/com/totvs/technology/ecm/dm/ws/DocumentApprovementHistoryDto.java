
package com.totvs.technology.ecm.dm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for documentApprovementHistoryDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentApprovementHistoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iterationSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="levelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="movementSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentApprovementHistoryDto", propOrder = {
    "approvementDate",
    "colleagueId",
    "colleagueName",
    "documentVersion",
    "iterationSequence",
    "levelId",
    "movementSequence",
    "observation",
    "signed",
    "status"
})
public class DocumentApprovementHistoryDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvementDate;
    protected String colleagueId;
    protected String colleagueName;
    protected int documentVersion;
    protected int iterationSequence;
    protected int levelId;
    protected int movementSequence;
    protected String observation;
    protected boolean signed;
    protected int status;

    /**
     * Gets the value of the approvementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovementDate() {
        return approvementDate;
    }

    /**
     * Sets the value of the approvementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovementDate(XMLGregorianCalendar value) {
        this.approvementDate = value;
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
     * Gets the value of the colleagueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueName() {
        return colleagueName;
    }

    /**
     * Sets the value of the colleagueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueName(String value) {
        this.colleagueName = value;
    }

    /**
     * Gets the value of the documentVersion property.
     * 
     */
    public int getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Sets the value of the documentVersion property.
     * 
     */
    public void setDocumentVersion(int value) {
        this.documentVersion = value;
    }

    /**
     * Gets the value of the iterationSequence property.
     * 
     */
    public int getIterationSequence() {
        return iterationSequence;
    }

    /**
     * Sets the value of the iterationSequence property.
     * 
     */
    public void setIterationSequence(int value) {
        this.iterationSequence = value;
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
     * Gets the value of the movementSequence property.
     * 
     */
    public int getMovementSequence() {
        return movementSequence;
    }

    /**
     * Sets the value of the movementSequence property.
     * 
     */
    public void setMovementSequence(int value) {
        this.movementSequence = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservation(String value) {
        this.observation = value;
    }

    /**
     * Gets the value of the signed property.
     * 
     */
    public boolean isSigned() {
        return signed;
    }

    /**
     * Sets the value of the signed property.
     * 
     */
    public void setSigned(boolean value) {
        this.signed = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
