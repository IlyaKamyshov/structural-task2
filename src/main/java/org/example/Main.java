package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("1100", "1011000"));
        System.out.println(bins.mult("1100", "1011000"));
    }
}