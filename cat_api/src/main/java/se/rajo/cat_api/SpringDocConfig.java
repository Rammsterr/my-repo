package se.rajo.cat_api;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
        .info(new Info()

          .title("Cat API")
                .version("1.0")
                .description("Cat API for managing cats")
        );
    }
}