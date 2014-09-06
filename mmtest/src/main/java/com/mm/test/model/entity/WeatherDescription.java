package com.mm.test.model.entity;

public class WeatherDescription {
	private int DescriptionId;
	private int WeatherDatetimeId;
	private String Main;
	private String Description;
	
	
	public int getDescriptionId() {
		return DescriptionId;
	}
	public void setDescriptionId(int descriptionId) {
		DescriptionId = descriptionId;
	}
	public int getWeatherDatetimeId() {
		return WeatherDatetimeId;
	}
	public void setWeatherDatetimeId(int weatherDatetimeId) {
		WeatherDatetimeId = weatherDatetimeId;
	}
	public String getMain() {
		return Main;
	}
	public void setMain(String main) {
		Main = main;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
