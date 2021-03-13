
package com.totvs.technology.ecm.dataservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datasetBuilder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datasetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datasetImpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datasetPK" type="{http://ws.dataservice.ecm.technology.totvs.com/}datasetPK" minOccurs="0"/>
 *         &lt;element name="journalingAdherence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastRemoteSync" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastReset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mobileCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offlineMobileCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="resetType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serverOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="syncDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataset", propOrder = {
    "datasetBuilder",
    "datasetDescription",
    "datasetImpl",
    "datasetPK",
    "journalingAdherence",
    "lastRemoteSync",
    "lastReset",
    "listId",
    "mobileCache",
    "offlineMobileCache",
    "resetType",
    "serverOffline",
    "syncDetails",
    "syncStatus",
    "type",
    "updateInterval"
})
public class Dataset {

    protected String datasetBuilder;
    protected String datasetDescription;
    protected String datasetImpl;
    protected DatasetPK datasetPK;
    protected Integer journalingAdherence;
    protected Long lastRemoteSync;
    protected Long lastReset;
    protected Integer listId;
    protected Boolean mobileCache;
    protected Boolean offlineMobileCache;
    protected Integer resetType;
    protected Boolean serverOffline;
    protected String syncDetails;
    protected Integer syncStatus;
    protected String type;
    protected Long updateInterval;

    /**
     * Gets the value of the datasetBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetBuilder() {
        return datasetBuilder;
    }

    /**
     * Sets the value of the datasetBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetBuilder(String value) {
        this.datasetBuilder = value;
    }

    /**
     * Gets the value of the datasetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetDescription() {
        return datasetDescription;
    }

    /**
     * Sets the value of the datasetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetDescription(String value) {
        this.datasetDescription = value;
    }

    /**
     * Gets the value of the datasetImpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetImpl() {
        return datasetImpl;
    }

    /**
     * Sets the value of the datasetImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetImpl(String value) {
        this.datasetImpl = value;
    }

    /**
     * Gets the value of the datasetPK property.
     * 
     * @return
     *     possible object is
     *     {@link DatasetPK }
     *     
     */
    public DatasetPK getDatasetPK() {
        return datasetPK;
    }

    /**
     * Sets the value of the datasetPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatasetPK }
     *     
     */
    public void setDatasetPK(DatasetPK value) {
        this.datasetPK = value;
    }

    /**
     * Gets the value of the journalingAdherence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJournalingAdherence() {
        return journalingAdherence;
    }

    /**
     * Sets the value of the journalingAdherence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJournalingAdherence(Integer value) {
        this.journalingAdherence = value;
    }

    /**
     * Gets the value of the lastRemoteSync property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRemoteSync() {
        return lastRemoteSync;
    }

    /**
     * Sets the value of the lastRemoteSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRemoteSync(Long value) {
        this.lastRemoteSync = value;
    }

    /**
     * Gets the value of the lastReset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastReset() {
        return lastReset;
    }

    /**
     * Sets the value of the lastReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastReset(Long value) {
        this.lastReset = value;
    }

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListId(Integer value) {
        this.listId = value;
    }

    /**
     * Gets the value of the mobileCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileCache() {
        return mobileCache;
    }

    /**
     * Sets the value of the mobileCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileCache(Boolean value) {
        this.mobileCache = value;
    }

    /**
     * Gets the value of the offlineMobileCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineMobileCache() {
        return offlineMobileCache;
    }

    /**
     * Sets the value of the offlineMobileCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineMobileCache(Boolean value) {
        this.offlineMobileCache = value;
    }

    /**
     * Gets the value of the resetType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResetType() {
        return resetType;
    }

    /**
     * Sets the value of the resetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResetType(Integer value) {
        this.resetType = value;
    }

    /**
     * Gets the value of the serverOffline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServerOffline() {
        return serverOffline;
    }

    /**
     * Sets the value of the serverOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServerOffline(Boolean value) {
        this.serverOffline = value;
    }

    /**
     * Gets the value of the syncDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncDetails() {
        return syncDetails;
    }

    /**
     * Sets the value of the syncDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncDetails(String value) {
        this.syncDetails = value;
    }

    /**
     * Gets the value of the syncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSyncStatus(Integer value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the updateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateInterval() {
        return updateInterval;
    }

    /**
     * Sets the value of the updateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateInterval(Long value) {
        this.updateInterval = value;
    }

}
