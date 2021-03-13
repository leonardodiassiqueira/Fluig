
package com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for processTaskDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processTaskDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canCurrentUserTakeTask" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="choosedColleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="choosedSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="complement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="completeColleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deadlineText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historCompleteColleague" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historTaskObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statusConsult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskCompletionHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferredSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processTaskDto", propOrder = {
    "active",
    "canCurrentUserTakeTask",
    "choosedColleagueId",
    "choosedSequence",
    "colleagueId",
    "colleagueName",
    "companyId",
    "complement",
    "completeColleagueId",
    "completeType",
    "deadlineText",
    "historCompleteColleague",
    "historTaskObservation",
    "movementSequence",
    "processInstanceId",
    "status",
    "statusConsult",
    "taskCompletionDate",
    "taskCompletionHour",
    "taskObservation",
    "taskSigned",
    "transferredSequence"
})
public class ProcessTaskDto {

    protected boolean active;
    protected boolean canCurrentUserTakeTask;
    protected String choosedColleagueId;
    protected int choosedSequence;
    protected String colleagueId;
    protected String colleagueName;
    protected long companyId;
    protected boolean complement;
    protected String completeColleagueId;
    protected int completeType;
    protected String deadlineText;
    protected String historCompleteColleague;
    protected String historTaskObservation;
    protected int movementSequence;
    protected int processInstanceId;
    protected int status;
    protected int statusConsult;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar taskCompletionDate;
    protected int taskCompletionHour;
    protected String taskObservation;
    protected boolean taskSigned;
    protected int transferredSequence;

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the canCurrentUserTakeTask property.
     * 
     */
    public boolean isCanCurrentUserTakeTask() {
        return canCurrentUserTakeTask;
    }

    /**
     * Sets the value of the canCurrentUserTakeTask property.
     * 
     */
    public void setCanCurrentUserTakeTask(boolean value) {
        this.canCurrentUserTakeTask = value;
    }

    /**
     * Gets the value of the choosedColleagueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoosedColleagueId() {
        return choosedColleagueId;
    }

    /**
     * Sets the value of the choosedColleagueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoosedColleagueId(String value) {
        this.choosedColleagueId = value;
    }

    /**
     * Gets the value of the choosedSequence property.
     * 
     */
    public int getChoosedSequence() {
        return choosedSequence;
    }

    /**
     * Sets the value of the choosedSequence property.
     * 
     */
    public void setChoosedSequence(int value) {
        this.choosedSequence = value;
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
     * Gets the value of the complement property.
     * 
     */
    public boolean isComplement() {
        return complement;
    }

    /**
     * Sets the value of the complement property.
     * 
     */
    public void setComplement(boolean value) {
        this.complement = value;
    }

    /**
     * Gets the value of the completeColleagueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteColleagueId() {
        return completeColleagueId;
    }

    /**
     * Sets the value of the completeColleagueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteColleagueId(String value) {
        this.completeColleagueId = value;
    }

    /**
     * Gets the value of the completeType property.
     * 
     */
    public int getCompleteType() {
        return completeType;
    }

    /**
     * Sets the value of the completeType property.
     * 
     */
    public void setCompleteType(int value) {
        this.completeType = value;
    }

    /**
     * Gets the value of the deadlineText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadlineText() {
        return deadlineText;
    }

    /**
     * Sets the value of the deadlineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadlineText(String value) {
        this.deadlineText = value;
    }

    /**
     * Gets the value of the historCompleteColleague property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistorCompleteColleague() {
        return historCompleteColleague;
    }

    /**
     * Sets the value of the historCompleteColleague property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistorCompleteColleague(String value) {
        this.historCompleteColleague = value;
    }

    /**
     * Gets the value of the historTaskObservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistorTaskObservation() {
        return historTaskObservation;
    }

    /**
     * Sets the value of the historTaskObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistorTaskObservation(String value) {
        this.historTaskObservation = value;
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

    /**
     * Gets the value of the statusConsult property.
     * 
     */
    public int getStatusConsult() {
        return statusConsult;
    }

    /**
     * Sets the value of the statusConsult property.
     * 
     */
    public void setStatusConsult(int value) {
        this.statusConsult = value;
    }

    /**
     * Gets the value of the taskCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaskCompletionDate() {
        return taskCompletionDate;
    }

    /**
     * Sets the value of the taskCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaskCompletionDate(XMLGregorianCalendar value) {
        this.taskCompletionDate = value;
    }

    /**
     * Gets the value of the taskCompletionHour property.
     * 
     */
    public int getTaskCompletionHour() {
        return taskCompletionHour;
    }

    /**
     * Sets the value of the taskCompletionHour property.
     * 
     */
    public void setTaskCompletionHour(int value) {
        this.taskCompletionHour = value;
    }

    /**
     * Gets the value of the taskObservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskObservation() {
        return taskObservation;
    }

    /**
     * Sets the value of the taskObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskObservation(String value) {
        this.taskObservation = value;
    }

    /**
     * Gets the value of the taskSigned property.
     * 
     */
    public boolean isTaskSigned() {
        return taskSigned;
    }

    /**
     * Sets the value of the taskSigned property.
     * 
     */
    public void setTaskSigned(boolean value) {
        this.taskSigned = value;
    }

    /**
     * Gets the value of the transferredSequence property.
     * 
     */
    public int getTransferredSequence() {
        return transferredSequence;
    }

    /**
     * Sets the value of the transferredSequence property.
     * 
     */
    public void setTransferredSequence(int value) {
        this.transferredSequence = value;
    }

}
