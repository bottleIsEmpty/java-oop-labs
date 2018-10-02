package com.company;

import com.company.interfaces.Flyable;

public class Plain implements Flyable {
    public void fly() {
        System.out.println("Я самолёт и летаю с помощью двигателя и горючего");
    }
}
