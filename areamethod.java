import java.util.Scanner;
public class areamethod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String figure="";
        double length=0,breadth=0,height=0;
        System.out.println("Area calculator of Square,Rectangle and Triangle"); 
        System.out.print("Enter the name of the figure (in block letters): ");
        figure=sc.nextLine();
        if(figure.equals("SQUARE"))
        {
          System.out.print("Enter the length of the side: \n");
          length=sc.nextDouble();
          double x=area(length);
          System.out.println("Area of the figure is: "+x);
        }
        else if(figure.equals("RECTANGLE"))
        {
          System.out.print("Enter the length and breadth: \n");
          length=sc.nextDouble();
          breadth=sc.nextDouble();
          double x=area(length,breadth);
          System.out.println("Area of the figure is: "+x);
        }
        else if(figure.equals("TRIANGLE"))
        {
          System.out.print("Enter the length,breadth and height: \n");
          length=sc.nextDouble();
          breadth=sc.nextDouble();
          height=sc.nextDouble();
          double x=area(breadth,height);
          System.out.println("Area of the figure is: "+x);
        }
        else 
        {
            System.out.println("Wrong input");
        }
    }
    public static double area(double a)
    {
        double y=a*a;
        return y;
    }
    public static double area(double a,double b)
    {
        double y=a*b;
        return y;
    }
    public static double area(double a,double b,double c)
    {
        double y=0.5*b*c;
        return y;
    }
}
 