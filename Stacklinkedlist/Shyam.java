package Stacklinkedlist;

import java.util.Scanner;

public class Shyam {
   int top=-1;
   int n=10;
   int arr[] = new int[10];
   Scanner sc = new Scanner(System.in);
   
   public void Push()
   {
	   if(top==(n-1))
	   {
		   System.out.println("Stack Is Full");
	   }
	   else
	   {
		   System.out.println("Enter the Element");
		   int i = sc.nextInt();
		   top = top+1;
		   arr[top]=i;
		   System.out.println("Data Added");
	   }
   }//class Push ends here
   
   public int Pop()
   {
	   if(top==-1)
	   {
		   System.out.println("Stack is Empty");
		   return -1;
	   }
	   else
	   {
		   int value = arr[top];
		   top=top-1;
		  System.out.println("Data Deleted");
		   return value;
	   }
   }//class Pop ends here
   
   public void Peek()
   {
	   if(top==-1)
	   {
		   System.out.println("Stack Is Empty");
	   }
	   else
	   {
		   System.out.println(arr[top]);
	   }
   }//class peek ends here
   
   public void display()
   {
	   for(int j = 0; j <= top; j++)
	   {
		   System.out.println(arr[j]);
	   }
   }
}
