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
	public boolean LCA_util(Node root,Node A,Node B){
		if(root == null )
			return false;
		System.out.println(root.data+" "+A.data+" "+B.data);
		return (LCA_util(root.left,A,B) || (root.data == A.data || root.data == B.data) || LCA_util(root.right,A,B) );	
	}
	public Node LCA(Node root,Node A,Node B){
		if(root == null)
			return null;
		boolean left  = LCA_util(root.left,A,B);
		boolean right = LCA_util(root.right,A,B);
		//System.out.println(left+" "+right);
		if(left && right)
			return root;
		else if(left== false && right == true){
			if (root.data == A.data || root.data == B.data)
				return root;
			else
				return LCA(root.right,A,B);
			}
		else if(left == true && right == false){
			if (root.data == A.data || root.data == B.data)
				return root;
			else 
				return LCA(root.left,A,B);
			}
		else 
			return null;
	}
	boolean isMirror(Node root_a,Node root_b){
		if(root_a == null && root_b == null)
			return true;
		if(root_a == null || root_b == null)
			return true;
		return((root_a.data==root_b.data) && isMirror(root_a.left,root_b.left) && isMirror(root_a.right,root_b.right));
	}
	
	public static void main(String[] args){
		BinaryTree bt = new BinaryTree();
		bt.root = bt.insertNode(bt.root,2,"",0);
		bt.root = bt.insertNode(bt.root,3,"R",0);
		bt.root = bt.insertNode(bt.root,1,"L",0);
		bt.root = bt.insertNode(bt.root,5,"LL",0);
		bt.root = bt.insertNode(bt.root,6,"LR",0);
		bt.root = bt.insertNode(bt.root,7,"RR",0);
		BinaryTree btm = new BinaryTree();
		btm.root = btm.insertNode(btm.root,2,"",0);
		btm.root = btm.insertNode(btm.root,3,"R",0);
		btm.root = btm.insertNode(btm.root,1,"L",0);
		btm.root = btm.insertNode(btm.root,5,"LL",0);
		btm.root = btm.insertNode(btm.root,6,"LR",0);
		btm.root = btm.insertNode(btm.root,7,"RR",0);
		btm.infixTraversal(btm.root);
		System.out.println(bt.isMirror(bt.root,btm.root));
		Node lca = bt.LCA(btm.root,btm.root.left,btm.root.left.left);
		//System.out.println(bt.root.left.data+" "+bt.root.left.left.data);
		//System.out.println("least common ancestor:"+lca.data);
		
		
	}


}