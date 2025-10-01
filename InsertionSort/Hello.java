package InsertionSort;

public class Hello {

	public static void main(String[] args) {
	
		int arr[] = {12,4,3,1,34,5,67,8,907,9};
		
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp)
			{
				 arr[j+1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		

	}

}
