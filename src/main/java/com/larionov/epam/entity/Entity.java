package com.larionov.epam.entity;

import com.larionov.epam.annotation.Secured;

public class Entity {
    private String firstName;
    private String lastName;

    @Secured(integer = 5)
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase()
                + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase()
                + this.lastName.substring(1);
    }

    @Secured(integer = 6, string = "Volvo")
    private String plusFirstNameAndLast() {
        return firstName + lastName;
    }

    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
