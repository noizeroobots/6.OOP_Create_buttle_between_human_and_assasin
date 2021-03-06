package ru.tinkoff.fintech.homework;

public class Battle {

    public void start() {

        Soldier1 soldier1 = new Soldier1(); // Создал экземпляр бойца (юнита)
        Soldier2 soldier2 = new Soldier2(); // Создал экземпляр бойца (юнита)

        System.out.print(soldier1.specialization + " " + soldier1.name);
        soldier1.run();
        soldier1.Attack();

        System.out.print(soldier2.specialization + " " + soldier2.name);
        soldier2.Defend();

        System.out.print(soldier2.specialization + " " + soldier2.name);
        soldier2.Attack();

        System.out.print(soldier1.specialization + " " + soldier1.name + " не");
        soldier1.Defend();

        System.out.print(soldier1.specialization + " " + soldier1.name);
        soldier1.death();

        System.out.println(":((((((");
    }
}
