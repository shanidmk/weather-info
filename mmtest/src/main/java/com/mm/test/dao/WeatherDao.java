package com.mm.test.dao;

import com.mm.test.model.entity.CityMaster;

public interface WeatherDao {
	void addWeatherInfo(CityMaster city);
	CityMaster getWeatherInfo(String CityName);
}
