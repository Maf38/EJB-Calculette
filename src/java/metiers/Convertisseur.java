/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers;


import java.util.HashMap;
import java.util.Map;



public class Convertisseur  {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private final Map conversionTable = new HashMap();
	
	public Convertisseur()                                                                                                     
   	{                                                                                                                                               
   		conversionTable.put("Livre", new Double(0.680987));                                           
   		conversionTable.put("Dollars canadien", new Double(1.51353));                                          
   		conversionTable.put("Riyals", new Double(3.75050));                                      
   		conversionTable.put("Yen", new Double(117.247));                                              
   		conversionTable.put("Ringits malaisien", new Double(3.79900));                                         
   		conversionTable.put("Dollars US", new Double(1.0));                                                    
   	}     
                                                                                                     
    
   	public double convertir(String source, String cible, double montant)                                                                                          
   	{                                                                                                          
   		//The constants should probably be defined somewhere else                                              
   		double tauxSource = ((Double)conversionTable.get(source)).doubleValue() ;                    
   		double tauxCible = ((Double)conversionTable.get(cible)).doubleValue() ;                    
   		double tauxConversion = tauxCible/tauxSource;	                                                       
   		return (montant * tauxConversion) ;                                                               
   	}           
   	
   	public Map getConversionTable()
   	{
   		return conversionTable;	
   	}     
}
