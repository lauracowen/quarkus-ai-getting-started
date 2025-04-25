package io.quarkus;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService( ) // <1>
public interface AiPoemService {

    @SystemMessage("You are a professional poet") // <2>
    @UserMessage("""
                Write a poem about {topic}. The poem should be {length} lines long. // <3>
                Display the poem in well-formed HTML with line breaks (no markdown).
            """)
    String writeAPoem(String topic, int length); // <4>
}
