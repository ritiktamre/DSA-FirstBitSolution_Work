package BubbleSortAlgo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
      
		int arr[] = { 10,3,45,7,48,9,22};
		int temp=0;
		
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
		
		System.out.println("Sorted Array" +Arrays.toString(arr));
	}

}
