package hw1_9;

import java.util.Scanner;
    public class exe3 {
        static int f(int a) {
            int result = 0;
            for (int i = 100; i < a; i++) {
                if ((i % 10 + i / 10 % 10 + i / 100) % 13 == 0) {
                    result++;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            System.out.println(f(b));
        }
    }
