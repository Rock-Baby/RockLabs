package cn.mecai.lab01.mapstruct.controller;

import cn.mecai.lab01.mapstruct.convert.CarMapper_Spring;
import cn.mecai.lab01.mapstruct.convert.CarMapper_Time;
import cn.mecai.lab01.mapstruct.dto.CarDto;
import cn.mecai.lab01.mapstruct.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import static cn.mecai.lab01.mapstruct.entity.ECarType.SEDAN;

/**
 * @Description
 * @Classname CarController
 * @Date 2026/1/13 17:10
 * @Created by rock
 */
@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarMapper_Spring carMapperSpring;

	@Autowired
	private CarMapper_Time carMapperTime;

	@GetMapping("/test1")
	public String test1() {
		Car car = new Car("奔驰", "奔驰E300", 5, SEDAN);
		CarDto dto = carMapperSpring.cartoDto(car);
		System.out.println("通过注解方式实现.......");
		System.out.println(dto.toString());
		return dto.toString();
	}

	@GetMapping("/test2")
	public String test2() {
		Car car = new Car("奔驰", "奔驰E300", 5, SEDAN, LocalDateTime.now());
		CarDto dto = carMapperTime.cartoDto(car);
		System.out.println("时间格式转换.......");
		System.out.println(dto.toString());
		return dto.toString();
	}
}
