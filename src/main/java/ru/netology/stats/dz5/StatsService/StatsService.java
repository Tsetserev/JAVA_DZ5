package ru.netology.stats.dz5.StatsService;

public class StatsService {


    public int sumSales(int[] sum) {
        int sumSale = 0;
        for (int i = 0; i < sum.length; i++) {
            sumSale = sumSale + sum[i];

        }
        return sumSale;
    }


    public int sumAverageSales(int[] sum) {
        int sumSale = 0;
        int sumAverageSales = 0;
        for (int i = 0; i < sum.length; i++) {
            sumSale = sumSale + sum[i];
            sumAverageSales = sumSale / sum.length;

        }
        return sumAverageSales;
    }


    /* public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

    }*/
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int maxSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int sumMaxAverageSales(int[] sum) {
        int sumSale = 0;
        int sumAverageSales = 0;
        for (int i = 0; i < sum.length; i++) {
            sumSale = sumSale + sum[i];
            sumAverageSales = sumSale / sum.length;
        }

        int aboveAverage = sumAverageSales;
        int countMonth = 0;
        for (int l = 0; l < sum.length; l++) {
            if (sum[l] > aboveAverage) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;

    }

    public int sumMinAverageSales(int[] sum) {
        int sumSale = 0;
        int sumAverageSales = 0;
        for (int i = 0; i < sum.length; i++) {
            sumSale = sumSale + sum[i];
            sumAverageSales = sumSale / sum.length;
        }

        int aboveAverage = sumAverageSales;
        int countMonth = 0;
        for (int l = 0; l < sum.length; l++) {
            if (sum[l] < aboveAverage) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;

    }
}


