
package com.totvs.technology.ecm.dataservice.ws;

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
@WebServiceClient(name = "ECMDatasetServiceService", targetNamespace = "http://ws.dataservice.ecm.technology.totvs.com/", wsdlLocation = "https://bancovotorantim.fluig.com/webdesk/ECMDatasetService?wsdl")
public class ECMDatasetServiceService
    extends Service
{

    private final static URL ECMDATASETSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ECMDATASETSERVICESERVICE_EXCEPTION;
    private final static QName ECMDATASETSERVICESERVICE_QNAME = new QName("http://ws.dataservice.ecm.technology.totvs.com/", "ECMDatasetServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://bancovotorantim.fluig.com/webdesk/ECMDatasetService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECMDATASETSERVICESERVICE_WSDL_LOCATION = url;
        ECMDATASETSERVICESERVICE_EXCEPTION = e;
    }

    public ECMDatasetServiceService() {
        super(__getWsdlLocation(), ECMDATASETSERVICESERVICE_QNAME);
    }

    public ECMDatasetServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECMDATASETSERVICESERVICE_QNAME, features);
    }

    public ECMDatasetServiceService(URL wsdlLocation) {
        super(wsdlLocation, ECMDATASETSERVICESERVICE_QNAME);
    }

    public ECMDatasetServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECMDATASETSERVICESERVICE_QNAME, features);
    }

    public ECMDatasetServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ECMDatasetServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DatasetService
     */
    @WebEndpoint(name = "DatasetServicePort")
    public DatasetService getDatasetServicePort() {
        return super.getPort(new QName("http://ws.dataservice.ecm.technology.totvs.com/", "DatasetServicePort"), DatasetService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DatasetService
     */
    @WebEndpoint(name = "DatasetServicePort")
    public DatasetService getDatasetServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.dataservice.ecm.technology.totvs.com/", "DatasetServicePort"), DatasetService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECMDATASETSERVICESERVICE_EXCEPTION!= null) {
            throw ECMDATASETSERVICESERVICE_EXCEPTION;
        }
        return ECMDATASETSERVICESERVICE_WSDL_LOCATION;
    }

}