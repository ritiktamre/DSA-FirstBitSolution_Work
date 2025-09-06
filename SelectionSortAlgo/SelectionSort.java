package SelectionSortAlgo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
      
		int arr[] = { 10,3,45,67,6,34,5};
		int temp;
		int minIndex;
		for(int i=0;i<arr.length-1;i++)
		{
			  minIndex = i;
			  
			  for(int j=i+1;j<arr.length;j++)
			  {
				  if(arr[j]<arr[minIndex])
				  {
					  minIndex=j;
				  }
			  }
			  
			  temp=arr[i];
			  arr[i]=arr[minIndex];
			  arr[minIndex]=temp;
			  System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("Sorted Array :"+Arrays.toString(arr));
		
	}

}
