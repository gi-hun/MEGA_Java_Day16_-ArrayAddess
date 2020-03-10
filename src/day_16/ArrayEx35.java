package day_16;

public class ArrayEx35 {
	public static void main(String[] args) {
		
		int[] arr = {87, 100, 24, 11, 79};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		int[] temp = arr;
		temp[1] = 0;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(temp[i] + " ");
		}
	}
}
