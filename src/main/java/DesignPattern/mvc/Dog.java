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
public class Dog extends Animal{
     private Integer  numberOfLegs;
    private Integer numberOfEyes;
    private String  typeOfAnimal;
    
    
    public Dog(Integer numberOfLegs,Integer numberOfEyes, String typeOfAnimal){
        this.numberOfEyes = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.typeOfAnimal = typeOfAnimal;
    }

    @Override
    public Integer getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public Integer getNumberOfEyes() {
        return this.numberOfEyes;
    }

    @Override
    public String typeOfAnimal() {
       return this.typeOfAnimal;
    }
}
