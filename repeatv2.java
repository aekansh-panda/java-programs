import java.util.Scanner;
public class repeatv2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=0;
        System.out.print("Enter a number");
        number=sc.nextInt();
        for(int x=1;x<=number;x++)
        {
            for(int i=1;i<=x;i++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println("\n");
        }
    }
}
