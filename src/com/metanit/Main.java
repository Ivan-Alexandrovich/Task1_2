package com.metanit;

import java.util.Scanner;
/*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
результат,где a, b, c, d – входные параметры этого метода; (внимательно изучить
деление на 3, разобраться, почему так, также предусмотреть деление на 0)*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your values of a, b, c, d: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if (d!=0) {
            double res = Ex(a, b, c, d);
            System.out.println("Here is the value of expression a * (b + (c / d)): "+ res);
        }
        else {
            System.out.println("insert d!=0 value");
        }
    }


    public static double Ex(double a, double b, double c, double d) {
        double res = a * (b + (c / d));
        return res;
    }
}