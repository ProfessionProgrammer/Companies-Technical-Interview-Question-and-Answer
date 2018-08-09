/* Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/

import java.util.Arrays;
import java.util.Scanner;

public class UberCodingProblem {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int [] x=Arrays.stream(s1.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		x=GetProduct(x);
		for(int i:x)
		{
			System.out.println(i);
		}
		s1.close();
	}
	public static int[] GetProduct(int...input)
	{
		int[] output=new int[input.length];
		int product;
		for(int i=0;i<input.length;i++)
		{
			product=1;
			for(int j=0;j<input.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					product=product*input[j];
				}
			}
			output[i]=product;
		}
		return output;
	}
}
