package br.com.alistese.alistese;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AlisteSeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlisteSeApplication.class, args);
    }

}
