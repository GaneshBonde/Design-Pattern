package DesignPattern.object;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ganeshbonde
 */
@JsonIgnoreProperties
public class City implements Serializable{

   
    private String longitude;
    private String latitude;
    private String weather;
    private String main;
    private String temperature;
    private String pressure;
    private String humidity;
    private String minimum_temperature;
    private String maximum_temperature;
    private String base;
    private String visibility;
    private String wind;
    private String rain;
    private String clouds;
    private String dt;
    private String sys;
    private String timezone;
    private String id;
    private String name;
    private String cod;
    private String country;

    

    /**
     * @return the weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }

    /**
     * @return the main
     */
    public String getMain() {
        return main;
    }

    /**
     * @param main the main to set
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * @return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return the visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * @return the wind
     */
    public String getWind() {
        return wind;
    }

    /**
     * @param wind the wind to set
     */
    public void setWind(String wind) {
        this.wind = wind;
    }

    /**
     * @return the rain
     */
    public String getRain() {
        return rain;
    }

    /**
     * @param rain the rain to set
     */
    public void setRain(String rain) {
        this.rain = rain;
    }

    /**
     * @return the clouds
     */
    public String getClouds() {
        return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    /**
     * @return the dt
     */
    public String getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(String dt) {
        this.dt = dt;
    }

    /**
     * @return the sys
     */
    public String getSys() {
        return sys;
    }

    /**
     * @param sys the sys to set
     */
    public void setSys(String sys) {
        this.sys = sys;
    }

    /**
     * @return the timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @param timezone the timezone to set
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the pressure
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the minimum_temperature
     */
    public String getMinimum_temperature() {
        return minimum_temperature;
    }

    /**
     * @param minimum_temperature the minimum_temperature to set
     */
    public void setMinimum_temperature(String minimum_temperature) {
        this.minimum_temperature = minimum_temperature;
    }

    /**
     * @return the maximum_temperature
     */
    public String getMaximum_temperature() {
        return maximum_temperature;
    }

    /**
     * @param maximum_temperature the maximum_temperature to set
     */
    public void setMaximum_temperature(String maximum_temperature) {
        this.maximum_temperature = maximum_temperature;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
