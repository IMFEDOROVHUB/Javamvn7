package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0; // сумма изначально 0

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            }

        return sum; // сумма
    }

    public int avgMonthSales(long[] sales) {
        int avgMonth = sumSales(sales) / sales.length; // взять сумму и разделить на количество месяцев

        return avgMonth; // средняя сумма продаж
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как максимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minAvgSales(long[] sales) {
        int minAvgSales = avgMonthSales(sales); // средняя продажа за месяц
        int month = 0; // количество месяцев в которых меньше среднего, изначально 0

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minAvgSales) { // значит, в рассматриваемом i-м месяце продаж больше
                month++; // прибавляем месяц если меньше среднего
            }
        }

        return month; // количество месяцев, где продажи меньше среднего
    }

    public int maxAvgSales(long[] sales) {
        int maxAvgSales = avgMonthSales(sales); // средняя продажа за месяц
        int month = 0; // количество месяцев в которых меньше среднего, изначально 0

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxAvgSales) { // значит, в рассматриваемом i-м месяце продаж больше
                month++; // прибавляем месяц если меньше среднего
            }
        }

        return month; // количество месяцев, где продажи меньше среднего
    }
}
