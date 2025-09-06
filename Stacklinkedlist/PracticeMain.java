package Stacklinkedlist;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		Practice p1 = new Practice();
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		while(choice!=5)
		{
			System.out.println("\t 1.Enqueue Operation");
			System.out.println("\t 2.Dequeue Operation");
			System.out.println("\t 3.Display Operation");
			System.out.println("\t 4.Exit ");
			System.out.println("Enter the Choice");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1: {
				p1.Enqueue();
				break;
			}
			
			case 2: {
				p1.Dequeue();
				break;
			}
			
			case 3: {
				p1.display();
				break;
			}
			
			
			case 4: {
				System.out.println("Best Of Luck");
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
