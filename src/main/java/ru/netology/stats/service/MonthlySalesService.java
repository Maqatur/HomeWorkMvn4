package ru.netology.stats.service;

public class MonthlySalesService {

    public long summarySales(long[] sales) {

        long amount = 0;
        for (long monthRevenue : sales) {
            amount += monthRevenue;
        }
        return amount;
    }

    public long averageAmount(long[] sales) {

        long averageMonthly = summarySales(sales) / sales.length;
        return averageMonthly;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcLowMonth(long[] sales) {
        int lowMonth = 0;
        long averageValue = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageValue) {
                lowMonth++;
            }
        }
        return lowMonth;
    }

    public int calcHighMonth(long[] sales) {
        int highMonth = 0;
        long averageValue = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageValue) {
                highMonth++;
            }
        }
        return highMonth;
    }

}