package ru.netology.stats;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(Arrays.toString(sales));

        long actualSum = service.sumSales(sales);
        System.out.println(actualSum);

        long actualAvg = service.avgMonthSales(sales);
        System.out.println(actualAvg);

        long actualMin = service.minSales(sales);
        System.out.println(actualMin);

        long actualMax = service.maxSales(sales);
        System.out.println(actualMax);

        long actualMinAvg = service.minAvgSales(sales);
        System.out.println(actualMinAvg);

        long actualMaxAvg = service.maxAvgSales(sales);
        System.out.println(actualMaxAvg);
    }
}
