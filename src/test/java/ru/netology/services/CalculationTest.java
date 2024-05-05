package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @Test
    public void testCalculation1() {
        Calculation calc = new Calculation();
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;

        int actual = calc.calculate(income, expense, threshold);

        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testCalculation2() {
        Calculation calc = new Calculation();
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;

        int actual = calc.calculate(income, expense, threshold);
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }
    @ParameterizedTest
    @CsvFileSource (resources = "data_csv.csv")
    public void paramsTestCalculation(int income, int expense, int threshold, int expected) {
        Calculation calc = new Calculation();

        int actual = calc.calculate(income, expense, threshold);

        Assertions.assertEquals(actual, expected);
    }



}