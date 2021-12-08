package Grekov;

import Grekov.classes.*;


public class Main {

    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler(2048, 4);
        scheduler.run();
    }
}
