
package com.totvs.technology.ecm.dm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attach" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="editing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSelected" type="{http://ws.dm.ecm.technology.totvs.com/}attachment" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="filecontent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fullPatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iconPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pathName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachment", propOrder = {
    "attach",
    "descriptor",
    "editing",
    "fileName",
    "fileSelected",
    "fileSize",
    "filecontent",
    "fullPatch",
    "iconPath",
    "mobile",
    "pathName",
    "principal"
})
public class Attachment {

    protected Boolean attach;
    protected Boolean descriptor;
    protected Boolean editing;
    protected String fileName;
    protected Attachment fileSelected;
    protected long fileSize;
    protected byte[] filecontent;
    protected String fullPatch;
    protected String iconPath;
    protected Boolean mobile;
    protected String pathName;
    protected Boolean principal;

    /**
     * Gets the value of the attach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttach() {
        return attach;
    }

    /**
     * Sets the value of the attach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttach(Boolean value) {
        this.attach = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptor(Boolean value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the editing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditing() {
        return editing;
    }

    /**
     * Sets the value of the editing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditing(Boolean value) {
        this.editing = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getFileSelected() {
        return fileSelected;
    }

    /**
     * Sets the value of the fileSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setFileSelected(Attachment value) {
        this.fileSelected = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the filecontent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFilecontent() {
        return filecontent;
    }

    /**
     * Sets the value of the filecontent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFilecontent(byte[] value) {
        this.filecontent = value;
    }

    /**
     * Gets the value of the fullPatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPatch() {
        return fullPatch;
    }

    /**
     * Sets the value of the fullPatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPatch(String value) {
        this.fullPatch = value;
    }

    /**
     * Gets the value of the iconPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * Sets the value of the iconPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconPath(String value) {
        this.iconPath = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobile(Boolean value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the pathName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * Sets the value of the pathName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathName(String value) {
        this.pathName = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipal(Boolean value) {
        this.principal = value;
    }

}
