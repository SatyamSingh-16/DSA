/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        path(root, arr1, p.val);
        path(root, arr2, q.val);
        int i = 0;
        int minLen = Math.min(arr1.size(), arr2.size());

        while (i < minLen && arr1.get(i).equals(arr2.get(i))) {
            i++;
        }

        int lcaVal = arr1.get(i - 1);

        return findNode(root, lcaVal);


        
    }

    public boolean path(TreeNode A, ArrayList<Integer> arr, int x){
        if(A == null){
            return false;
        }
        arr.add(A.val);
        if(A.val == x){
            return true;
        }

        if(path(A.left, arr,x) || path(A.right, arr, x)){
            return true;
        }

        arr.remove(arr.size() -1);
        return false;
    }
    public TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        TreeNode left = findNode(root.left, val);
        if (left != null) return left;

        return findNode(root.right, val);
    }
}