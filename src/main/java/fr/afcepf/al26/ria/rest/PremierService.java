package fr.afcepf.al26.ria.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Stagiaire on 18/03/2016.
 */
@Path("/premier")
public class PremierService {

    /**
     * hello.
     * @return hello.
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld(){
        return "Rest In Peace";
    }
}
