
package com.totvs.technology.ecm.dataservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchConstraintDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchConstraintDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="likeSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchConstraintDto", propOrder = {
    "contraintType",
    "fieldName",
    "finalValue",
    "initialValue",
    "likeSearch"
})
public class SearchConstraintDto {

    protected String contraintType;
    protected String fieldName;
    protected String finalValue;
    protected String initialValue;
    protected boolean likeSearch;

    /**
     * Gets the value of the contraintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraintType() {
        return contraintType;
    }

    /**
     * Sets the value of the contraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraintType(String value) {
        this.contraintType = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the finalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalValue() {
        return finalValue;
    }

    /**
     * Sets the value of the finalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalValue(String value) {
        this.finalValue = value;
    }

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialValue() {
        return initialValue;
    }

    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialValue(String value) {
        this.initialValue = value;
    }

    /**
     * Gets the value of the likeSearch property.
     * 
     */
    public boolean isLikeSearch() {
        return likeSearch;
    }

    /**
     * Sets the value of the likeSearch property.
     * 
     */
    public void setLikeSearch(boolean value) {
        this.likeSearch = value;
    }

}
