package Arrays;

public class ReverseAnArray {

	public static void reverse1(int arr[])
	{
		int left = 0; int right = arr.length-1;
		while(left <= right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		reverse1(arr);
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}

}
