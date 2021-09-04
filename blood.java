import java.io.*;
public class blood  
{
    public static void main(String args[])throws IOException
    {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        int age =0 , w =0;
        System.out.println( " BLOOD DONATION" );
        System.out.println( " --------------" );
        System.out.print("Enter your 'AGE'= ");
        age =Integer.parseInt(stdin.readLine());
        System.out.print("Enter your 'WEIGHT'= ");
        w =Integer.parseInt(stdin.readLine());
        if (age>=18 && age<=50){
            if (w>50){
                System.out.println("You are eligible for donating blood");
            }else{
                System.out.println("You are not eligible to donate blood . Your 'WEIGHT' is under 50 ");
            }
        }else{
            System.out.println("You are not elegible to donate blood . Your 'AGE' must be greater than 18 OR lesser than 50   ");
        }
    }
}