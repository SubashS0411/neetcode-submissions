/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        ans = new ArrayList<>();
        dfs1(root,0);
        return ans;
    }
    public  void dfs1(TreeNode root,int depth){
        if(root==null) return;
        if(ans.size()==depth){
            ans.add(new ArrayList<>());
        }
        ans.get(depth).add(root.val);
        dfs1(root.left,depth+1);
        dfs1(root.right,depth+1);
    }
}
