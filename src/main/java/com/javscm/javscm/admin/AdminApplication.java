package com.javscm.javscm.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Admin application.
 *
 * @author liuzhaoming
 */
@EnableAdminServer
@SpringBootApplication
public class AdminApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
