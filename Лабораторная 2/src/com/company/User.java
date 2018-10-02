package com.company;

class User {

    private Role role;

    User(Role role) {
        this.role = role;
    }

    Role getRole() {
        return role;
    }
}
