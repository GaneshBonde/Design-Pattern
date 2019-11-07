/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;

import DesignPattern.object.City;
import DesignPattern.object.Data;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




  

/**
 *
 * @author ganeshbonde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        OkHttpClient client = new OkHttpClient();

/*Request request = new Request.Builder()
	.url("https://community-open-weather-map.p.rapidapi.com/weather?callback=test&id=2172797&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html&q=London%2Cuk")
	.get()
	.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
	.addHeader("x-rapidapi-key", "d542b2a66emshf60285decab86a5p1e6b3djsn2e8f5600bc67")
	.build();

Response response = client.newCall(request).execute();

System.out.println(response.body().source());
*/
        
HttpResponse<String> response2 = Unirest.get("https://community-open-weather-map.p.rapidapi.com/weather?callback=test&id=2172797&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html&q=London%2Cuk")
	.header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
	.header("x-rapidapi-key", "d542b2a66emshf60285decab86a5p1e6b3djsn2e8f5600bc67")
	.asString();

String json = response2.getBody().toString().replace("test(", ""); 
json =json.replace("})","}");

 
ObjectMapper mapper = new ObjectMapper();
mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

String obj = json;
//String obj = "{\"coord\":{\"lon\":-0.13,\"lat\":51.51},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"base\":\"stations\",\"main\":{\"temp\":284.43,\"pressure\":999,\"humidity\":87,\"temp_min\":283.15,\"temp_max\":285.37},\"visibility\":10000,\"wind\":{\"speed\":4.1,\"deg\":10},\"rain\":{},\"clouds\":{\"all\":40},\"dt\":1572968957,\"sys\":{\"type\":1,\"id\":1502,\"country\":\"GB\",\"sunrise\":1572937221,\"sunset\":1572971269},\"timezone\":0,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
obj =obj.replaceAll("\"", "");
obj =obj.replaceAll("\\{", "");
obj =obj.replaceAll("\\}", "");
        
String []arrObjects = obj.split("[,:]");
           
       

           
 
        
          Data data = new Data();
           City london = new City();
            for (int i=0;i<arrObjects.length;i++) {
            // System.out.print(str+"    "+counter+++"$   ");
                if(arrObjects[i].contains("lon")){
                    //System.out.println(str+" hello");
                    london.setLongitude(arrObjects[i+1]);
                    
                }
                if(arrObjects[i].contains("lat")){
                    //System.out.println(str+" hello");
                    london.setLatitude(arrObjects[i+1]);
                    
                }
                if(arrObjects[i].contains("description")){
                    //System.out.println(str+" hello");
                    london.setWeather(arrObjects[i+1]);
                    
                }
                if(arrObjects[i].contains("temp")){
                    //System.out.println(str+" hello");
                    london.setTemperature(arrObjects[i+1]);
                    
                }
                 if(arrObjects[i].contains("pressure")){
                    //System.out.println(str+" hello");
                    london.setPressure(arrObjects[i+1]);
                    
                }
                 if(arrObjects[i].contains("humidity")){
                    //System.out.println(str+" hello");
                    london.setHumidity(arrObjects[i+1]);
                    
                }
                 if(arrObjects[i].contains("temp_min")){
                    //System.out.println(str+" hello");
                    london.setMinimum_temperature(arrObjects[i+1]);
                    
                }
                 if(arrObjects[i].contains("temp_max")){
                    //System.out.println(str+" hello");
                    london.setMaximum_temperature(arrObjects[i+1]);
                    
                }
                  if(arrObjects[i].contains("country")){
                    //System.out.println(str+" hello");
                    london.setCountry(arrObjects[i+1]);
                    
                }
                  if(arrObjects[i].contains("name")){
                    //System.out.println(str+" hello");
                    london.setName(arrObjects[i+1]);
                    
                }
                 
            }
            
            data.getLstCities().add(london);
           try{
               FileOutputStream f = new FileOutputStream(new File("database.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(data);
           } catch (FileNotFoundException e) {
			System.out.println("File not found");
           } catch (IOException e) {
			System.out.println("Error initializing stream");
	   }
           
           // read the objects
           FileInputStream fi = new FileInputStream(new File("database.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
                        
           Data databaseData = (Data)oi.readObject();
           for(int i =0; i < databaseData.getLstCities().size();i++){
               City city = databaseData.getLstCities().get(i);
               System.out.println("**************************************************************");
               System.out.println("The city name is "+city.getName());
               System.out.println("Longitude: "+city.getLongitude());
               System.out.println("Latitude: "+city.getLatitude());
               System.out.println("Description: "+city.getWeather());
               System.out.println("Temperature: "+city.getTemperature());
               System.out.println("pressure: "+city.getPressure());
               System.out.println("humidity: "+city.getHumidity());
               System.out.println("Minimum Temperature: "+city.getMinimum_temperature());
               System.out.println("Maximum Temperature: "+city.getMaximum_temperature());
               System.out.println("Country: "+city.getCountry());
               System.out.println("**************************************************************");
           }
           

    }
}
