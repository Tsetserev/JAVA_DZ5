package ru.netology.stats.dz5.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldSumAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedSumAverageSales = 15;
        int actualSumAverageSales = service.sumAverageSales(sales);

        Assertions.assertEquals(expectedSumAverageSales, actualSumAverageSales);
    }

    @Test
    public void shouldMinMonthSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxMonthSales = 9;
        int actualMaxMonthSales = service.minSales(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxMonthSales = 8;
        int actualMaxMonthSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void shouldSumMaxAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxAverageSales = 5;
        int actualMaxAverageSales = service.sumMaxAverageSales(sales);

        Assertions.assertEquals(expectedMaxAverageSales, actualMaxAverageSales);

    }

    @Test
    public void shouldSumMinAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};

        int expectedMaxAverageSales = 5;
        int actualMaxAverageSales = service.sumMinAverageSales(sales);

        Assertions.assertEquals(expectedMaxAverageSales, actualMaxAverageSales);

    }
}
