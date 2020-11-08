package hw1_9;
import java.util.Scanner;
public class exe5 {

        static double f(int[] a) {
            double sum = 0;
            int count = 0;
            for (int value : a) {
                if (value >= 1000 && value % 10000 == value) {
                    sum += value;
                    count++;
                }
            }
            if (count != 0)
                return sum / count;
            else
                return -1.00;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            System.out.printf("%.2f", f(a));
        }
    }

