package QueueLinkedList;

import java.util.Scanner;

public class RadheQueue {
   
	 int head=-1;
	 int tail=-1;
	 int n=10;
	 int arr[] = new int[10];
	 Scanner sc = new Scanner(System.in);
	 
	 public void enqueue()
	 {
		 if(tail==(n-1))
		 {
			 System.out.println("Stack Is Full");
		 }
		 else
		 {
			 System.out.println("Enter Data");
			 int i = sc.nextInt();
			 if(head==-1 && tail ==-1)
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
	 
	 public void dequeue()
	 {
		 if(head==-1 && tail ==-1)
		 {
			 System.out.println("Stack Is Empty");
		 }
		 else
		 {
			 head=head+1;
			 System.out.println("Data Deleted");
		 }
	 }
	 
	 void display()
	 {
		 for(int j = head; j<=tail;j++)
		 {
			 System.out.println(arr[j]);
		 }
	 }
}
