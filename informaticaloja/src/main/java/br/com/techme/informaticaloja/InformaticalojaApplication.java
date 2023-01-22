package br.com.techme.informaticaloja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InformaticalojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InformaticalojaApplication.class, args);
	}

}
