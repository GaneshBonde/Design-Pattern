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
public class AnimalView {
    
    public void displayPictureOfAnimal(AnimalModel model){
        if(model.typeOfAnimal().equals("Dog")){
            System.out.println("Dog");
        }
        
        if(model.typeOfAnimal().equals("Cat")){
            System.out.println("Cat");
        }
                
    }
    
}
