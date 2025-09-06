package InsertionSort;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		int arr[] = {2,3,11,450,1,34,5,78,8,90};
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int j = i-1;
			
			while(j>=0 && temp < arr[j])
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			
			arr[j+1]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("Sorted Array :"+Arrays.toString(arr));
		

	}

}
