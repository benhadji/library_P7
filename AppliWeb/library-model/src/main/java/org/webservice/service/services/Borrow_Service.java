
package org.webservice.service.services;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Borrow", targetNamespace = "http://services.service.WebService.org/", wsdlLocation = "http://lfr023221:8080/library-service46650661518080117553/Borrow?wsdl")
public class Borrow_Service
    extends Service
{

    private final static URL BORROW_WSDL_LOCATION;
    private final static WebServiceException BORROW_EXCEPTION;
    private final static QName BORROW_QNAME = new QName("http://services.service.WebService.org/", "Borrow");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr023221:8080/library-service46650661518080117553/Borrow?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BORROW_WSDL_LOCATION = url;
        BORROW_EXCEPTION = e;
    }

    public Borrow_Service() {
        super(__getWsdlLocation(), BORROW_QNAME);
    }

    public Borrow_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BORROW_QNAME, features);
    }

    public Borrow_Service(URL wsdlLocation) {
        super(wsdlLocation, BORROW_QNAME);
    }

    public Borrow_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BORROW_QNAME, features);
    }

    public Borrow_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Borrow_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BorrowService
     */
    @WebEndpoint(name = "BorrowServicePort")
    public BorrowService getBorrowServicePort() {
        return super.getPort(new QName("http://services.service.WebService.org/", "BorrowServicePort"), BorrowService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BorrowService
     */
    @WebEndpoint(name = "BorrowServicePort")
    public BorrowService getBorrowServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.service.WebService.org/", "BorrowServicePort"), BorrowService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BORROW_EXCEPTION!= null) {
            throw BORROW_EXCEPTION;
        }
        return BORROW_WSDL_LOCATION;
    }

}
