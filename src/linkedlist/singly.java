package linkedlist;
class Node{
	int data;
	Node link;
	
}
class Method{
	static Node head=null;
	public static void insertAtBeg(int data){
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		if(head==null) {
			
			head=newNode;
			
		}
		else {
			newNode.link=head;
			head=newNode;
			
			
		}
	}
	public static void insertAtEnd(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		if(head==null) {
			
			head=newNode;
			
		}
		else {
			Node temp=head;
			while(temp.link!=null) {
				temp=temp.link;
				
		}
			temp.link=newNode;
		
	}
	}
	public static void insertAtPosition(int pos,int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.link=null;
		if (pos == 1) {
	        newNode.link = head;
	        head = newNode;
	        return;
	    }
		int position=1;
		Node temp=head;
		while(position<pos-1) {
			temp=temp.link;
			position++;
			
		}
		newNode.link=temp.link;
		temp.link=newNode;
		
	}
	public static void deleteAtFirst() {
		
		if(head==null) {
			System.out.println("no node to delete");
			return;
		}
		head=head.link;
		
	}
	public static void deleteAtLast() {
		if (head == null) {
	        System.out.println("No node to delete");
	        return;
	    }

	    if (head.link == null) {  // Only one node
	        head = null;
	        return;
	    }

	    Node temp = head;
	    while (temp.link.link != null) {
	        temp = temp.link;
	    }
	    temp.link = null;  // Remove last node
		
	}
	public static void deleteAtPosition(int pos) {
		if (head == null) {
	        System.out.println("No node to delete");
	        return;
	    }
		if(pos==1) {
			deleteAtFirst();
		}
		else {
			int position=1;
			Node temp = head;
			while(position<pos-1) {
				temp=temp.link;
				position++;
			}
			temp.link=temp.link.link;
			
		}
	}
		public static void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " -> ");
			temp=temp.link;
			
		}
		
		
	}
}


public class singly extends Method{
	

	public static void main(String[] args) {
		
		insertAtBeg(8);
		insertAtEnd(1);
		insertAtEnd(2);
		insertAtEnd(3);
		insertAtEnd(14);
		insertAtPosition(2,7);
		deleteAtFirst();
		deleteAtLast();
		deleteAtPosition(4);
		
		
		
		print();
	}

}
