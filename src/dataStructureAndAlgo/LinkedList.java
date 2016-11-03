package dataStructureAndAlgo;

public class LinkedList {
	Node head = null;
	int index = 0;
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		int[] a = new int[]{};
		for(int i=0;i<a.length;i++){
			li.Insert(a[i]);
		}
		LinkedList li1 = new LinkedList();
		int[] a1 = new int[]{2,4,7};
		for(int i=0;i<a1.length;i++){
			li1.Insert(a1[i]);
		}
		
		li.display(li.MergeLists(li.head, li1.head));
		
	}

	Node MergeLists(Node headA, Node headB) {
	    if(headA == null && headB ==null){
				return headA;
			}
			Node tmp = null;
			if((headA == null || headB == null)){
				if(headB == null){
		            tmp = headA;
					headA = headA.next;
				}else{
		            tmp = headB;
					headB = headB.next;
				}
			}
			else if((headA.data<headB.data)){
				tmp = new Node();
	            tmp = headA;
				headA = headA.next;
			}else if((headA.data>=headB.data)){
				tmp = new Node();
	            tmp = headB;
				headB = headB.next;
			}
			Node ret = tmp;
			ret.next = null;
			while(headA != null && headB != null){
				if(headA.data<headB.data){
					tmp.next = new Node();
	                tmp.next.data = headA.data;
					tmp = tmp.next;
	                
					headA = headA.next;
				}else{
					tmp.next = new Node();
	                tmp.data = headB.data;
					tmp = tmp.next;
					headB = headB.next;
				}
				
				
			}
			
			if(headA == null){
				while(headB != null){
					tmp.next = new Node();
	                tmp.data = headB.data;
					headB = headB.next;
	                tmp = tmp.next;
				}
			}
			
			if(headB == null){
				while(headA != null){
					tmp.next = new Node();
	                tmp.next.data = headA.data;
	                tmp = tmp.next;
					headA = headA.next;
				}
			}
			return ret;

	}

	/*int CompareLists(Node headA, Node headB) {
	    if(headA == null && headB == null){
	        return 1;
	    }else if((headA == null && headB != null)||(headA != null && headB == null)){
	    	return 0;
	    }
	    
	    if(headA.data != headB.data){
	        return 0;
	    }
	    
	    return CompareLists(headA.next, headB.next);
	    
	}
	
	Node Reverse(Node head) {
		if(head == null || head.next == null){
			return head;
		}else{
			Node tmp = Reverse(head.next);
			head.next.next = head;
			head.next = null;
			return tmp;
		}
	}
*/	void Insert(int data) {
	  if(head == null){
	            head = new Node();
	            head.data = data;
	            return;
	    }
	    Node current = head;
	      
	    while(current.next != null){
	        current = current.next;
	    }
	    current.next = new Node();
	    current.next.data = data;
	    
	    		
	}
	
	/*void appendFirst(int data){
		if(head == null){
			head = new Node(data);
            return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	
	Node Delete(int position) {
		if(position == 0){
			head = head.next;
			return head;
		}
		Node current = head;
		Node prev = null;
		int index = 0;
		while(current.next != null){
			if(position == index){
				prev.next = current.next;
				return head;
			}
			index++;
			prev = current;
			current = current.next;
		}
		prev.next = null;
		return head;
	}
	
	void ReversePrint() {
			if(head == null){
				return;
			}else if(head.next == null){
				System.out.println(head.data);
				return;
			}else{
				Node current = head;
				Node prev = null;
				while(current.next != null){
					prev = current;
					current = current.next;
				}
				System.out.println(current.data);
				prev.next=null;
				ReversePrint();
			}
	}

	Node InsertNth(int data, int position) {
		 if(position ==0){
			 Node temp = head;
			 head = new Node(data);
			 head.next = temp;
			 return head;
		 }
		 int index = 1;
		 Node current = head;
		while(current.next != null){
			if(index == position){
				Node tmp = current.next;
				current.next = new Node(data);
				current = current.next;
				current.next = tmp;
				return head;
			}
			index++;
			current = current.next;
		}
		current.next = new Node(data);
		return head;
		}
	
	void deleteFirst(){
		if(head ==null)return;
		head = head.next;
		
	}*/
	
	void display(Node head){
		Node current = head;
		while(current.next != null){
			System.out.print(current.data+" ");
			current = current.next;
			
		}
		System.out.print(current.data+" ");
		System.out.println();
	}

}

class Node{
	Node next;
	int data;

}