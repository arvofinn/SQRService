package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SQRServiceTest {
    @Test

    public void calcWhenFewSquaresFound() {
        SQRService service = new SQRService();


        int actual = service.countSquares(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }
    @Test

    public void calcWhenFewSquaresFound2() {
        SQRService service = new SQRService();


        int actual = service.countSquares(300, 400);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test

    public void calcWhenFewSquaresFound3() {
        SQRService service = new SQRService();


        int actual = service.countSquares(50, 200);
        int expected = 5;

        assertEquals(expected, actual);
    }
}
