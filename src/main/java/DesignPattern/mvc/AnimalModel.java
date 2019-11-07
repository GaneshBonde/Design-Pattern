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
public class AnimalModel {
    private Integer  numberOfLegs;
    private Integer numberOfEyes;
    private String  typeOfAnimal;
    
    
    public AnimalModel(Integer numberOfLegs,Integer numberOfEyes, String typeOfAnimal){
        this.numberOfEyes = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.typeOfAnimal = typeOfAnimal;
    }

    
    public Integer getNumberOfLegs() {
        return this.numberOfLegs;
    }

    
    public Integer getNumberOfEyes() {
        return this.numberOfEyes;
    }

    
    public String typeOfAnimal() {
       return this.typeOfAnimal;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    /**
     * @param numberOfEyes the numberOfEyes to set
     */
    public void setNumberOfEyes(Integer numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }
}
