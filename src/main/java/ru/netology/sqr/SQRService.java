package ru.netology.sqr;

public class SQRService {
    public int calculateSqr(int firstLimit, int lastLimit) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstLimit && i * i <= lastLimit) {
                j++;
            }
        }
        return j;
    }
}

