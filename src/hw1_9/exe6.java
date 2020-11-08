package hw1_9;
import java.util.Scanner;
public class exe6 {

        private static void f(int[] a) {
            int index_min = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < a[index_min]) {
                    index_min = i;
                }
            }
            int temp = a[index_min];
            for (int i = index_min; i != 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            f(a);
            for (int i = 0; i < N; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

