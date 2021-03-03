package ru.tinkoff.fintech.homework;

public class Soldier2 extends WarriorRace2 implements Cutting{ //Класс наследник необходимо объявить как абстрактный класс

    @Override
    public void run() {
        System.out.println("Ассасин выбежал из-за угла");
    }

    @Override
    public void death() {
        System.out.println("Ассасин умер");
    }

    @Override
    public void Attack() {
        System.out.println("Ассасин метнул ножи");
    }

    @Override
    public void Defend() {
        System.out.println("Ассасин увернулся от пуль");
    }
}
