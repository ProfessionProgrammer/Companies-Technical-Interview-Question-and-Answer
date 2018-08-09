
import java.util.Arrays;
import java.util.Scanner;

public class AmezonCodeingProblem {
 
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
		int n=s1.nextInt();
		String s=s1.next();
		int [] noSteps=Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).toArray();
		System.out.println(new AmezonFinal().Number_of_way(n,noSteps));
	}
}
