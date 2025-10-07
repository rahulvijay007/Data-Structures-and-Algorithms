
import java.util.*;

public class MaxLengthChainPairs
{
    public static void main(String[] args) {
        int[][] pairs = {{1,2}, {3,4}, {5,6}, {7,8}
    };
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int count = 1;
        int end = pairs[0][1];
        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] > end) {
                count++;
                end = pairs[i][1];
            }
        }
        System.out.println(count);

    }
}
    


    

