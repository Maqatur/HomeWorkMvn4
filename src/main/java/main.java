import ru.netology.stats.service.MonthlySalesService;

public class main {

    public static void main(String[] args) {

        int[] sales = {440_000, 352_000, 856_120, 297_340, 462_310, 58_700, 332_890, 764_100, 963_150, 852_340, 963_000, 498_000};
        MonthlySalesService service = new MonthlySalesService();

        int sum = service.SummarySales(sales);
        System.out.println("Годовая выручка составляет: " + sum);

        int sum2 = service.AverageAmount(sales);
        System.out.println("Среднемесячная выручка составляет: " + sum2);

        int maxMonth = service.MaxSales(sales);
        System.out.println("Месяц максимальных продаж: " + maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println("Месяц минимальных продаж: " + minMonth);

        int lowMonth = service.CalcLowMonth(sales);
        System.out.println("Количество месяцев низких продаж: " + lowMonth);

        int highMonth = service.CalcHighMonth(sales);
        System.out.println("Количество месяцев высоких продаж: " + highMonth);

    }
}
