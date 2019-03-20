/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author gai
 */
@Stateless
public class Controleur implements ControleurRemote {

 
    @EJB EjbConvertLocal conv; 
    @EJB SessionCalculLocal calc;
    
    @Override
    public double convertir(String source, String cible, double montant){
        
        return conv.convertir(source, cible, montant);
    }

    /**
     *
     * @return
     */
    @Override
    public Map getConversionTable()
    {
        return conv.getConversionTable();
        
    }

    @Override
    public String hello() {
        return calc.hello();
    }

    @Override
    public double plus(double nb1, double nb2) {
        return calc.plus(nb1,nb2);
    }

    @Override
    public double divise(double nb1, double nb2) {
        return calc.divise(nb1,nb2);
    }

    @Override
    public double moins(double nb1, double nb2) {
        return calc.moins(nb1,nb2);
    }

    @Override
    public double multiplie(double nb1, double nb2) {
       return calc.multiplie(nb1,nb2);
    }
    
    
    
    
}
