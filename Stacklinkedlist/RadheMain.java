package Stacklinkedlist;

import java.util.Scanner;

public class RadheMain {

	public static void main(String[] args) {
	Radhe r1 = new Radhe();
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;
	while(choice!=5)
	{
	   System.out.println("\t 1.Push Condition");
	   System.out.println("\t 2.Pop Condition");
	   System.out.println("\t 3.Peek Condition");
	   System.out.println("\t 4.Display Condition");
	   System.out.println("\t 5.Exit");
	   System.out.println("Enter the Choice");
	   
	   choice=sc.nextInt();
	   
	   switch(choice) {
	   case 1: {
		   r1.push();
		   break;
	   }
	   
	   case 2: {
		   r1.pop();
		   break;
	   }
	   
	   case 3: {
		   r1.peek();
		   break;
	   }
	    
	   case 4: {
		   r1.display();
		   break;
	   }
	   
	   case 5: {
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
