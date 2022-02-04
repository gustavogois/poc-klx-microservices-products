package org.klx.microservices.core.recommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.klx")
public class RecommendationServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(RecommendationServiceApplication.class, args);
  }
}
