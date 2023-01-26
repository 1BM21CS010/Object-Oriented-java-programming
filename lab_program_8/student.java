package CIE;
import java.util.*;

public class student
{
    String usn;
    String name = new String();
    int sem;
    public void  setinfo()
    {
        System.out.println("Enter usn,name,sem:");
        Scanner ss = new Scanner(System.in);
        usn =ss.next() ;
        name =ss.next() ;
        sem = ss.nextInt();
    }

    public void  dispay()
    {
        System.out.println("USN :" + usn);
        System.out.println("NAME :" + name);
        System.out.println("SEM :" + sem);

    }

}