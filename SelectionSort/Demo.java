package SelectionSort;

public class Demo {

	public static void main(String[] args) {
		
		int arr[] = {12,4,56,78,9,19,6,32,44,677};
		
		for(int i =0;i<arr.length-1;i++)
		{
			int min = i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] <arr[min])
				 min = j;
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
