package ru.tinkoff.fintech.homework;

public class Soldier1 extends WarriorRace1 implements Shooting { // Создаем новый класс и наследуемся от абстрактного класса и реализуем интерфейс Shooting

    Soldier1() {
        name = "Фёдор";
        specialization = "Человек";
    }

    @Override
    public void run() {
        System.out.print(" выглянул из-за камня");
    }

    @Override
    public void Attack() { // Класс Soldier1, связанный с интерфейсом Shooting, реализует его метод Attack()
        System.out.println(" и выстрелил из дробовика.");
    }

    @Override
    public void Defend() { // Класс Soldier1, связанный с интерфейсом Shooting, реализует его метод Defend()

        System.out.println(" увернулся от ножей");
    }


}
