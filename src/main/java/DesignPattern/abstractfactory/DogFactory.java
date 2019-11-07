/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.abstractfactory;

/**
 *
 * @author ganeshbonde
 */
public class DogFactory implements AbstractFactory{

    private Integer  numberOfLegs;
    private Integer numberOfEyes;
    private String  typeOfAnimal;
    
    
    public DogFactory(Integer numberOfLegs,Integer numberOfEyes, String typeOfAnimal){
        this.numberOfEyes = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.typeOfAnimal = typeOfAnimal;
    }

    @Override
    public Animal createAnimal() {
        return new Dog(numberOfLegs,numberOfEyes,typeOfAnimal); 
    }
    
}
