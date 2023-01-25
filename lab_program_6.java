import java.util.Scanner;
class WrongAge extends Exception
{
	String msg=new String();
	WrongAge()
	{ msg= "Age error";}
	WrongAge(String s)
	{  msg=s; }
	public String toString()
	{  return msg; }
}
class Father
{
	int fage;
	Father() throws WrongAge
	{
		System.out.println("Enter Father's age:");
		Scanner ss = new Scanner(System.in);
		fage=ss.nextInt();
		if(fage<0)
		{
	  		throw new WrongAge("Invalid input. Father's age can not be lesser than 0");
	   	}

	}
	Father(int a) throws WrongAge
	{
  			fage=a;
  			if(fage<0)
  		{
		throw new WrongAge("Invalid input. Father's age can not be lesser than 0");
 		}
	}
	public String toString()
	{
		return "Father's age: "+fage;
	}
}
class Son extends Father
{
	int sage;
	Son() throws WrongAge
	{
		Scanner ss = new Scanner(System.in);		
		System.out.println("Enter Son's age:");
  		int sage=ss.nextInt();
  		
  		if(sage>=fage)
  		{
			ss.close();
			throw new WrongAge("Sons age can not be greater than father's age");
 		}
		ss.close();
	}
	public String toString()
	{
		return "Father's age: "+fage+"\nSon's age: "+sage;
	}
}
class Main
{
	public static void main(String args[])
	{  		try
		{
  		Father f=new Father();
  		Son s=new Son();
		System.out.println(f);
		System.out.println(s);
		}
 		catch(WrongAge wa)
  		{ System.out.println(wa); }
  		catch(Exception ec)
  		{ System.out.println("Exception encountered. Try again!"); }
		
	}
}
