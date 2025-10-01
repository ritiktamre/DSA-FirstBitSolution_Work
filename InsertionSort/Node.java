package InsertionSort;

public class Node {

	public static void main(String[] args) {
	
		int arr[] = {1,4,53,2,12,3,45,6,890,8,76,5};
		
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j>= 0 && arr[j]>temp)
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
