package DoublyLinkedlist;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Doublylinkedlist1 mylist = new Doublylinkedlist1();
		Scanner sc = new Scanner(System.in);
		
		int choice=0;
		while(choice!=5) {
			System.out.println("\t 1.Insert Beg");
			System.out.println("\t 2.Display All");
			System.out.println("\t3.Insert End");
			System.out.println("\t5. Exit");
			System.out.println("Enter your choice :");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1 : {
				int ele;
				System.out.println("Enter Element");
				ele=sc.nextInt();
				mylist.insertBeg(ele);
				break;
			}
			
			case 2  : {
				mylist.displayAll();
				break;
			}
			
			case 3 : {
				int data;
				System.out.println("Enter Element");
				data=sc.nextInt();
				mylist.insertEnd(data);
				break;
			}
			
			case 5 : {
				System.out.println("-- Bye Bye --");
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
