public class AVLTree{
	Node root;
	AVLTree(){
		root = null;
	}
	class Node{
		int data;
		Node left;
		Node right;
		int height;
		Node(int data){
			this.data = data;
			this.height =  1;
		}
		
	}	
	int height(Node root){
		if(root==null)
			return 0;
		int left = height(root.left);
		int right = height(root.right);
		return Math.max(left,right)+1;	
	}	
	
	Node rotateRight(Node y){
		Node x = y.left;
		y.left = x.right;
		x.right = y;
		x.height = Math.max(height(x.left),height(x.right))+1;
		y.height = Math.max(height(y.left),height(y.right))+1;
		return x;	
	}
	Node rotateLeft(Node y){
		Node x = y.right;
		y.right = x.left;
		x.left = y;
		x.height = Math.max(height(x.left),height(x.right))+1;
		y.height = Math.max(height(y.left),height(y.right))+1;
		return x;
	}
	Node insertNode(Node root,int data){
		if(root==null)
			return (new Node(data));
		else if(data <= root.data )
			root.left = insertNode(root.left,data);
		else if(data > root.data)
			root.right = insertNode(root.right,data);
		else return root;
		root.height = Math.max(height(root.left),height(root.right))+1;
		int balance = height(root.left)-height(root.right);
		
		if(balance < -1 && data < root.left.data){    
			return rotateRight(root.left);				
								      //  left-left case 
		}
		if(balance < -1 && data > root.right.data){ 
			return  rotateLeft(root.right);
							              //  right-right case 
		}
		if(balance > 1 && data >  root.left.data){  
			root.left = rotateLeft(root.left);
			return  rotateRight(root);		      //  left-right case
		}
		if(balance > 1 && data < root.right.data){
			root.right = rotateRight(root.right);
			return rotateLeft(root);
		}	 					      //  right-left case 
			
		return root;                                          //in case already it is balanced 
		
	}
	
	void inorderTraversal(Node root){
		if(root == null)
			return;
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	public static void main(String args[]){
		AVLTree avl = new AVLTree();
		avl.root = avl.insertNode(avl.root,7);
		avl.root = avl.insertNode(avl.root,1);
		avl.root = avl.insertNode(avl.root,14);
		avl.root = avl.insertNode(avl.root,3);
		avl.root = avl.insertNode(avl.root,9);
		avl.inorderTraversal(avl.root);
	}

}