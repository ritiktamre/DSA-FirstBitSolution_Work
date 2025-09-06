package Stacklinkedlist;

import java.util.Scanner;

public class Radhe {
    
	int top=-1;
	int n=10;
	int a[]=new int[10];
	Scanner sc = new Scanner(System.in);
	
	public void push()
	{
		if(top==(n-1))
		{
			System.out.println("OverFlow Condition");
		}
		else
		{
			System.out.println("Enter the Element");
			int i = sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("Data Added");
		}
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("UnderFlow Conditions");
			return -1;
		}
		else
		{
			
			System.out.println("Enter the Element");
			top=top-1;
			int value=a[top];
			return value;
		}
	}
	
	public void peek()
	{
		if(top==-1)
		{
			System.out.println("UnderFlow Condition");
		}
		else
		{
			System.out.println(a[top]);
		}
	}
	
	public void display()
	{
		for(int k=0 ;k<=top;k++)
		{
			System.out.println(a[k]);
		}
	}
	
	
}
