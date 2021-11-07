package io.seia.hofirp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import(ScheduledTasks.class)
public class HofirpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HofirpApplication.class, args);
	}
}
