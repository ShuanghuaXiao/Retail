package com.company.model.customer;

import com.company.model.digital.RetailStoreEquipment;

public class IT extends RetailStoreEquipment {
  private   String systemName;
   private String systemPurpose;

    public void systemUpgrade () {
    System.out.println("Установлена новая версия ПО");
    }


}
