package io.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/poems")
public class Poems {

    @Inject
    AiPoemService aiPoemService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/{mytopic}/{lines}")
    public String showMeAPoem(String mytopic, int lines) {
        return aiPoemService.writeAPoem(mytopic, lines);
    }
}
