package uvsoftgroup.springbootadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SpringbootadminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootadminserverApplication.class, args);
	}
}
