package cn.mecai.lab01.mapstruct;

import cn.mecai.lab01.mapstruct.convert.CarMapper_INSTANCE;
import cn.mecai.lab01.mapstruct.dto.CarDto;
import cn.mecai.lab01.mapstruct.entity.Car;
import cn.mecai.lab01.mapstruct.entity.ECarType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab01MapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab01MapstructApplication.class, args);

		Car car = new Car("奔驰", "奔驰C类", 5, ECarType.SUV);
		CarDto carDto = CarMapper_INSTANCE.INSTANCE.cartoDto(car);
		System.out.println("------->" + carDto.getType());
	}

}
