package fr.afcepf.al26.ria.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

    @GET
    @Path("/hello/{p1}")
    @Produces(MediaType.TEXT_PLAIN)
    public String testParam(
            @PathParam(value = "p1") String param1){
        return "Rest In Peace"+ param1;
    }

    @GET
    @Path("/hello/{p1}/{p2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String testParam(
            @PathParam(value = "p1") String param1,
            @PathParam(value = "p2") String param2
    ){
        return "Rest In Peace : "+ param1+", "+param2;
    }
}
