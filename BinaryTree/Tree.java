package BinaryTree;

import java.util.Scanner;

public class Tree {
	
        Node root;
        
	public static Node createTree()
	{
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		if(data == -1)
		{
			return null;
		}
		
		Node root = new Node(data);
		
			System.out.println("Enter Left Child :" + data);
			root.left=createTree();
			
			System.out.println("Enter Right Child :" + data);
			root.right=createTree();
		
		return root;
		
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
			return;
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root)
	{
		if(root==null)
			return ;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
	
		Node root = createTree();
		
		System.out.println("\t 1.InOrder Traversal");
		inorder(root);
		
		System.out.println("\t 2.PreOrder Traversal");
		preorder(root);
		
		System.out.println("\t 3.PostOrder Traversal");
		postorder(root);

	}

}
