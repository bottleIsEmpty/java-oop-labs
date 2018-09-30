/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author user311
 */
public class ParentClass {
    public String someString;
    
    ParentClass() {
        System.out.println("ParentClass object (without parametres) is created.");
    }
    
    ParentClass(String someString) {
        this.someString = someString;
        
        System.out.println("ParentClass object (with parameter) is created. The parameter value is: " + someString) ;
    }
    
    void parentMethod() {
        System.out.println("Parent method is called");
    }
}
