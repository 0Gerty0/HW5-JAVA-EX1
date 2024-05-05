package ru.netology.services;

public class Calculation {
    public int calculate(int income, int expense, int threshold) {
        int balance = 0; // начальное состояние счёта
        int count = 0; //счётчик месяцев
        for (int i = 0; i < 12; i++) {
            if (balance>=threshold) {//отдых
                balance -= expense;
                balance /= 3;
                count++;

            } else {// работа
                balance += income;
                balance -= expense;
            }
        }
        return count;
    }
}
