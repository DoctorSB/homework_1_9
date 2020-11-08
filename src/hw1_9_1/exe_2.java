package hw1_9_1;
import java.util.Scanner;
public class exe_2 {
        static int min(int a, int b, int c, int d) {
            int min = a;
            for (int i : new int[]{b, c, d}) {
                if (min > i) {
                    min = i;
                }
            }
            return min;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(min(a, b, c, d));
        }
    }
