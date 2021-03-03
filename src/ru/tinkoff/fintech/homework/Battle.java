package ru.tinkoff.fintech.homework;

public class Battle {

    public void start() {
        Soldier1 soldier1 = new Soldier1(); // Создал экземпляр бойца (юнита)
        Soldier2 soldier2 = new Soldier2(); // Создал экземпляр бойца (юнита)

        soldier1.run();
        soldier1.Attack();
        soldier2.Defend();
        soldier2.Attack();

        soldier1.Defend();

        soldier1.death();




    }
}
