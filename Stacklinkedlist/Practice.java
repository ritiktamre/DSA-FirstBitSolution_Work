package Stacklinkedlist;

import java.util.Scanner;

public class Practice
{
	int head=-1;
	int tail=-1;
	int n=10;
	int arr[]= new int[10];
	Scanner sc = new Scanner(System.in);
	
	public void Enqueue()
	{
		if(tail==(n-1))
		{
			System.out.println("Queue is Full");
		}
		
		else
		{
			System.out.println("Enter the Data");
			int i = sc.nextInt();
			if(tail==-1 && head ==-1)
		{
			head=0;
			tail=0;
			arr[tail]=i;
			System.out.println("Data Added");
		}
			else
			{
			     tail=tail+1;
			     arr[tail]=i;
			     System.out.println("Data Added");
			}
			
		}
	}
	
	public void Dequeue()
	{
		if(tail==-1 && head==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			head=head+1;
		    System.out.println("Data is Delete :"+head);
			System.out.println("Data Deleted");
		}
	}
	
	public void display()
	{
		for(int j=head;j<= tail;j++)
		{
			System.out.println(arr[j]);
		}
	}
}