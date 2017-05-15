package InterviewPrep;

import java.util.HashMap;

public class LRUGenericSecondSolution {
	
	int capacity;
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    Node head=null;
    Node end=null;
 
    public LRUGenericSecondSolution(int capacity) {
        this.capacity = capacity;
    }
 
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
 
        return -1;
    }
 
    public void remove(Node n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        }
 
        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            end = n.pre;
        }
 
    }
 
    public void setHead(Node n){
        n.next = head;
        n.pre = null;
 
        if(head!=null)
            head.pre = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
 
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            Node created = new Node(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
 
            }else{
                setHead(created);
            }    
 
            map.put(key, created);
        }
    }
    
    
    public static void main(String args []){
    	
    	LRUGenericSecondSolution lru = new LRUGenericSecondSolution(4);
    	
    	lru.set(3, 3);
    	lru.set(5, 5);
    	lru.set(1, 1);
    	lru.set(2, 2);
    	lru.set(4, 4);
    	lru.set(7, 7);
    	
    	System.out.println(lru.get(1));
    	System.out.println(lru.get(2));
    	System.out.println(lru.get(3));
    	System.out.println(lru.get(4));
    	
    }

}

class Node{
    int key;
    int value;
    Node pre;
    Node next;
 
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
