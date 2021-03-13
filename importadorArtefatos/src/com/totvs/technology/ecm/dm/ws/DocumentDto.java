
package com.totvs.technology.ecm.dm.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for documentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="activeUserApprover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="activeVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="additionalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowMuiltiCardsPerUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvalAndOr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="articleContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://ws.dm.ecm.technology.totvs.com/}attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="atualizationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bannerImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="crc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createDateInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="datasetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFormStarted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="documentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentKeyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentPropertyNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentPropertyVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downloadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="draft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expiredForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="forAproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iconId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iconPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indexed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inheritSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="internalVisualizer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="metaListRecordId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newStructure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="onCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parentDocumentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pdfRenderEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="phisicalFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phisicalFileSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="privateColleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privateDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="protectedCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedFiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restrictionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="securityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sociableDocumentDto" type="{http://ws.dm.ecm.technology.totvs.com/}sociableDocumentDto" minOccurs="0"/>
 *         &lt;element name="socialDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="topicId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="translated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateIsoProperties" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userAnswerForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userPermission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="validationStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visualization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentDto", propOrder = {
    "accessCount",
    "activeUserApprover",
    "activeVersion",
    "additionalComments",
    "allowMuiltiCardsPerUser",
    "approvalAndOr",
    "approved",
    "approvedDate",
    "articleContent",
    "attachments",
    "atualizationId",
    "backgroundColor",
    "backgroundImage",
    "bannerImage",
    "cardDescription",
    "colleagueId",
    "colleagueName",
    "companyId",
    "crc",
    "createDate",
    "createDateInMilliseconds",
    "datasetName",
    "dateFormStarted",
    "deleted",
    "documentDescription",
    "documentId",
    "documentKeyWord",
    "documentPropertyNumber",
    "documentPropertyVersion",
    "documentType",
    "documentTypeId",
    "downloadEnabled",
    "draft",
    "expirationDate",
    "expiredForm",
    "expires",
    "externalDocumentId",
    "favorite",
    "fileURL",
    "folderId",
    "forAproval",
    "iconId",
    "iconPath",
    "imutable",
    "indexed",
    "inheritSecurity",
    "internalVisualizer",
    "isEncrypted",
    "keyWord",
    "languageId",
    "languageIndicator",
    "lastModifiedDate",
    "lastModifiedTime",
    "metaListId",
    "metaListRecordId",
    "newStructure",
    "onCheckout",
    "parentDocumentId",
    "pdfRenderEngine",
    "permissionType",
    "phisicalFile",
    "phisicalFileSize",
    "priority",
    "privateColleagueId",
    "privateDocument",
    "protectedCopy",
    "publisherId",
    "publisherName",
    "relatedFiles",
    "restrictionType",
    "rowId",
    "searchNumber",
    "securityLevel",
    "siteCode",
    "sociableDocumentDto",
    "socialDocument",
    "tool",
    "topicId",
    "translated",
    "uuid",
    "updateIsoProperties",
    "userAnswerForm",
    "userNotify",
    "userPermission",
    "validationStartDate",
    "version",
    "versionDescription",
    "versionOption",
    "visualization",
    "volumeId"
})
public class DocumentDto {

    protected Integer accessCount;
    protected Boolean activeUserApprover;
    protected Boolean activeVersion;
    protected String additionalComments;
    protected Boolean allowMuiltiCardsPerUser;
    protected Boolean approvalAndOr;
    protected Boolean approved;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDate;
    protected String articleContent;
    @XmlElement(nillable = true)
    protected List<Attachment> attachments;
    protected Integer atualizationId;
    protected String backgroundColor;
    protected String backgroundImage;
    protected String bannerImage;
    protected String cardDescription;
    protected String colleagueId;
    protected String colleagueName;
    protected long companyId;
    protected Long crc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected long createDateInMilliseconds;
    protected String datasetName;
    protected Boolean dateFormStarted;
    protected Boolean deleted;
    protected String documentDescription;
    protected Integer documentId;
    protected String documentKeyWord;
    protected Integer documentPropertyNumber;
    protected Integer documentPropertyVersion;
    protected String documentType;
    protected String documentTypeId;
    protected Boolean downloadEnabled;
    protected Boolean draft;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected Boolean expiredForm;
    protected Boolean expires;
    protected String externalDocumentId;
    protected Boolean favorite;
    protected String fileURL;
    protected Integer folderId;
    protected boolean forAproval;
    protected Integer iconId;
    protected String iconPath;
    protected Boolean imutable;
    protected Boolean indexed;
    protected boolean inheritSecurity;
    protected Boolean internalVisualizer;
    protected Boolean isEncrypted;
    protected String keyWord;
    protected String languageId;
    protected String languageIndicator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String lastModifiedTime;
    protected Integer metaListId;
    protected Integer metaListRecordId;
    protected Boolean newStructure;
    protected boolean onCheckout;
    protected Integer parentDocumentId;
    protected String pdfRenderEngine;
    protected Integer permissionType;
    protected String phisicalFile;
    protected Float phisicalFileSize;
    protected Integer priority;
    protected String privateColleagueId;
    protected Boolean privateDocument;
    protected Boolean protectedCopy;
    protected String publisherId;
    protected String publisherName;
    protected String relatedFiles;
    protected Integer restrictionType;
    protected int rowId;
    protected Integer searchNumber;
    protected int securityLevel;
    protected String siteCode;
    protected SociableDocumentDto sociableDocumentDto;
    protected String socialDocument;
    protected Boolean tool;
    protected Integer topicId;
    protected boolean translated;
    @XmlElement(name = "UUID")
    protected String uuid;
    protected boolean updateIsoProperties;
    protected Boolean userAnswerForm;
    protected Boolean userNotify;
    protected Integer userPermission;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validationStartDate;
    protected int version;
    protected String versionDescription;
    protected String versionOption;
    protected String visualization;
    protected String volumeId;

