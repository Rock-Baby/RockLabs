package cn.mecai.lab01.mapstruct.convert;

import cn.mecai.lab01.mapstruct.dto.CarDto;
import cn.mecai.lab01.mapstruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @Classname CarMapper_Time
 * @Date 2026/1/13 17:25
 * @Created by rock
 */

@Mapper(componentModel = "spring")
public interface CarMapper_Time {
	@Mapping(source = "numberOfSeats", target = "seatCount")
	@Mapping(source = "produceTime", target = "time1", dateFormat = "yyyy-MM-dd")
	CarDto cartoDto(Car car);
}
