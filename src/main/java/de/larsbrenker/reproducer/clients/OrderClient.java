package de.larsbrenker.reproducer.clients;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(baseUri = "http://orderservice:8080")
@Produces(MediaType.APPLICATION_JSON)
@Path("order")
public interface OrderClient {

    @GET
    @Path("commissioned")
    Response isCommissioned();

}
