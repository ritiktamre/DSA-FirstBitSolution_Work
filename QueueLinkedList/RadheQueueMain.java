package QueueLinkedList;

import java.util.Scanner;

public class RadheQueueMain {

	public static void main(String[] args) {
	 
		RadheQueue q1 = new RadheQueue();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		while(choice!=5) {
			System.out.println("\t 1.Enqueue Operation");
			System.out.println("\t 2.Dequeue Operation");
			System.out.println("\t 3.Display Operation");
			System.out.println("\t 4.Exit");
			
			System.out.println("Enter the choice");
			  choice = sc.nextInt();
			  
			  switch(choice) {
			  case 1: {
				  q1.enqueue();
				  break;
			  }
			  
			  case 2: {
				  q1.dequeue();
				  break;
			  }
			  
			  case 3: {
				  q1.display();
				  break;
			  }
			  
			  case 4: {
				  System.out.println("Bye Bye Coders");
				  break;
			  }
			  
			  default : {
				  System.out.println("Invalid Choice");
				  break;
			  }
			  }
		}
		sc.close();

	}

}
