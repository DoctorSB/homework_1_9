package hw1_9;

import java.util.Scanner;
public class exe4 {
        static void f(double a, int b) {
            for (int i = 0; i < b; i++) {
                a *= 2;
                System.out.print((int) a % 10);
                if (a >= 1) {
                    a = a - 1;
                }
            }

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            int b = sc.nextInt();
            f(a, b);
        }
}

