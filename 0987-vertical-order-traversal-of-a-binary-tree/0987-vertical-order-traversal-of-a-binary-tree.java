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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<int[]> index = new LinkedList<>(); 
        
        int min = 0;
        int max = 0;

        q.add(root);
        index.add(new int[]{0, 0}); 

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            int[] pos = index.poll();
            int row = pos[0];
            int col = pos[1];

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(new int[]{row, curr.val});

            min = Math.min(col, min);
            max = Math.max(col, max);

            if (curr.left != null) {
                q.add(curr.left);
                index.add(new int[]{row + 1, col - 1});
            }

            if (curr.right != null) {
                q.add(curr.right);
                index.add(new int[]{row + 1, col + 1});
            }
        }

        for (int i = min; i <= max; i++) {
            ArrayList<int[]> temp = map.get(i);

            Collections.sort(temp, (a, b) -> {
                if (a[0] == b[0]) return a[1] - b[1];
                return a[0] - b[0];
            });

            List<Integer> colList = new ArrayList<>();
            for (int[] arr : temp) {
                colList.add(arr[1]);
            }

            ls.add(colList);
        }

        return ls;
    }
}