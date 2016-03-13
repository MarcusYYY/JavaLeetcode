public class Populating_Next_Right_pointer{
    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode (int x) {val = x;}
   }
      public void connect(TreeLinkNode root){
      if(root == null) return;
      List<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
      q.add(root);

      while(!q.isEmptu()){
          int qsize = q.size();
          while(qsize > 0){
          TreeLinkNode node = q.get(0);
          TreeLinkNode p = node;
          if(qsize > 1){
              p.next = q.get(1);
           }
           q.remove(0);
           if(node.left != null) q.add(node.left);
           if(node.right != null) q.add(node.right);
           qsize--;
          }
      }
      return ;
     }
}
