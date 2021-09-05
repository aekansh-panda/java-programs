import java.util.Scanner;
public class elementarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double element=0;
        System.out.println("PROGRAM TO CHECK IF THE NUMBER IS PRESENT BETWEEN 1-10");
        System.out.println("------- -- ----- -- --- ------ -- ------- ------- ----");
        System.out.print("Enter a number : \n");
        element=sc.nextDouble();
        double[] x={1,2,3,4,5,6,7,8,9,10};
        boolean y=false;
        for(double check:x)
        {
         if(element==check)
         {
             y=true;
             break;
         }
        }
        if(y)
        {
            System.out.println("Given number is present between 1-10");
        }
        else
        {
            System.out.println("Given number is not present between 1-10");
        }
    }
}