import java.util.*;

public class JobSequencing
{
    static class Jobs{
        int deadline;
        int profit;
        int id;
        public Jobs(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        int n = jobsInfo.length;
        ArrayList<Jobs> jobs = new ArrayList<>();
        for(int i=0;i<n;i++){
            jobs.add(new Jobs(i+1, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (a,b) -> b.profit - a.profit);
        ArrayList<Integer> result = new ArrayList<>();
        int time = 0;
        for(int i = 0; i<jobs.size(); i++)
        {
            Jobs currJob = jobs.get(i);
            if(currJob.deadline > time){
                time++;
                result.add(currJob.id);
            }
        }
        System.out.println("The jobs selected are: " + result);
        

        
    }
}