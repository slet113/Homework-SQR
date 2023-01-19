package ru.netology.sqr;

import javax.swing.plaf.IconUIResource;

public class SQRService {
    public int calcSQR(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= min & x <= max) {
              count++;
            }
        }
        return count;
    }
}