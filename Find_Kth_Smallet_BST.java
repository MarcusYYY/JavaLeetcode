public class Find_Kth_Smallest_BST{
    private TreeNode node = null;
    private count = 0;

    public int Kth_Smallest(TreeNode root, int k){
        if(root == null)
          return -1;
        dfs(root,k);
        return node.val;
    }

    private void dfs(TreeNode node, int k){
        if(root == null) return;
        dfs(root.left , k);

        if(++count == k){
          this.node = node;
          return;
        }

        dfs(root.right, k);
    }
}
