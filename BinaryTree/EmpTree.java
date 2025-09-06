package BinaryTree;

import java.util.Scanner;

import downcasting.Emp;

public class EmpTree {
         
	Employee root;
	public static Employee createEmp() {
		 
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		if(name.equals("-1"))
		{
			return null;
		}
		
	
		Employee root = new Employee(name);
		
		System.out.println("Enter Left child :"+name);
		root.left=createEmp();
		
		System.out.println("Enter Right child :" +name);
		root.right=createEmp();
		
		return root;
	}
	
	public static void inorder(Employee root)
	{
		if(root==null)
			return ;
		
		inorder(root.left);
		System.out.println(root.name);
		inorder(root.right);
	}
	
	public static void preorder(Employee root)
	{
		if(root==null)
			return ;
		
		System.out.println(root.name);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Employee root)
	{
		if(root==null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.name);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee root =  createEmp();
		
		System.out.println("\t 1.PreOrder Traversal");
		preorder(root);
		System.out.println("\t 2.InOrder Traversal");
		inorder(root);
		System.out.println("\t 3.PostOrder Traversal");
		postorder(root);
        
		sc.close();
	
	}

}
