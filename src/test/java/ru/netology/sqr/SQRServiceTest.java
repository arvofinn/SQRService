package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SQRServiceTest {
    @Test

    public void calcWhenFewSquaresFound() {
         SQRService service = new SQRService();

        int actual = service.countSquares( lowLimit: 200, highLimit: 300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
