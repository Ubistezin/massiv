package org.example.massiv.service;

public class StatsService {
    public long sum(long[] sale) {
        int sum = 0;
        for (long num : sale) {
            sum += num;
        }
        return sum;
    }

    public long average(long[] sale) {
        return sum(sale) / 12;
    }

    public int maxMonth(long[] sale) {
        int maxMonth = 0;
        int month = 0;
        for (long number : sale) {
            if (number >= sale[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sale) {
        int minMonth = 0;
        int month = 0;
        for (long number : sale) {
            if (number <= sale[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageMonth(long[] sale) {
        int belowAverageMonth = 0;
        long avg = average(sale);
        for (long number : sale) {
            if (number < avg) {
                belowAverageMonth++;
            }
        }
        return belowAverageMonth;
    }

    public int aboveAverageMonth(long[] sale) {
        int aboveAverageMonth = 0;
        long avg = average(sale);
        for (long number : sale) {
            if (number > avg) {
                aboveAverageMonth++;
            }
        }
        return aboveAverageMonth;
    }
}