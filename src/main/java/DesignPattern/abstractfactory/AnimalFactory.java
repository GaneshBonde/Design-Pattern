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
public class AnimalFactory {
     public static Animal getAnimal(AbstractFactory fact){
        return fact.createAnimal();
    }
}
