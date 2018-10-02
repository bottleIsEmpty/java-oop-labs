package com.company;

public enum Role {
    USER("Пользователь"),
    MODERATOR("Модератор"),
    ADMIN("Админимтратор");

    private String title;

    Role(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