    /**
     * Gets the value of the accessCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessCount() {
        return accessCount;
    }

    /**
     * Sets the value of the accessCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessCount(Integer value) {
        this.accessCount = value;
    }

    /**
     * Gets the value of the activeUserApprover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveUserApprover() {
        return activeUserApprover;
    }

    /**
     * Sets the value of the activeUserApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveUserApprover(Boolean value) {
        this.activeUserApprover = value;
    }

    /**
     * Gets the value of the activeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveVersion() {
        return activeVersion;
    }

    /**
     * Sets the value of the activeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveVersion(Boolean value) {
        this.activeVersion = value;
    }

    /**
     * Gets the value of the additionalComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalComments() {
        return additionalComments;
    }

    /**
     * Sets the value of the additionalComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalComments(String value) {
        this.additionalComments = value;
    }

    /**
     * Gets the value of the allowMuiltiCardsPerUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMuiltiCardsPerUser() {
        return allowMuiltiCardsPerUser;
    }

    /**
     * Sets the value of the allowMuiltiCardsPerUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMuiltiCardsPerUser(Boolean value) {
        this.allowMuiltiCardsPerUser = value;
    }

    /**
     * Gets the value of the approvalAndOr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprovalAndOr() {
        return approvalAndOr;
    }

    /**
     * Sets the value of the approvalAndOr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApprovalAndOr(Boolean value) {
        this.approvalAndOr = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the approvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDate() {
        return approvedDate;
    }

    /**
     * Sets the value of the approvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDate(XMLGregorianCalendar value) {
        this.approvedDate = value;
    }

    /**
     * Gets the value of the articleContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * Sets the value of the articleContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleContent(String value) {
        this.articleContent = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the atualizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAtualizationId() {
        return atualizationId;
    }

    /**
     * Sets the value of the atualizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAtualizationId(Integer value) {
        this.atualizationId = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the backgroundImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Sets the value of the backgroundImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImage(String value) {
        this.backgroundImage = value;
    }

    /**
     * Gets the value of the bannerImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerImage() {
        return bannerImage;
    }

    /**
     * Sets the value of the bannerImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerImage(String value) {
        this.bannerImage = value;
    }

    /**
     * Gets the value of the cardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDescription() {
        return cardDescription;
    }

    /**
     * Sets the value of the cardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDescription(String value) {
        this.cardDescription = value;
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
     * Gets the value of the crc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrc() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrc(Long value) {
        this.crc = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createDateInMilliseconds property.
     * 
     */
    public long getCreateDateInMilliseconds() {
        return createDateInMilliseconds;
    }

    /**
     * Sets the value of the createDateInMilliseconds property.
     * 
     */
    public void setCreateDateInMilliseconds(long value) {
        this.createDateInMilliseconds = value;
    }

