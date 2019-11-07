/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.factory;

/**
 *
 * @author ganeshbonde
 */
public abstract class Animal {
    
    public abstract Integer getNumberOfLegs();
    public abstract Integer getNumberOfEyes();
    public abstract String typeOfAnimal();
    
    @Override
    public String toString(){
        return "Animal has  " + this.getNumberOfLegs() + " CPU = " + this.getNumberOfEyes() + " HDD = " + this.typeOfAnimal();
    }
    
}
