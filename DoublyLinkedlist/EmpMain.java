package DoublyLinkedlist;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
	
		EmpDoublyLinkedList e1 = new EmpDoublyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		int choice=0;
		while(choice!=10) {
			System.out.println("\t 1.Insert Beg");
			System.out.println("\t 2.Display");
			System.out.println("\t 3.InsertEnd");
			System.out.println("\t 4.InsertPosition");
			System.out.println("\t 5.Reversed");
			System.out.println("\t 6.Sort the list");
			System.out.println("\t 7.Delete At Begnning");
			System.out.println("\t 8. Delete At End");
			System.out.println();
			
			System.out.println("\t 10.Exit");
			System.out.println("Enter your choice :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				int id;
				String name;
				double salary;
				System.out.println("Enter the ID:");
				id=sc.nextInt();
				
				System.out.println("Enter the Name :");
				name=sc.next();
				
				System.out.println("Enter the Salary");
				salary=sc.nextDouble();
				e1.insertBeg(id,name,salary);
				break;
				
				
			}
			
			case 2 : {
				System.out.println("-- Display the List --");
				e1.display();
				break;
			}
			
			case 3: {
				int id;
				String name;
				double salary;
				System.out.println("Enter the Id :");
				id =sc.nextInt();
				
				System.out.println("Enter the Name :");
				name=sc.next();
				
				System.out.println("Enter the Salary :");
				salary=sc.nextDouble();
				e1.InsertEnd(id, name, salary);
				break;
			}
			
			case 4 : {
				int pos=0;
				int id;
				String name;
				double salary;
				System.out.println("Enter the Id :");
				id =sc.nextInt();
				
				System.out.println("Enter the Name :");
				name=sc.next();
				
				System.out.println("Enter the Salary :");
				salary=sc.nextDouble();
				e1.insertPosition(id, name, salary,pos);
				break;
			}
			
			case 5 :
			{
				System.out.println("-- Reversed the Element --");
				e1.reversed();
				break;
			}
			
			case 6 : {
				System.out.println("-- Sorted Linked List --");
				e1.sort();
				break;
			}
			
			case 7 : {
				System.out.println("-- Delete the Begginning --");
				e1.deleteBeg();
				break;
			}
			
			case 8 : {
				System.out.println("-- Delete the End --");
				e1.deleteEnd();
				break;
			}
			
			case 10 : {
				System.out.println("-- Bye Bye Coders --");
				break;
			}
			
			default : {
				System.out.println("-- Invalid Choice --");
				break;
		    	}
			}
		}

	}

}
