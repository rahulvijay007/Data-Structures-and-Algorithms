import java.util.*;
public class MaxAreaHist {
    public static int area(int[] arr){
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<=arr.length;i++){
            int currHeight = (i==arr.length)?0:arr[i];
            while(!s.isEmpty() && currHeight < arr[s.peek()]){
                int height = arr[s.pop()];
                int width;
                if(s.isEmpty()){
                    width = i;
                }else{
                    width = i - s.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            s.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(area(arr));
    }
    
}
