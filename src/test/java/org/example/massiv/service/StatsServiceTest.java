package org.example.massiv.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldAmount() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sum(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.average(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldmaxMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonth(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldminMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonth(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldbelowAverageMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageMonth(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldaboveAverageMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageMonth(sale);

        Assertions.assertEquals(expected, actual);
    }
}