package Stacklinkedlist;

import java.util.Scanner;

public class RitikMain {

	public static void main(String[] args) {
	
		Ritik r1 = new Ritik();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		while(choice!=5)
		{
			System.out.println("\t 1. Push Operation");
			System.out.println("\t 2.Pop Operation");
			System.out.println("\t 3.Peek Operation");
			System.out.println("\t 4.Display Operation");
			
			System.out.println("Enter the Choice");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1: {
				r1.Push();
				break;
			}
			case 2: {
				r1.Pop();
				break;
			}
			
			case 3: {
				r1.Peek();
				break;
			}
			
			case 4: {
				r1.display();
				break;
			}
			
			case 5: {
				System.out.println("Bye Bye Coders Best Of Luck Champs");
				break;
			}
			
			default: {
				System.out.println("Invalid Choice");
				break;
			}
			}
			
		}
		   
		sc.close();

	}

}
