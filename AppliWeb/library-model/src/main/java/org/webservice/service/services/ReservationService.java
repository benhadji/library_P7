
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
@WebService(name = "ReservationService", targetNamespace = "http://services.service.WebService.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationService {


    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.service.services.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getResaJobTicket1", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetResaJobTicket1")
    @ResponseWrapper(localName = "getResaJobTicket1Response", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetResaJobTicket1Response")
    @Action(input = "http://services.service.WebService.org/ReservationService/getResaJobTicket1Request", output = "http://services.service.WebService.org/ReservationService/getResaJobTicket1Response")
    public List<Reservation> getResaJobTicket1();

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.service.services.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllReservations", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetAllReservations")
    @ResponseWrapper(localName = "getAllReservationsResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetAllReservationsResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/getAllReservationsRequest", output = "http://services.service.WebService.org/ReservationService/getAllReservationsResponse")
    public List<Reservation> getAllReservations();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteReservation", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.DeleteReservation")
    @ResponseWrapper(localName = "deleteReservationResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.DeleteReservationResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/deleteReservationRequest", output = "http://services.service.WebService.org/ReservationService/deleteReservationResponse")
    public void deleteReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateReservation", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.UpdateReservation")
    @ResponseWrapper(localName = "updateReservationResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.UpdateReservationResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/updateReservationRequest", output = "http://services.service.WebService.org/ReservationService/updateReservationResponse")
    public void updateReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addReservation", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.AddReservation")
    @ResponseWrapper(localName = "addReservationResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.AddReservationResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/addReservationRequest", output = "http://services.service.WebService.org/ReservationService/addReservationResponse")
    public void addReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        UserAccount arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.service.services.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listResaByBook", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.ListResaByBook")
    @ResponseWrapper(localName = "listResaByBookResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.ListResaByBookResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/listResaByBookRequest", output = "http://services.service.WebService.org/ReservationService/listResaByBookResponse")
    public List<Reservation> listResaByBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.service.services.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listResaByUser", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.ListResaByUser")
    @ResponseWrapper(localName = "listResaByUserResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.ListResaByUserResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/listResaByUserRequest", output = "http://services.service.WebService.org/ReservationService/listResaByUserResponse")
    public List<Reservation> listResaByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserAccount arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.webservice.service.services.Reservation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getResaById", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetResaById")
    @ResponseWrapper(localName = "getResaByIdResponse", targetNamespace = "http://services.service.WebService.org/", className = "org.webservice.service.services.GetResaByIdResponse")
    @Action(input = "http://services.service.WebService.org/ReservationService/getResaByIdRequest", output = "http://services.service.WebService.org/ReservationService/getResaByIdResponse")
    public Reservation getResaById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
