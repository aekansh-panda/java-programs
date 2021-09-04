import java.util.*;
public class Positive 
{
    int n,c,sum_even, sum_odd, n1 ;
    Positive()
    {
        n= 0;
        c=0;
        n1= 0;
        sum_even = 0;
        sum_odd = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number :-");
        n = sc.nextInt();
    }
    void calc()
    {
        do{
            n1 = n%10;
            n= n/10;
            c++;
            if(c%2 == 0)
            {
                sum_even +=n1;
            }
            else
            {
                sum_odd += n1;
            }
        }while(n!=0);
    }
    void display()
    {
        System.out.println("sum of digits at even places ="+sum_even);
        System.out.println("sum of the digits at odd places ="+sum_odd);
    }
    public static void main(String args[])
    {
        Positive o = new Positive();
        o.input();
        o.calc();
        o.display();
    }
}