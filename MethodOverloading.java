import java.util.Scanner;
public class MethodOverloading
{
    public static void main (String args[])
    {
       Scanner sc=new Scanner (System.in);
       int value1=0,value2=0;
       double value3=0,value4=0;
       String s="";
       System.out.print("Enter the data type of your value (in block letters): ");
       s=sc.nextLine();
       if(s.equals("INTEGER"))
       {
       System.out.print("Enter two int value");
       value1=sc.nextInt();
       value2=sc.nextInt();
       int result1=minFunction(value1,value2);       
       System.out.println("The minimum value between the two integer is :"+result1);
       }
       else if(s.equals("DOUBLE"))
       {
       System.out.print("Enter two double value");
       value3=sc.nextInt();
       value4=sc.nextInt();
       double result2=minFunction(value3,value4);
       System.out.println("The minimum value between the two double is :"+result2);
       }
       else
       {
           System.out.println("Wrong input ......re-check");
       } 
    }
    public static int minFunction(int n1,int n2)
    {
     int min;
     if(n1>n2)
     {
         min=n2;
     }
     else
     {
         min=n1;
     }
     return min;
    }
    public static double minFunction(double n1,double n2)
    {
      double min;
     if(n1>n2)
     {
         min=n2;
     }
     else
     {
         min=n1;
     }
     return min;  
    }
}