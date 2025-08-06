public class sum {
    public static int sum_n(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum_n(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum_n(n));
    }
}
