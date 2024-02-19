import ru.netology.stats.service.MonthlySalesService;

public class main {

    public static void main(String[] args) {

        long[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        MonthlySalesService service = new MonthlySalesService();

        long annualRevenue = service.summarySales(sales);
        System.out.println("Годовая выручка составляет: " + annualRevenue);

        long averageMonthly = service.averageAmount(sales);
        System.out.println("Среднемесячная выручка составляет: " + averageMonthly);

        int maxMonth = service.maxSales(sales);
        System.out.println("Месяц максимальных продаж: " + maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println("Месяц минимальных продаж: " + minMonth);

        int lowMonth = service.calcLowMonth(sales);
        System.out.println("Количество месяцев низких продаж: " + lowMonth);

        int highMonth = service.calcHighMonth(sales);
        System.out.println("Количество месяцев высоких продаж: " + highMonth);

    }
}
