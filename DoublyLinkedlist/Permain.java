package DoublyLinkedlist;

import java.util.Scanner;

public class Permain {

	public static void main(String[] args) {
		PerDoublyLinkedList l1 = new PerDoublyLinkedList();
		Scanner sc= new Scanner(System.in);
		
		int choice = 0;
		while(choice!=10) {
			System.out.println("\t 1.InsertBeg");
			System.out.println("\t 2.Display");
			System.out.println("\t 3.InsertEnd");
			System.out.println("\t 4.InsertPosition");
			System.out.println("\t 5.DeleteBeg");
			System.out.println("\t 6. Delete End");
			System.out.println("\t 7.Reversed the linked list");
			System.out.println("\t 8. Sort the linked list");
			System.out.println("\t 10.Exit");
			System.out.println("Enter the choice");
			
			
			choice =sc.nextInt();
			
			switch(choice)  {
			case 1 : {
				int id;
				String name;
				double salary;
				
				System.out.println("Enter Id :");
				id=sc.nextInt();
				
				System.out.println("Enter Name :");
				name=sc.next();
				
				System.out.println("Enter Salary :");
				salary = sc.nextDouble();
				l1.InsertBeg(id, name, salary);
			     break;
			}
			
			case 2 : {
				System.out.println("-- Display the Linked List --");
				l1.display();
				break;
			}
			
			case 3 : {
				int id;
				String name;
				double salary;
				
				System.out.println("Enter Id :");
				id=sc.nextInt();
				System.out.println("Enter Name :");
				name=sc.next();
				System.out.println("Enter Salary :");
				salary=sc.nextDouble();
				
				l1.InsertEnd(id, name, salary);
				break;
				
			}
			
			case 4 : {
				int pos =0;
				int id;
				String name;
				double salary;
				System.out.println("Enter id:");
				id=sc.nextInt();
				System.out.println("Enter Name :");
				name=sc.next();
				System.out.println("Enter Salary :");
				salary=sc.nextDouble();
				System.out.println("Enter pos :");
				pos=sc.nextInt();
				
				l1.InsertPos(id, name, salary, pos);
				break;
			}
			
			case 5 : {
				System.out.println("-- Delete at Begginning --");
				l1.deleteBeg();
				break;
			}
			
			case 6 : {
				System.out.println("-- Delete at End --");
				l1.deleteEnd();
				break;
			}
			
			case 7 : {
				System.out.println("-- Reversed the Linked List --");
				l1.reversed();
				break;
			}
			
			case 8 : {
				System.out.println("-- Sorted the Linked List --");
				l1.sort();
				break;
			}
			
			case 10 : {
				System.out.println("--- Bye Bye Coders Best of Luck ---");
				break;
			}
			
			default :
				System.out.println("-- Invalid Choice --");
			}
			
		}
		
		

	}

}
