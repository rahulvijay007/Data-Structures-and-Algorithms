import java.util.*;
public class NearestCars
{
    static class Point
    {
        int x;
        int y;
        int dist;
        public Point(int x, int y, int dist)
        {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
        public int comapreTo(Point p)
        {
            return this.dist - p.dist;
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dist = x*x + y*y;
            points[i] = new Point(x,y, dist);
        }
        int k = sc.nextInt();
        PriorityQueue<Point> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            int dist = points[i].x*points[i].x + points[i].y*points[i].y;
            points[i].dist = dist;
            pq.add(points[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        while(!pq.isEmpty())
        {
            Point p = pq.poll();
            System.out.println("("+p.x+","+p.y+")");
        }
        sc.close();
    }  


}