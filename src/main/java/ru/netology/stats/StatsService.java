package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public int averrageCountSales(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count = count + sales[i];
        }
        return count / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int belowAverage(int[] sales) {
        int countBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averrageCountSales(sales)) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public int aboveAverage(int[] sales) {
        int countAbove = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averrageCountSales(sales)) {
                countAbove++;
            }
        }
        return countAbove;
    }
}
