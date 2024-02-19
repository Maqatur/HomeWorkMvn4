package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthlySalesServiceTest {
    @Test
    public void TestAmountOfSales() {
        MonthlySalesService service = new MonthlySalesService();
        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        long expected = 6_839_950;
        long actual = service.summarySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAverageAmount() {
        MonthlySalesService service = new MonthlySalesService();
        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        long expected = 569_995;
        long actual = service.averageAmount(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMaxSales() {
        MonthlySalesService service = new MonthlySalesService();
        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 9;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMinSales() {
        MonthlySalesService service = new MonthlySalesService();
        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 6;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestLowSales() {
        MonthlySalesService service = new MonthlySalesService();
        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        long expected = 7;
        long actual = service.calcLowMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestHighSales() {
        MonthlySalesService service = new MonthlySalesService();
        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        long expected = 5;
        long actual = service.calcHighMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

}




