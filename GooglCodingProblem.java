/* Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?*/

import java.util.ArrayList;
import java.util.Scanner;
class pair
{
	int a,b;
}
public class GooglCodingProblem {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		pair p;
		ArrayList<pai> lis=new ArrayList<>();
		ArrayList<Integer> input=new ArrayList<>();
		int k=s1.nextInt();
		int n=s1.nextInt();
		for(int i=0;i<n;i++)
		{
			input.add(s1.nextInt());
		}
		for(int i=0;i<input.size();i++)
		{
			Integer x=new Integer(k-input.get(i));
			if(input.contains(x) && input.indexOf(x)>i)
			{
				p=new pair();
				p.a=(int)input.get(i);
				p.b=(int)x;
				lis.add(p);
			}
		}
		for(pair i :lis)
		{
			System.out.println(i.a+"+"+i.b+"="+k);
		}
		s1.close();
	}

}
