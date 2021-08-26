package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void findAmountOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAmount(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void findAverageOfPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getAverage(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMaxPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMonthMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthWithMinPurchases() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMonthMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityUnderAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findQuantityUnderAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityOverAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findQuantityOverAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

}