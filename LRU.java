import java.util.HashMap;
public class LRU {
    class Node{
        int val;
        int key;
        Node next;
        Node prev;
        Node(int key, int value){
            this.val = value;
            this.key = key;
        }
    }
    
    int capacity;
    HashMap<Integer, Node> map = new HashMap<Integer,Node>();
    Node head, end = null;
    public LRU(int capacity) {
        this.capacity = capacity;
    }
    
    public void setHead(Node node){
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        
        head = node;
        head.prev = null;
        
        if(end == null)
            end = head;
    }
    
    public void remove(Node node){
        if(node.prev != null)
            node.prev.next = node.next;
        else{
            head = node.next;
        }
        if(node.next != null)
            node.next.prev = node.prev;
        else
            end = node.prev;
        
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.val;
        }else
            return -1;
    }
    
    public void set(int key, int value) {
        Node n = new Node(key,value);
        if(!map.containsKey(key)){
            if(map.size() >= capacity){
                map.remove(end.key);
                remove(end);
            }
        }else{
            remove(map.get(key));
            map.remove(key);
        }
        setHead(n);
        map.put(key,n);
    }
}