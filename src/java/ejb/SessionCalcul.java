/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;


import javax.ejb.Stateless;

/**
 *
 * @author gai
 */
@Stateless
public class SessionCalcul implements SessionCalculLocal {

    @Override
    public String hello(){
        return "Hello World!";
        
    }
    
    @Override
    public double plus(double nb1,double nb2){
        return nb1+ nb2;
    }
    
    @Override
    public double moins(double nb1,double nb2){
        return nb1- nb2;
    }
    
    @Override
    public double divise(double nb1,double nb2){
        double result=0;
        
        if (nb2!=0){
            result=nb1/nb2;
        }
        
        return nb1/ nb2;
    }
    
    @Override
    public  double multiplie(double nb1,double nb2){
        return nb1*nb2;
    }    
}
