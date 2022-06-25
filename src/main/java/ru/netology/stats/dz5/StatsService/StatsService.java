package ru.netology.stats.dz5.StatsService;

public class StatsService {


    public long sum(long[] sales) {
       long sum =0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int minSalesMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int lessAvg(long[] sales) {
        long avg =average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count = count + 1;
            }
        }
        return count;
    }

    public int aboveAvg(long[] sales) {
        long avg =average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count = count + 1;
            }
        }
        return count;
    }

}


