package ru.tinkoff.fintech.homework;

public abstract class WarriorRace {

    private String name;
    private String specialization;

    public abstract void run(); //Объявляем абстрактный метод run()
    public abstract void death(); //Объявляем абстрактный метод death()
}
/*
#Абстрактный класс - класс, содержащий абстрактные методы. Шаблон для будущих классов.
