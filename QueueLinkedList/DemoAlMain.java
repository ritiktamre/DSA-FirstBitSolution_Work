package QueueLinkedList;

import java.util.Scanner;

public class DemoAlMain {

	public static void main(String[] args) {
		DemoAl a = new DemoAl();
		Scanner sc= new Scanner(System.in);
		
		int choice=0;
		
		while(choice!=5)
		{
			System.out.println("\t 1.Enqueue Operation");
			System.out.println("\t 2.Dequeue Operation");
			System.out.println("\t 3.Display Operation");
			System.out.println("Enter Choice :");
			
		     choice=sc.nextInt();
		     
		     switch(choice) {
		     case 1 : {
		    	 a.enqueue();
		    	 break;
		     }
		     
		     case 2 : {
		    	 a.dequeue();
		    	 break;
		     }
		     
		     case 3 : {
		    	 a.display();
		    	 break;
		     }
		     
		     case 5 : {
		    	 System.out.println("Bye Bye Coders Best Of Luck");
		    	 break;
		     }
		     
		     default : {
		    	 System.out.println("-- Invalid choice --");
		     }
		     
		     }
		}
           sc.close();
	}

}
