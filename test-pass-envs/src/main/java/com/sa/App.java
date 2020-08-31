package com.sa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class App implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(App.class);

    @Autowired
    private Environment env;
    @Value("${my.client.id}")
    private String clientIdProps;
    @Value("${my.client.secret}")
    private String clientSecretProps;

    @Override
    public void run(String... args) {
        String your_region = env.getProperty("YOUR_REGION");
        logger.info("REGION value '{}' from config", your_region);
        logger.info("CLIENT ID value '{}' from properties", clientIdProps);
        logger.info("CLIENT SECRET value '{}' from default property", clientSecretProps);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
