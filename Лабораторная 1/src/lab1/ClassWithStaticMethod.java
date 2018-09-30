/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author user311
 */
public class ClassWithStaticMethod {
    static String staticString = "Default value";
    
    void changeStaticValue(String value) {
        this.staticString = value;
        
        System.out.println("The value of static string now is " +  value);
    }
}
