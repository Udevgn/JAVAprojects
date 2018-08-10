public class BinaryTree{
	public Node root;
	BinaryTree(){
		root = null;
	}
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;	
			left = null;
			right = null;
		}
	}
	public Node insertNode(Node root,int data,String path,int index){
		if(root ==null && index < path.length()){
			return null;
		}
		if(root == null){
			root = new Node(data);
			return root;
		}
		if((root !=null && index == path.length())){
			System.out.println("invalid string!!");
			return null;
		}
		if(path.charAt(index) == 'L'){
			root.left = insertNode(root.left,data,path,index+1);
		}
		if(path.charAt(index) == 'R'){
			root.right =insertNode(root.right,data,path,index+1);
		}
		return root;
		
	}
	public void infixTraversal(Node root){
		if(root == null)
			return;
		if(root.left!=null)
			infixTraversal(root.left);
		System.out.println(root.data);
		if(root.right!=null)
			infixTraversal(root.right);
	
	}
	public static void main(String[] args){
		BinaryTree bt = new BinaryTree();
		bt.root = bt.insertNode(bt.root,2,"",0);
		bt.root = bt.insertNode(bt.root,3,"R",0);
		bt.root = bt.insertNode(bt.root,1,"L",0);
		bt.infixTraversal(bt.root);
		
	}


}