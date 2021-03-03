package ru.tinkoff.fintech.homework;

public class Battle {

    public void start() {
        Soldier1 soldier1 = new Soldier1();
        soldier1.Attack();
        soldier1.Defend();
        Soldier2 soldier2 = new Soldier2();
        soldier2.Attack();
        soldier2.Defend();

    }
}
