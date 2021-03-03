package ru.tinkoff.fintech.homework;

public class Solderi1 extends WarriorRace1 implements Shooting{ // Создаем новый класс и наследуемся от абстрактного класса


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
        System.out.println("WarriorRace1 Soldier1 Attack");
    }

    @Override
    public void Defend() {
        System.out.println("WarriorRace1 Soldier1 Defend");
    }
}
