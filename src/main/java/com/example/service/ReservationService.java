package com.example.service;

import com.example.entity.Reservation;
import com.example.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

/**
 * @author sudhir
 *         Date:7/11/16
 *         Time:3:57 PM
 *         Project:demo
 */
@Service
@Path("/reservations")
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllReservation(){
            Collection<Reservation> reservations= reservationRepository.findAll();
            Response response=Response.status(Response.Status.OK).entity(reservations).build();
        return response;
    }
}
