import CIE.student;
import CIE.internals;
import SEE.external;
import java.util.*;

class Main
{
    
    
    public static void main(String xx[])
    {
        System.out.println("Enter no of students :");
        Scanner ss = new Scanner(System.in);
        int n;
        double fin[] = new double[5];
        n = ss.nextInt();
        external e1[] = new external[n];
        for(int i=0 ; i<n ; i++)
        {
            
            
            e1[i] = new external();
            e1[i].setinfo();
            e1[i].setd();
            e1[i].set();
            e1[i].finalmarks();
            e1[i].dispf();
        

        }  

    }
}