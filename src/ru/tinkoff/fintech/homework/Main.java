package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(String[] args) {

        Solderi1 soldier1 = new Solderi1();
        Soldier2 soldier2 = new Soldier2();

        Battle battle = new Battle();
        battle.start(soldier1);
        battle.start(soldier2);
    }
}
