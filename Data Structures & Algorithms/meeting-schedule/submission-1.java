/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
 if(intervals==null|| intervals.size()<=1)return true;
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        for (int i = 0; i < intervals.size()-1; i++) {
            int currentEnd=intervals.get(i).end;
            int nextstart=intervals.get(i+1).start;
            if(nextstart<currentEnd)return false;

        }
        return true;
    }
}
