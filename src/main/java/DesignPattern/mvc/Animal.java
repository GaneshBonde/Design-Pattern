/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.mvc;

/**
 *
 * @author ganeshbonde
 */
public class Animal {
     public  Integer getNumberOfLegs(){
         return null;
     }
    public  Integer getNumberOfEyes(){
        return null;
    }
    public  String typeOfAnimal(){
        return null;
    }
    
    @Override
    public String toString(){
        return "Animal has  " + this.getNumberOfLegs() + " CPU = " + this.getNumberOfEyes() + " HDD = " + this.typeOfAnimal();
    }
}
