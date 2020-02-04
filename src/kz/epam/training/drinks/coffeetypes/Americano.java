package kz.epam.training.drinks.coffeetypes;

import kz.epam.training.drinks.Coffee;

public class Americano extends Coffee {
    private static final int AMERICANO_WATER_ML = 70;
    private static final int AMERICANO_MILK_ML = 0;
    private static final int AMERICANO_ES_ML = 30;
    private static final int AMERICANO_PRICE = 500;

    public Americano() {
        super(AMERICANO_WATER_ML, AMERICANO_MILK_ML, AMERICANO_ES_ML,AMERICANO_PRICE);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Готовка Американо: За основу кофе добавляется эспрессо до 30 мл, затем заливается кипятком. " +
                "Ваше американо готово!.");
    }

    public int getPrice(){
        return AMERICANO_PRICE;
    }
}
