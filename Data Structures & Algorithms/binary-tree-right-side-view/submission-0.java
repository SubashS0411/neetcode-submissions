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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode right=null;
            int currentsize = queue.size();
            for (int i = 0; i < currentsize; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode != null) {
                    right = currentNode;
                    queue.offer(currentNode.left);
                    queue.offer(currentNode.right);
                }
            }

                if (right != null) {
                    res.add(right.val);
                }
        }
        return res;
    }
}
