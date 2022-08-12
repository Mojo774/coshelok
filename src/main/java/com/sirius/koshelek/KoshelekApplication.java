package com.sirius.koshelek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KoshelekApplication {

    public static void main(String[] args) {
        SpringApplication.run(KoshelekApplication.class, args);
    }

}
