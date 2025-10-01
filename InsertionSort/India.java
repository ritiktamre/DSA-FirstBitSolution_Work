package InsertionSort;

public class India {

	public static void main(String[] args) {
	
		int arr[] = {12,34,5,67,54,32,4,21,1,23,2,8,6};
		
		for(int i =0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i - 1;
			
			while( j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j = j - 1;
			}
			
			arr[j+1] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
