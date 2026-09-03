class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result=new ArrayList<>();
        int [] currentlevel=intervals[0];
        result.add(currentlevel);
        for(int[]interval:intervals){
            int currentEnd=currentlevel[1];
            int nextstart=interval[0];
            int nextEnd=interval[1];
            if(nextstart<=currentEnd){
                currentlevel[1]= Math.max(currentEnd,nextEnd);
            }
            else{
                currentlevel=interval;
                result.add(currentlevel);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
