/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication127;

/**
 *
 * @author shahriman.said
 */
public abstract class Control {
    
    public abstract void startEngine();
    public abstract void shiftGear();
    public abstract void stepOnGas();
    
    public final void movement(){
        startEngine();
        shiftGear();
        stepOnGas();
    }
    
}
