package hw1_9;

import java.util.Scanner;
public class exe1 {
        static int f(int a) {
            return a / 10 + a % 10;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            System.out.println(f(b));
        }
    }
