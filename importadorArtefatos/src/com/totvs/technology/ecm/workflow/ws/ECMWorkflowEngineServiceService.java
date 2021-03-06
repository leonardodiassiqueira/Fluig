
package com.totvs.technology.ecm.workflow.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ECMWorkflowEngineServiceService", targetNamespace = "http://ws.workflow.ecm.technology.totvs.com/", wsdlLocation = "http://bancovotorantim.fluig.com/webdesk/ECMWorkflowEngineService?wsdl")
public class ECMWorkflowEngineServiceService
    extends Service
{

    private final static URL ECMWORKFLOWENGINESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ECMWORKFLOWENGINESERVICESERVICE_EXCEPTION;
    private final static QName ECMWORKFLOWENGINESERVICESERVICE_QNAME = new QName("http://ws.workflow.ecm.technology.totvs.com/", "ECMWorkflowEngineServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://bancovotorantim.fluig.com/webdesk/ECMWorkflowEngineService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECMWORKFLOWENGINESERVICESERVICE_WSDL_LOCATION = url;
        ECMWORKFLOWENGINESERVICESERVICE_EXCEPTION = e;
    }

    public ECMWorkflowEngineServiceService() {
        super(__getWsdlLocation(), ECMWORKFLOWENGINESERVICESERVICE_QNAME);
    }

    public ECMWorkflowEngineServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECMWORKFLOWENGINESERVICESERVICE_QNAME, features);
    }

    public ECMWorkflowEngineServiceService(URL wsdlLocation) {
        super(wsdlLocation, ECMWORKFLOWENGINESERVICESERVICE_QNAME);
    }

    public ECMWorkflowEngineServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECMWORKFLOWENGINESERVICESERVICE_QNAME, features);
    }

    public ECMWorkflowEngineServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ECMWorkflowEngineServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkflowEngineService
     */
    @WebEndpoint(name = "WorkflowEngineServicePort")
    public WorkflowEngineService getWorkflowEngineServicePort() {
        return super.getPort(new QName("http://ws.workflow.ecm.technology.totvs.com/", "WorkflowEngineServicePort"), WorkflowEngineService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkflowEngineService
     */
    @WebEndpoint(name = "WorkflowEngineServicePort")
    public WorkflowEngineService getWorkflowEngineServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.workflow.ecm.technology.totvs.com/", "WorkflowEngineServicePort"), WorkflowEngineService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECMWORKFLOWENGINESERVICESERVICE_EXCEPTION!= null) {
            throw ECMWORKFLOWENGINESERVICESERVICE_EXCEPTION;
        }
        return ECMWORKFLOWENGINESERVICESERVICE_WSDL_LOCATION;
    }

}
