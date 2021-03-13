
package com.totvs.technology.ecm.dm.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.totvs.technology.ecm.dm.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ws.dm.ecm.technology.totvs.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.totvs.technology.ecm.dm.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ApproverDtoArray }
     * 
     */
    public ApproverDtoArray createApproverDtoArray() {
        return new ApproverDtoArray();
    }

    /**
     * Create an instance of {@link RelatedDocumentDto }
     * 
     */
    public RelatedDocumentDto createRelatedDocumentDto() {
        return new RelatedDocumentDto();
    }

    /**
     * Create an instance of {@link DocumentSecurityConfigDto }
     * 
     */
    public DocumentSecurityConfigDto createDocumentSecurityConfigDto() {
        return new DocumentSecurityConfigDto();
    }

    /**
     * Create an instance of {@link WebServiceMessageArray }
     * 
     */
    public WebServiceMessageArray createWebServiceMessageArray() {
        return new WebServiceMessageArray();
    }

    /**
     * Create an instance of {@link DocumentApprovalStatusDtoArray }
     * 
     */
    public DocumentApprovalStatusDtoArray createDocumentApprovalStatusDtoArray() {
        return new DocumentApprovalStatusDtoArray();
    }

    /**
     * Create an instance of {@link ApproverDto }
     * 
     */
    public ApproverDto createApproverDto() {
        return new ApproverDto();
    }

    /**
     * Create an instance of {@link ApprovalLevelDto }
     * 
     */
    public ApprovalLevelDto createApprovalLevelDto() {
        return new ApprovalLevelDto();
    }

    /**
     * Create an instance of {@link ApprovalLevelDtoArray }
     * 
     */
    public ApprovalLevelDtoArray createApprovalLevelDtoArray() {
        return new ApprovalLevelDtoArray();
    }

    /**
     * Create an instance of {@link DocumentSecurityConfigDtoArray }
     * 
     */
    public DocumentSecurityConfigDtoArray createDocumentSecurityConfigDtoArray() {
        return new DocumentSecurityConfigDtoArray();
    }

    /**
     * Create an instance of {@link AttachmentArray }
     * 
     */
    public AttachmentArray createAttachmentArray() {
        return new AttachmentArray();
    }

    /**
     * Create an instance of {@link ApproverWithLevelDtoArray }
     * 
     */
    public ApproverWithLevelDtoArray createApproverWithLevelDtoArray() {
        return new ApproverWithLevelDtoArray();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link WebServiceMessage }
     * 
     */
    public WebServiceMessage createWebServiceMessage() {
        return new WebServiceMessage();
    }

    /**
     * Create an instance of {@link DocumentDto }
     * 
     */
    public DocumentDto createDocumentDto() {
        return new DocumentDto();
    }

    /**
     * Create an instance of {@link DocumentApprovalStatusDto }
     * 
     */
    public DocumentApprovalStatusDto createDocumentApprovalStatusDto() {
        return new DocumentApprovalStatusDto();
    }

    /**
     * Create an instance of {@link DocumentApprovementHistoryDtoArray }
     * 
     */
    public DocumentApprovementHistoryDtoArray createDocumentApprovementHistoryDtoArray() {
        return new DocumentApprovementHistoryDtoArray();
    }

    /**
     * Create an instance of {@link SociableDocumentDto }
     * 
     */
    public SociableDocumentDto createSociableDocumentDto() {
        return new SociableDocumentDto();
    }

    /**
     * Create an instance of {@link ApproverWithLevelDto }
     * 
     */
    public ApproverWithLevelDto createApproverWithLevelDto() {
        return new ApproverWithLevelDto();
    }

    /**
     * Create an instance of {@link DocumentDtoArray }
     * 
     */
    public DocumentDtoArray createDocumentDtoArray() {
        return new DocumentDtoArray();
    }

    /**
     * Create an instance of {@link DocumentApprovementHistoryDto }
     * 
     */
    public DocumentApprovementHistoryDto createDocumentApprovementHistoryDto() {
        return new DocumentApprovementHistoryDto();
    }

    /**
     * Create an instance of {@link RelatedDocumentDtoArray }
     * 
     */
    public RelatedDocumentDtoArray createRelatedDocumentDtoArray() {
        return new RelatedDocumentDtoArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.dm.ecm.technology.totvs.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
