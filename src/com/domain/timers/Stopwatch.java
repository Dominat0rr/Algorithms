package com.domain.timers;

public class Stopwatch {
    private long start;
    private double stop;

    public Stopwatch() { }

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        long now = System.currentTimeMillis();
        stop = (now - start) / 1000.0;
    }

    public void print() {
        System.out.println(stop);
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
