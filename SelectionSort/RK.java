package SelectionSort;

public class RK {

	public static void main(String[] args) {
	
		int arr[] = {1,23,4,22,45,6,78,9,7,54,3,2};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[min])
					min = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
