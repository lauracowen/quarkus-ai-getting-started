package dev.kevindubois;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService( )
public interface MyAiService {

    @SystemMessage("You are a professional poet") 
    @UserMessage("""
                Write a poem about {topic}. The poem should be {lines} lines long. 
                Display the poem in HTML (no markdown).
            """)
    String writeAPoem(String topic, int lines); 
}
