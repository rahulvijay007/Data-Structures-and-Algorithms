public class hollow_rhombus {
    public static void main(String[] args) {
        int n = 10; // Size of the rhombus
        int i, j;

        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces in between
            for (j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
