package oshka_guru_qa;

public class MathOperations {

    public static void main(String[] args) {

        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int firstInt = 7;
        int secondInt = 5;
        int thirdInt = 5;

        System.out.println("\nОперации над Integer\n");

        System.out.println("Сложение " + (firstInt + secondInt));
        System.out.println("Вычитание " + (firstInt - secondInt));
        System.out.println("Умножение " + (firstInt * secondInt));
        System.out.println("Деление без остатка " + (firstInt / secondInt));
        System.out.println("Остаток от деления " + (firstInt % secondInt));

        //1) применить несколько арифметических операций над int и double в одном выражении

        double firstDouble = 7.99;

        System.out.println("\nОперации над Integer и Double\n");

        System.out.println("Сложение " + (firstInt + firstDouble));
        System.out.println("Вычитание " + (firstDouble - firstInt));
        System.out.println("Умножение " + (secondInt * firstDouble));
        System.out.println("Деление " + (firstDouble / firstInt));

        //2) применить несколько логических операций ( < , >, >=, <= )

        System.out.println("\nЛогические операции\n");

        System.out.println("> " + (firstInt > firstDouble));
        System.out.println("< " + (firstInt < firstDouble));
        System.out.println(">= " + (thirdInt >= secondInt));
        System.out.println("<= " + (firstInt <= firstDouble));

        //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // (какие максимальные и минимальные значения есть, как их получить) и переполнение

        System.out.println("\nМаксимальные значения Float и Double\n");

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(-Float.MAX_VALUE);
        System.out.println(-Double.MAX_VALUE);

        System.out.println("\nМинимальные значения Float и Double\n");

        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(-Float.MIN_VALUE);
        System.out.println(-Double.MIN_VALUE);

        //4) получить переполнение при арифметической операции

        System.out.println("\nПереполнения\n");

        System.out.println("Переполнение " + (Float.MAX_VALUE * 2)); //Значение больше, чем может быть в float
        System.out.println("Подпереполнение  " + (Float.MIN_VALUE / 2)); //Значение меньше, чем может быть в float

    }
}