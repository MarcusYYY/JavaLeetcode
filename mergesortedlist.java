class Node{
  int val;
  Node next;
  Node (int value){
    this.val = value;
    next = null;
    }
}

public class mergesortedlist{
    public Node merge(Node [] lists){
      if(lists.length == 0) return null;

      Queue<Node> q = new PriorityQueue<Node>(new ListComparator());
      for(Node : lists){
        if(node != null){
          q.offer(node);
          }
       }
       Node dumy = new Node(0);
       Node = dumy;

       while(!q.isEmpty()){
            Node tmp = q.poll();
            if(tmp.next != null){
              q.offer(tmp.next);
            }
            p.next = tmp;
            p = p.next;
         }
        return dumy.next;
    }
class ListComparator implements Comparator<Node>{
      public int compare(Node a , Node b){
          return a.val - b.val;
      }
   }
}
