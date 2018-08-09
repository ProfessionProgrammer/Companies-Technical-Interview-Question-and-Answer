/*Juan Marquinho is a geologist and he needs to count rock samples in
order to send it to chemical laboratory. He has a problem: The laboratory
only accepts rock samples by a range of its size in ppm (parts per million).
Juan Marquinho receives the rock samples one by one and he classifies
the rock samples according the range of the laboratory. This process is
very hard because the rock samples may be in millions.
Juan Marquinho needs your help, your task is develop a program to get
the number of rocks of a given range of size.*/
import java.util.Scanner;
public class TCSMockVitaC
{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int [] sample=new int[n];
		int range=s1.nextInt();
		int []min=new int[range];
		int []max=new int[range];
		int []resule=new int[range];
		for(int i=0;i<n;i++)
		{
			sample[i]=s1.nextInt();
		}
		for(int i=0;i<range;i++)
		{
			min[i]=s1.nextInt();
			max[i]=s1.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<range;j++)
			{
				if(sample[i]>min[j] && sample[i]<max[j])
				{
					resule[j]=resule[j]+1;
				}
			}
		}
		for(int i=0;i<range;i++)
		{
			System.out.println(resule[i]);
		}
		s1.close();
	}

}
