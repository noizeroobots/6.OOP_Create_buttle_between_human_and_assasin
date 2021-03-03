package ru.tinkoff.fintech.homework;

public class Soldier1 extends WarriorRace1 implements Shooting { // Создаем новый класс и наследуемся от абстрактного класса

    public void setName(String name) {
        this.name = "1+1";
    }

    public void setSpecialization(String specialization) {
        this.specialization = "Human";
    }

    @Override
    public void run() {
        System.out.println("Федя выглянул из-за камня");
    }

    @Override
    public void death() {
        System.out.println("Федя умер");
    }

    @Override
    public void Attack() {
        System.out.println("Федя выстрелил из ружья");
    }

    @Override
    public void Defend() {
        System.out.println("Федя не увернулся от ножей");
    }
}
