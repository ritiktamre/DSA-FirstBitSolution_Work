package QueueLinkedList;

import java.util.Scanner;

public class DemoAl {
    
	int f=-1;
	int r=-1;
	int n=10;
	int q[] =new int[10];
	Scanner sc= new Scanner(System.in);
	
	void enqueue()//insertion
	{
		if(r==(n-1))
		{
			System.out.println("OverFlow Condition");
		}
		else
		{
			System.out.println("--Enter Data--");
			int i = sc.nextInt();
			if(f==-1 && r==-1)
			{
				f=0;
				r=0;
				q[r]=i;
				System.out.println("--Data Added --");
			}
			else
			{
				r=r+1;
				q[r]=i;
				System.out.println("-- Data Added --");
			}
		}
	}
	
	void dequeue()//Deletion
	{
		if(f==-1 && r==-1)
		{
			System.out.println("UnderFlow Condition");
		}
		else
		{
			f=f+1;
			System.out.println("-- Data Deleted --");
		}
	}
	
	void display()
	{
		for(int i = f; i <= r; i++)
			System.out.println(q[i]);
	}
}
