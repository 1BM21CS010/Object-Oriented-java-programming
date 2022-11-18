import java.util.Scanner;
class Quadratic
{
	int a,b,c;
	double r1,r2,d;
	void getd()
	{
		System.out.println("enter the coefficients ax^2+bx+c");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	}
	void compute()
	{
		d=b*b-4*a*c;
		if(d==0)
		{
			r1=(-b)/(2*a);
			System.out.println("Roots are equal");
			System.out.println("Roots r1=r2="+r1);
		}
		else if (d>0)
		{
			r1= (-b+Math.sqrt(d))/(double)(2*a);
			r2=(-b-Math.sqrt(d))/(double)(2*a);
			System.out.println("Roots are real and distinct");
			System.out.println("Root1= "+r1 +" Root2 ="+r2);
		}
		else
		{
			System.out.println("Roots are imaginary");
			
		}		
	}
}
class QuadraticEq
{	
	public static void main(String[] args)
	{
		Quadratic q = new Quadratic();
		q.getd();
		q.compute();
	}
}