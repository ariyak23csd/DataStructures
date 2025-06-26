package linkedlist;
class Dnode{
	int data;
	Dnode next;
	Dnode prev;
	
}
class Dmethod{
	static Dnode tail=null,head=null;
	public static void InsertAtBeg(int data) { 
		Dnode newnode=new Dnode();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		if(head==null) {
			
			head=newnode;
			tail=newnode;
		}
		else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public static void InsertAtEnd(int data) {
		Dnode newnode=new Dnode();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		if(head==null) {
			InsertAtBeg( data);
		}
		else {
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	public static void InsertAtPosition(int pos,int data) {
		Dnode newnode=new Dnode();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		int position=1;
		Dnode temp=head;
		
		while(position<pos-1) {
			temp=temp.next;
			position++;
			
		}
		newnode.next=temp.next;
		newnode.next.prev=newnode;
		temp.next=newnode;
		newnode.prev=temp;
		
		
	}
	public static void DeleteAtBeg() {
		if(head==null) {
			System.out.println("no node to delete");
		}
		else {
			head=head.next;
			head.prev=null;
		}
	}
	public static void DeleteAtEnd() {
		if(head==null) {
			System.out.println("no node to delete");
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	public static void DeleteAtPosition(int pos) {
		if(head==null) {
			System.out.println("no node to delete");
		}
		if(pos==1) {
			DeleteAtBeg();
		}
		else {
			Dnode temp =head;
			int position=1;
			while(position<pos-1) {
				temp=temp.next;
				position++;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
			
		}
	}
	
	public static void print() {
		Dnode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " -> ");
			temp=temp.next;
			
		}
		
		
	}
	
}


public class doubly extends Dmethod{

	public static void main(String[] args) {
		InsertAtBeg(9);
		InsertAtBeg(1);
		InsertAtBeg(1);
		InsertAtBeg(1);
		InsertAtEnd(7);
		InsertAtPosition(3,4);
		DeleteAtBeg();
		DeleteAtEnd();
		DeleteAtPosition(3);
		print();

	}

}
