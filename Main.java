import java.util.Scanner;
public class Main
{
   public static void main(String[] args) 
   {
      int number, total = 0;
      Scanner sc = new Scanner(System.in);
      do{
          System.out.println("Please enter number: ");
          number = sc.nextInt();
          total += number;
      }while (number != 0);  
      System.out.println("Total is = " + total);
      sc.close();
   }
}
