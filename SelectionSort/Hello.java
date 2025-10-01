package SelectionSort;

public class Hello {

	public static void main(String[] args) {
	
		int arr[] = {1,23,4,2,3,45,6,7,8,988,65,43,56,42,256};
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			
			for(int j =i+1;j<arr.length;j++)
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
			System.out.println(arr[i]);

	}

}
