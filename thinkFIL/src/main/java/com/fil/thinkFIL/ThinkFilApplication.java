package com.fil.thinkFIL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//(scanBasePackages= {"com.fil.thinFIL.controllers","com.fil.thinkFIL.services"})
@EntityScan("com.fil.thinkFIL.dao.models")
@EnableJpaRepositories("com.fil.thinkFIL.repoInterfaces")
public class ThinkFilApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkFilApplication.class, args);
	}
}
