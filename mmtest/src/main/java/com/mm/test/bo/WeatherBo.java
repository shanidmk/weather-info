package com.mm.test.bo;

import com.mm.test.model.entity.CityMaster;

public interface WeatherBo {
	void addWeatherInfo(CityMaster city);
	CityMaster getWeatherInfo(String CityName);
}
