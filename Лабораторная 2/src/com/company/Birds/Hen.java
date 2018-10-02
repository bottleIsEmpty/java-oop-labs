package com.company.Birds;

import com.company.interfaces.Quackable;

public class Hen extends Bird implements Quackable {
    public Hen() {
        System.out.println("Я курица, я хоть и птица, но не умею летать");
    }

    public void quack() {
        System.out.println("Ко-ко-ко");
    }
}
