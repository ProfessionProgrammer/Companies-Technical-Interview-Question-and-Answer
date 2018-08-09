import java.util.Arrays;
import java.util.Scanner;
/* In this program I use the login of the fibbonancies series but in different way for calculating the multiple ways of cross all steps 
of ladder on given possible  collection of the steps*/
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