package ru.netology.stats.dz5.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualSum = service.sum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldSumAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedSumAverageSales = 15;
        long actualSumAverageSales = service.average(sales);

        Assertions.assertEquals(expectedSumAverageSales, actualSumAverageSales);
    }

    @Test
    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxMonthSales = 8;
        int actualMaxMonthSales = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void shouldMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxMonthSales = 9;
        int actualMaxMonthSales = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void shouldSumMinAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxAverageSales = 5;
        int actualMaxAverageSales = service.lessAvg(sales);

        Assertions.assertEquals(expectedMaxAverageSales, actualMaxAverageSales);

    }

    @Test
    public void shouldSumMaxAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxAverageSales = 5;
        int actualMaxAverageSales = service.aboveAvg(sales);

        Assertions.assertEquals(expectedMaxAverageSales, actualMaxAverageSales);

    }
}

