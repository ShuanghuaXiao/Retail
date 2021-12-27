package com.company.model.dairy;

public class Product  {
    private String name;
    double price;
    String dateOfProduction;
    int barCode;

    public void putOnShell() {
        System.out.println("продукт был положен на полку");
    }

    public void takeFromShell() {
        System.out.println("Продукт был взят с полки");
    }

    public void scanBarCode() {
        System.out.println("Баркод отсканирован");
    }

    public void putInBasket() {
        System.out.println("Продукт положен в корзину");
    }

    public void takeFromBasket() {
        System.out.println("Продукт вынут из корзины");
    }

    public double checkThePrice() {
        System.out.println("цена: " + price);
        return price;
    }
    public void chekName () {
        System.out.println("Я продукт");
    }
    }