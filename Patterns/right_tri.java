public class right_tri {
    public static void main(String[] args) {
        int n = 5; // You can change this value to create a larger triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}