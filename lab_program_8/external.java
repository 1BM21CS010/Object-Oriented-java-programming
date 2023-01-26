package SEE;
import CIE.internals;
import java.util.*;

public class  external extends internals
{
    public double arrsee[] = new double[5];
    double finalm[] = new double[5];
    public void set()
    {
        System.out.println("Enter marks for 5 subjects for SEE  :");
        Scanner ss = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++)
        {
            arrsee[i] = ss.nextDouble();
        }
    }
    public void  disp2()
    {
        System.out.println("SEE MARKS OF 5 SUB ARE :");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(arrsee[i]);
        }
    }
    public void finalmarks()
    {
        
        for(int i=0 ;i<5;i++)
        {
            finalm[i] = arrsee[i] + arrcie[i];

        }
        
    
    }
    public void dispf()
    {
        System.out.println("FINAL MARKS IS : ");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(finalm[i]);
        }
    }

}