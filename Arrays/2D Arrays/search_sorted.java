import java.util.Scanner;

public class search_sorted {
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
    public static boolean search(int n[][], int k)
    {
        int r = 0, c = n[0].length - 1; // Start from the top-right corner
        while (r < n.length && c >= 0) {    
            if (n[r][c] == k) {
                return true; // Element found
            } else if (n[r][c] > k) {
                c--; // Move left
            } else {
                r++; // Move down
            }
        }
        return false; // Element not found
    }
    public static void main(String[] args)
    {
        int num[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};
        boolean ans = search(num, 33);
        System.err.println("Element found: " + ans);
    }
    
}
