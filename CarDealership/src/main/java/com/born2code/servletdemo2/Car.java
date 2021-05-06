package com.born2code.servletdemo2;

public class Car {

	private String modelName;
	private String carType;
	private String carDetails;
	
	public Car(String modelName, String carType, String carDetails) {
		super();
		this.modelName = modelName;
		this.carType = carType;
		this.carDetails = carDetails;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(String carDetails) {
		this.carDetails = carDetails;
	}
	
	
	
}