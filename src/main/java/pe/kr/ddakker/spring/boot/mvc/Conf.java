package pe.kr.ddakker.spring.boot.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Conf {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
