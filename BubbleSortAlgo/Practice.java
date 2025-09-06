package BubbleSortAlgo;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
        
		int arr[] = {234,5,432,67,89,9,76,78};
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				
				if(arr[j] > arr[j+1])
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
