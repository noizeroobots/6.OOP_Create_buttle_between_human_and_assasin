package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public final class Battle {

    private final Soldier1 soldier1 = new Soldier1(); // Создал экземпляр бойца (юнита)
    private final Soldier2 soldier2 = new Soldier2(); // Создал экземпляр бойца (юнита)

    public void startDark() {

        System.out.print(soldier1.specialization + " " + soldier1.name);
        soldier1.run();
        soldier1.attack();

        System.out.print(soldier2.specialization + " " + soldier2.name);
        soldier2.defend();

        System.out.print(soldier2.specialization + " " + soldier2.name);
        soldier2.attack();
        System.out.println(soldier1.specialization + " " + soldier1.name);

        System.out.print(soldier1.specialization + " " + soldier1.name + " не");
        soldier1.defend();

        System.out.print(soldier1.specialization + " " + soldier1.name);
        soldier1.death();

        System.out.println(":((((((");
    }

    public void startLight() {

        System.out.print(soldier2.specialization + " " + soldier2.name);
        soldier2.run();
        soldier2.attack();
        System.out.println(soldier1.specialization + " " + soldier1.name);

        System.out.print(soldier1.specialization + " " + soldier1.name);
        soldier1.defend();

        System.out.print(soldier1.specialization + " " + soldier1.name);
        soldier1.attack();

        System.out.print(soldier2.specialization + " " + soldier2.name + " не");
        soldier2.defend();

        System.out.print(soldier2.specialization + " " + soldier2.name);
        soldier2.death();

        System.out.println(":))))))");
    }

    public void start() {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите светлую (введите 'light') или тёмную сторону(введите 'dark'): ");
        String starting = in.nextLine();

        switch (starting) {
            case ("dark"):
                startDark();
                break;

            case ("light"):
                startLight();
                break;

            default:
                System.out.println("Вы не выбрали ни светлую, ни тёмную сторону, вы уникум!");
        }
    }

}
