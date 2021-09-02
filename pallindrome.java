import java.io.*;
public class pallindrome
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        int p,n,d,r=0;
        System.out.println("Enter a number:");
        n=Integer.parseInt(stdin.readLine());
        p=n;
        do
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        while(n!=0);
        if(r==p)
        {
           System.out.println("Pallindrome number");
        }
        else
        {
            System.out.println("Not a Pallindrome number");
        }
    }
}