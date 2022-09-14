package com.rank;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@PropertySource(value={"classpath:application.properties"})
@ComponentScan(basePackages = { "com.rank", "com.rank.api"})
@RestController
public class RankCasino {

    public static void main(String[] args) {
        SpringApplication.run(RankCasino.class, args);
    }

    @GetMapping(value="/")
    public String  home(){


        return "its working";
    }
}
