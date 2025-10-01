package SelectionSort;

public class Tamre {

	public static void main(String[] args) {
		
		int arr[] = {12,3,5,67,8,90,4,1,9,3,45,6,78};
		
		for(int i =0;i<arr.length-1;i++)
		{
			int min = i;
			
			for(int j=i+1;j<arr.length;j++)
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
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
