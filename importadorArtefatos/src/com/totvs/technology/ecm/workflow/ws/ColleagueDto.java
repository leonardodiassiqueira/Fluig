
package com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colleagueDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="colleagueDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adminUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="area1Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area2Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area3Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area4Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area5Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleaguebackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="currentProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dialectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecmVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="especializationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gedUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxPrivateSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="menuConfig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nominalUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="passwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedSpace" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "colleagueDto", propOrder = {
    "active",
    "adminUser",
    "area1Id",
    "area2Id",
    "area3Id",
    "area4Id",
    "area5Id",
    "colleagueId",
    "colleagueName",
    "colleaguebackground",
    "companyId",
    "currentProject",
    "defaultLanguage",
    "dialectId",
    "ecmVersion",
    "emailHtml",
    "especializationArea",
    "extensionNr",
    "gedUser",
    "groupId",
    "guestUser",
    "homePage",
    "login",
    "mail",
    "maxPrivateSize",
    "menuConfig",
    "nominalUser",
    "passwd",
    "photoPath",
    "rowId",
    "sessionId",
    "usedSpace",
    "volumeId"
})
public class ColleagueDto {

    protected Boolean active;
    protected Boolean adminUser;
    protected Integer area1Id;
    protected Integer area2Id;
    protected Integer area3Id;
    protected Integer area4Id;
    protected Integer area5Id;
    protected String colleagueId;
    protected String colleagueName;
    protected String colleaguebackground;
    protected long companyId;
    protected String currentProject;
    protected String defaultLanguage;
    protected String dialectId;
    protected String ecmVersion;
    protected Boolean emailHtml;
    protected String especializationArea;
    protected String extensionNr;
    protected Boolean gedUser;
    protected String groupId;
    protected Boolean guestUser;
    protected String homePage;
    protected String login;
    protected String mail;
    protected Float maxPrivateSize;
    protected Integer menuConfig;
    protected Boolean nominalUser;
    protected String passwd;
    protected String photoPath;
    protected int rowId;
    protected String sessionId;
    protected Float usedSpace;
    protected String volumeId;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the adminUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminUser() {
        return adminUser;
    }

    /**
     * Sets the value of the adminUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminUser(Boolean value) {
        this.adminUser = value;
    }

    /**
     * Gets the value of the area1Id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea1Id() {
        return area1Id;
    }

    /**
     * Sets the value of the area1Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea1Id(Integer value) {
        this.area1Id = value;
    }

    /**
     * Gets the value of the area2Id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea2Id() {
        return area2Id;
    }

    /**
     * Sets the value of the area2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea2Id(Integer value) {
        this.area2Id = value;
    }

    /**
     * Gets the value of the area3Id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea3Id() {
        return area3Id;
    }

    /**
     * Sets the value of the area3Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea3Id(Integer value) {
        this.area3Id = value;
    }

    /**
     * Gets the value of the area4Id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea4Id() {
        return area4Id;
    }

    /**
     * Sets the value of the area4Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea4Id(Integer value) {
        this.area4Id = value;
    }

    /**
     * Gets the value of the area5Id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea5Id() {
        return area5Id;
    }

    /**
     * Sets the value of the area5Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea5Id(Integer value) {
        this.area5Id = value;
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
     * Gets the value of the colleaguebackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleaguebackground() {
        return colleaguebackground;
    }

    /**
     * Sets the value of the colleaguebackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleaguebackground(String value) {
        this.colleaguebackground = value;
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
     * Gets the value of the currentProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentProject() {
        return currentProject;
    }

    /**
     * Sets the value of the currentProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentProject(String value) {
        this.currentProject = value;
    }

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the dialectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialectId() {
        return dialectId;
    }

    /**
     * Sets the value of the dialectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialectId(String value) {
        this.dialectId = value;
    }

    /**
     * Gets the value of the ecmVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcmVersion() {
        return ecmVersion;
    }

    /**
     * Sets the value of the ecmVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcmVersion(String value) {
        this.ecmVersion = value;
    }

    /**
     * Gets the value of the emailHtml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailHtml() {
        return emailHtml;
    }

    /**
     * Sets the value of the emailHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailHtml(Boolean value) {
        this.emailHtml = value;
    }

    /**
     * Gets the value of the especializationArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecializationArea() {
        return especializationArea;
    }

    /**
     * Sets the value of the especializationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecializationArea(String value) {
        this.especializationArea = value;
    }

    /**
     * Gets the value of the extensionNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNr() {
        return extensionNr;
    }

    /**
     * Sets the value of the extensionNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNr(String value) {
        this.extensionNr = value;
    }

    /**
     * Gets the value of the gedUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGedUser() {
        return gedUser;
    }

    /**
     * Sets the value of the gedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGedUser(Boolean value) {
        this.gedUser = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the guestUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestUser() {
        return guestUser;
    }

    /**
     * Sets the value of the guestUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestUser(Boolean value) {
        this.guestUser = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the maxPrivateSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPrivateSize() {
        return maxPrivateSize;
    }

    /**
     * Sets the value of the maxPrivateSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPrivateSize(Float value) {
        this.maxPrivateSize = value;
    }

    /**
     * Gets the value of the menuConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMenuConfig() {
        return menuConfig;
    }

    /**
     * Sets the value of the menuConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMenuConfig(Integer value) {
        this.menuConfig = value;
    }

    /**
     * Gets the value of the nominalUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNominalUser() {
        return nominalUser;
    }

    /**
     * Sets the value of the nominalUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNominalUser(Boolean value) {
        this.nominalUser = value;
    }

    /**
     * Gets the value of the passwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Sets the value of the passwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswd(String value) {
        this.passwd = value;
    }

    /**
     * Gets the value of the photoPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * Sets the value of the photoPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoPath(String value) {
        this.photoPath = value;
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
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the usedSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUsedSpace() {
        return usedSpace;
    }

    /**
     * Sets the value of the usedSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUsedSpace(Float value) {
        this.usedSpace = value;
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
