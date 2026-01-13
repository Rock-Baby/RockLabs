package cn.mecai.lab01.mapstruct.dto;

import cn.mecai.lab01.mapstruct.entity.ECarType;
import org.mapstruct.Mapper;

/**
 * @Description
 * @Classname CarDto
 * @Date 2026/1/13 16:44
 * @Created by rock
 */
public class CarDto {

	private String brand;
	private String name;
	private int seatCount;
	private String type;

	private String  time1;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	@Override
	public String toString() {
		return "CarDto{" + "brand='" + brand + '\'' + ", name='" + name + '\'' + ", seatCount="
				+ seatCount + ", type='" + type + '\'' + ", time1='" + time1 + '\'' + '}';
	}
}