import java.util.Scanner;
public class presentElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double number=0;
        double[] marks={95,97,82,93,88};
        System.out.print("Enter the number: ");
        number=sc.nextDouble();
        int flag=0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==number)
            {
                flag=1;
                break;
            }
        }
        if (flag==1)
        {
         System.out.println("The given number is present in the array");   
        }
        else
        {
            System.out.println("The given number is not present in the array");
        }
    }
}

