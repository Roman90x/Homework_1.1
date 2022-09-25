public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Часть 1.");

        //Домашнее задание 1
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Домашнее задание 2
        //Задание 1
        System.out.println("Задание 1");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i+ " ");
        }
        System.out.println("");

        //Задание 3
        System.out.println("Задание 3");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println("");

        //Домашнее задание 3
        //Задание 1
        System.out.println("Задание 1");
        int part = 29_000;
        int sum = 0;
        for (int i = 1; i <=12; i++) {
            sum += part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }

        //Задание 2
        System.out.println("Задание 2");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <=12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей.");
        }

    }
}