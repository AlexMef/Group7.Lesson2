package com.company;


import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

    private static DecimalFormat format = new DecimalFormat();
    public static void main(String[] args) {
//        // 1. Программа для решения квадратного уравнения. Коэффициенты вводятся в процессе выполнения программы
//        Scanner in = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//        // Ввод коэффициентов квадратного уравнения
//        System.out.print("Введите коэффициент a= ");
//        a = in.nextDouble();
//        System.out.print("Введите коэффициент b= ");
//        b = in.nextDouble();
//        System.out.print("Введите коэффициент c= ");
//        c = in.nextDouble();
//
//        sqr(a, b, c);


//        // 2. Программа для подсчёта периметра и площади прямоугольника
//        Scanner in = new Scanner(System.in);
//        double a;
//        double b;
//        // Ввод значений сторон a и b
//        System.out.print("Длина стороны а = ");
//        a = in.nextDouble();
//        System.out.print("Длина стороны b = ");
//        b = in.nextDouble();
//
//        squarePerimeter(a, b);
//        squareArea(a, b);

//         // 3. Программа для подсчёта длины квадрата по периметру
//         Scanner in = new Scanner(System.in);
//         System.out.print("Периметр квадрата равен = ");
//         double perimeter = in.nextDouble();
////       Вызов метода для нахождения длины стороны квадрата из периметра
//         sideFromPerimeter(perimeter);


        // 4. Программы для вычисления значений переменной по заданым формулам
        Scanner in = new Scanner(System.in);

        double a;
        double b;
        double c;
        double x;
        double y;



        System.out.print("Выберите необходимое действие : ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Введите значение переменной a = ");
                a = in.nextDouble();
                System.out.print("Введите значение переменной b = ");
                b = in.nextDouble();
                System.out.print("Введите значение переменной c = ");
                c = in.nextDouble();
                System.out.println(func_1(a, b, c));
                break;
            case 2:
                System.out.print("Введите значение переменной x = ");
                x = in.nextDouble();
                System.out.println(func_2(x));
                break;
            case 3:
                System.out.print("Введите значение переменной x = ");
                x = in.nextDouble();
                System.out.println(func_3(x));
                break;
            case 4:
                System.out.print("Введите значение переменной x = ");
                x = in.nextDouble();
                System.out.print("Введите значение переменной y = ");
                y = in.nextDouble();
                System.out.println(func_4(x, y));
                break;
            case 5:
                System.out.print("Введите значение переменной x = ");
                x = in.nextDouble();
                System.out.println(func_5(x));
            default:
                break;
        }

    }

    // Метод для подсчета и вывода корней квадратного уравнения
    private static void sqr(double a, double b, double c) {
        double x1;
        double x2;
        double diskriminant = b * b - 4 * a * c;
        if (diskriminant < 0) {
            // Выход, если дискриминант меньше нуля
            System.out.println("Дискриминант меньше 0");
        } else if (diskriminant == 0) {
            // Подсчёт х, когда дискриминант равен нулю
            x1 = (-b) / (2 * a);
            System.out.println("Уравнение имеет один корень = " + x1);
        } else {
            // Подсчёт коэффициента х1
            x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            // Подсчёт коэффициента х2
            x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("Коэффициент х1 = " + x1 + " , x2 = " + x2);
        }
    }

    // Метод для подсчёта периметра прямоугольника
    private static void squarePerimeter(double a, double b) {
        if (a < 0 || b < 0) {
            System.out.println("Стороны не могут иметь отрицательную длину");
        } else if (a == b) {
            System.out.println("Периметр квадрата равен = " + ((2 * a) + (2 * b)));
        } else
            System.out.println("Периметр прямоугольника равен = " + ((2 * a) + (2 * b)));

    }

    // Метод для подсчёта площади прямоугольника
    private static void squareArea(double a, double b) {
        if (a < 0 || b < 0) {
            System.out.println("Стороны не могут иметь отрицательную длину");
        } else if (a == b) {
            System.out.println("Площадь квадрата равна = " + a * b);
        } else
            System.out.println("Площадь прямоугольника равна = " + a * b);
    }

    // Метод для подсчета длины стороны квадрата из его периметра
    private static void sideFromPerimeter(double perimeter) {
        System.out.println("Длина стороны квадрата равна = " + (perimeter / 4));
    }

    // Метод для вычисления первой формулы
    private static double func_1(double a, double b, double c) {
        double diskriminant = b * b - 4 * a * c;
        return ((b + Math.sqrt(diskriminant)) / (2 * a)) - (a * a * a * c + (1 / (b * b)));
    }
    // Метод для вычисления второй формулы
    private static double func_2 (double x){
        return Math.pow(x, 2) + Math.pow(x, 3);
    }
    // Метод для вычисления третьей формулы
    private static double func_3 (double x){
        return (x - (Math.pow(x, 3)/3) + (Math.pow(x, 5)/5));
    }
    // Метод для вычисления четвертой формулы
    private static double func_4 (double x, double y){
        return ((x + y)/(y + 1) - ((x * y) - 12)/(34 + x));
    }
    // Метод для вычисления пятой формулы
    private static double func_5 (double x){
        return (Math.sin(Math.sqrt(Math.toRadians(x) + 1)) - Math.sin((Math.sqrt(Math.toRadians(x) - 1))));
    }




}