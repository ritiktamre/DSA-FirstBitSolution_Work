package SelectionSort;

public class Node {

	public static void main(String[] args) {
		
		int arr[] = {13,4,23,5,6,2,12,1,7,89,78,90};
		
		for(int i = 0;i<arr.length-1;i++)
		{
			int min = i;
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
