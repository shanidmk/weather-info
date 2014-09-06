package com.mm.test;

import com.mm.test.client.IWeatherFetcher;
import com.mm.test.model.openweathermap.WeatherInfo;
import com.mm.test.model.response.ResponseWeatherInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn({"myClient"})
@Path("/hello")
public class HelloWorld
{
  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  @Autowired
  IWeatherFetcher weatherClient;

  @GET
  @Path("/echo/{input}")
  @Produces({"text/plain"})
  public String ping(@PathParam("input") String input) { logger.info("Hi Shani");
    return input; } 
  @GET
  @Path("/weather")
  @Produces({"application/json"})
  public ResponseWeatherInfo pingJson(@QueryParam("q") String city) { logger.info("calling weather service..");

    ResponseWeatherInfo response = null;
    try
    {
      WeatherInfo weatherMapResponse = this.weatherClient.getWeather("dubai");

      response = new ResponseWeatherInfo();

      response.MapWeatherMapData(weatherMapResponse);

      logger.info("done");
    }
    catch (Exception ee)
    {
      logger.info("exception while involking weather service" + ee.toString());
    }

    return response; } 
  @POST
  @Produces({"application/json"})
  @Consumes({"application/json"})
  @Path("/jsonBean")
  public Response modifyJson(JsonBean input) { input.setVal2(input.getVal1());
    return Response.ok().entity(input).build();
  }
}