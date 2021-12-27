package com.company.model.digital;

public class DigitalPriceTag extends RetailStoreEquipment{
   private String tagsSize;
    private String tagsScreenColor;
    private double tagsPrice;
    private String productName;

    public void tagsReadThePrice () {
        System.out.println("Узнать цену");
    }
    public void tagsReadProductName () {
        System.out.println("Узнать наименование товара");
    }
    public void tagsReadManufactureName () {
        System.out.println("Производитель");
    }

}
