package cn.mecai.lab01.mapstruct.entity;

import java.time.LocalDateTime;

/**
 * @Description
 * @Classname Car
 * @Date 2026/1/13 16:42
 * @Created by rock
 */
public class Car {

	private String brand;
	private String name;
	private int numberOfSeats;
	private ECarType type;
	private LocalDateTime produceTime;

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

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public ECarType getType() {
		return type;
	}

	public void setType(ECarType type) {
		this.type = type;
	}

	public Car(String brand, String name, int numberOfSeats, ECarType type) {
		this.brand = brand;
		this.name = name;
		this.numberOfSeats = numberOfSeats;
		this.type = type;
	}

	public Car(String brand, String name, int numberOfSeats, ECarType type,
			LocalDateTime produceTime) {
		this.brand = brand;
		this.name = name;
		this.numberOfSeats = numberOfSeats;
		this.type = type;
		this.produceTime = produceTime;
	}

	public LocalDateTime getProduceTime() {
		return produceTime;
	}

	public void setProduceTime(LocalDateTime produceTime) {
		this.produceTime = produceTime;
	}
}
