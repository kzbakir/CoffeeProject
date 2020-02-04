package kz.epam.training.drink;

public abstract class Coffee {
    private int watermL;
    private int milkmL;
    private int espressomL;
    private int price;

    public Coffee(int watermL, int milkmL, int espressomL,int price) {
        this.watermL = watermL;
        this.milkmL = milkmL;
        this.espressomL = espressomL;
        this.price = price;
    }

    public void getComposition(){
        System.out.println("Состав кофе в миллилитрах: Вода: "+watermL + " , Молоко: "+milkmL+", эспрессо: "+espressomL+".");
    }

    public abstract void makeCoffee();

}
