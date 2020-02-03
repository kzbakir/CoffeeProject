package kz.epam.training.mainpackage;

import kz.epam.training.service.Cashbox;
import kz.epam.training.service.Worker;

public class Runner {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Cashbox cashbox = new Cashbox();
        worker.sayHello();
        cashbox.choice();
    }

}
