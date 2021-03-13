
package com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for processTaskAppointmentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processTaskAppointmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appointmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="appointmentSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="appointmentSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="isNewRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="movementSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transferenceSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processTaskAppointmentDto", propOrder = {
    "appointmentDate",
    "appointmentSeconds",
    "appointmentSequence",
    "colleagueId",
    "colleagueName",
    "companyId",
    "isNewRecord",
    "movementSequence",
    "processInstanceId",
    "transferenceSequence"
})
public class ProcessTaskAppointmentDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentDate;
    protected Integer appointmentSeconds;
    protected int appointmentSequence;
    protected String colleagueId;
    protected String colleagueName;
    protected long companyId;
    protected Boolean isNewRecord;
    protected int movementSequence;
    protected int processInstanceId;
    protected int transferenceSequence;

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Gets the value of the appointmentSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentSeconds() {
        return appointmentSeconds;
    }

    /**
     * Sets the value of the appointmentSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentSeconds(Integer value) {
        this.appointmentSeconds = value;
    }

    /**
     * Gets the value of the appointmentSequence property.
     * 
     */
    public int getAppointmentSequence() {
        return appointmentSequence;
    }

    /**
     * Sets the value of the appointmentSequence property.
     * 
     */
    public void setAppointmentSequence(int value) {
        this.appointmentSequence = value;
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
     * Gets the value of the isNewRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewRecord() {
        return isNewRecord;
    }

    /**
     * Sets the value of the isNewRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewRecord(Boolean value) {
        this.isNewRecord = value;
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
     * Gets the value of the processInstanceId property.
     * 
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * Sets the value of the processInstanceId property.
     * 
     */
    public void setProcessInstanceId(int value) {
        this.processInstanceId = value;
    }

    /**
     * Gets the value of the transferenceSequence property.
     * 
     */
    public int getTransferenceSequence() {
        return transferenceSequence;
    }

    /**
     * Sets the value of the transferenceSequence property.
     * 
     */
    public void setTransferenceSequence(int value) {
        this.transferenceSequence = value;
    }

}
