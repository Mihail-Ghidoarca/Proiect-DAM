package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootDomain_InternetCafeApplication extends SpringBootServletInitializer
{
    private static Logger logger = Logger.getLogger(SpringBootDomain_InternetCafeApplication.class.getName());

    public static void main(String[] args) {
        logger.info("Loading ... :: SpringBoot - InternetCafeApplication Default Settings ...  ");
        SpringApplication.run(SpringBootDomain_InternetCafeApplication.class, args);
    }
}