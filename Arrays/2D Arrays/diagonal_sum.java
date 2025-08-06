import java.util.Scanner;

public class diagonal_sum {
    public static void input(int n[][])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns:");
            int cols = sc.nextInt();
            
            n = new int[rows][cols];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    n[i][j] = sc.nextInt();
                }
            }
            sc.close();
        }
        
    }
    public static void print(int n[][])
    {
        System.out.println("The elements of the array are:");
        for (int[] n1 : n) {
            for (int j = 0; j < n1.length; j++) {
                System.out.print(n1[j] + " ");
            }
            System.out.println();
        }
    }
    public static int  diagonalSum(int n[][])
    {
        int s = 0;
        /*for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i == j) {
                    s += n[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal elements is: " + s);
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i + j == n.length - 1) {
                    s += n[i][j];
                }
            }
        }*/
        for(int i=0; i<n.length; i++)
        {
            s += n[i][i]; // Primary diagonal
            if(i != n.length - 1 - i) // Avoid double counting the center element in odd-sized matrices
            {
                s += n[i][n.length - 1 - i]; // Secondary diagonal
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        int num[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        print(num);
        diagonalSum(num);
    }
}
