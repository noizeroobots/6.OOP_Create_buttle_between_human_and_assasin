package ru.tinkoff.fintech.homework;

public abstract class Solderi1 extends WarriorRace { // Создаем новый класс и наследуемся от абстрактного класса

    public Solderi1(String name) {
        super(name);
    }

    @Override
    public void run() { // Переопределяем абстрактный метод и пишем реализацию.
        System.out.println("Soldier1 Бежит со скоростью 1 метр в секунду");
    }

    @Override
    public void death() { // Переопределяем абстрактный метод и пишем реализацию.
        System.out.println("Soldier1 Трагично погибает");
    }
}
