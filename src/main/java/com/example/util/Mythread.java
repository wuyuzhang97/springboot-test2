package com.example.util;

import java.util.concurrent.Callable;

public class Mythread implements Callable<Integer> {
    private int start;
    private int end;

    public Mythread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        int j;
        for (int i = start; i <= end ; i++) {
            j = 2;
            for (; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.println(i);
                sum++;
            }
        }
        return sum;
    }
}
