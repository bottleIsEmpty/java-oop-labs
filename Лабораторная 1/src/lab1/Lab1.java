/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author user311
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Перегрузка конструкторов 
        
        ParentClass parent1 = new ParentClass();
        ParentClass parent2 = new ParentClass("foo");
        
        parent1.parentMethod();
        
        // 2. Наследование
        
        ChildClass child1 = new ChildClass("bar", 1);
        
        child1.parentMethod();
        child1.childMethod("baz");
        
        // 3. Статические свойства
        
        System.out.println(ClassWithStaticMethod.staticString);
        
        ClassWithStaticMethod static1 = new ClassWithStaticMethod();
        static1.changeStaticValue("New value");
        
        System.out.println(ClassWithStaticMethod.staticString);
    }
}
