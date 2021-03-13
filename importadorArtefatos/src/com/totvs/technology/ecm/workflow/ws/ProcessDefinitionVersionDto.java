
package com.totvs.technology.ecm.workflow.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processDefinitionVersionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processDefinitionVersionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="counterSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="formVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fullCategoryStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialProcessState" type="{http://ws.workflow.ecm.technology.totvs.com/}processStateDto" minOccurs="0"/>
 *         &lt;element name="mobileReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="processDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedDatasets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processDefinitionVersionDto", propOrder = {
    "categoryStructure",
    "companyId",
    "counterSign",
    "favorite",
    "formId",
    "formVersion",
    "fullCategoryStructure",
    "initialProcessState",
    "mobileReady",
    "processDescription",
    "processId",
    "relatedDatasets",
    "rowId",
    "version",
    "versionDescription"
})
public class ProcessDefinitionVersionDto {

    protected String categoryStructure;
    protected long companyId;
    protected Boolean counterSign;
    protected boolean favorite;
    protected Integer formId;
    protected Integer formVersion;
    protected String fullCategoryStructure;
    protected ProcessStateDto initialProcessState;
    protected boolean mobileReady;
    protected String processDescription;
    protected String processId;
    @XmlElement(nillable = true)
    protected List<String> relatedDatasets;
    protected int rowId;
    protected int version;
    protected String versionDescription;

    /**
     * Gets the value of the categoryStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryStructure() {
        return categoryStructure;
    }

    /**
     * Sets the value of the categoryStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryStructure(String value) {
        this.categoryStructure = value;
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
     * Gets the value of the counterSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterSign() {
        return counterSign;
    }

    /**
     * Sets the value of the counterSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSign(Boolean value) {
        this.counterSign = value;
    }

    /**
     * Gets the value of the favorite property.
     * 
     */
    public boolean isFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     */
    public void setFavorite(boolean value) {
        this.favorite = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormId(Integer value) {
        this.formId = value;
    }

    /**
     * Gets the value of the formVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormVersion() {
        return formVersion;
    }

    /**
     * Sets the value of the formVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormVersion(Integer value) {
        this.formVersion = value;
    }

    /**
     * Gets the value of the fullCategoryStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullCategoryStructure() {
        return fullCategoryStructure;
    }

    /**
     * Sets the value of the fullCategoryStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullCategoryStructure(String value) {
        this.fullCategoryStructure = value;
    }

    /**
     * Gets the value of the initialProcessState property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessStateDto }
     *     
     */
    public ProcessStateDto getInitialProcessState() {
        return initialProcessState;
    }

    /**
     * Sets the value of the initialProcessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessStateDto }
     *     
     */
    public void setInitialProcessState(ProcessStateDto value) {
        this.initialProcessState = value;
    }

    /**
     * Gets the value of the mobileReady property.
     * 
     */
    public boolean isMobileReady() {
        return mobileReady;
    }

    /**
     * Sets the value of the mobileReady property.
     * 
     */
    public void setMobileReady(boolean value) {
        this.mobileReady = value;
    }

    /**
     * Gets the value of the processDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDescription() {
        return processDescription;
    }

    /**
     * Sets the value of the processDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDescription(String value) {
        this.processDescription = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the relatedDatasets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDatasets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDatasets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelatedDatasets() {
        if (relatedDatasets == null) {
            relatedDatasets = new ArrayList<String>();
        }
        return this.relatedDatasets;
    }

    /**
     * Gets the value of the rowId property.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
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

    /**
     * Gets the value of the versionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * Sets the value of the versionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDescription(String value) {
        this.versionDescription = value;
    }

}
