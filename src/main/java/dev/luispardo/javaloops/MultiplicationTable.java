package dev.luispardo.javaloops;

public class MultiplicationTable {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printMultiplicationTable(n);
    }
}
