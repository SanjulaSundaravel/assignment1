package Assignment.week1;

import java.util.Arrays;

public class FindMissingNoInArray {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,8,6,5};
		System.out.println("Length of array "+a.length);
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println("");
		for(int i=0; i<a.length; i++)
		{
			int m=i+1;
			if(m!=a[i]) {
				System.out.println("Missing no is "+m);
			}
			
		}
     }
}