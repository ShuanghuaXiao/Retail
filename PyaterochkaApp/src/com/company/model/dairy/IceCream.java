package com.company.model.dairy;

public class IceCream extends Product {
    private String name;
    private String flavor;

    public void takeFromShell() {
        System.out.println("Мороженое взяли с полки");
    }
}
