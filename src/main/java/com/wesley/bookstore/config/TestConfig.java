package com.wesley.bookstore.config;

import com.wesley.bookstore.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    private final DbService dbService;

    public TestConfig(DbService dbService) {
        this.dbService = dbService;
    }

    @Bean
    public String instanciaBaseDeDados() {
        this.dbService.instanciaBaseDeDados();
        return "Certo";
    }
}
