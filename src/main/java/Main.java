import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {12, 16, 15, 17, 4, 18, 5};

        System.out.println(service.minSalesMonth(sales) + 1);
    }
}
