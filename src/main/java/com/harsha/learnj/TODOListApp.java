package com.harsha.learnj;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class TODOListApp {
    public static void main( String[] args ) {

        String migrationLocations = "classpath:db/migrations";
        String dbURL = "jdbc:mysql://localhost:3306/todolist?useSSL=true";
        Flyway flyway = Flyway.configure().locations(migrationLocations).dataSource(dbURL, "root", "rootpassword").load();
        flyway.clean();
        flyway.migrate();

        SpringApplication.run(TODOListApp.class, args);
    }
}
