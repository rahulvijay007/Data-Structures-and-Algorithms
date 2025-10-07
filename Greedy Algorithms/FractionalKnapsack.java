import java.util.*;
public class FractionalKnapsack {

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
    int wt[] = {10, 20, 30};
    int W = 50;
     
    double ratio[][] = new double[val.length][2];
    for(int i = 0; i<val.length; i++){
        ratio[i][0] = i;
        ratio[i][1] = val[i]/(double)wt[i];
    }
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    int capacity = W;
    int finalvalue = 0;
    for(int i = ratio.length-1; i>=0; i--){
        int id = (int)ratio[i][0];
        if(wt[id] <= capacity){
            finalvalue += val[id];
            capacity -= wt[id];
        }
        else{
            finalvalue += (ratio[i][1] * capacity);            break;
        }
    }
    System.out.println(finalvalue);
    }
}
    

