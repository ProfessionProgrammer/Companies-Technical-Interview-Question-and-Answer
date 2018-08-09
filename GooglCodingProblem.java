package defaultPackage;

import java.util.ArrayList;
import java.util.Scanner;
class pai
{
	int a,b;
}
public class GooglCodingProblem {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		pai p;
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
				p=new pai();
				p.a=(int)input.get(i);
				p.b=(int)x;
				lis.add(p);
			}
		}
		for(pai i :lis)
		{
			System.out.println(i.a+"+"+i.b+"="+k);
		}
		s1.close();
	}

}
