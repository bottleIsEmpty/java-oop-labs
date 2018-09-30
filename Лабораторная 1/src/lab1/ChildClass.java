/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author user311
 */
public class ChildClass extends ParentClass {
    ChildClass(String someString, int oneMoreParameter) {
        super(someString);
        
        System.out.println("ChildClass object is created");
        
        if (oneMoreParameter <= 0) {
            System.out.println("The parameter is negative");
        } else {
            System.out.println("The parameter is positive or 0");
        }        
    }
    
    void childMethod(String newSomeString) {
        this.someString = newSomeString;
        
        System.out.println("The new value of someString is " + this.someString);
    }
}
