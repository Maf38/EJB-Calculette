package ejb;

import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author gai
 */
@Remote
public interface ControleurRemote {
     double convertir(String source, String cible, double montant) ;                                                                                         
   	
   	
     Map getConversionTable();
}