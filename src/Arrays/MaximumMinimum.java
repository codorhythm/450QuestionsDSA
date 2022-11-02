package Arrays;
import java.util.*;


public class MaximumMinimum {
	static class Pair
	{
		int max;
		int min;
	}
	
	public static void maxMin(int arr[])
	{
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[arr.length-1]);
		
	}
	
	
	public static Pair maxMin2(int arr[])
	{
		
		Pair num = new Pair();
		num.max=arr[0];
		num.min=arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i]>num.max)
			{
				num.max = arr[i];
			}
			if(arr[i]<num.min)
			{
				num.min = arr[i];
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Pair ans = maxMin2(arr);
		System.out.println(ans.max+" "+ans.min);
//		for(int i: arr)
//		{
//			System.out.print(i+" ");
//		}
	}

}
