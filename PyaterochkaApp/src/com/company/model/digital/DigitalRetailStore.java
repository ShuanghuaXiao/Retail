package com.company.model.digital;

public class DigitalRetailStore {
    private String storeDescription;
   private int storeCustomerNumber;
   private int bonusSum;

    public void storePurchase () {
        System.out.println("Покупка совершена");
    }
    public void storePaymentAddToRevenue () {
        System.out.println("Доход магазина увеличился");
    }
    public void storeBonusPurchase () {
        System.out.println("Покупка за бонусы");
    }
}
