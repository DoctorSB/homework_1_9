package hw1_9_1;
import java.util.Scanner;
public class exe_1 {
        private static double f(int x1, int y1, int x2, int y2) {
            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            double perimeter = f(x1, y1, x2, y2) + f(x1, y1, x3, y3) + f(x2, y2, x3, y3);
            System.out.printf("%.10f", perimeter);
        }
    }
