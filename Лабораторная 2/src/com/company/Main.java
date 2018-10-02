package com.company;

import com.company.Birds.Duck;
import com.company.Birds.Hen;
import com.company.interfaces.Flyable;
import com.company.interfaces.Quackable;

public class Main {

    public static void main(String[] args) {

        // 1. Интерфейсы
	    Flyable duck = new Duck();
	    Flyable plain = new Plain();

	    plain.fly();
	    duck.fly();

		Quackable hen = new Hen();
		Quackable duck2 = new Duck();

		hen.quack();
		duck2.quack();

		// 2. Перечисления
		System.out.println("--------------------------------------------------------------------------");

        System.out.println("Роли:");
		Role[] roles = Role.values();
        for (Role role : roles) {
            System.out.println(role.getTitle());
        }

        System.out.println("--------------------------------------------------------------------------");

        var user = new User(Role.USER);
		System.out.println(user.getRole().getTitle());

        var moder = new User(Role.MODERATOR);
        System.out.println(moder.getRole().getTitle());

        var admin = new User(Role.ADMIN);
        System.out.println(admin.getRole().getTitle());
    }
}
