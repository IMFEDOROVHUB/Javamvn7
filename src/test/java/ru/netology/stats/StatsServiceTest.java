package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int exepted = 180;
        int actualSum = service.sumSales(sales);
        System.out.println(actualSum);
        Assertions.assertEquals(exepted, actualSum);
    }

    @Test
    public void testAvgMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 15;
        int actualAvgMonthSales = service.avgMonthSales(sales);
        System.out.println(actualAvgMonthSales);
        Assertions.assertEquals(expected, actualAvgMonthSales);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 9;
        int actualMinSales = service.minSales(sales);
        System.out.println(actualMinSales);
        Assertions.assertEquals(expected, actualMinSales);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 8;
        int actualMaxSales = service.maxSales(sales);
        System.out.println(actualMaxSales);
        Assertions.assertEquals(expected, actualMaxSales);
    }

    @Test
    public void testMinAvgSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actualMinAvgSales = service.minAvgSales(sales);
        System.out.println(actualMinAvgSales);
        Assertions.assertEquals(expected, actualMinAvgSales);
    }

    @Test
    public void testMaxAvgSales() {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actualMaxAvgSales = service.maxAvgSales(sales);
        System.out.println(actualMaxAvgSales);
        Assertions.assertEquals(expected, actualMaxAvgSales);
    }
}
