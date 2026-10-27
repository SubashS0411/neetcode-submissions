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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> current = new LinkedList<>();
        if(root==null){
            return ans;
        }
        current.add(root);
        while (!current.isEmpty()) {
            int level = current.size();
            List<Integer> clevel = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                TreeNode node = current.poll();
                clevel.add(node.val);
                if (node.left != null) {
                    current.add(node.left);
                }
                if (node.right != null) {
                    current.add(node.right);
                }

            }
            ans.add(clevel);
        }
        return ans;
    }
}
