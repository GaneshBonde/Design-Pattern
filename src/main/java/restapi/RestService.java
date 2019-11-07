/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restapi;

import DesignPattern.object.City;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ganeshbonde
 */
@Path("/RestService")
public class RestService {
    @GET
    @Path("/rest")
    @Produces(MediaType.APPLICATION_JSON)
    public List<City> getWeather(){
        List<City> listCity = new ArrayList();
        City city = new City();
        city.setName("London");
        listCity.add(city);
        City city2 = new City();
        city2.setName("MIAMI");
        listCity.add(city2);
        return listCity;
    }
    
}
