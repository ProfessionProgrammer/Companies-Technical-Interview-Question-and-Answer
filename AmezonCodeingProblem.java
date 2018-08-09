/*There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.*/

/* In this program I use the login of the fibbonancies series but in different way for calculating the multiple ways of cross all steps 
of ladder on given possible  collection of the steps*/

import java.util.Arrays;
import java.util.Scanner;
public class AmezonFinal 
{
 //Recursive Function to retive the  final output
	public int Number_of_way(int n,int...input)
	{
		int total=0;
		if(n==0)
		{
			return 1;
		}
		for(int i=0;i<input.length;i++)
		{
			if(n-input[i]>=0)
			{
				total=total+Number_of_way(n-input[i],input);
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
    //n No of Steps
		int n=s1.nextInt();
    //CSV in string for possible combination of the steps take in one step like 1,2,3
		String s=s1.next();
    //Mapping it to with int array using the stream API of JAVA8
		int [] noSteps=Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).toArray();
    //Print the output by calling the Function
		System.out.println(new AmezonFinal().Number_of_way(n,noSteps));
	}
}