package cc.hiknomore.gym_progress;

import org.springframework.boot.SpringApplication;

public class TestGymProgressApplication {

	public static void main(String[] args) {
		SpringApplication.from(GymProgressApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
