package cn.mecai.lab01.mapstruct.convert;

import cn.mecai.lab01.mapstruct.dto.CarDto;
import cn.mecai.lab01.mapstruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Description
 * @Classname CarMapper
 * @Date 2026/1/13 16:44
 * @Created by rock
 */
@Mapper(componentModel = "spring")
public interface CarMapper_Spring {
	CarMapper_Spring INSTANCE = Mappers.getMapper(CarMapper_Spring.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto cartoDto(Car car) ;

}
