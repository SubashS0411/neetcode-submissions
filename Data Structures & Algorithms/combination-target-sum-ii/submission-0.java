class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
      List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(arr);
    backtrack(ans,new ArrayList<>(),arr,target,0);
    return ans;
}
public static void backtrack(List<List<Integer>> ans,List<Integer> current,int[] arr,int remain,int start){
 if(remain<0) return;
 if(remain==0){
     ans.add(new ArrayList<>(current));
     return;
 }
    for (int i = start; i < arr.length ; i++) {
        if(i>start && arr[i]==arr[i-1]){
            continue;
        }
        if(remain-arr[i]<0){
            break;
        }
        current.add(arr[i]);
        backtrack(ans, current, arr, remain-arr[i], i+1);
        current.remove(current.size()-1);
    }
}
}
