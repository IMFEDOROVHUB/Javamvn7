package ru.netology.stats;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(Arrays.toString(sales));

        int actualSum = service.sumSales(sales);
        System.out.println(actualSum);

        int actualAvg = service.avgMonthSales(sales);
        System.out.println(actualAvg);

        int actualMin = service.minSales(sales);
        System.out.println(actualMin);

        int actualMax = service.maxSales(sales);
        System.out.println(actualMax);

        int actualMinAvg = service.minAvgSales(sales);
        System.out.println(actualMinAvg);

        int actualMaxAvg = service.maxAvgSales(sales);
        System.out.println(actualMaxAvg);
    }
}
