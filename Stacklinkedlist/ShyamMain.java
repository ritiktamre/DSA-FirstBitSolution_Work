package Stacklinkedlist;

import java.util.Scanner;

public class ShyamMain {

	public static void main(String[] args) {
		Shyam s = new Shyam();
		Scanner sc = new Scanner(System.in);
		
		int choice =0;
		while(choice!=5)
		{
			System.out.println("\t 1.Push Operation");
			System.out.println("\t 2.Pop Operation");
			System.out.println("\t 3.Peek Operation");
			System.out.println("\t 4.Display ");
			System.out.println("\t 5.Exit");
			
			System.out.println("Enter the choice");
			
			choice  = sc.nextInt();
			switch(choice)
			{
			case 1: {
				s.Push();
				break;
			}
			
			case 2: {
				s.Pop();
				break;
			}
			
			case 3: {
				s.Peek();
				break;
			}
			
			case 4: {
				s.display();
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
