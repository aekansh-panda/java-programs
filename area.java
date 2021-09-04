import java.io.*;
public class area
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("To Find The Area and Perimetre of a rectangle");
        int a=0,b=0;
        System.out.print("Enter the lenght : ");
        a=Integer.parseInt(stdin.readLine());
        System.out.print("Enter the breadth : ");
        b=Integer.parseInt(stdin.readLine());
        int area=a*b;
        int peri=2*(a+b);
        System.out.println("Area of the rectangle ="+area);
        System.out.println("Perimeter of the rectangle ="+peri);
    }
}