    /**
     * Gets the value of the datasetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * Sets the value of the datasetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetName(String value) {
        this.datasetName = value;
    }

    /**
     * Gets the value of the dateFormStarted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateFormStarted() {
        return dateFormStarted;
    }

    /**
     * Sets the value of the dateFormStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateFormStarted(Boolean value) {
        this.dateFormStarted = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the documentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Sets the value of the documentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
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
     * Gets the value of the documentKeyWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentKeyWord() {
        return documentKeyWord;
    }

    /**
     * Sets the value of the documentKeyWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentKeyWord(String value) {
        this.documentKeyWord = value;
    }

    /**
     * Gets the value of the documentPropertyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentPropertyNumber() {
        return documentPropertyNumber;
    }

    /**
     * Sets the value of the documentPropertyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentPropertyNumber(Integer value) {
        this.documentPropertyNumber = value;
    }

    /**
     * Gets the value of the documentPropertyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentPropertyVersion() {
        return documentPropertyVersion;
    }

    /**
     * Sets the value of the documentPropertyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentPropertyVersion(Integer value) {
        this.documentPropertyVersion = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Sets the value of the documentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeId(String value) {
        this.documentTypeId = value;
    }

    /**
     * Gets the value of the downloadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadEnabled() {
        return downloadEnabled;
    }

    /**
     * Sets the value of the downloadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadEnabled(Boolean value) {
        this.downloadEnabled = value;
    }

    /**
     * Gets the value of the draft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDraft() {
        return draft;
    }

    /**
     * Sets the value of the draft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDraft(Boolean value) {
        this.draft = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the expiredForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpiredForm() {
        return expiredForm;
    }

    /**
     * Sets the value of the expiredForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiredForm(Boolean value) {
        this.expiredForm = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpires(Boolean value) {
        this.expires = value;
    }

    /**
     * Gets the value of the externalDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentId() {
        return externalDocumentId;
    }

    /**
     * Sets the value of the externalDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentId(String value) {
        this.externalDocumentId = value;
    }

    /**
     * Gets the value of the favorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorite(Boolean value) {
        this.favorite = value;
    }

    /**
     * Gets the value of the fileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the value of the fileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileURL(String value) {
        this.fileURL = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the forAproval property.
     * 
     */
    public boolean isForAproval() {
        return forAproval;
    }

    /**
     * Sets the value of the forAproval property.
     * 
     */
    public void setForAproval(boolean value) {
        this.forAproval = value;
    }

    /**
     * Gets the value of the iconId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIconId() {
        return iconId;
    }

    /**
     * Sets the value of the iconId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIconId(Integer value) {
        this.iconId = value;
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
     * Gets the value of the imutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImutable() {
        return imutable;
    }

    /**
     * Sets the value of the imutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImutable(Boolean value) {
        this.imutable = value;
    }

    /**
     * Gets the value of the indexed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexed() {
        return indexed;
    }

    /**
     * Sets the value of the indexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexed(Boolean value) {
        this.indexed = value;
    }

    /**
     * Gets the value of the inheritSecurity property.
     * 
     */
    public boolean isInheritSecurity() {
        return inheritSecurity;
    }

    /**
     * Sets the value of the inheritSecurity property.
     * 
     */
    public void setInheritSecurity(boolean value) {
        this.inheritSecurity = value;
    }

    /**
     * Gets the value of the internalVisualizer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalVisualizer() {
        return internalVisualizer;
    }

    /**
     * Sets the value of the internalVisualizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalVisualizer(Boolean value) {
        this.internalVisualizer = value;
    }

    /**
     * Gets the value of the isEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Sets the value of the isEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEncrypted(Boolean value) {
        this.isEncrypted = value;
    }

    /**
     * Gets the value of the keyWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * Sets the value of the keyWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWord(String value) {
        this.keyWord = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the languageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageIndicator() {
        return languageIndicator;
    }

    /**
     * Sets the value of the languageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageIndicator(String value) {
        this.languageIndicator = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTime(String value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the metaListId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMetaListId() {
        return metaListId;
    }

    /**
     * Sets the value of the metaListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMetaListId(Integer value) {
        this.metaListId = value;
    }

    /**
     * Gets the value of the metaListRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMetaListRecordId() {
        return metaListRecordId;
    }

    /**
     * Sets the value of the metaListRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMetaListRecordId(Integer value) {
        this.metaListRecordId = value;
    }

    /**
     * Gets the value of the newStructure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewStructure() {
        return newStructure;
    }

    /**
     * Sets the value of the newStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewStructure(Boolean value) {
        this.newStructure = value;
    }

    /**
     * Gets the value of the onCheckout property.
     * 
     */
    public boolean isOnCheckout() {
        return onCheckout;
    }

    /**
     * Sets the value of the onCheckout property.
     * 
     */
    public void setOnCheckout(boolean value) {
        this.onCheckout = value;
    }

