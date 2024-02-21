package com.poja.sary_std22090.conf;

import com.poja.sary_std22090.PojaGenerated;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.PostgreSQLContainer;

@PojaGenerated
public class PostgresConf {

  private final PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13.9");

  void start() {
    postgres.start();
  }

  void stop() {
    postgres.stop();
  }

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.datasource.url", postgres::getJdbcUrl);
    registry.add("spring.datasource.username", postgres::getUsername);
    registry.add("spring.datasource.password", postgres::getPassword);
  }
}
