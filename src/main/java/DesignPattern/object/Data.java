package DesignPattern.object;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ganeshbonde
 */
public class Data implements Serializable {
   private List<City> lstCities = new ArrayList(); 

    /**
     * @return the lstCities
     */
    public List<City> getLstCities() {
        return lstCities;
    }

    /**
     * @param lstCities the lstCities to set
     */
    public void setLstCities(List<City> lstCities) {
        this.lstCities = lstCities;
    }
    
    
    
    
}
