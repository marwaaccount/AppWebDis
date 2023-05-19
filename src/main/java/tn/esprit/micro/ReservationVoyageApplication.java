package tn.esprit.micro;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ReservationVoyageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationVoyageApplication.class, args);
	}

}
