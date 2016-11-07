package com.example.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author sudhir
 *         Date:7/11/16
 *         Time:3:38 PM
 *         Project:demo
 */
@Service
@Path("/greeting")
public class GreetingService {

    @GET
    @Produces("text/plain")
    public String greeting(){
        return "Good morning";
    }
}
