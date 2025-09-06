package Stacklinkedlist;

import java.util.Scanner;

public class stackMain {

	public static void main(String[] args) {
	 
		Stack s= new Stack();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(choice!=5) {
			System.out.println("\t 1.Push Operation");
			System.out.println("\t 2.Pop Operations");
			System.out.println("\t 3.Display Operations");
			System.out.println("\t 4.Pop1 Operations");
			System.out.println("\t 5.Exit");
			
			System.out.println("Enter your Choice :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				s.push();
				break;
			}
				case 2:{
					s.pop();
					break;
				}
				
				case 3 : {
					s.display();
					break;
				}
				
				case 4: {
					s.pop1();
					break;
				}
			    
				case 5: {
					System.out.println("Bye Bye Coders Best of Luck");
					break;
				}
				
				default : {
					System.out.println("-- Invalid Choice --");
				}
			}
		}
	
		sc.close();

	}

}
