package kz.epam.training.service;

import kz.epam.training.customers.Client;
import kz.epam.training.drinks.coffeetypes.Americano;
import kz.epam.training.drinks.coffeetypes.Espresso;
import kz.epam.training.drinks.coffeetypes.Latte;

import java.util.Scanner;

public class Cashbox {
    private int coffeeNumber;
    private Client elon = new Client();
    private Payment payment = new Payment();
    private Espresso espresso = new Espresso();
    private Americano americano = new Americano();
    private Latte latte = new Latte();
    private Scanner scan = new Scanner(System.in);

    public void choice() {
        elon.setName("Elon");
        elon.setCash(600);
        System.out.print("Введите номер кофе из меню: ");
        coffeeNumber = scan.nextInt();
        switch (coffeeNumber) {
            case 1:
                espresso.makeCoffee();
                payment.toPay(espresso.getPrice(), elon.getCash(), elon.getName());
                break;
            case 2:
                americano.makeCoffee();
                payment.toPay(americano.getPrice(), elon.getCash(), elon.getName());
                break;
            case 3:
                latte.makeCoffee();
                payment.toPay(latte.getPrice(), elon.getCash(), elon.getName());
                break;
            default:
                System.out.println("Возможно, вы ввели некорректный номер , попробуйте еще раз!");
                choice();
        }
    }

}
