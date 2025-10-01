package SelectionSort;

public class Ritik {

	public static void main(String[] args) {
		
		int arr[] = {12,3,45,6,4,21,45,67,8,90,6};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			
			for(int j = i+1;j<arr.length;j++)
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
