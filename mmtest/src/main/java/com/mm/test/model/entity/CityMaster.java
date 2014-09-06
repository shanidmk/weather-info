package com.mm.test.model.entity;

import java.util.Set;

public class CityMaster {

	private int CityId;
	private String CityName; 
	private String Country;
	private Set<CityWeather> cityweather;
	
	
	public int getCityId() {
		return CityId;
	}
	public void setCityId(int cityId) {
		CityId = cityId;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	public Set<CityWeather> getCityweather() {
		return cityweather;
	}
	public void setCityweather(Set<CityWeather> cityweather) {
		this.cityweather = cityweather;
	}
	
	
}
