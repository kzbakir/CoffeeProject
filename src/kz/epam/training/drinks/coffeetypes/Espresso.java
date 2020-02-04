package kz.epam.training.drinks.coffeetypes;

import kz.epam.training.drinks.Coffee;

public class Espresso extends Coffee {
    private static final int ESPRESSO_WATER_ML = 30;
    private static final int ESPRESSO_MILK_ML = 0;
    private static final int ESPRESSO_ES_ML = 0;
    private static final int ESPRESSO_PRICE = 400;

    public Espresso() {
        super(ESPRESSO_WATER_ML, ESPRESSO_MILK_ML, ESPRESSO_ES_ML, ESPRESSO_PRICE);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Готовка эспрессо: Через молотый кофе " +
                "пропускается под высоким давлением горячая вода. В чашку «выжимается» предельно " +
                "концентрированный вкус и аромат. Ваш эспрессо готово! ");
    }

    public int getPrice() {
        return ESPRESSO_PRICE;
    }
}
