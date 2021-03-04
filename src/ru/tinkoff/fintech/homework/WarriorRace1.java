package ru.tinkoff.fintech.homework;

public abstract class WarriorRace1 {

    String name;
    String specialization;

    public abstract void run(); //Объявляем абстрактный метод run()

    public void death(){ //Объявляем обычный метод death()
        System.out.println(" умер");
    }
}

