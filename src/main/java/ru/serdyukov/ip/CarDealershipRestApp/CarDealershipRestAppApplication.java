package ru.serdyukov.ip.CarDealershipRestApp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.serdyukov.ip.CarDealershipRestApp.services.CarBrandService;

@SpringBootApplication
public class CarDealershipRestAppApplication {

    public static void main(String[] args) {
		SpringApplication.run(CarDealershipRestAppApplication.class, args);

		for (long i = 0; i < 1_000_000_000; i++) {

		}
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
