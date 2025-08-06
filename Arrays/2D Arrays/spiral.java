import java.util.Scanner;

public class spiral {
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
    public static void printSpiral(int n[][])
    {
        int startRow = 0, endRow = n.length - 1;
        int startCol = 0, endCol = n[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print the first row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(n[startRow][i] + " ");
            }
            startRow++;

            // Print the last column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(n[i][endCol] + " ");
            }
            endCol--;

            // Print the last row if still in bounds
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(n[endRow][i] + " ");
                }
                endRow--;
            }

            // Print the first column if still in bounds
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(n[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }
    public static void main(String[] args)
    {
        int num[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        printSpiral(num);
    }
}
