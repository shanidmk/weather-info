/**
 * This document is a part of the source code and related artifacts
 * for DreamIT LLC
 *
 * http://www.dreamit.com
 *
 * Copyright 2013
 *
 */
package com.mm.test.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.mm.test.model.openweathermap.WeatherInfo;

/**
 * @author Shabeer Ellath
 * 
 * @version 1.0 Created Date: Aug 31, 2014
 * 
 */

@Produces({ MediaType.APPLICATION_JSON })
public interface IWeatherFetcher {

	@GET
	@Path("/weather")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	WeatherInfo getWeather(@QueryParam("q") String city);
}
