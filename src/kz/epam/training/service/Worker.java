package kz.epam.training.service;

import kz.epam.training.drinks.coffeetypes.Americano;
import kz.epam.training.drinks.coffeetypes.Espresso;
import java.util.Scanner;

public class Worker {

    public void sayHello() {
        System.out.println("Добро пожаловать в нашу кофейню! Какое кофе будете заказывать?");
        System.out.println("Меню: 1.Эспрессо , 2.Американо , 3.Латте");
    }

    public void sayGoodBuy(String name) {
        System.out.println("Досвидание  " + name + "! Приходите еще!");
    }

}
