class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}

public class zigzagTraversal{
    public List<List<Integer>> res = new ArrayList<>();
    if(root == null) return res;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int level = 0;

    while(!q.isEmpty()){
      int qsize = q.size();
      List<Integer> sublist = new ArrayList<>():
      while(qsize > 0){
          
          TreeNode p = q.poll():
          if(level % 2 == 0){
              sublist.add(p.val);
          }else{
              sublist.add(0,p.val);
          }
          qsize--;
          if(p.left != null) q.add(p.left);
          if(p.right != null) q.add(p.right);
       }
       res.add(sublist);
       level++;
    }
    return res;
  }
}
