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
    
    
    
    
}
