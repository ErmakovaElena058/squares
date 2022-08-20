package org.example.squaresmvn.services;

public class SQRServiceRange {

    public long calcSqrt(long bottom, long top) {

        long count = 0;
        for (long i = 10; i <= 99; i++) {
            long sqr = i * i;
            if (sqr >= bottom) {
                if (sqr <= top) {
                    count++;
                }
            }
        }
        return count;
    }

}