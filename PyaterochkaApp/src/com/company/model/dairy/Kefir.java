package com.company.model.dairy;


public class Kefir extends Product {
    private String name;
    private double price;

    public void openABottle () {
        System.out.println ("Бутылка кефира открыта");
    }
    public void chekName () {
        System.out.println("Я кефир");
    }
    public double checkThePrice() {
        System.out.println("Цена кефира: " + 24.51);
        return 24;
    }

    public void putInBasket() {
        System.out.println("Кефир положен в корзину");
    }
}
