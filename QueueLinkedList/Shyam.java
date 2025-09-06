package QueueLinkedList;

import java.util.Scanner;

public class Shyam {
    
	int head=-1;
	int tail=-1;
	int n=10;
	int arr[]= new int[10];
	
	Scanner sc = new Scanner(System.in);
	
	public void Enqueue()//Insertion
	{
		if(tail==(n-1))
		{
			System.out.println("Stack is Full");
		}
		else
		{
			System.out.println("Enter the Element");
			int i = sc.nextInt();
			if(head==-1 && tail==-1)
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
		if(head==-1 && tail == -1)
		{
			System.out.println("Queue Is Empty");
			
		}
		else
		{
			head=head+1;
			System.out.println("Delete Data Is :"+head);
			System.out.println("Data Deleted");
		}
	}
	
	public void display()
	{
		for(int j =head; j<= tail;j++)
		{
			System.out.println(arr[j]);
		}
	}
}
