import java.util.Scanner; 
public class methods 
{  
      public static int varname(int x,int y)
      {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else 
        {
            z=(x+y)*5;
        }
        return z;
      }
     public static void main (String args[])
     {
        Scanner sc = new Scanner(System.in);
        int firstnumber=0;
        int secondnumber=0;
        System.out.print("Enetr the the first number: ");
        firstnumber=sc.nextInt();
        System.out.print("Enetr the the second number: ");
        secondnumber=sc.nextInt();
        int c;
        c=varname(firstnumber,secondnumber);
        // methods obj=new methods();
        // c=obj.varname(firstnumber,secondnumber);
        // System.out.println(c);
        System.out.println(c);
     }     
}
