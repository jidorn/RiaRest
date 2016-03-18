package fr.afcepf.al26.ria.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * classe rest.
 */
@Path("/premier")
public class PremierService {

    /**
     * hello.
     *
     * @return hello.
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Rest In Peace";
    }

    /**
     * test.
     *
     * @param param1 test.
     * @return param.
     */
    @GET
    @Path("/hello/{p1}")
    @Produces(MediaType.TEXT_PLAIN)
    public String testParam(
            @PathParam(value = "p1") String param1) {
        return "Rest In Peace" + param1;
    }

    /**
     * test.
     *
     * @param param1 test.
     * @param param2 test.
     * @return string.
     */
    @GET
    @Path("/hello/{p1}/{p2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String testParam(
            @PathParam(value = "p1") String param1,
            @PathParam(value = "p2") String param2
    ) {
        return "Rest In Peace : " + param1 + ", " + param2;
    }

    @GET
    @Path("/totoXml/{id}/{nom}/{prenom}")
    @Produces(MediaType.TEXT_XML)
    public Toto getTotoXml(
            @PathParam(value = "id") int paramId,
            @PathParam(value = "nom") String paramNom,
            @PathParam(value = "prenom") String paramPrenom) {
        return new Toto(paramId,paramNom,paramPrenom);
    }

    @GET
    @Path("/totoJSON/{id}/{nom}/{prenom}")
    @Produces(MediaType.APPLICATION_JSON)
    public Toto getTotoJson(
            @PathParam(value = "id") int paramId,
            @PathParam(value = "nom") String paramNom,
            @PathParam(value = "prenom") String paramPrenom) {
        return new Toto(paramId,paramNom,paramPrenom);
    }

    @POST
    @Path("/formattoto")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Toto formatToto(Toto paramToto){
        paramToto.setNom(paramToto.getNom().toUpperCase());
        paramToto.setPrenom(paramToto.getPrenom().toUpperCase());
        return paramToto;
    }
}
