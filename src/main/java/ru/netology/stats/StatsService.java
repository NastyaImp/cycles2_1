package ru.netology.stats;

public class StatsService {
    public int calculateAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateAmount(sales) / sales.length;
    }

    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int calculateMonthSalesUnderAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calculateMonthSalesAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }
}
