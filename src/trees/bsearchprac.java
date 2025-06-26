package trees;
class bbnode{
	int data;
	bbnode left,right;
	 bbnode(int data){
		 this.data=data;
		 this.left=null;
		 this.right=null;
	 }
}
public class bsearchprac {
	bbnode root;
	bsearchprac(){
		root=null;
	}
	 void insert(int data) {
		bbnode newnode=new bbnode(data);
		if(root==null) {
			root =newnode;
		}
		else {
			bbnode current=root;
			while(true) {
				if(data<current.data) {
					if(current.left==null) {
						current.left=newnode;
						break;
					}
					else {
						current=current.left;
					}
				}
				if(data>current.data) {
					if(current.right==null) {
						current.right=newnode;
						break;
					}
					else {
						current=current.right;
					}
				}
			}
		}
		
	}
	void inOrder(bbnode node) {
	     if (node != null) {
	         inOrder(node.left);
	         System.out.print(node.data + " ");
	         inOrder(node.right);
	     }
	 }

	 void preOrder(bbnode node) {
	     if (node != null) {
	         System.out.print(node.data + " ");
	         preOrder(node.left);
	         preOrder(node.right);
	     }
	 }

	 void postOrder(bbnode node) {
	     if (node != null) {
	         postOrder(node.left);
	         postOrder(node.right);
	         System.out.print(node.data + " ");
	     }
	 }



	public static void main(String[] args) {
		bsearchprac hi =new bsearchprac();
	hi.insert(8);
	hi.insert(4);
	hi.insert(3);
	hi.insert(9);
	hi.insert(2);
	hi.insert(6);
	hi.inOrder(hi.root);
	System.out.println();
	hi.preOrder(hi.root);
	System.out.println();
	hi.postOrder(hi.root);
	System.out.println();
	
	
	}
}

