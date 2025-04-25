package io.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/poems")
public class Poems {

    @Inject
    AiPoemService aiPoemService;  //<1>

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/{mytopic}/{lines}")  //<2>
    public String showMeAPoem(String mytopic, int lines) {  //<3>
        return aiPoemService.writeAPoem(mytopic, lines);  // <4>
    }
}
