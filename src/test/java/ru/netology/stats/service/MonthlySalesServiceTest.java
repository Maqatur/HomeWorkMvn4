package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.service.MonthlySalesService;

public class MonthlySalesServiceTest {
    @Test
    public void TestAmountOfSales() {
        MonthlySalesService service = new MonthlySalesService();
        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 6_839_950;
        int actual = service.SummarySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAverageAmount() {
        MonthlySalesService service = new MonthlySalesService();
        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 569_995;
        int actual = service.AverageAmount(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMaxSales() {
        MonthlySalesService service = new MonthlySalesService();
        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 9;
        int actual = service.MaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMinSales() {
        MonthlySalesService service = new MonthlySalesService();
        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 6;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestLowSales() {
        MonthlySalesService service = new MonthlySalesService();
        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 7;
        int actual = service.CalcLowMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestHighSales() {
        MonthlySalesService service = new MonthlySalesService();
        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        int expected = 5;
        int actual = service.CalcHighMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

}




