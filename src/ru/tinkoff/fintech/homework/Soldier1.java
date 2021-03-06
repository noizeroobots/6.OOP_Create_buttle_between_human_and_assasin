package ru.tinkoff.fintech.homework;

public class Soldier1 extends WarriorRace1 implements Shooting {

    Soldier1() {
        name = "Фёдор";
        specialization = "Человек";
    }

    @Override
    public final void run() {
        System.out.print(" выглянул из-за камня");
    }

    @Override
    public final void attack() { // Класс Soldier1, связанный с интерфейсом Shooting, реализует его метод Attack()
        System.out.println(" и выстрелил из дробовика.");
    }

    @Override
    public final void defend() { // Класс Soldier1, связанный с интерфейсом Shooting, реализует его метод Defend()

        System.out.println(" увернулся от ножей");
    }


}
