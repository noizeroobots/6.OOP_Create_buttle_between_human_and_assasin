package ru.tinkoff.fintech.homework;

public class Soldier2 extends WarriorRace2 implements Cutting{ //Класс наследник необходимо объявить как абстрактный класс


    @Override
    public void run() {
        System.out.println("to run");
    }

    @Override
    public void death() {
        System.out.println("to dead");
    }

    @Override
    public void Attack() {
        System.out.println("WarriorRace2 Soldier2 Attack");
    }

    @Override
    public void Defend() {
        System.out.println("WarriorRace2 Soldier2 Defend");
    }
}
