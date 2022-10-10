package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void totalNumOfSales() {
        int expectedTotal = 180;
        int actualTotal = service.sumAllSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void calcAverrage() {
        int expectedAver = 15;
        int actualAver = service.averrageCountSales(sales);

        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    public void findMinMonthSales() {
        int expectedMonth = 9;
        int actualMonth = service.minSalesMonth(sales) + 1;

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findMaxMonthSales() {
        int expectedMonth = 8;
        int actualMonth = service.maxSalesMonth(sales) + 1;

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void belowAverageTest() {
        int expectedAbove = 5;
        int actualAbove = service.belowAverage(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }

    @Test
    public void aboveAverageTest() {
        int expectedAbove = 5;
        int actualAbove = service.aboveAverage(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }
}
