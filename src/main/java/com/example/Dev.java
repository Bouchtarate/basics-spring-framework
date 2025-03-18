package com.example;

public class Dev {

    private Laptop laptop;

    public Dev(Laptop laptop) {
        System.out.println("Dev constructor");
        this.laptop = laptop;
    }

    public void build() {
        laptop.compile();
        System.out.println("Build a project by using spring framework");
    }
}
