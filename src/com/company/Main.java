package com.company;

public class Main {

    public static void main(String[] args) {
	    VeredaGT coche = new VeredaGT("1131-AWF", 10.0f,2.4f);

        coche.move();
        coche.move();
        coche.move();
        coche.move();
        coche.move();
        coche.move();

        System.out.println(coche.energyLevel());

        coche.recharge();

        System.out.println(coche.energyLevel());

        System.out.println(coche.status());
    }
}
