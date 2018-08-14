public class BinarySearchTree{
	Node root;
	BinarySearchTree(){
		root= null;
	}
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	Node insertNode(Node root,int data){
		if(root==null){
			root = new Node(data);
			return root;
		}
		if(data <= root.data){
			root.left = insertNode(root.left,data);
		} 
		if(data > root.data){
			root.right = insertNode(root.right,data);
		}	
		return root;
	}
	void inorderTraversal(Node root){
		if(root == null)
			return ;
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	boolean isBST(Node root){
		if(root ==null)
			return true ;
		int left = max_value(root.left);
		int right = min_value(root.right);	
		return (isBST(root.left)&&(left<=root.data && root.data<=right)&&isBST(root.right));
	}
	int max_value(Node root){	
		if(root==null)
			return Integer.MIN_VALUE;
		while(root.right!=null)
			root = root.right;
		return root.data;	
	}
	int min_value(Node root){
		if(root == null)
			return Integer.MAX_VALUE;
		while(root.left !=null)
			root = root.left;
		return root.data;
	}
	public static void main(String args[]){
		BinarySearchTree bst= new BinarySearchTree();
		bst.root = bst.insertNode(bst.root,4);
		bst.root = bst.insertNode(bst.root,1);
		bst.root = bst.insertNode(bst.root,9);
		bst.root = bst.insertNode(bst.root,5);
		bst.root = bst.insertNode(bst.root,2);
		bst.root = bst.insertNode(bst.root,3);
		bst.root = bst.insertNode(bst.root,14);
		bst.root = bst.insertNode(bst.root,7);
		bst.inorderTraversal(bst.root);
		System.out.println(bst.isBST(bst.root));
	}	
}