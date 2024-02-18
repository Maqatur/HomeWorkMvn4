package ru.netology.stats.service;

public class MonthlySalesService {

    public int SummarySales(int[] sales) {

        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int AverageAmount(int[] sales) {

        int sum2 = SummarySales(sales) / sales.length;
        return sum2;
    }

    public int MaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int CalcLowMonth(int[] sales) {
        int lowMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageAmount(sales)) {
                lowMonth++;
            }
        }
        return lowMonth;

    }

    public int CalcHighMonth(int[] sales) {
        int highMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageAmount(sales)) {
                highMonth++;
            }
        }
        return highMonth;

    }

}