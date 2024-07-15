package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Path("/")
public class MainRestController {

    @Inject
    @RestClient
    CatServiceClient ninjaCatCliennt;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public Response hello() {
        log.info("hello endpoint triggered");
        Response result = Response.fromResponse(ninjaCatCliennt.getNinjaCatFact()).build();
        log.info("After ninjaCat");
        return result;
    }
}
