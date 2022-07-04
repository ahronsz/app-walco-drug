package org.walco.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.walco.services.drug.repository.DiseaseRepository;

//@SpringBootApplication(scanBasePackageClasses = {DiseaseRepository.class})
//@SpringBootApplication(scanBasePackages = "org.walco.services")
@SpringBootApplication
public class AppWalcoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppWalcoApplication.class, args);
    }
}