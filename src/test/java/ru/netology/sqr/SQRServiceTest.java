package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void calculateSqr(String testName, int firstLimit, int lastLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSqr(firstLimit, lastLimit);
        assertEquals(expected, actual);
    }
}