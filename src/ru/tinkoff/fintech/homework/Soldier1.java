package ru.tinkoff.fintech.homework;

public class Soldier1 extends WarriorRace1 implements Shooting { // Создаем новый класс и наследуемся от абстрактного класса

    Soldier1() {
        name = "Фёдор";
        specialization = "Человек";
    }

    @Override
    public void run() {
        System.out.println(" выглянул из-за камня");
    }

    @Override
    public void Attack() {
        System.out.println(" выстрелил из дробовика");
    }

    @Override
    public void Defend() {
        System.out.println(" не увернулся от ножей");
    }
}
