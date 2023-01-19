package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 4;
        int actual = service.calcSQR(500, 700);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcMinus() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQR(-10, 50);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcBeyond() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSQR(9800, 1_000_000);

        Assertions.assertEquals(expected, actual);

    }
}
