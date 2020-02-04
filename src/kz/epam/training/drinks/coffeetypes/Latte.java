package kz.epam.training.drinks.coffeetypes;

import kz.epam.training.drinks.Coffee;

public class Latte extends Coffee {
    private static final int LATTE_WATER_ML = 0;
    private static final int LATTE_MILK_ML = 150;
    private static final int LATTE_ES_ML = 50;
    private static final int LATTE_PRICE = 600;

    public Latte() {
        super(LATTE_WATER_ML, LATTE_MILK_ML, LATTE_ES_ML, LATTE_PRICE);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Готовка Латте: В стакан сначала наливается эспрессо, а затем к нему постепенно, чтобы не перемешать, " +
                "добавляется молоко. Ваше кофе готово!");
    }

    public int getPrice() {
        return LATTE_PRICE;
    }
}
