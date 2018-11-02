
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
@WebServiceClient(name = "Book", targetNamespace = "http://services.service.WebService.org/", wsdlLocation = "http://lfr023221:8080/library-service46650661518080117553/Book?wsdl")
public class Book_Service
    extends Service
{

    private final static URL BOOK_WSDL_LOCATION;
    private final static WebServiceException BOOK_EXCEPTION;
    private final static QName BOOK_QNAME = new QName("http://services.service.WebService.org/", "Book");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr023221:8080/library-service46650661518080117553/Book?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOK_WSDL_LOCATION = url;
        BOOK_EXCEPTION = e;
    }

    public Book_Service() {
        super(__getWsdlLocation(), BOOK_QNAME);
    }

    public Book_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOK_QNAME, features);
    }

    public Book_Service(URL wsdlLocation) {
        super(wsdlLocation, BOOK_QNAME);
    }

    public Book_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOK_QNAME, features);
    }

    public Book_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Book_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServicePort")
    public BookService getBookServicePort() {
        return super.getPort(new QName("http://services.service.WebService.org/", "BookServicePort"), BookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServicePort")
    public BookService getBookServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.service.WebService.org/", "BookServicePort"), BookService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOK_EXCEPTION!= null) {
            throw BOOK_EXCEPTION;
        }
        return BOOK_WSDL_LOCATION;
    }

}
