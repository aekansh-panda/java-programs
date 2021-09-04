import java.io.*;
public class pizza
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        int x=0 ,y=0 ,w=0,z=0,a=0,b=0,i=0,c=0,d=0;
        System.out.println( "       PIZZA STOP   " );
        System.out.println( "       ----------   " );
        System.out.println( "                  (Get 10% discount on Wednesdays) " ); 
        System.out.println( " S.NO       ITEM            PRIZE");
        System.out.println("  ----       ----            -----");
        System.out.println( "   1     Paparoni pizza      475$");
        System.out.println( "   2     Chesse burst        300$"); 
        System.out.println( "   3     Saucy paneer pizza  275$");
        System.out.println( "   4     Chiken chick pizza  450$");
        System.out.print("Enter how many types of pizza you want = ");
        x =Integer.parseInt(stdin.readLine());
        if (x==1)
        {
         System.out.print("Enter the S.NO of the pizza you want");
         y =Integer.parseInt(stdin.readLine());
        }
        else if (x==2)
        {
          System.out.print("Enter the S.NO of the first pizza you want ");
          w =Integer.parseInt(stdin.readLine()); 
          System.out.print("Enter the S.NO of the second pizza you want ");
          z =Integer.parseInt(stdin.readLine());
          System.out.print("Enter the quantity of the first pizza you want ");
          a =Integer.parseInt(stdin.readLine());
          System.out.print("Enter the quantity of the second pizza you want ");
          b =Integer.parseInt(stdin.readLine());
          int p=475*a;
          int p1=300*b;
          int p2=p+p1;
          int q=300*a;
          int q1=275*b;
          int q2=q+q1;
          int l=275*a;
          int l1=450*b;
          int l2=l+l1;
          int k=450*a;
          int k1=475*b;
          int k2=k+k1;
          if (w==1 && z==2)
          {
              System.out.println("Your bill= "+p2);
          }
          if (w==2 && z==3)
          {
              System.out.println("Your bill= "+q2);
          }
          if (w==3 && z==4)
          {
              System.out.println("Your bill= "+l2);
          }
          if (w==1 && z==4)
          {
              System.out.println("Your bill= "+k2);
          }
        }
         else if (x==3)
        {
          System.out.print("Enter the S.NO of the first pizza you want ");
          w =Integer.parseInt(stdin.readLine()); 
          System.out.print("Enter the S.NO of the second pizza you want ");
          z =Integer.parseInt(stdin.readLine());
          System.out.print("Enter the S.NO of the third pizza you want ");
          i =Integer.parseInt(stdin.readLine());
          System.out.print("Enter the quantity of the first pizza you want ");
          a =Integer.parseInt(stdin.readLine());
          System.out.print("Enter the quantity of the second pizza you want ");
          b =Integer.parseInt(stdin.readLine());
          System.out.print("Enter the quantity of the third pizza you want ");
          c =Integer.parseInt(stdin.readLine());
          int p=475*a;
          int p1=300*b;
          int p0=275*c;
          int p2=p+p1+p0;
          int q=300*a;
          int q1=275*b;
          int q0=450*c;
          int q2=q+q1+q0;
          int l=275*a;
          int l1=450*b;
          int l0=475*c;
          int l2=l+l1+l0;
          int k=450*a;
          int k1=475*b;
          int k0=300*c;
          int k2=k+k1+k0;
          if (w==1 && z==2 && i==3)
          {
              System.out.println("Your bill= "+p2);
          }
          else if (w==2 && z==3 && i==4)
          {
              System.out.println("Your bill= "+q2);
          }
          else if (w==3 && z==4 && i==1)
          {
              System.out.println("Your bill= "+l2);
          }
          else if (w==4 && z==1 && i==2)
          {
              System.out.println("Your bill= "+k2);
          }
        }
            else if (x==4)
            {
             System.out.print("Enter the quantity of the first pizza you want ");
             a =Integer.parseInt(stdin.readLine());
             System.out.print("Enter the quantity of the second pizza you want ");
             b =Integer.parseInt(stdin.readLine());
             System.out.print("Enter the quantity of the third pizza you want ");
             c =Integer.parseInt(stdin.readLine()); 
             System.out.print("Enter the quantity of the fourth pizza you want ");
             d =Integer.parseInt(stdin.readLine()); 
             int p=475*a;
             int p1=300*b;
             int p0=275*c;
             int p3=450*d;
             int p2=p+p1+p0+p3;
             System.out.println("Your bill= "+p2);
            }
            else
            {
                System.out.println("Invalid Input");
            }
    }
}
        