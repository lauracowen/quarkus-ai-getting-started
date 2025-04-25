package io.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/poem")
public class MyResource {

    @Inject
    MyAiService myAiService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/{topic}/{lines}")
    public String writeAPoem(String topic, int lines) {
        return myAiService.writeAPoem(topic, lines);
    }
}
