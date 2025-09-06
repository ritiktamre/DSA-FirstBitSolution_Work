package Stacklinkedlist;

import java.util.Scanner;

public class DemoLL {
	Scanner sc = new Scanner (System.in);
	class Node {
		int data;
		Node next;
	
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int data) {
			super();
			this.data = data;
		}

		int getData() {
			return data;
		}

		void setData(int data) {
			this.data = data;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}
		
		
	}
	Node top = null;
	public void push()
	{
		System.out.println("Enter Data");
		int data = sc.nextInt();
		Node n = new Node(data);
		if(top==null)
		{
			top=n;
			System.out.println("Data Added");
		}
		else
		{
			n.next=top;
			top=n;
		System.out.println("Data Added");
		}
	}
	
	public void pop ()
	{
		if(top==null)
		{
			System.out.println("Stack Empty");
		}
		else
		{
			top=top.next;
			System.out.println("Data Deleted");
		}
	}
	
	public void display()
	{
		Node current =top;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}

	
}
