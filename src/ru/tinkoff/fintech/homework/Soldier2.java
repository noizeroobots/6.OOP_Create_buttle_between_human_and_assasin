package ru.tinkoff.fintech.homework;

public abstract class Soldier2 extends WarriorRace{ //Класс наследник необходимо объявить как абстрактный класс

    @Override
    public void run() { // Переопределяем абстрактный метод и пишем реализацию.
        System.out.println("Soldier2 Бежит со скоростью 1 метр в секунду");
    }

    @Override
    public void death() { // Переопределяем абстрактный метод и пишем реализацию.
        System.out.println("Soldier2 Трагично погибает");
    }
}
