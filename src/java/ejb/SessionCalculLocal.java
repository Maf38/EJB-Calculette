/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;


/**
 *
 * @author gai
 */
@Local
public interface SessionCalculLocal {

    public String hello();

    public double plus(double nb1, double nb2);

    public double divise(double nb1, double nb2);

    public double moins(double nb1, double nb2);

    public double multiplie(double nb1, double nb2);
    
}
