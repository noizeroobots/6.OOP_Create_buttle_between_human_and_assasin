package ru.tinkoff.fintech.homework;

public class Soldier2 extends WarriorRace2 implements Cutting {

    Soldier2() {
        name = "Крид";
        specialization = "Ассасин";
    }

    @Override
    public final void run() {
        System.out.print(" появился из темной комнаты,");
    }

    @Override
    public final void attack() {
        System.out.print(" метнул ножи в ");
    }

    @Override
    public final void defend() {
        System.out.println(" увернулся от пуль");
    }
}

