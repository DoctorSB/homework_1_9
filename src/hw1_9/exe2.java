package hw1_9;

public class exe2 {
        static int f() {
            int result = 0;
            for (int i = 10; i < 100; i++) {
                if (i % 7 == 0) {
                    result += i / 10 + i % 10;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(f());
        }
}

