package BubbleSortAlgo;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
      
		int arr[] = {12,3,45,67,8};
		int temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					System.out.println(Arrays.toString(arr));
				}
					
			}
		}
		
		System.out.println("Sorted Array :"+Arrays.toString(arr));
		
	}

}
