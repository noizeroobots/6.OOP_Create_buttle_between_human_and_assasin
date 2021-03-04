package ru.tinkoff.fintech.homework;

public class Soldier2 extends WarriorRace2 implements Cutting{ //Класс наследник необходимо объявить как абстрактный класс

    Soldier2() {
        name = "Крид";
        specialization = "Ассасин";
    }

    @Override
    public void run() {
        System.out.println(" выбежал из-за угла");
    }

    @Override
    public void Attack() {
        System.out.println(" метнул ножи");
    }

    @Override
    public void Defend() {
        System.out.println(" увернулся от пуль");
    }
}
