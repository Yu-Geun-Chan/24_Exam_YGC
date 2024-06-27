package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            if (i > 1) {
                System.out.println();
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
        }
    }
}