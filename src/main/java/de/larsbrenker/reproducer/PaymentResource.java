package de.larsbrenker.reproducer;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
@RequestScoped
public class PaymentResource {

    @GET
    @Path("order/paid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isPaid() {
        return Response.ok().build();
    }

}
