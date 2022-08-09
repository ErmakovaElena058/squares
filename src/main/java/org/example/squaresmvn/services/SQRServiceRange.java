package org.example.squaresmvn.services;

public class SQRServiceRange {

    public long calcSqrt(long bottom, long top) {

        for (long i = 10; i >= 99; i++) {
            if (i * i >= bottom
                    && i * i <= top) {
                return i;
            }
        }
        return -1;
    }

}