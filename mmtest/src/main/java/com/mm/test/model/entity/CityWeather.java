package com.mm.test.model.entity;

import java.util.Date;
import java.util.Set;

public class CityWeather {
	private int WeatherDateId; 
	private CityMaster city;
	private Date WeatherDate; 
	private float Latitude;
	private float Longitude;
	private float Temperature;
	private float TemperatureMin;
	private float TemperatureMax;
	private String Sunrise;
	private String Sunset ;
	//private Set<WeatherDescription> weatherdescription;
	
	public CityMaster getCityId() {
		return city;
	}
	public void setCityId(CityMaster city) {
		this.city = city;
	}
	public Date getWeatherDate() {
		return WeatherDate;
	}
	public void setWeatherDate(Date weatherDate) {
		WeatherDate = weatherDate;
	}
	public float getLatitude() {
		return Latitude;
	}
	public void setLatitude(float latitude) {
		Latitude = latitude;
	}
	public float getLongitude() {
		return Longitude;
	}
	public void setLongitude(float longitude) {
		Longitude = longitude;
	}
	public float getTemperature() {
		return Temperature;
	}
	public void setTemperature(float temperature) {
		Temperature = temperature;
	}
	public float getTemperatureMin() {
		return TemperatureMin;
	}
	public void setTemperatureMin(float temperatureMin) {
		TemperatureMin = temperatureMin;
	}
	public float getTemperatureMax() {
		return TemperatureMax;
	}
	public void setTemperatureMax(float temperatureMax) {
		TemperatureMax = temperatureMax;
	}
	public String getSunrise() {
		return Sunrise;
	}
	public void setSunrise(String sunrise) {
		Sunrise = sunrise;
	}
	public String getSunset() {
		return Sunset;
	}
	public void setSunset(String sunset) {
		Sunset = sunset;
	}
	
	/*public Set<WeatherDescription> getWeatherdescription() {
		return weatherdescription;
	}
	public void setWeatherdescription(Set<WeatherDescription> weatherdescription) {
		this.weatherdescription = weatherdescription;
	}*/
	public int getWeatherDateId() {
		return WeatherDateId;
	}
	public void setWeatherDateId(int weatherDateId) {
		WeatherDateId = weatherDateId;
	}
	
	
}
