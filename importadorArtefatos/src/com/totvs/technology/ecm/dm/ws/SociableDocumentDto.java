
package com.totvs.technology.ecm.dm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sociableDocumentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sociableDocumentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commented" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="denounced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="following" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="liked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberComments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberDenouncements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberFollows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberLikes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberShares" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shared" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sociableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sociableDocumentDto", propOrder = {
    "commented",
    "denounced",
    "documentId",
    "following",
    "liked",
    "numberComments",
    "numberDenouncements",
    "numberFollows",
    "numberLikes",
    "numberShares",
    "shared",
    "sociableId",
    "version"
})
public class SociableDocumentDto {

    protected boolean commented;
    protected boolean denounced;
    protected Integer documentId;
    protected boolean following;
    protected boolean liked;
    protected Integer numberComments;
    protected Integer numberDenouncements;
    protected Integer numberFollows;
    protected Integer numberLikes;
    protected Integer numberShares;
    protected boolean shared;
    protected Long sociableId;
    protected Integer version;

    /**
     * Gets the value of the commented property.
     * 
     */
    public boolean isCommented() {
        return commented;
    }

    /**
     * Sets the value of the commented property.
     * 
     */
    public void setCommented(boolean value) {
        this.commented = value;
    }

    /**
     * Gets the value of the denounced property.
     * 
     */
    public boolean isDenounced() {
        return denounced;
    }

    /**
     * Sets the value of the denounced property.
     * 
     */
    public void setDenounced(boolean value) {
        this.denounced = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentId(Integer value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the following property.
     * 
     */
    public boolean isFollowing() {
        return following;
    }

    /**
     * Sets the value of the following property.
     * 
     */
    public void setFollowing(boolean value) {
        this.following = value;
    }

    /**
     * Gets the value of the liked property.
     * 
     */
    public boolean isLiked() {
        return liked;
    }

    /**
     * Sets the value of the liked property.
     * 
     */
    public void setLiked(boolean value) {
        this.liked = value;
    }

    /**
     * Gets the value of the numberComments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberComments() {
        return numberComments;
    }

    /**
     * Sets the value of the numberComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberComments(Integer value) {
        this.numberComments = value;
    }

    /**
     * Gets the value of the numberDenouncements property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDenouncements() {
        return numberDenouncements;
    }

    /**
     * Sets the value of the numberDenouncements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDenouncements(Integer value) {
        this.numberDenouncements = value;
    }

    /**
     * Gets the value of the numberFollows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberFollows() {
        return numberFollows;
    }

    /**
     * Sets the value of the numberFollows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberFollows(Integer value) {
        this.numberFollows = value;
    }

    /**
     * Gets the value of the numberLikes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberLikes() {
        return numberLikes;
    }

    /**
     * Sets the value of the numberLikes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberLikes(Integer value) {
        this.numberLikes = value;
    }

    /**
     * Gets the value of the numberShares property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberShares() {
        return numberShares;
    }

    /**
     * Sets the value of the numberShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberShares(Integer value) {
        this.numberShares = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     */
    public void setShared(boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the sociableId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSociableId() {
        return sociableId;
    }

    /**
     * Sets the value of the sociableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSociableId(Long value) {
        this.sociableId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
