
package com.totvs.technology.ecm.dm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approvalLevelDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalLevelDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="levelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mandatorySignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalLevelDto", propOrder = {
    "approvalMode",
    "levelDescription",
    "levelId",
    "mandatorySignature"
})
public class ApprovalLevelDto {

    protected int approvalMode;
    protected String levelDescription;
    protected int levelId;
    protected boolean mandatorySignature;

    /**
     * Gets the value of the approvalMode property.
     * 
     */
    public int getApprovalMode() {
        return approvalMode;
    }

    /**
     * Sets the value of the approvalMode property.
     * 
     */
    public void setApprovalMode(int value) {
        this.approvalMode = value;
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
     * Gets the value of the mandatorySignature property.
     * 
     */
    public boolean isMandatorySignature() {
        return mandatorySignature;
    }

    /**
     * Sets the value of the mandatorySignature property.
     * 
     */
    public void setMandatorySignature(boolean value) {
        this.mandatorySignature = value;
    }

}
