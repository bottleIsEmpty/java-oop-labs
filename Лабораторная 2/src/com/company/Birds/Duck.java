package com.company.Birds;

import com.company.interfaces.Flyable;
import com.company.interfaces.Quackable;

public class Duck extends Bird implements Flyable, Quackable {
    public void fly() {
        System.out.println("Я утка, и летаю с помощью моих крыльев");
    }

    public void quack() {
        System.out.println("Кря-кря-кря");
    }
}
