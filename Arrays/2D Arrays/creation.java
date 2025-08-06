import java.util.*;
public class creation {
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
    public static void main(String[] args)
    {
        int num[][] = null;
        input(num);
        print(num);
    }
}
        
        
        

        
