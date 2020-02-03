package kz.epam.training.service;

import kz.epam.training.customers.Client;
import java.util.Scanner;

public class Payment {

    private int result;
    private String tenge = "тг.";
    private Worker worker = new Worker();

    public void toPay(int price, int cash,String name) {
        System.out.println("С Вас будет " + price + " " + tenge);
        if (price == cash) {
            worker.sayGoodBuy(name);
        } else if (price < cash) {
            result = cash - price;
            System.out.println("Спасибо за покупку! Вот ваша сдача: " + result + " " + tenge);
        } else if (price > cash) {
            result = price - cash;
            System.out.print("К сожелению Вам не хватает: " + result + " " + tenge);
        }
    }

}
