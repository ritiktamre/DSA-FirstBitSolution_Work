package QuickSort;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		int arr[]= {12,3,567,8,90,34};
		Quick(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void Quick(int arr[])
	{
		sort(arr,0,arr.length-1);
	}
	public static void sort(int  arr[],int start,int end)
	{
		if(start<end)
		{
			int divisionPos = divide(arr,start,end);
			sort(arr,start,divisionPos-1);
			sort(arr,divisionPos+1,end);
		}
	}
	
	public  static int divide(int[] ref,int start,int end)
	{
		int pivot=ref[end];
		int first=start-1;
		
		for(int second=start;second < end;second ++)
		{
			if(ref[second] <= pivot)
			{
				first++;
				int temp=ref[first];
				ref[first]=ref[second];
				ref[second]=temp;
			}
			
		}
		
		int temp = ref[first+1];
		ref[first+1]=ref[end];
		ref[end]=temp;
		return first+1;
	}

}
