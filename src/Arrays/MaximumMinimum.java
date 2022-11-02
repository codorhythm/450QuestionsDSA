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
		
		if(arr.length == 1)
		{
			return num;
		}
		
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
	
	public static Pair maxMin3(int arr[], int left, int right)
	{
		
		Pair num = new Pair();
		
		if(left == right)
		{
			num.max = arr[left];
			num.min = arr[left];
			return num;
		}
		
		if(right - left == 1)
		{
			if(arr[left]>arr[right])
			{
				num.max = arr[left];
				num.min = arr[right];
			}
			else
			{
				num.max = arr[right];
				num.min = arr[left];
			}
			
			return num;
		}
		
			
		
		int mid = (left+right)/2;
		Pair leftPart =  maxMin3(arr, left, mid);
		
		Pair rightPart = maxMin3(arr, mid+1, right);
		
		if(leftPart.max > rightPart.max)
		{
			num.max = leftPart.max;
		}
		else
		{
			num.max = rightPart.max;
		}
		
		
		if(leftPart.min < rightPart.min)
		{
			num.min = leftPart.min;
			
		}
		else
		{
			num.min = rightPart.min;
		}
		
		
		return num;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
//		Pair ans = maxMin2(arr);
//		System.out.println(ans.max+" "+ans.min);
		
		Pair ans2 = maxMin3(arr,0,arr.length-1);
		System.out.println(ans2.max+" "+ans2.min);
//		for(int i: arr)
//		{
//			System.out.print(i+" ");
//		}
	}

}
