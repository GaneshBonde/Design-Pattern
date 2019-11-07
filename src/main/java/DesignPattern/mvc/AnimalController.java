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
public class AnimalController {
    private AnimalModel model;
  private AnimalView view;
  
  public AnimalController(AnimalModel model,AnimalView view){
      this.model=model;
      this.view=view;
  }
    
  public Integer getNumberOfEyes(){
      return this.model.getNumberOfEyes();
  }
  
  public Integer getNumberOfLegs(){
      return this.model.getNumberOfLegs();
  }
  
  public void setNumberOfLegs(Integer numberLegs) {
    this.model.setNumberOfLegs(numberLegs);
  }

  public void setNumberOfEyes(Integer numberEyes) {
    this.model.setNumberOfEyes(numberEyes);
  }

  public void updateView() {
    this.view.displayPictureOfAnimal(model);
  }
}
