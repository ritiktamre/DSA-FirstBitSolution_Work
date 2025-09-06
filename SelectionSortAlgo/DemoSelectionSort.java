package SelectionSortAlgo;

import java.util.Arrays;

public class DemoSelectionSort {

	public static void main(String[] args) {
      
		int arr[] = {10,20,30,40,111,2,45,67,8,0,7,66};
		int minIndex;
		int temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[minIndex])
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
