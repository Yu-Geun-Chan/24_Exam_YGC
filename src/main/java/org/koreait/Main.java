package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 9;
        for (int i = 0; i <= n; i++) System.out.println(fibonacci(i));
    }
    private static int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}


