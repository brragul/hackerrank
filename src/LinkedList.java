import java.util.ArrayList;

public class LinkedList {
	static Node head;
	public static void main(String[] args){
		append(100);
		append(110);
		append(120);
		append(130);
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		if(hasCycle(head)){
			System.out.println("yes");
		}else{
			System.out.println("false");
		}
	}
	
	static boolean hasCycle(Node head) {
	    ArrayList<Node> list = new ArrayList<Node>();
	    if(head == null){
	        return false;
	    }else{
	        Node current = head;
	        list.add(head);
	        while(current != null){
	            if(list.contains(current)){
	                return false;
	            }
	            list.add(current.next);
	            current = current.next;
	        }
	        return true;
	    }
	    
	    
	}

	
	public static void append(int data){
		if(head == null){
			head = new Node(data);
			return;	
		}
		Node current = head;
		while(current.next !=null){
			current = current.next;
		}
		current.next = new Node(data);
	}
}

class Node{
	Node next;
	int data;
	public Node(int data){
		this.data = data;
	}
}