
package org.webservice.service.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookService", targetNamespace = "http://services.service.WebService.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.service.services.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getByName", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetByName")
    @ResponseWrapper(localName = "getByNameResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetByNameResponse")
    @Action(input = "http://services.service.WebService.org/BookService/getByNameRequest", output = "http://services.service.WebService.org/BookService/getByNameResponse")
    public List<Book> getByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.webservice.service.services.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getById", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetById")
    @ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetByIdResponse")
    @Action(input = "http://services.service.WebService.org/BookService/getByIdRequest", output = "http://services.service.WebService.org/BookService/getByIdResponse")
    public Book getById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.service.services.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBooks", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetAllBooks")
    @ResponseWrapper(localName = "getAllBooksResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetAllBooksResponse")
    @Action(input = "http://services.service.WebService.org/BookService/getAllBooksRequest", output = "http://services.service.WebService.org/BookService/getAllBooksResponse")
    public List<Book> getAllBooks();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.service.services.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooksByAuthor", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetBooksByAuthor")
    @ResponseWrapper(localName = "getBooksByAuthorResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetBooksByAuthorResponse")
    @Action(input = "http://services.service.WebService.org/BookService/getBooksByAuthorRequest", output = "http://services.service.WebService.org/BookService/getBooksByAuthorResponse")
    public List<Book> getBooksByAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        Author arg0);

}
