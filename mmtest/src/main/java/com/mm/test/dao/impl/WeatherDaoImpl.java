package com.mm.test.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mm.test.dao.WeatherDao;
import com.mm.test.model.entity.CityMaster;

public class WeatherDaoImpl extends HibernateDaoSupport implements WeatherDao {

	
	
	public void addWeatherInfo(CityMaster city) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(city);
		
	}

	public CityMaster getWeatherInfo(String CityName) {
		// TODO Auto-generated method stub
		getHibernateTemplate().get(CityMaster.class, 1);
		return null;
	}
	
}
