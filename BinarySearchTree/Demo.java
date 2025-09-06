//package BinarySearchTree;
//
//public class Demo {
//
//	public static void main(String[] args) {
//		int arr[] = { 1,3,12,21,23,66};
//		
//		int search=23;
//	}
//	
//	public static void search(int arr[],int search)
//	{
//		
//		int start=arr[0];
//		int end=arr[arr.length-1];
//		int mid=arr[arr.length/2];
//		
//		boolean found=false;
//		
//		while(start<end && found==true) {
//			if(arr[mid]==search)
//			{
//				System.out.println("Element is found");
//			     found=true;
//			     break;
//			     
//			}
//			else
//				if(arr[mid]>search)
//				{
//					end=end-1;
//					
//				}
//				else if(arr[mid]<search)
//				{
//					start=start+1;
//				}
//		}
//		if(found) {
//			System.out.println("Element are found");
//		}
//	}
//}
