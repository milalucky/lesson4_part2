package TestSales;

import Sales.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatsService {

    @Test //Сумма всех продаж
    public void testSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test //Средняя сумма продаж
    public void testAvgSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avgSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test //Месяц с максимальной продажей
    public void testMaxMonthSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.maxMonthSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test //Месяц с минимальной продажей
    public void testMinMonthSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonthSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test //Кол-во месяцев с продажами ниже среднего
    public void testCountMonthMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthMinSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test //Кол-во месяцев с продажами выше среднего
    public void testCountMonthMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthMaxSale(sales);
        Assertions.assertEquals(expected, actual);
    }
}
