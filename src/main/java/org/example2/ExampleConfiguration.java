package org.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {
    @Bean
    Person getPerson() {
        return new Person("Serg");
    }

}
