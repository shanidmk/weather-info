package com.mm.test.model.response;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.mm.test.model.openweathermap.*;

public class ResponseWeatherInfo {
	
	private String date;
	private City city;
	private ResponseWeather[] weather;
	private ResponseMain main;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public ResponseWeather[] getWeather() {
		return weather;
	}
	public void setWeather(ResponseWeather[] weather) {
		this.weather = weather;
	}
	public ResponseMain getMain() {
		return main;
	}
	public void setMain(ResponseMain main) {
		this.main = main;
	}
	
	
	public Boolean MapWeatherMapData(WeatherInfo data)
	{
		this.setDate(MakeDateString(data.getDt(),"dd-MM-yyyy HH:mm:ss"));
		
		City newCity = new City();
		newCity.setName(data.getName());
		newCity.setCountry(data.getSys().getCountry());
		newCity.setSunrise(MakeDateString(data.getSys().getSunrise(),"HH:mm"));
		newCity.setSunset(MakeDateString(data.getSys().getSunset(),"HH:mm"));
		
		ResponseLocation coord = new ResponseLocation();
		coord.setLat(data.getCoord().getLat());
		coord.setLon(data.getCoord().getLon());
		
		newCity.setCoord(coord);
		
		this.setCity(newCity);
		this.setWeather(this.mapWeatherLsit(data.getWeather()));
		
		ResponseMain newMain= new ResponseMain();
		
		newMain.setTemp(data.getMain().getTemp());
		newMain.setTemp_max(data.getMain().getTemp_max());
		newMain.setTemp_min(data.getMain().getTemp_min());
		
		this.setMain(newMain);
		
		return true;
	}
	
	
	public ResponseWeather[] mapWeatherLsit(Weather[] openMapWeatherList)
	{
		ResponseWeather[] responseWeatherList = new ResponseWeather[openMapWeatherList.length];
		ResponseWeather responseWeather;
		
		for(int i=0;i < openMapWeatherList.length;i++)
		{
			responseWeather =new ResponseWeather();
			responseWeather.setMain(openMapWeatherList[i].getMain());
			responseWeather.setDescription(openMapWeatherList[i].getDescription());
			
			responseWeatherList[i]=responseWeather;
		}
		
		
		return responseWeatherList;
	}
	
	
	
	public String MakeDateString(long longDate,String format)
	{
		String dateString="";
		//Converting UNIX timestamp to Java Date
		Date date=new Date(longDate*1000L);
		SimpleDateFormat   formatter = new SimpleDateFormat(format);
        dateString = formatter.format(date);
		
		return dateString;
	}
	
	
}
