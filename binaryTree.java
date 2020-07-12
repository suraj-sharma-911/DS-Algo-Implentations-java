package dataStructures;

	class Node {
		int key;
		Node L, R;
		public Node(int key) {
			this.key = key;
			this.L = R = null;
		}
	}

	public class binaryTree{
		//root node
		Node root;
		
		//constructors
		binaryTree(int key){
			root = new Node(key);
		}
		
		binaryTree(){
			root=null;
		}
		
		int height(Node node) {
			if(node==null)
				return 0;
			else {
				int lh =0; height(node.L);
				int rh =0; height(node.R);
				if(node.L != null)
					lh =height(node.L);
				
				if(node.R != null)
					rh = height(node.R);
				int max =( lh > rh ) ? lh :rh;
				
				return(max+1);
			}
		}


		public static void main(String[] args) {
			binaryTree tree =new binaryTree();
			tree.root =new Node(1);
			tree.root.L=new Node(2);
			tree.root.L=new Node(3);
			tree.root.L.L=new Node(4);
			tree.root.L.R=new Node(5);
			tree.root.L.R.L=new Node(5);
			
			int depth= tree.height(tree.root);
			System.out.println(depth);
		}
		}
