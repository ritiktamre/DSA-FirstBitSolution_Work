package Stacklinkedlist;

import java.util.Scanner;

public class Stack {
   
	int top=-1;
	int n=10;
	int a[] = new int[10];
	Scanner sc = new Scanner(System.in);
	
	void push()
	{
		if(top==(n-1))
		{
			System.out.println("OverFlow Conditions");
		}
		else
		{
			System.out.println("Enter The Data");
			int i = sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println(" Data Added");
		}
	  }		
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("UnderFlow Conditions");
		}
		else
		{
			top=top-1;
			System.out.println("Data Deleted");
		}
	}
	
	int pop1()
	{
		if(top==-1)
		{
			System.out.println("UnderFlow Conditions");
			return -1;
		}
		else
		{
			int value=a[top];
			top=top-1;
			return value;
		}
	}
	
	void display()
	{
		System.out.println("Data are");
		for(int j=0;j<=top;j++)
		{
			System.out.println(a[j]);
		}
	}
}
