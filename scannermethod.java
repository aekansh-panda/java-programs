import java.util.Scanner;
public class scannermethod
{
    public static int area(int a,int b)
    {
        int x;
        x=a*b;
        return x;
    }
    public static int area(int a)
    {
        int x;
        x=a*a;
        return x;
    }
    public static double area(double a)
    {
        double x;
        x=a*3.14;
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double radius=0;
        int length=0;
        int side=0;
        int breadth=0;
        System.out.println("Enter the length of the side of the square: ");
        side=sc.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");        
        breadth=sc.nextInt();       
        System.out.println("Enter the radius of the circle: ");
        radius=sc.nextInt();
        System.out.println("Area of the circle is : "+area(radius));
        System.out.println("Area of the circle is : "+area(length,breadth));
        System.out.println("Area of the circle is : "+area(side));
    }
}