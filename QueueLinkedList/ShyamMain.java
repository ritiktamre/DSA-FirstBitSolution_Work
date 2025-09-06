package QueueLinkedList;

import java.util.Scanner;

public class ShyamMain {

	public static void main(String[] args) {
		
		Shyam s1 = new Shyam();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice!=5)
		{
			System.out.println("\t 1.Enqueue Operation");
			System.out.println("\t 2.Dequeue Operation");
			System.out.println("\t 3.Display Operation");
			System.out.println("\t 4.Exit Operation");
			System.out.println("Enter the Choice");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				s1.Enqueue();
				break;
			}
			
			case 2: {
				s1.Dequeue();
				break;
			}
			
			case 3: {
				s1.display();
				break;
			}
			
			case 4: {
				System.out.println("Best Of Luck Champs");
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
