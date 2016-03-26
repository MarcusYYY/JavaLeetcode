public class pathsumII{
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        findPath(res, new ArrayList<>(),sum,root);
        return res;
    }
    private void findPath(List<List<Integer>> res, ArrayList<Integer> sublist, int sum, TreeNode node){
        if(node.val == sum && node.left == null && node.right == null){
            sublist.add(node.val);
            res.add(new ArrayList<Integer>(sublist));
            return;
        }
        
        sublist.add(node.val);
        if(node.left != null){
            findPath(res,sublist,sum-node.val,node.left);
            sublist.remove(sublist.size()-1);
          }

        if(node.right != null){
            findPath(res,sublist,sum-node.val,node.right);
            sublist.remove(sublist.size()-1);
          }
     }
}
