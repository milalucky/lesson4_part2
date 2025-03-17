package Sales;

public class StatsService {

    public int sumSales(int[] sales) { //Сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int avgSumSales(int[] sales) { //Средняя сумма продаж
        return sumSales(sales) / sales.length;
    }

    public int maxMonthSale(int[] sales) { //Месяц с максимальной продажей
        int max = sales[0];
        int monthMax = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
                monthMax = i;
            }
        }
        return monthMax + 1;
    }


    public int minMonthSale(int[] sales) { //Месяц с минимальной продажей
        int min = sales[0];
        int monthMin = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int countMonthMinSale(int[] sales) { //Кол-во месяцев с продажами ниже среднего
        int count = 0;
        int avgSum = avgSumSales(sales);
        for (int sale : sales) {
            if (sale < avgSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthMaxSale(int[] sales) { //Кол-во месяцев с продажами выше среднего
        int count = 0;
        int avgSum = avgSumSales(sales);
        for (int sale : sales) {
            if (sale > avgSum) {
                count++;
            }
        }
        return count;
    }

}
