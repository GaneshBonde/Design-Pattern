/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.singleton;

/**
 *
 * @author ganeshbonde
 */
public class Singleton {
    private static Singleton instance;

    // private contructor to make to singleton and thread safe
    private Singleton(){
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return  instance;
    }
}
