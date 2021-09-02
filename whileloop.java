import java.util.Scanner;
public class whileloop
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int x=0;
      System.out.print("Enter a number :");
      x=sc.nextInt();
      int i=1;
      while (i<=10)
      {
          System.out.println(x+" x "+i+" = "+x*i);
          i++;
      }
  }
}
