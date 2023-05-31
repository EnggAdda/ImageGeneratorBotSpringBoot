package com.example.imagegeneratorbotspringboot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenAIConfig {

    private static final String   OPENAI_KEY  = "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";
    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((request, body, execution) -> {
           request.getHeaders().add("Authorization" ,"Bearer "+ OPENAI_KEY);
           return execution.execute(request,body);
        });
        return restTemplate;
    }


}
