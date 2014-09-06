package com.mm.test.model.response;

public class City {
	
	private String name;
	private String country;
	private String sunrise;
	private String sunset;
	private ResponseLocation coord;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public ResponseLocation getCoord() {
		return coord;
	}
	public void setCoord(ResponseLocation coord) {
		this.coord = coord;
	}		
}
