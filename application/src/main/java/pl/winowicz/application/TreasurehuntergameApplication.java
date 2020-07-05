package pl.winowicz.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.winowicz")
public class TreasurehuntergameApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreasurehuntergameApplication.class, args);
    }

}
