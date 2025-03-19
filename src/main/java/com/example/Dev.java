package com.example;

public class Dev {

    private Computer desktop1;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public void setComputer(Computer computer) {
        this.desktop1 = computer;
    }

    public Computer getComputer() {
        return this.desktop1;
    }

    public void build() {
        desktop1.compile();
        System.out.println("Build a project by using spring framework");
    }
}