    /**
     * Gets the value of the parentDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentDocumentId() {
        return parentDocumentId;
    }

    /**
     * Sets the value of the parentDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentDocumentId(Integer value) {
        this.parentDocumentId = value;
    }

    /**
     * Gets the value of the pdfRenderEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfRenderEngine() {
        return pdfRenderEngine;
    }

    /**
     * Sets the value of the pdfRenderEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfRenderEngine(String value) {
        this.pdfRenderEngine = value;
    }

    /**
     * Gets the value of the permissionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPermissionType() {
        return permissionType;
    }

    /**
     * Sets the value of the permissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPermissionType(Integer value) {
        this.permissionType = value;
    }

    /**
     * Gets the value of the phisicalFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhisicalFile() {
        return phisicalFile;
    }

    /**
     * Sets the value of the phisicalFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhisicalFile(String value) {
        this.phisicalFile = value;
    }

    /**
     * Gets the value of the phisicalFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPhisicalFileSize() {
        return phisicalFileSize;
    }

    /**
     * Sets the value of the phisicalFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPhisicalFileSize(Float value) {
        this.phisicalFileSize = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the privateColleagueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateColleagueId() {
        return privateColleagueId;
    }

    /**
     * Sets the value of the privateColleagueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateColleagueId(String value) {
        this.privateColleagueId = value;
    }

    /**
     * Gets the value of the privateDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateDocument() {
        return privateDocument;
    }

    /**
     * Sets the value of the privateDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateDocument(Boolean value) {
        this.privateDocument = value;
    }

    /**
     * Gets the value of the protectedCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtectedCopy() {
        return protectedCopy;
    }

    /**
     * Sets the value of the protectedCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectedCopy(Boolean value) {
        this.protectedCopy = value;
    }

    /**
     * Gets the value of the publisherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherId(String value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the relatedFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedFiles() {
        return relatedFiles;
    }

    /**
     * Sets the value of the relatedFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedFiles(String value) {
        this.relatedFiles = value;
    }

    /**
     * Gets the value of the restrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionType() {
        return restrictionType;
    }

    /**
     * Sets the value of the restrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionType(Integer value) {
        this.restrictionType = value;
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
     * Gets the value of the searchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchNumber() {
        return searchNumber;
    }

    /**
     * Sets the value of the searchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchNumber(Integer value) {
        this.searchNumber = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     */
    public int getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     */
    public void setSecurityLevel(int value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the sociableDocumentDto property.
     * 
     * @return
     *     possible object is
     *     {@link SociableDocumentDto }
     *     
     */
    public SociableDocumentDto getSociableDocumentDto() {
        return sociableDocumentDto;
    }

    /**
     * Sets the value of the sociableDocumentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SociableDocumentDto }
     *     
     */
    public void setSociableDocumentDto(SociableDocumentDto value) {
        this.sociableDocumentDto = value;
    }

    /**
     * Gets the value of the socialDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialDocument() {
        return socialDocument;
    }

    /**
     * Sets the value of the socialDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialDocument(String value) {
        this.socialDocument = value;
    }

    /**
     * Gets the value of the tool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTool() {
        return tool;
    }

    /**
     * Sets the value of the tool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTool(Boolean value) {
        this.tool = value;
    }

    /**
     * Gets the value of the topicId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * Sets the value of the topicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopicId(Integer value) {
        this.topicId = value;
    }

    /**
     * Gets the value of the translated property.
     * 
     */
    public boolean isTranslated() {
        return translated;
    }

    /**
     * Sets the value of the translated property.
     * 
     */
    public void setTranslated(boolean value) {
        this.translated = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the updateIsoProperties property.
     * 
     */
    public boolean isUpdateIsoProperties() {
        return updateIsoProperties;
    }

    /**
     * Sets the value of the updateIsoProperties property.
     * 
     */
    public void setUpdateIsoProperties(boolean value) {
        this.updateIsoProperties = value;
    }

    /**
     * Gets the value of the userAnswerForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAnswerForm() {
        return userAnswerForm;
    }

    /**
     * Sets the value of the userAnswerForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAnswerForm(Boolean value) {
        this.userAnswerForm = value;
    }

    /**
     * Gets the value of the userNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserNotify() {
        return userNotify;
    }

    /**
     * Sets the value of the userNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserNotify(Boolean value) {
        this.userNotify = value;
    }

    /**
     * Gets the value of the userPermission property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserPermission() {
        return userPermission;
    }

    /**
     * Sets the value of the userPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserPermission(Integer value) {
        this.userPermission = value;
    }

    /**
     * Gets the value of the validationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationStartDate() {
        return validationStartDate;
    }

    /**
     * Sets the value of the validationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationStartDate(XMLGregorianCalendar value) {
        this.validationStartDate = value;
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

    /**
     * Gets the value of the versionOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionOption() {
        return versionOption;
    }

    /**
     * Sets the value of the versionOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionOption(String value) {
        this.versionOption = value;
    }

    /**
     * Gets the value of the visualization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualization() {
        return visualization;
    }

    /**
     * Sets the value of the visualization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualization(String value) {
        this.visualization = value;
    }

    /**
     * Gets the value of the volumeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * Sets the value of the volumeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeId(String value) {
        this.volumeId = value;
    }

}
