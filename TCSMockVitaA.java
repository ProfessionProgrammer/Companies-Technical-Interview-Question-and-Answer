/* Given a sequence of distinct numbers a1, a2, ….. an, an inversion occurs if
there are indices i<j such that ai > aj .
For example, in the sequence 2 1 4 3 there are 2 inversions (2 1) and (4 3).
The input will be a main sequence of N positive integers. From this
sequence, a Derived Sequence will be obtained using the following rule.
The output is the number of inversions in the derived sequence.

Rule for forming derived sequence
An integer may be represented in base 6 notation. In base 6, 10305 is
1x64 + 3x62 + 5 =1409. Note that none of the digits in that representation
will be more than 5.
The sum of digits in a base 6 representation is the sum of all the digits at
the various positions in the representation. Thus for the number 1409, the
representation is 10305, and the sum of digits is 1+0+3+0+5=9. The sum
of digits may be done in the decimal system, and does not need to be in
base 6
The derived sequence is the sum of the digits when the corresponding
integer is represented in the base 6 form number will be expressed in base
6, and the derived sequence is the sum of the digits of the number in the
base 6 representation.
*/
import java.util.*;
public class TCSMockVitaA
{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		String input=s1.next();
		int in[]=Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
		int []derived=new int[n];
		for(int i=0;i<n;i++)
		{
			derived[i]=Integer.parseInt(TCSMockVitaA.converttoBase6(in[i],6));
		}
		int sum=0;
		int []addition=new int[n];
		for(int i=0;i<n;i++)
		{
			int n1=derived[i];
			while(n1>0)
			{
				int rem=n1%10;
				sum=sum+rem;
				n1=n1/10;
			}
			addition[i]=sum;
			sum=0;
		}
		int pair=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(addition[i]>addition[j])
				{
					pair++;
				}
			}
		}
		System.out.println(pair);
		s1.close();
	}
	public static String converttoBase6(int number, int base)
	{
	    int Q = number / base;
	    int R = number % base;
	    if (Q == 0) // base case
	    {
	        return Integer.toString(R);      
	    }
	    else
	    {
	        return converttoBase6(Q, base) + Integer.toString(R);
	    }            
	}
}
