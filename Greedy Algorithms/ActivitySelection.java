import java.util.*;

public class ActivitySelection {
    static class Activity {
        int start, end, index;
        Activity(int s, int e, int i) {
            start = s;
            end = e;
            index = i;
        }
    }

    public static void main(String[] args) {
        int s[] = {1, 3, 0, 5, 8, 5};
        int e[] = {2, 4, 6, 7, 8, 9};
        int n = s.length;

        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(s[i], e[i], i));
        }

        // sort by end time
        activities.sort(Comparator.comparingInt(a -> a.end));

        List<Integer> ans = new ArrayList<>();
        int max = 1;
        ans.add(activities.get(0).index);
        int lastEnd = activities.get(0).end;

        for (int i = 1; i < n; i++) {
            if (activities.get(i).start >= lastEnd) {
                max++;
                ans.add(activities.get(i).index);
                lastEnd = activities.get(i).end;
            }
        }

        System.out.println("Maximum number of activities: " + max);
        for (int idx : ans) {
            System.out.print("A" + idx + " ");
        }
        System.out.println();
    }
}
