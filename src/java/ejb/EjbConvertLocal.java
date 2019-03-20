/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Map;
import javax.ejb.Local;

/**
 *
 * @author gai
 */
@Local
public interface EjbConvertLocal {
     double convertir(String source, String cible, double montant) ;                                                                                         
   	
   	
     Map getConversionTable();
}
