package com.mm.test.model.openweathermap;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherInfo {
	private Location coord;
	private SysObj sys;
	private Weather[] weather;
	private String base;
	private Main main;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	
	private long id;
	private String name;
	private int cod;
	
	public Location getCoord() {
		return coord;
	}
	public void setCoord(Location coord) {
		this.coord = coord;
	}
	public SysObj getSys() {
		return sys;
	}
	public void setSys(SysObj sys) {
		this.sys = sys;
	}
	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
}