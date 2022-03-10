package com.company;

public class Main {
    public static void main(String[] args) {

//1
        int clientOS = 1;
        boolean isClientOS = clientOS == 1;

        if(isClientOS){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
    }
//2
        int clientDeviceYear = 2014;
        boolean isDino = clientDeviceYear < 2015;

        if(isClientOS && isDino){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(isClientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (isDino){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
    }
//3
        int year = 1984;

        boolean isLeapYear = (year%4 == 0 && year%100 != 0) || year%400 == 0 ;

        if(isLeapYear){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
//4

        int deliveryDistance = 95;

        if(deliveryDistance <= 20) {
            System.out.println("Потребуется дней: "+"1");
        }
        else if(deliveryDistance <= 60){
            System.out.println("Потребуется дней: "+"2");
        }
        else if(deliveryDistance <= 100)
            System.out.println("Потребуется дней: "+"3");


//        int deltaDistance = 20;
//        if(deliveryDistance <= 20) {
//            System.out.println("Потребуется дней: "+1);
//        }
//        else {
//            System.out.println("Потребуется дней: " + (((deliveryDistance-20)/deltaDistance)+2) );
//        }

//5
        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " это осень");
                break;
            default:
                System.out.println("Месяц введен неверно");
        }

        }
}
