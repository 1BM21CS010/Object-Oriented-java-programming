package CIE;
import java.util.*;


public class internals extends student
{
    public double arrcie[] = new double[5];
    public void  setd()
    {
        System.out.println("Enter marks for 5 subjects :");
        Scanner ss = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++)
        {
            arrcie[i] = ss.nextDouble();
        }
    }
    public void disp()
    {
        System.out.println("CIE MARKS OF 5 SUB ARE :");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(arrcie[i]);
        }
    }

}