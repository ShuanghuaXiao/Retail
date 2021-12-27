package com.company.model.customer;

public class MobileApp extends IT {
    String mobAppTypeOfOs;
    private String mobAppDeviceInfo;
    String mobAppSystemRequipments;

    public void mobAppDownload() {
        System.out.println("мобильное приложение скачано");
    }
    public void mobAppInstall () {
        System.out.println("Мобильное приложение установлено");
    }
    public void mobAppOpen () {
        System.out.println("Мобильное приложение открыто");
    }
}
