package BinaryTree;

import java.util.Scanner;

public class pracTree {
  
	Practice root;
	
	public static Practice createTree()
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		
		if(name.equals("-1"))
		{
			return null;
		}
		
		Practice root = new Practice(name);
		System.out.println("Enter the Left Child :"+name);
		root.left=createTree();
		
		System.out.println("Enter the Right Child :"+name);
		root.right=createTree();
		
		return root;
	}
	
	public static void inorder(Practice root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.println(root.name);
		inorder(root.right);
	}
	
	public static void preorder(Practice root)
	{
		if(root==null)
		{
			return ;
		}
		
		System.out.println(root.name);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Practice root)
	{
		if(root==null)
		{
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.name);
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Practice root = createTree();
		
		System.out.println("\t 1.InOrder Traversal");
		inorder(root);
		
		System.out.println("\t 2.PreOrder Traversal");
		preorder(root);
		
		System.out.println("\t 3.PostOrder Traversal");
		postorder(root);
		
		
		
	}
}